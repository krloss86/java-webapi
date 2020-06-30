import React from 'react';

class Item extends React.Component {

    render() {

        return (

            <tr>
                <th scope="row">
                    {this.props.item.id}
                </th>
                <td>
                    {this.props.item.descripcion}
                </td>
                <td>
                    {this.props.item.precio}
                </td>
                <td>
                    <button onClick={(e) =>this.props.deleteItem(this.props.item.id)}>Eliminar</button>
                </td>
            </tr>
            
        );
    }
}

export default Item;