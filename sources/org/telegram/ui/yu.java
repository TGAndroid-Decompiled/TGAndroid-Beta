package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yu implements Runnable {
    public final int f52412a;
    public final tw f52413b;

    public yu(tw twVar, int i3) {
        this.f52412a = i3;
        this.f52413b = twVar;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f52412a) {
            case 0:
                this.f52413b.d.f();
                return;
            case 1:
                tw twVar = this.f52413b;
                uw uwVar = twVar.L;
                pw pwVar = twVar.f49897a;
                if (pwVar != null && pwVar.getScrollState() == 0 && twVar.f49897a.getChildCount() > 0 && twVar.f49897a.getLayoutManager() != null) {
                    int i3 = 1;
                    if (twVar.f49904s == 0 && uwVar.l4() && twVar.f49905w == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f10 = uwVar.O;
                    u4.b0 b0Var = (u4.b0) twVar.f49897a.getLayoutManager();
                    View view = null;
                    int i10 = Integer.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < twVar.f49897a.getChildCount(); i12++) {
                        int R = RecyclerView.R(twVar.f49897a.getChildAt(i12));
                        View childAt = twVar.f49897a.getChildAt(i12);
                        if (R != -1 && childAt != null && childAt.getTop() < i10) {
                            i10 = childAt.getTop();
                            i11 = R;
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        float top = view.getTop() - twVar.f49897a.getPaddingTop();
                        if (uwVar.L) {
                            f10 = 0.0f;
                        }
                        if (twVar.f49897a.getScrollState() != 1) {
                            if (z10 && i11 == 0 && ((twVar.f49897a.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f10 < 0.0f) {
                                top = f10;
                            } else {
                                i3 = i11;
                            }
                            b0Var.h1(i3, (int) top);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                tw twVar2 = this.f52413b;
                twVar2.d.X(twVar2.J);
                twVar2.L.R = true;
                pw pwVar2 = twVar2.f49897a;
                pwVar2.f48676k3 = true;
                twVar2.I = false;
                pwVar2.invalidate();
                return;
        }
    }
}
