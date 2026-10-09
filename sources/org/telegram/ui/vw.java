package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vw implements Runnable {
    public final int f42989a;
    public final sy f42990b;

    public vw(sy syVar, int i10) {
        this.f42989a = i10;
        this.f42990b = syVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42989a) {
            case 0:
                this.f42990b.d.l();
                return;
            case 1:
                sy syVar = this.f42990b;
                ty tyVar = syVar.K;
                py pyVar = syVar.f41788a;
                if (pyVar != null && pyVar.getScrollState() == 0 && syVar.f41788a.getChildCount() > 0 && syVar.f41788a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (syVar.f41795s == 0 && tyVar.W3() && syVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = tyVar.N;
                    s4.d0 d0Var = (s4.d0) syVar.f41788a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < syVar.f41788a.getChildCount(); i13++) {
                        int R = RecyclerView.R(syVar.f41788a.getChildAt(i13));
                        View childAt = syVar.f41788a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - syVar.f41788a.getPaddingTop();
                        if (tyVar.K) {
                            f7 = 0.0f;
                        }
                        if (syVar.f41788a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((syVar.f41788a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                sy syVar2 = this.f42990b;
                syVar2.d.W(syVar2.I);
                syVar2.K.Q = true;
                py pyVar2 = syVar2.f41788a;
                pyVar2.f40912b3 = true;
                syVar2.H = false;
                pyVar2.invalidate();
                return;
        }
    }
}
