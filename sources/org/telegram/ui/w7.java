package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final int f42683a;
    public int f42684b;
    public final org.telegram.messenger.vs f42685c;

    public w7(org.telegram.messenger.vs vsVar, Context context, int i10) {
        super(context);
        this.f42683a = i10;
        this.f42685c = vsVar;
        this.f42684b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42683a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f42684b != measuredWidth) {
                    this.f42684b = measuredWidth;
                    ((h8) this.f42685c).L.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f42684b;
                if (i15 != -1 && Math.abs(i15 - i14) > org.telegram.messenger.i0.L(20.0f)) {
                    iq iqVar = (iq) this.f42685c;
                    iqVar.f38122b.y0(iqVar.V - 1);
                }
                this.f42684b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = org.telegram.messenger.i0.f16172q;
                int i16 = point.x + point.y;
                int i17 = this.f42684b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.g20 g20Var = (org.telegram.ui.Components.g20) this.f42685c;
                    g20Var.f26309x = false;
                    g20Var.a();
                }
                this.f42684b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f42683a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f42684b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public w7(h8 h8Var, Context context) {
        super(context);
        this.f42683a = 0;
        this.f42685c = h8Var;
    }
}
