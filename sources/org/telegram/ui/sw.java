package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class sw implements Runnable {
    public final int f37876a;
    public final py f37877b;

    public sw(py pyVar, int i10) {
        this.f37876a = i10;
        this.f37877b = pyVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37876a) {
            case 0:
                this.f37877b.d.l();
                return;
            case 1:
                py pyVar = this.f37877b;
                qy qyVar = pyVar.K;
                my myVar = pyVar.f36694a;
                if (myVar != null && myVar.getScrollState() == 0 && pyVar.f36694a.getChildCount() > 0 && pyVar.f36694a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (pyVar.f36700s == 0 && qyVar.Z3() && pyVar.v == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f7 = qyVar.N;
                    s4.c0 c0Var = (s4.c0) pyVar.f36694a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < pyVar.f36694a.getChildCount(); i13++) {
                        int R = RecyclerView.R(pyVar.f36694a.getChildAt(i13));
                        View childAt = pyVar.f36694a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - pyVar.f36694a.getPaddingTop();
                        if (qyVar.K) {
                            f7 = 0.0f;
                        }
                        if (pyVar.f36694a.getScrollState() != 1) {
                            if (z10 && i12 == 0 && ((pyVar.f36694a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f7 < 0.0f) {
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
                py pyVar2 = this.f37877b;
                pyVar2.d.W(pyVar2.I);
                pyVar2.K.Q = true;
                my myVar2 = pyVar2.f36694a;
                myVar2.f35686d3 = true;
                pyVar2.H = false;
                myVar2.invalidate();
                return;
        }
    }
}
