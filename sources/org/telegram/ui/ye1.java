package org.telegram.ui;

import java.util.Iterator;
public final class ye1 implements org.telegram.ui.ActionBar.z1 {
    public final af1 f43837a;

    public ye1(af1 af1Var) {
        this.f43837a = af1Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        df1 df1Var = this.f43837a.f35752a;
        Iterator it = df1Var.e.iterator();
        while (it.hasNext()) {
            df1.U(df1Var, ((Integer) it.next()).intValue());
        }
        df1Var.e.clear();
        df1Var.V();
    }
}
