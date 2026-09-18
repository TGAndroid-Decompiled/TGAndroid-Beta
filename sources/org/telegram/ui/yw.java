package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yw implements Runnable {
    public final int f40031a;
    public final vy f40032b;

    public yw(vy vyVar, int i10) {
        this.f40031a = i10;
        this.f40032b = vyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f40031a) {
            case 0:
                this.f40032b.d.l();
                return;
            case 1:
                vy vyVar = this.f40032b;
                wy wyVar = vyVar.K;
                sy syVar = vyVar.f38527a;
                if (syVar != null && syVar.getScrollState() == 0 && vyVar.f38527a.getChildCount() > 0 && vyVar.f38527a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (vyVar.f38533s == 0 && wyVar.Z3() && vyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = wyVar.N;
                    s4.c0 c0Var = (s4.c0) vyVar.f38527a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < vyVar.f38527a.getChildCount(); i13++) {
                        int S = RecyclerView.S(vyVar.f38527a.getChildAt(i13));
                        View childAt = vyVar.f38527a.getChildAt(i13);
                        if (S != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = S;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - vyVar.f38527a.getPaddingTop();
                        if (wyVar.K) {
                            f7 = 0.0f;
                        }
                        if (vyVar.f38527a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((vyVar.f38527a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                vy vyVar2 = this.f40032b;
                vyVar2.d.W(vyVar2.I);
                vyVar2.K.Q = true;
                sy syVar2 = vyVar2.f38527a;
                syVar2.f37573d3 = true;
                vyVar2.H = false;
                syVar2.invalidate();
                return;
        }
    }
}
