package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class w11 extends s4.r {
    public final int Q;
    public final i31 R;

    public w11(i31 i31Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = i31Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    org.telegram.ui.Components.qw qwVar = new org.telegram.ui.Components.qw(this, recyclerView.getContext(), 2);
                    qwVar.f48045a = i10;
                    w0(qwVar);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                try {
                    org.telegram.ui.Components.qw qwVar2 = new org.telegram.ui.Components.qw(this, recyclerView.getContext(), 4);
                    qwVar2.f48045a = i10;
                    w0(qwVar2);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
        }
    }
}
