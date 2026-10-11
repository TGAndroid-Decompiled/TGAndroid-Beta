package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class uw implements Runnable {
    public final int f42777a;
    public final ry f42778b;

    public uw(ry ryVar, int i10) {
        this.f42777a = i10;
        this.f42778b = ryVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42777a) {
            case 0:
                this.f42778b.d.l();
                return;
            case 1:
                ry ryVar = this.f42778b;
                sy syVar = ryVar.K;
                oy oyVar = ryVar.f41530a;
                if (oyVar != null && oyVar.getScrollState() == 0 && ryVar.f41530a.getChildCount() > 0 && ryVar.f41530a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (ryVar.f41537s == 0 && syVar.W3() && ryVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = syVar.N;
                    s4.d0 d0Var = (s4.d0) ryVar.f41530a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < ryVar.f41530a.getChildCount(); i13++) {
                        int R = RecyclerView.R(ryVar.f41530a.getChildAt(i13));
                        View childAt = ryVar.f41530a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - ryVar.f41530a.getPaddingTop();
                        if (syVar.K) {
                            f7 = 0.0f;
                        }
                        if (ryVar.f41530a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((ryVar.f41530a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                ry ryVar2 = this.f42778b;
                ryVar2.d.W(ryVar2.I);
                ryVar2.K.Q = true;
                oy oyVar2 = ryVar2.f41530a;
                oyVar2.f40644b3 = true;
                ryVar2.H = false;
                oyVar2.invalidate();
                return;
        }
    }
}
