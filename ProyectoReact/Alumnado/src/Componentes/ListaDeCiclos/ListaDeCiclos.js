import React, { Component } from 'react';
import MostrarCiclos from '../MostrarCiclos/MostrarCiclos';

class ListaDeCiclos extends Component {
  constructor(props){
    super(props);
    this.state = {
      ciclos: []
    }
  }

  componentWillMount(){
    fetch("http://192.168.1.178:8080/Alumnado/webresources/ciclo")
      .then((response) => {
        return response.json();
      }) 
      .then((ciclos) => {
        this.setState({
          ciclos: ciclos
        });
      });
  }

  render() {
    return (
      <MostrarCiclos ciclos={this.state.ciclos}/>
    );
  }
}

export default ListaDeCiclos;
