package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final int f50955a;
    public int f50956b;
    public final org.telegram.messenger.ls f50957c;

    public w7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.f50955a = i7;
        this.f50957c = lsVar;
        this.f50956b = -1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f50955a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f50956b != measuredWidth) {
                    this.f50956b = measuredWidth;
                    ((h8) this.f50957c).L.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f50956b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    kp kpVar = (kp) this.f50957c;
                    kpVar.f47227b.y0(kpVar.V - 1);
                }
                this.f50956b = i13;
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                Point point = org.telegram.messenger.g0.f22563q;
                int i15 = point.x + point.y;
                int i16 = this.f50956b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.p10 p10Var = (org.telegram.ui.Components.p10) this.f50957c;
                    p10Var.f36778y = false;
                    p10Var.a();
                }
                this.f50956b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f50955a) {
            case 2:
                super.setVisibility(i7);
                if (i7 == 8) {
                    this.f50956b = -1;
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
        this.f50955a = 0;
        this.f50957c = h8Var;
    }
}
