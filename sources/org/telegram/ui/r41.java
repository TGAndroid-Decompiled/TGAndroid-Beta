package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class r41 extends f2.w {
    public final int Q;
    public final d61 R;

    public r41(d61 d61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = d61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    nh.k1 k1Var2 = new nh.k1(this, recyclerView.getContext(), 3);
                    k1Var2.f6373a = i10;
                    w0(k1Var2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                try {
                    nh.k1 k1Var3 = new nh.k1(this, recyclerView.getContext(), 5);
                    k1Var3.f6373a = i10;
                    w0(k1Var3);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
        }
    }
}
