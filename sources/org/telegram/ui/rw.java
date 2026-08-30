package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rw implements Runnable {
    public final int f38131a;
    public final ny f38132b;

    public rw(ny nyVar, int i10) {
        this.f38131a = i10;
        this.f38132b = nyVar;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f38131a) {
            case 0:
                this.f38132b.d.l();
                return;
            case 1:
                ny nyVar = this.f38132b;
                oy oyVar = nyVar.H;
                ky kyVar = nyVar.f36741a;
                if (kyVar != null && kyVar.getScrollState() == 0 && nyVar.f36741a.getChildCount() > 0 && nyVar.f36741a.getLayoutManager() != null) {
                    int i10 = 1;
                    if (nyVar.f36747s == 0 && oyVar.Z3() && nyVar.v == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    float f10 = oyVar.K;
                    f2.i0 i0Var = (f2.i0) nyVar.f36741a.getLayoutManager();
                    View view = null;
                    int i11 = Integer.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < nyVar.f36741a.getChildCount(); i13++) {
                        int R = RecyclerView.R(nyVar.f36741a.getChildAt(i13));
                        View childAt = nyVar.f36741a.getChildAt(i13);
                        if (R != -1 && childAt != null && childAt.getTop() < i11) {
                            i11 = childAt.getTop();
                            i12 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - nyVar.f36741a.getPaddingTop();
                        if (oyVar.H) {
                            f10 = 0.0f;
                        }
                        if (nyVar.f36741a.getScrollState() != 1) {
                            if (z4 && i12 == 0 && ((nyVar.f36741a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
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
                ny nyVar2 = this.f38132b;
                nyVar2.d.W(nyVar2.F);
                nyVar2.H.N = true;
                ky kyVar2 = nyVar2.f36741a;
                kyVar2.f35833a3 = true;
                nyVar2.E = false;
                kyVar2.invalidate();
                return;
        }
    }
}
