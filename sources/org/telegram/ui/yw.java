package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yw implements Runnable {
    public final int f39117a;
    public final vy f39118b;

    public yw(vy vyVar, int i10) {
        this.f39117a = i10;
        this.f39118b = vyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39117a) {
            case 0:
                this.f39118b.d.l();
                return;
            case 1:
                vy vyVar = this.f39118b;
                wy wyVar = vyVar.K;
                sy syVar = vyVar.f37645a;
                if (syVar != null && syVar.getScrollState() == 0 && vyVar.f37645a.getChildCount() > 0 && vyVar.f37645a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (vyVar.f37651s == 0 && wyVar.Z3() && vyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = wyVar.N;
                    s4.c0 c0Var = (s4.c0) vyVar.f37645a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < vyVar.f37645a.getChildCount(); i13++) {
                        int R = RecyclerView.R(vyVar.f37645a.getChildAt(i13));
                        View childAt = vyVar.f37645a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - vyVar.f37645a.getPaddingTop();
                        if (wyVar.K) {
                            f7 = 0.0f;
                        }
                        if (vyVar.f37645a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((vyVar.f37645a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                vy vyVar2 = this.f39118b;
                vyVar2.d.W(vyVar2.I);
                vyVar2.K.Q = true;
                sy syVar2 = vyVar2.f37645a;
                syVar2.f36777d3 = true;
                vyVar2.H = false;
                syVar2.invalidate();
                return;
        }
    }
}
