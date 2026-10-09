package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class y51 extends s4.s {
    public final int Q;
    public final k71 R;

    public y51(k71 k71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = k71Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    ci.l1 l1Var = new ci.l1(this, recyclerView.getContext(), 3);
                    l1Var.f47827a = i10;
                    w0(l1Var);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                try {
                    ci.l1 l1Var2 = new ci.l1(this, recyclerView.getContext(), 5);
                    l1Var2.f47827a = i10;
                    w0(l1Var2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
