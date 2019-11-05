import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { UserComponent } from './user/user.component';
import { PmComponent } from './pm/pm.component';
import { AdminComponent } from './admin/admin.component';
import { CustomersListComponent } from './customers-list/customers-list.component';
import { CreateCustomerComponent } from './create-customer/create-customer.component';
import { SearchCustomersComponent } from './search-customers/search-customers.component';
import { CompletedTrainingsComponent } from './completed-trainings/completed-trainings.component';

const routes: Routes = [
    { path: 'home',component: HomeComponent},
    { path: 'user',component: UserComponent},
    { path: 'pm',component: PmComponent},
    { path: 'admin',component: AdminComponent},
    { path: 'auth/login',component: LoginComponent},
    { path: 'signup',component: RegisterComponent},
    { path: 'home',redirectTo: 'home',pathMatch: 'full'},
    { path: '', redirectTo: 'customer', pathMatch: 'full' },
    { path: 'customer', component: CustomersListComponent },
    { path: 'add', component: CreateCustomerComponent },
    { path: 'findbyage', component: SearchCustomersComponent },
    { path: 'completedtrainings', component: CompletedTrainingsComponent },
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }


