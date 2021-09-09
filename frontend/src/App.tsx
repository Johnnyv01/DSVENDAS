import Barchart from "components/Barchart";
import DataTable from "components/DataTable";
import DonutCharts from "components/DonutCharts";
import Footer from "components/Footer";
import Navbar from "components/Navbar";

function App() {
  return (
    <>
    <Navbar/>
    <div className="container">
      <h1 className="text-primary py-3">Dashboard de Vendas!</h1>
        <div className="row px-3">
        <div className="col-sm-6">
            <h5 className="text-center text-secundary">Taxa de sucesso(%)</h5>
            <Barchart/>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secundary" >Todas vendas</h5>
            <DonutCharts/>
          </div>
        
        <div className="py-3">
          <h2 className="text-primary"> Todas vendas</h2>
        </div>
        </div>
       
      <DataTable/>
    </div>
    <Footer/>
    </>
  );
}

export default App;
