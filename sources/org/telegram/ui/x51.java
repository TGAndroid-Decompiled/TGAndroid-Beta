package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class x51 extends s4.s {
    public final int Q;
    public final j71 R;

    public x51(j71 j71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = j71Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    di.m1 m1Var = new di.m1(this, recyclerView.getContext(), 3);
                    m1Var.f45934a = i10;
                    w0(m1Var);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                try {
                    di.m1 m1Var2 = new di.m1(this, recyclerView.getContext(), 5);
                    m1Var2.f45934a = i10;
                    w0(m1Var2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
