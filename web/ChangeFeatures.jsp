<%-- 
    Document   : ChangeFeatures
    Created on : Nov 6, 2017, 3:11:55 PM
    Author     : MuhammadHarris
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="models.Features"%>
<%@page import="models.SeatFeatures"%>
<%@page import="models.TempSeat"%>
<%@page import="models.Facility"%>
<%@page import="models.TempFacility"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
	<head>
            <jsp:include page="Templates/HeadMetaInfo.jsp"/>
            
            <title>Admin Portal</title>
        </head>

	<body style="background-color:black;  background: url('./assets/img/dashboard.jpg'); background-size:cover;">
  	
                <jsp:include page="Templates/AdminHeader.jsp"/>
		
		<div class="row">
			
                <jsp:include page="Templates/AdminPanel.jsp"/>
                
		<!-- Table -->
		<section class="col-9" style="margin:1%;">                
		<form role="form" action="ChangeFeatures.do" method="post" class="update-features-form">

		<table class="table table-inverse table-striped table-bordered table-hover mx-auto table-responsive">
		  <thead>
			<tr>
			  <th>#</th>
			  <th>Features</th>
			  <th>Economy</th>
			  <th>Business</th>
			  <th>First Class</th>                          
			</tr>
		  </thead>
		  <tbody>
                      
                        <% 
                            ArrayList<Features> fres = (ArrayList<Features>)(application.getAttribute("features"));
                            Features e = fres.get(0);
                            Features b = fres.get(1);
                            Features f = fres.get(2);
                            
                            ArrayList<SeatFeatures> sF = (ArrayList<SeatFeatures>)(application.getAttribute("seatFeatures"));
                            SeatFeatures eSeat = sF.get(0);
                            SeatFeatures bSeat = sF.get(1);
                            SeatFeatures fSeat = sF.get(2);
                            
                            
                            ArrayList<TempSeat> tS = (ArrayList<TempSeat>)(application.getAttribute("tempSeat"));
                            TempSeat eTS = tS.get(0);
                            TempSeat bTS = tS.get(1);
                            TempSeat fTS = tS.get(2);
                            
                            ArrayList<Facility> fac = (ArrayList<Facility>)(application.getAttribute("facility"));
                            Facility eF = fac.get(0);
                            Facility bF = fac.get(1);
                            Facility fF = fac.get(2);
                            
                            ArrayList<TempFacility> tempFac = (ArrayList<TempFacility>)(application.getAttribute("tempFacility"));
                            TempFacility eTF = tempFac.get(0);
                            TempFacility bTF = tempFac.get(1);
                            TempFacility fTF = tempFac.get(2);

                        %>
                        <tr>
			  <th scope="row">1</th>
			  <th>Seat Pitch</th>
                        
                          <td <% if ((eSeat.getNewSeatPitch() != eTS.getSeatPitch()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >  <input type="number" name="seat_pitch_e" min="29" max="38" placeholder="29-38" required value ='${(tempSeat[0])["seatPitch"]}'> </td>
			  <td <% if ((bSeat.getNewSeatPitch() != bTS.getSeatPitch()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >  <input type="number" name="seat_pitch_b" min="30" max="87" placeholder="30-87" required value ='${(tempSeat[1])["seatPitch"]}'>	</td>			  
			  <td <% if ((fSeat.getNewSeatPitch() != fTS.getSeatPitch()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >  <input type="number" name="seat_pitch_f" min="42" max="90" placeholder="42-90" required value ='${(tempSeat[2])["seatPitch"]}'>	</td>
			 </tr>
			<tr>
			  <th scope="row">2</th>
			  <th>Seat Width</th>
			  <td <% if ((eSeat.getNewSeatWidth() != eTS.getSeatWidth()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >  <input type="number" name="seat_width_e" min="17" max="20" placeholder="17-20" required value ='${(tempSeat[0])["seatWidth"]}'>	</td>
			  <td <% if ((bSeat.getNewSeatWidth() != bTS.getSeatWidth()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >  <input type="number" name="seat_width_b" min="17" max="34" placeholder="17-34" required value ='${(tempSeat[1])["seatWidth"]}'>	</td>
			  <td <% if ((fSeat.getNewSeatWidth() != fTS.getSeatWidth()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >  <input type="number" name="seat_width_f" min="18.5" max="35.5" placeholder="18.5-35.5" required value ='${(tempSeat[2])["seatWidth"]}'>	</td>
			  </tr>
			<tr>
			  <th scope="row">3</th>
			  <th>Video Type</th>				
                          <td <% if ((eF.getNewVideoType() != null) && (!eF.getNewVideoType().equals(eTF.getVideoType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
				  <select name="video_e" required>					  
                                          <option selected hidden value ='${(tempFacility[0])["videoType"]}'>${(tempFacility[0])["videoType"]}</option>					
					  <option value="None">None</option>
					  <option value="On-Demand TV">Personal TV</option>
					  <option value="Overhead TV">Overhead TV</option>
					  <option value="Portable Device">Portable Device</option>					  
					  <option value="Satellite TV">Satellite TV</option>
					  <option value="Seatback TV">Seatback TV</option>
				  </select>
			   </td>

			  <td <% if ((bF.getNewVideoType() != null) && (!bF.getNewVideoType().equals(bTF.getVideoType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
				  <select name="video_b" required>
                                          <option selected hidden value ='${(tempFacility[1])["videoType"]}'>${(tempFacility[1])["videoType"]}</option>		                                      
					  <option value="None">None</option>
					  <option value="On-Demand TV">On-Demand TV</option>
					  <option value="Overhead TV">Overhead TV</option>
					  <option value="Portable Device">Portable Device</option>					  
					  <option value="Seatback TV">Seatback TV</option>
				  </select>
			   </td>

			  <td <% if ((fF.getNewVideoType() != null) && (!fF.getNewVideoType().equals(fTF.getVideoType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
				  <select name="video_f" required>
                                          <option selected hidden value ='${(tempFacility[2])["videoType"]}'>${(tempFacility[2])["videoType"]}</option>		                                      
					  <option value="None">None</option>
					  <option value="On-Demand TV">On-Demand TV</option>
					  <option value="Overhead TV">Overhead TV</option>
					  <option value="Portable Device">Portable Device</option>					  
					  <option value="Seatback TV">Seatback TV</option>
				  </select>
			   </td>

		   </tr>
			<tr>
				<th scope="row">4</th>
				<th>Power Type</th>
				<td <% if ((eF.getNewPowerType() != null) && (!eF.getNewPowerType().equals(eTF.getPowerType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="power_e" required>
                                                <option selected hidden value ='${(tempFacility[0])["powerType"]}'>${(tempFacility[0])["powerType"]}</option>								 
                                                  <option value="None">None</option>
						  <option value="AC Power">AC Power</option>
					  </select>
				</td>
				<td <% if ((bF.getNewPowerType() != null) && (!bF.getNewPowerType().equals(bTF.getPowerType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="power_b" required>
                                          <option selected hidden value ='${(tempFacility[1])["powerType"]}'>${(tempFacility[1])["powerType"]}</option>		                                              
						  <option value="None">None</option>
						  <option value="AC Power">AC Power</option>
					  </select>
				</td>
				<td <% if ((fF.getNewPowerType() != null) && (!fF.getNewPowerType().equals(fTF.getPowerType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="power_f" required>
                                          <option selected hidden value ='${(tempFacility[2])["powerType"]}'>${(tempFacility[2])["powerType"]}</option>	                                              
						  <option value="None">None</option>
						  <option value="DC Power">DC Power</option>
						  <option value="AC Power">AC Power</option>
					  </select>
				</td>

				
			</tr>
			
			<tr>
				<th scope="row">5</th>
				<th>Wi-fi</th>
				<td>
					  <select name="wifi_e" disabled>                                              
						  <option value="No">No</option>
						  <option value="Yes">Yes</option>
					  </select>
				</td>
				<td <% if ((bF.getNewWifi() != null) && (!bF.getNewWifi().equals(bTF.getWifi())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="wifi_b" required>
                                                    <option selected hidden value ='${(tempFacility[1])["wifi"]}'>${(tempFacility[1])["wifi"]}</option>	                                              
						  <option value="No">No</option>
						  <option value="Yes">Yes</option>
					  </select>
				</td>
				<td <% if ((fF.getNewWifi() != null) && (!fF.getNewWifi().equals(fTF.getWifi())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="wifi_f" required>
                                                    <option selected hidden value ='${(tempFacility[2])["wifi"]}'>${(tempFacility[2])["wifi"]}</option>	                                              
						  <option value="No">No</option>
						  <option value="Yes">Yes</option>
					  </select>
				</td>				
			</tr>

			<tr>
				<th scope="row">6</th>
				<th>Seat Type</th>
				<td <% if ((eSeat.getNewSeatType() != null) && (!eSeat.getNewSeatType().equals(eTS.getSeatType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="seat_type_e" required>
                                                    <option selected hidden value ='${(tempSeat[0])["seatType"]}'>${(tempSeat[0])["seatType"]}</option>	                                              
						  <option value="Recliner">Recliner</option>
						  <option value="Standard">Standard</option>
					  </select>
				
				</td>			

				<td <% if ((bSeat.getNewSeatType() != null) && (!bSeat.getNewSeatType().equals(bTS.getSeatType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="seat_type_b" required>
                                                    <option selected hidden value ='${(tempSeat[1])["seatType"]}'>${(tempSeat[1])["seatType"]}</option>	                                              
						  <option value="Angle Lie Flat">Angle Lie Flat</option>
						  <option value="Flat Bed">Flat Bed</option>
						  <option value="Open Suite">Open Suite</option>
						  <option value="Recliner">Recliner</option>
					  </select>
				
				</td>			

				<td <% if ((fSeat.getNewSeatType() != null) && (!fSeat.getNewSeatType().equals(fTS.getSeatType())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="seat_type_f" required>
                                                    <option selected hidden value ='${(tempSeat[2])["seatType"]}'>${(tempSeat[2])["seatType"]}</option>	                                              
						  <option value="Closed Suite">Closed Suite</option>					  
						  <option value="Angle Lie Flat">Angle Lie Flat</option>
						  <option value="Flat Bed">Flat Bed</option>
						  <option value="Open Suite">Open Suite</option>
						  <option value="Recliner">Recliner</option>
					  </select>
				
				</td>			
				
			</tr>			
			<tr>
				<th scope="row">7</th>
				<th>Special Food</th>
				<td>
					  <select name="special_food_e" disabled>
						  <option value="No">No</option>
						  <option value="Yes">Yes</option>
					  </select>
				</td>
				<td>
					  <select name="special_food_b" disabled>
						  <option value="No">No</option>
						  <option value="Yes">Yes</option>
					  </select>

   			    </td>
				<td <% if ((fF.getNewSpecialFood() != null) && (!fF.getNewSpecialFood().equals(fTF.getSpecialFood())) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					  <select name="special_food_f" required>
                                                  <option selected hidden value ='${(tempFacility[2])["specialFood"]}'>${(tempFacility[2])["specialFood"]}</option>	                                              
						  <option value="No">No</option>
						  <option value="Yes">Yes</option>
					  </select>
				</td>	
			</tr>
			
			<tr>
				<th scope="row"></th>
				<th scope="row">Price</th>
				<td <% if ((e.getNewPrice() != e.getPrice()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					<div class="input-group">
					<div class="input-group-addon col-1 d-inline">$</div>
					<input type="number" min="10" max="200" placeholder="10-200" name="price_e" required value="${(features[0])["price"]}">
					</div>
				</td>
				<td <% if ((b.getNewPrice() != b.getPrice()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					<div class="input-group">
					<div class="input-group-addon col-1 d-inline">$</div>
					<input type="number" min="300" max="350" placeholder="300-350" name="price_b" required value="${(features[1])["price"]}">
					</div>
				</td>				
				<td <% if ((f.getNewPrice() != f.getPrice()) && (e.getIsChanged())){out.print("Class = 'bg-success text-white'");}%> >
					<div class="input-group">
					<div class="input-group-addon col-1 d-inline">$</div>
					<input type="number" min="1000" max="5000" placeholder="1000-5000" name="price_f" required value="${(features[2])["price"]}">
					</div>
				</td>				
			</tr>

			</tbody>
		</table>
                
                <%
                   if (!Features.isChanged) 
                   {
                       out.println("<div style='text-align:center; margin:1%;'>");
                       out.println("<button class='btn btn-primary flex-row-reverse' type='submit'>Submit</button>");
                       out.println("</div>");
                   }
                   else
                   {
                        out.print("<div style='text-align:center;' class='bg-success text-white'>");
                        out.print("Changes are already pending to be approved/disapproved by the Manager.");
                        out.print("</div>");                       
                   }                                
                %>                                
		</form>
			
		
		</section>
		
		</div>
                
                <jsp:include page="Templates/Footer.jsp"/>
	
	</body>

	
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
  </body>
</html>