package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class x7 extends FrameLayout {
    public final int f53115a;
    public int f53116b;
    public final org.telegram.messenger.is f53117c;

    public x7(org.telegram.messenger.is isVar, Context context, int i7) {
        super(context);
        this.f53115a = i7;
        this.f53117c = isVar;
        this.f53116b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f53115a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f53116b != measuredWidth) {
                    this.f53116b = measuredWidth;
                    ((i8) this.f53117c).M.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f53116b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    mp mpVar = (mp) this.f53117c;
                    mpVar.f49269b.y0(mpVar.W - 1);
                }
                this.f53116b = i13;
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                Point point = org.telegram.messenger.g0.f23611q;
                int i15 = point.x + point.y;
                int i16 = this.f53116b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) this.f53117c;
                    s10Var.f39156y = false;
                    s10Var.a();
                }
                this.f53116b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f53115a) {
            case 2:
                super.setVisibility(i7);
                if (i7 == 8) {
                    this.f53116b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i7);
                return;
        }
    }

    public x7(i8 i8Var, Context context) {
        super(context);
        this.f53115a = 0;
        this.f53117c = i8Var;
    }
}
