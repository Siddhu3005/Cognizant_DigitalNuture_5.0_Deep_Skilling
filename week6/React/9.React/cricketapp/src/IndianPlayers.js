import React from "react";

function IndianPlayers() {
  const players = [
    "Virat Kohli",
    "Rohit Sharma",
    "Shubman Gill",
    "KL Rahul",
    "Hardik Pandya",
    "Ravindra Jadeja"
  ];

  const [odd1, even1, odd2, even2, odd3, even3]=players;

  const oddPlayers = [odd1, odd2, odd3];
  const evenPlayers = [even1, even2, even3];

  const T20Players = [
    "Virat Kohli",
    "Rohit Sharma",
    "Hardik Pandya"
  ];

  const RanjiPlayers = [
    "Cheteshwar Pujara",
    "Hanuma Vihari",
    "Mayank Agarwal"
  ];

  const mergedPlayers = [...T20Players, ...RanjiPlayers];

  return (
    <div>
      <h2>Indian Players</h2>

      <h3>Odd Team Players</h3>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>Even Team Players</h3>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>Merged T20 and Ranji Trophy Players</h3>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;