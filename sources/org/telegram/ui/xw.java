package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xw implements Runnable {
    public final int f44187a;
    public final uy f44188b;

    public xw(uy uyVar, int i10) {
        this.f44187a = i10;
        this.f44188b = uyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f44187a) {
            case 0:
                this.f44188b.d.l();
                return;
            case 1:
                uy uyVar = this.f44188b;
                vy vyVar = uyVar.K;
                ry ryVar = uyVar.f42613a;
                if (ryVar != null && ryVar.getScrollState() == 0 && uyVar.f42613a.getChildCount() > 0 && uyVar.f42613a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (uyVar.f42620s == 0 && vyVar.W3() && uyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = vyVar.N;
                    s4.d0 d0Var = (s4.d0) uyVar.f42613a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < uyVar.f42613a.getChildCount(); i13++) {
                        int R = RecyclerView.R(uyVar.f42613a.getChildAt(i13));
                        View childAt = uyVar.f42613a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - uyVar.f42613a.getPaddingTop();
                        if (vyVar.K) {
                            f7 = 0.0f;
                        }
                        if (uyVar.f42613a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((uyVar.f42613a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
                                top = f7;
                            } else {
                                i10 = i12;
                            }
                            d0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                uy uyVar2 = this.f44188b;
                uyVar2.d.W(uyVar2.I);
                uyVar2.K.Q = true;
                ry ryVar2 = uyVar2.f42613a;
                ryVar2.f41750b3 = true;
                uyVar2.H = false;
                ryVar2.invalidate();
                return;
        }
    }
}
