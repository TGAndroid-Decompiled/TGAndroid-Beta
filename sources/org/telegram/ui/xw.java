package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xw implements Runnable {
    public final int f44182a;
    public final uy f44183b;

    public xw(uy uyVar, int i10) {
        this.f44182a = i10;
        this.f44183b = uyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f44182a) {
            case 0:
                this.f44183b.d.l();
                return;
            case 1:
                uy uyVar = this.f44183b;
                vy vyVar = uyVar.K;
                ry ryVar = uyVar.f42611a;
                if (ryVar != null && ryVar.getScrollState() == 0 && uyVar.f42611a.getChildCount() > 0 && uyVar.f42611a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (uyVar.f42618s == 0 && vyVar.W3() && uyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = vyVar.N;
                    s4.d0 d0Var = (s4.d0) uyVar.f42611a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < uyVar.f42611a.getChildCount(); i13++) {
                        int R = RecyclerView.R(uyVar.f42611a.getChildAt(i13));
                        View childAt = uyVar.f42611a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - uyVar.f42611a.getPaddingTop();
                        if (vyVar.K) {
                            f7 = 0.0f;
                        }
                        if (uyVar.f42611a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((uyVar.f42611a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                uy uyVar2 = this.f44183b;
                uyVar2.d.W(uyVar2.I);
                uyVar2.K.Q = true;
                ry ryVar2 = uyVar2.f42611a;
                ryVar2.f41750b3 = true;
                uyVar2.H = false;
                ryVar2.invalidate();
                return;
        }
    }
}
