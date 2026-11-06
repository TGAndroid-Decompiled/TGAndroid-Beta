package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final int f50998a;
    public int f50999b;
    public final org.telegram.messenger.ls f51000c;

    public w7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.f50998a = i7;
        this.f51000c = lsVar;
        this.f50999b = -1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f50998a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f50999b != measuredWidth) {
                    this.f50999b = measuredWidth;
                    ((h8) this.f51000c).L.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f50999b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    kp kpVar = (kp) this.f51000c;
                    kpVar.f47200b.y0(kpVar.V - 1);
                }
                this.f50999b = i13;
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                Point point = org.telegram.messenger.g0.f22537q;
                int i15 = point.x + point.y;
                int i16 = this.f50999b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.p10 p10Var = (org.telegram.ui.Components.p10) this.f51000c;
                    p10Var.f36861y = false;
                    p10Var.a();
                }
                this.f50999b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f50998a) {
            case 2:
                super.setVisibility(i7);
                if (i7 == 8) {
                    this.f50999b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public w7(h8 h8Var, Context context) {
        super(context);
        this.f50998a = 0;
        this.f51000c = h8Var;
    }
}
