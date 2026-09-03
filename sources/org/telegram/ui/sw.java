package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sw implements Runnable {
    public final int f41324a;
    public final oy f41325b;

    public sw(oy oyVar, int i10) {
        this.f41324a = i10;
        this.f41325b = oyVar;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f41324a) {
            case 0:
                this.f41325b.d.l();
                return;
            case 1:
                oy oyVar = this.f41325b;
                py pyVar = oyVar.H;
                ly lyVar = oyVar.f39822a;
                if (lyVar != null && lyVar.getScrollState() == 0 && oyVar.f39822a.getChildCount() > 0 && oyVar.f39822a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (oyVar.f39829s == 0 && pyVar.Z3() && oyVar.v == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float f10 = pyVar.K;
                    f2.j0 j0Var = (f2.j0) oyVar.f39822a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < oyVar.f39822a.getChildCount(); i13++) {
                        int R = RecyclerView.R(oyVar.f39822a.getChildAt(i13));
                        View childAt = oyVar.f39822a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - oyVar.f39822a.getPaddingTop();
                        if (pyVar.H) {
                            f10 = 0.0f;
                        }
                        if (oyVar.f39822a.getScrollState() != 1) {
                            if (z4 && i12 == 0 && ((oyVar.f39822a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i10 = i12;
                            }
                            j0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                oy oyVar2 = this.f41325b;
                oyVar2.d.W(oyVar2.F);
                oyVar2.H.N = true;
                ly lyVar2 = oyVar2.f39822a;
                lyVar2.f38800a3 = true;
                oyVar2.E = false;
                lyVar2.invalidate();
                return;
        }
    }
}
