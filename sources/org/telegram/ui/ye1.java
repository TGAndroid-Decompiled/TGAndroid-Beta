package org.telegram.ui;

import java.util.Iterator;
public final class ye1 implements org.telegram.ui.ActionBar.b2 {
    public final af1 f44850a;

    public ye1(af1 af1Var) {
        this.f44850a = af1Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        df1 df1Var = this.f44850a.f36475a;
        Iterator it = df1Var.f37533e.iterator();
        while (it.hasNext()) {
            df1.T(df1Var, ((Integer) it.next()).intValue());
        }
        df1Var.f37533e.clear();
        df1Var.U();
    }
}
