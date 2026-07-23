import React from "react";
import "./index.css";

const books=[
{id:101,bname:"Master React",price:670},
{id:102,bname:"Deep Dive into Angular 11",price:800},
{id:103,bname:"Mongo Essentials",price:450}
];

const blogs=[
{id:1,title:"React Learning",author:"Stephen Biz",content:"Welcome to learning React!"},
{id:2,title:"Installation",author:"Schwezdenier",content:"You can install React from npm."}
];

const courses=[
{id:1,cname:"Angular",date:"4/5/2021"},
{id:2,cname:"React",date:"6/3/2020"}
];

function App(){

  const bookdet=(
    <div>
      {books.map(book=>(
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );

  const content=(
    <div>
      {blogs.map(blog=>(
        <div key={blog.id}>
          <h2>{blog.title}</h2>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );

  const coursedet=(
    <div>
      {courses.map(course=>(
        <div key={course.id}>
          <h2>{course.cname}</h2>
          <h4>{course.date}</h4>
        </div>
      ))}
    </div>
  );

  return(
    <div className="container">
      <div className="st2">
        <h1>Book Details</h1>
        {bookdet}
      </div>

      <div className="v1">
        <h1>Blog Details</h1>
        {content}
      </div>

      <div className="mine1">
        <h1>Course Details</h1>
        {coursedet}
      </div>
    </div>
  );
}

export default App;