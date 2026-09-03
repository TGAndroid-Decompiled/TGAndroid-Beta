package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class tw implements Runnable {
    public final int f38598a;
    public final py f38599b;

    public tw(py pyVar, int i10) {
        this.f38598a = i10;
        this.f38599b = pyVar;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f38598a) {
            case 0:
                this.f38599b.d.l();
                return;
            case 1:
                py pyVar = this.f38599b;
                qy qyVar = pyVar.H;
                my myVar = pyVar.f37246a;
                if (myVar != null && myVar.getScrollState() == 0 && pyVar.f37246a.getChildCount() > 0 && pyVar.f37246a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (pyVar.f37252s == 0 && qyVar.Z3() && pyVar.v == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float f10 = qyVar.K;
                    f2.i0 i0Var = (f2.i0) pyVar.f37246a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < pyVar.f37246a.getChildCount(); i13++) {
                        int R = RecyclerView.R(pyVar.f37246a.getChildAt(i13));
                        View childAt = pyVar.f37246a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - pyVar.f37246a.getPaddingTop();
                        if (qyVar.H) {
                            f10 = 0.0f;
                        }
                        if (pyVar.f37246a.getScrollState() != 1) {
                            if (z4 && i12 == 0 && ((pyVar.f37246a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i10 = i12;
                            }
                            i0Var.h1(i10, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                py pyVar2 = this.f38599b;
                pyVar2.d.W(pyVar2.F);
                pyVar2.H.N = true;
                my myVar2 = pyVar2.f37246a;
                myVar2.f36271a3 = true;
                pyVar2.E = false;
                myVar2.invalidate();
                return;
        }
    }
}
