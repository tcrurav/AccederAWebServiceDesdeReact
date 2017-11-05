import React, { Component } from 'react';

class MostrarCiclos extends Component {

  mostrarCiclos(){
    if(this.props.ciclos.length === 0){
      return <p>No hay ciclos</p>;
    } else {
      return this.props.ciclos.map((ciclo) => <div key={ciclo.PK_ID}>
                                                  <h2>{ciclo.abreviatura}</h2>
                                                  <p>{ciclo.nombre}</p>
                                              </div>);
    }
  }

  render() {
    return (
      <div>
        {this.mostrarCiclos()}
      </div>
    );
  }
}

export default MostrarCiclos;
