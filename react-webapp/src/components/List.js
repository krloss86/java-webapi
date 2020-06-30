import React from 'react';
import Item from './Item';

class List extends React.Component {
    render() {
        const _props = this.props;

        return (
            <div className="row mt-3">
                <div className="col-12">
                    <table className="table">
                        <thead>
                            <tr>
                            <th scope="col">#</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Precio</th>
                            <th scope="col"></th>
                            </tr>
                        </thead>
                        <tbody>                        
                            {
                                this.props.items.map(function(item, index){
                                    return <Item deleteItem={_props.deleteItem} key={index} item={item}></Item>
                                })
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

export default List;