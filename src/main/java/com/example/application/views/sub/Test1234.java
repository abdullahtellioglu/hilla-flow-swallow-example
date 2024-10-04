package com.example.application.views.sub;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.example.application.views.MainLayout;

@Route(value = "test1234", layout = MainLayout.class)
@PageTitle("Test1234")
@AnonymousAllowed
public class Test1234 extends HorizontalLayout {

    public Test1234() {
        add(new H1("This is Test1234"));
    }

}
