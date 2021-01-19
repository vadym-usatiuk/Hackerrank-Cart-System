<div aria-label="Question Content" class="challenge-text hrx-version ck_table-wrap fadeinContent" style="min-height:100px;"><p style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:normal;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;text-align:center;"><strong><span style="font-size:29px;">Cart System</span></strong></p>
<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;"><br>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;"><strong><span style="font-size:19px;line-height:107%;">Business Requirement:</span></strong><span style="font-size:19px;line-height:107%;">&nbsp;</span></p>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;"><span style="font-size:19px;line-height:107%;">Your task is to create a basic Cart System where an App system reads from a file of default items and displays those items to the user in order to add them to their cart. A new item can be added at any time to the system (Only at runtime and it does not need to be saved in the file with default items). Items can be removed from the System as well as from the cart.</span></p>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;">&nbsp;</p>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;"><strong><span style="font-size:19px;line-height:107%;">Work-Flow:</span></strong></p>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;"><span style="font-size:16px;line-height:107%;">The Cart System starts by asking the user to select whether they would like to:</span></p>

<ol start="1" style="margin-bottom:0in;margin-top:0in;" type="1">
	<li style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;color:black;border:none;"><span style="font-size:16px;line-height:107%;color:windowtext;">Add an item to the System: In this case, the system asks the user to enter the new item's name, a description for the new item, the new item’s price and the available quantity of the new item, finally, the new item will be added to the app.</span></li>
</ol>

<p style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;border:none;"><span style="font-size:16px;line-height:107%;">&nbsp;</span></p>

<ol start="2" style="margin-bottom:0in;margin-top:0in;" type="1">
	<li style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;color:black;border:none;"><span style="font-size:16px;line-height:107%;color:windowtext;">Add an item to the Cart: In this case, the system displays all of the available items in the app system and asks the user to enter the name of an item to be added to the cart. The item will be added to the cart by searching the name for that item in the collection of items available in the app system. If the item has already been added to the cart, the quantity of that item in the cart is increased by one.</span></li>
</ol>

<p style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;border:none;"><span style="font-size:16px;line-height:107%;">&nbsp;</span></p>

<ol start="3" style="margin-bottom:0in;margin-top:0in;" type="1">
	<li style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;color:black;border:none;">
<span style="font-size:16px;line-height:107%;color:windowtext;">Display Cart: All the items in the cart are displayed, the system then calculates the sub-total by calculating the total sum of the products of the price and quantity of each item in the cart (Sum (item's price * item's quantity)). The sub-total is displayed along with the tax, which is (sub-total * 0.05), and the total, which is (sub-total + tax) for all items in the cart</span><span style="font-size:16px;line-height:107%;">.</span>
</li>
</ol>

<p style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;border:none;"><span style="font-size:16px;line-height:107%;color:black;">&nbsp;</span></p>

<ol start="4" style="margin-bottom:0in;margin-top:0in;" type="1">
	<li style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;color:black;border:none;"><span style="font-size:16px;line-height:107%;">Display System: The system displays all the items that are available in the app.</span></li>
</ol>

<p style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;border:none;"><span style="font-size:16px;line-height:107%;color:black;">&nbsp;</span></p>

<ol start="5" style="margin-bottom:0in;margin-top:0in;" type="1">
	<li style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;color:black;border:none;"><span style="font-size:16px;line-height:107%;">Remove an item from the cart: In this case, the system asks the user for the name of the item to be removed from the cart.</span></li>
</ol>

<p style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;border:none;"><span style="font-size:16px;line-height:107%;color:black;">&nbsp;</span></p>

<ol start="6" style="margin-bottom:0in;margin-top:0in;" type="1">
	<li style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;color:black;border:none;"><span style="font-size:16px;line-height:107%;">Remove an item from the system: In this case, the system asks the user for the name of the item to be removed from the app. If an item is removed from the app, but it was already added to the cart. It will also be removed from the cart.</span></li>
</ol>

<p style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;border:none;"><span style="font-size:16px;line-height:107%;color:black;">&nbsp;</span></p>

<ol start="7" style="margin-bottom:0in;margin-top:0in;" type="1">
	<li style="margin-top:0in;margin-right:0in;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;color:black;border:none;"><span style="font-size:16px;line-height:107%;">Quit: This option terminates the program.</span></li>
</ol>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;"><span style="font-size:16px;line-height:107%;">&nbsp;</span></p>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;"><strong><span style="font-size:19px;line-height:107%;">&nbsp;</span></strong></p>

<p style="margin-top:0in;margin-right:0in;margin-bottom:8.0pt;margin-left:0in;line-height:107%;font-size:15px;font-family:&quot;Calibri&quot;,sans-serif;">&nbsp;</p>

