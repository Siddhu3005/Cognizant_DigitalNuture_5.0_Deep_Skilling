import React,{useState} from "react";

function LoginButton(props){
  return <button onClick={props.onClick}>Login</button>;
}

function LogoutButton(props){
  return <button onClick={props.onClick}>Logout</button>;
}

function GuestGreeting(){
  return(
    <div>
      <h1>Please sign up.</h1>
      <h3>Flight Details</h3>
      <ul>
        <li>Flight : AI202</li>
        <li>From : Hyderabad</li>
        <li>To : Delhi</li>
        <li>Time : 10:00 AM</li>
      </ul>
    </div>
  );
}

function UserGreeting(){
  return(
    <div>
      <h1>Welcome back</h1>
      <h3>Ticket Booking</h3>
      <p>You can now book your tickets.</p>
    </div>
  );
}

function Greeting(props){
  if(props.isLoggedIn){
    return <UserGreeting/>;
  }
  return <GuestGreeting/>;
}

function App(){

  const[isLoggedIn,setIsLoggedIn]=useState(false);

  const handleLogin=()=>{
    setIsLoggedIn(true);
  };

  const handleLogout=()=>{
    setIsLoggedIn(false);
  };

  let button;

  if(isLoggedIn){
    button=<LogoutButton onClick={handleLogout}/>;
  }
  else{
    button=<LoginButton onClick={handleLogin}/>;
  }

  return(
    <div style={{margin:"20px"}}>
      <Greeting isLoggedIn={isLoggedIn}/>
      <br/>
      {button}
    </div>
  );
}

export default App;