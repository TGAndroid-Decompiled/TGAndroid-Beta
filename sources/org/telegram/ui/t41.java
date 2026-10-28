package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;
public final class t41 extends s4.t {
    public final int Q;
    public final f61 R;

    public t41(f61 f61Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = f61Var;
    }

    @Override
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    fi.k1 k1Var = new fi.k1(this, recyclerView.getContext(), 3);
                    k1Var.f47715a = i10;
                    w0(k1Var);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                try {
                    fi.k1 k1Var2 = new fi.k1(this, recyclerView.getContext(), 5);
                    k1Var2.f47715a = i10;
                    w0(k1Var2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
