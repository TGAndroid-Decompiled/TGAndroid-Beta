package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class z51 extends s4.s {
    public final int Q;
    public final l71 R;

    public z51(l71 l71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = l71Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    bi.t1 t1Var = new bi.t1(this, recyclerView.getContext(), 3);
                    t1Var.f41760a = i10;
                    w0(t1Var);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                try {
                    bi.t1 t1Var2 = new bi.t1(this, recyclerView.getContext(), 5);
                    t1Var2.f41760a = i10;
                    w0(t1Var2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
