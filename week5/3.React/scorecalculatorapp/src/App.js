import logo from './logo.svg';
import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore
        Name={"Sid"}
        School={"ABD High School"}
        total={264}
        goal={3}
      />
    </div>
  );
}

export default App;
