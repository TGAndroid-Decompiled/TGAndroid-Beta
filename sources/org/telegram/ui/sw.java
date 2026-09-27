package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sw implements Runnable {
    public final int f37586a;
    public final sy f37587b;

    public sw(sy syVar, int i10) {
        this.f37586a = i10;
        this.f37587b = syVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37586a) {
            case 0:
                this.f37587b.d.l();
                return;
            case 1:
                sy syVar = this.f37587b;
                ty tyVar = syVar.K;
                py pyVar = syVar.f37593a;
                if (pyVar != null && pyVar.getScrollState() == 0 && syVar.f37593a.getChildCount() > 0 && syVar.f37593a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (syVar.f37599s == 0 && tyVar.i4() && syVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = tyVar.N;
                    s4.c0 c0Var = (s4.c0) syVar.f37593a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < syVar.f37593a.getChildCount(); i13++) {
                        int S = RecyclerView.S(syVar.f37593a.getChildAt(i13));
                        View childAt = syVar.f37593a.getChildAt(i13);
                        if (S != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = S;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - syVar.f37593a.getPaddingTop();
                        if (tyVar.K) {
                            f7 = 0.0f;
                        }
                        if (syVar.f37593a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((syVar.f37593a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                sy syVar2 = this.f37587b;
                syVar2.d.W(syVar2.I);
                syVar2.K.Q = true;
                py pyVar2 = syVar2.f37593a;
                pyVar2.f36564d3 = true;
                syVar2.H = false;
                pyVar2.invalidate();
                return;
        }
    }
}
