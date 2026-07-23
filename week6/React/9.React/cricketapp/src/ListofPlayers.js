import React from "react";

function ListofPlayers() {
  const players = [
    {name:"Virat Kohli",score:95},
    {name:"Rohit Sharma",score:88},
    {name:"Shubman Gill",score:72},
    {name:"KL Rahul",score:68},
    {name:"Hardik Pandya",score:64},
    {name:"Ravindra Jadeja",score:75},
    {name:"Rishabh Pant",score:81},
    {name:"MS Dhoni",score:92},
    {name:"AjinkyaRahane",score:45},
    {name:"Isan Kisan",score:52},
    {name:"Manish Pandey",score:61}
  ];
  const lessscorers=players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      <h3>All Players</h3>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with Score below 70</h3>
      <ul>
        {lessscorers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;