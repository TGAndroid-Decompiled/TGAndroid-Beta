package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tw implements Runnable {
    public final int f37802a;
    public final qy f37803b;

    public tw(qy qyVar, int i10) {
        this.f37802a = i10;
        this.f37803b = qyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37802a) {
            case 0:
                this.f37803b.d.l();
                return;
            case 1:
                qy qyVar = this.f37803b;
                ry ryVar = qyVar.K;
                ny nyVar = qyVar.f36629a;
                if (nyVar != null && nyVar.getScrollState() == 0 && qyVar.f36629a.getChildCount() > 0 && qyVar.f36629a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (qyVar.f36635s == 0 && ryVar.Z3() && qyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = ryVar.N;
                    s4.c0 c0Var = (s4.c0) qyVar.f36629a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < qyVar.f36629a.getChildCount(); i13++) {
                        int R = RecyclerView.R(qyVar.f36629a.getChildAt(i13));
                        View childAt = qyVar.f36629a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - qyVar.f36629a.getPaddingTop();
                        if (ryVar.K) {
                            f7 = 0.0f;
                        }
                        if (qyVar.f36629a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((qyVar.f36629a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            c0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                qy qyVar2 = this.f37803b;
                qyVar2.d.W(qyVar2.I);
                qyVar2.K.Q = true;
                ny nyVar2 = qyVar2.f36629a;
                nyVar2.f35623d3 = true;
                qyVar2.H = false;
                nyVar2.invalidate();
                return;
        }
    }
}
