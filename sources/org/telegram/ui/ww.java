package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ww implements Runnable {
    public final int f39274a;
    public final ty f39275b;

    public ww(ty tyVar, int i10) {
        this.f39274a = i10;
        this.f39275b = tyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39274a) {
            case 0:
                this.f39275b.d.l();
                return;
            case 1:
                ty tyVar = this.f39275b;
                uy uyVar = tyVar.K;
                qy qyVar = tyVar.f37905a;
                if (qyVar != null && qyVar.getScrollState() == 0 && tyVar.f37905a.getChildCount() > 0 && tyVar.f37905a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (tyVar.f37911s == 0 && uyVar.Z3() && tyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = uyVar.N;
                    s4.c0 c0Var = (s4.c0) tyVar.f37905a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < tyVar.f37905a.getChildCount(); i13++) {
                        int S = RecyclerView.S(tyVar.f37905a.getChildAt(i13));
                        View childAt = tyVar.f37905a.getChildAt(i13);
                        if (S != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = S;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - tyVar.f37905a.getPaddingTop();
                        if (uyVar.K) {
                            f7 = 0.0f;
                        }
                        if (tyVar.f37905a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((tyVar.f37905a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ty tyVar2 = this.f39275b;
                tyVar2.d.W(tyVar2.I);
                tyVar2.K.Q = true;
                qy qyVar2 = tyVar2.f37905a;
                qyVar2.f37005d3 = true;
                tyVar2.H = false;
                qyVar2.invalidate();
                return;
        }
    }
}
