import React from "react";
import officeImage from "./office.avif";

function App() {
  const office = {
    name: "Tech Park Office",
    rent: 55000,
    address: "Bangalore"
  };

  const officeSpaces = [
    {
      name: "Tech Park Office",
      rent: 55000,
      address: "Bangalore"
    },
    {
      name: "Cyber Towers",
      rent: 75000,
      address: "Hyderabad"
    },
    {
      name: "Mind Space",
      rent: 62000,
      address: "Chennai"
    },
    {
      name: "IT Hub",
      rent: 45000,
      address: "Pune"
    }
  ];

  return (
    <div style={{ margin: "20px" }}>
      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office"
        width="400"
        height="250"
      />

      <h2>Featured Office</h2>

      <p><b>Name:</b> {office.name}</p>

      <p
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        <b>Rent:</b> ₹{office.rent}
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {officeSpaces.map((item, index) => (
        <div
          key={index}
          style={{
            border: "1px solid gray",
            padding: "10px",
            marginBottom: "10px"
          }}
        >
          <p><b>Name:</b> {item.name}</p>

          <p
            style={{
              color: item.rent < 60000 ? "red" : "green"
            }}
          >
            <b>Rent:</b> ₹{item.rent}
          </p>

          <p><b>Address:</b> {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;