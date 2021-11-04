import Footer from "components/Footer";
import NavBar from "components/NavBar";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonultChart from "components/DonultChart";

function App() {
  return (
    <>
    <NavBar />
    <div className = "container">     
      <h1 className="text-primary py-3">DashBoard de Vendas</h1>    

     <div className="row px-3">
      <div className="col-sm-6">
      <h5 className="text-center">Todas as Vendas</h5>
      <BarChart />
      
      </div>
      <div className="col-sm-6">
      <h5 className="text-center">Todas as Vendas</h5>
      <DonultChart />
      
      </div>
     </div>


      <div className="by-3">
    <h2 className="text-primary">Todas as Vendas</h2>
      </div>


      <DataTable />
    </div>
    <Footer />
    </>
  );
}

export default App;
