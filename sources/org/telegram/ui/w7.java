package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class w7 extends FrameLayout {
    public final int f52999a;
    public int f53000b;
    public final org.telegram.messenger.fs f53001c;

    public w7(org.telegram.messenger.fs fsVar, Context context, int i7) {
        super(context);
        this.f52999a = i7;
        this.f53001c = fsVar;
        this.f53000b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f52999a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f53000b != measuredWidth) {
                    this.f53000b = measuredWidth;
                    ((i8) this.f53001c).M.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f53000b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    np npVar = (np) this.f53001c;
                    npVar.f50233b.y0(npVar.W - 1);
                }
                this.f53000b = i13;
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                Point point = org.telegram.messenger.g0.f24146q;
                int i15 = point.x + point.y;
                int i16 = this.f53000b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) this.f53001c;
                    c20Var.f34004y = false;
                    c20Var.a();
                }
                this.f53000b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f52999a) {
            case 2:
                super.setVisibility(i7);
                if (i7 == 8) {
                    this.f53000b = -1;
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
        this.f52999a = 0;
        this.f53001c = i8Var;
    }
}
