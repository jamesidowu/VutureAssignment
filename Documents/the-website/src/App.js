import React, { Component } from 'react';
import SelfPicWeb from './images/SelfPicWeb.png';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={SelfPicWeb} className="App-logo" alt="logo" />
          <p>
            Hello, I'm James Idowu.
          </p>
        </header>
      </div>
    );
  }
}

export default App;
