package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ww implements Runnable {
    public final int f42497a;
    public final ty f42498b;

    public ww(ty tyVar, int i10) {
        this.f42497a = i10;
        this.f42498b = tyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42497a) {
            case 0:
                this.f42498b.d.l();
                return;
            case 1:
                ty tyVar = this.f42498b;
                uy uyVar = tyVar.K;
                qy qyVar = tyVar.f40859a;
                if (qyVar != null && qyVar.getScrollState() == 0 && tyVar.f40859a.getChildCount() > 0 && tyVar.f40859a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (tyVar.f40866s == 0 && uyVar.Z3() && tyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = uyVar.N;
                    s4.c0 c0Var = (s4.c0) tyVar.f40859a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < tyVar.f40859a.getChildCount(); i13++) {
                        int R = RecyclerView.R(tyVar.f40859a.getChildAt(i13));
                        View childAt = tyVar.f40859a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - tyVar.f40859a.getPaddingTop();
                        if (uyVar.K) {
                            f7 = 0.0f;
                        }
                        if (tyVar.f40859a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((tyVar.f40859a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ty tyVar2 = this.f42498b;
                tyVar2.d.W(tyVar2.I);
                tyVar2.K.Q = true;
                qy qyVar2 = tyVar2.f40859a;
                qyVar2.f40000d3 = true;
                tyVar2.H = false;
                qyVar2.invalidate();
                return;
        }
    }
}
