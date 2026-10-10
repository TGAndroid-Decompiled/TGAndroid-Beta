package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vw implements Runnable {
    public final int f43035a;
    public final sy f43036b;

    public vw(sy syVar, int i10) {
        this.f43035a = i10;
        this.f43036b = syVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f43035a) {
            case 0:
                this.f43036b.d.l();
                return;
            case 1:
                sy syVar = this.f43036b;
                ty tyVar = syVar.K;
                py pyVar = syVar.f41834a;
                if (pyVar != null && pyVar.getScrollState() == 0 && syVar.f41834a.getChildCount() > 0 && syVar.f41834a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (syVar.f41841s == 0 && tyVar.W3() && syVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = tyVar.N;
                    s4.d0 d0Var = (s4.d0) syVar.f41834a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < syVar.f41834a.getChildCount(); i13++) {
                        int R = RecyclerView.R(syVar.f41834a.getChildAt(i13));
                        View childAt = syVar.f41834a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - syVar.f41834a.getPaddingTop();
                        if (tyVar.K) {
                            f7 = 0.0f;
                        }
                        if (syVar.f41834a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((syVar.f41834a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                sy syVar2 = this.f43036b;
                syVar2.d.W(syVar2.I);
                syVar2.K.Q = true;
                py pyVar2 = syVar2.f41834a;
                pyVar2.f40958b3 = true;
                syVar2.H = false;
                pyVar2.invalidate();
                return;
        }
    }
}
