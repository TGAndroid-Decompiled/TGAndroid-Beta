package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final int f52966a;
    public int f52967b;
    public final org.telegram.messenger.gs f52968c;

    public w7(org.telegram.messenger.gs gsVar, Context context, int i7) {
        super(context);
        this.f52966a = i7;
        this.f52968c = gsVar;
        this.f52967b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f52966a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f52967b != measuredWidth) {
                    this.f52967b = measuredWidth;
                    ((i8) this.f52968c).M.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f52967b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    np npVar = (np) this.f52968c;
                    npVar.f50244b.y0(npVar.W - 1);
                }
                this.f52967b = i13;
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                Point point = org.telegram.messenger.g0.f24010q;
                int i15 = point.x + point.y;
                int i16 = this.f52967b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) this.f52968c;
                    c20Var.f33962y = false;
                    c20Var.a();
                }
                this.f52967b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f52966a) {
            case 2:
                super.setVisibility(i7);
                if (i7 == 8) {
                    this.f52967b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public w7(i8 i8Var, Context context) {
        super(context);
        this.f52966a = 0;
        this.f52968c = i8Var;
    }
}
