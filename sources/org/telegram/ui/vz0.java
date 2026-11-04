package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class vz0 extends u4.s {
    public final int Q;
    public final g11 R;

    public vz0(g11 g11Var, int i3) {
        super(40);
        this.Q = i3;
        this.R = g11Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        switch (this.Q) {
            case 0:
                try {
                    gi.j1 j1Var = new gi.j1(3, recyclerView.getContext(), this);
                    j1Var.f55704a = i3;
                    w0(j1Var);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                try {
                    gi.j1 j1Var2 = new gi.j1(5, recyclerView.getContext(), this);
                    j1Var2.f55704a = i3;
                    w0(j1Var2);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
        }
    }
}
