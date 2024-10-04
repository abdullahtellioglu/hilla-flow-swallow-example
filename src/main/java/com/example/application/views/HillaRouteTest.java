package com.example.application.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@Route(value = "HillaRouteTest", registerAtStartup = false)
@PageTitle("HillaRouteTestButFlow")
@AnonymousAllowed
public class HillaRouteTest extends HorizontalLayout {

    public HillaRouteTest() {
add(new H1("test"));
    }

}
