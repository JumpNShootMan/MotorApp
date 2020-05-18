import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MotorListComponent } from './motor-list/motor-list.component';
import { MotorCreateComponent } from './motor-create/motor-create.component';
import { MotorPricelistComponent } from './motor-pricelist/motor-pricelist.component';


const routes: Routes = [
  {path: '', redirectTo: 'list', pathMatch:'full'},
  {path: 'list', component: MotorListComponent},
  {path: 'new', component: MotorCreateComponent},
  {path: 'search', component: MotorPricelistComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
