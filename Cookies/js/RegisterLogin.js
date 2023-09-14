function setCookies()
        {
            alert('setCookies');
            document.cookie="Name=" + document.myform.name.value + "; max-age="+60*60*24*10;
            document.cookie="Password=" + document.myform.pass.value + "; max-age="+60*60*24*10;
            document.cookie="Email="+document.myform.email.value + "; max-age="+60*60*24*10;
            document.cookie="City="+document.myform.city.value + "; max-age="+60*60*24*10;
            document.myform.name.value='';
            document.myform.pass.value='';
            document.myform.email.value='';
            document.myform.city.value='';
        }

   //alert(document.cookie);
   function getCookies()
   {
       
       var cookiesArray=document.cookie.split(";");
       //alert(document.cookie);
       console.log(valueArray);
       for(var i=0;i<cookiesArray.length;i++)
       {   
           var valueArray=cookiesArray[i].split("=");
           console.log(valueArray);
           if(valueArray[0].trim()=='Name')
           document.myform.name.value=valueArray[1];
           //console.log(valueArray[1]);
           if(valueArray[0].trim()=='Password')
           document.myform.pass.value=valueArray[1];
           if(valueArray[0].trim()=='Email')
           document.myform.email.value=valueArray[1];
           //console.log(valueArray[1]);

           if(valueArray[0].trim()=='City')
           document.myform.city.value=valueArray[1];
           //console.log(valueArray[1]);

       }
   }