package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class x7 extends FrameLayout {
    public final int f53116a;
    public int f53117b;
    public final org.telegram.messenger.is f53118c;

    public x7(org.telegram.messenger.is isVar, Context context, int i7) {
        super(context);
        this.f53116a = i7;
        this.f53118c = isVar;
        this.f53117b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f53116a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f53117b != measuredWidth) {
                    this.f53117b = measuredWidth;
                    ((i8) this.f53118c).M.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f53117b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    mp mpVar = (mp) this.f53118c;
                    mpVar.f49270b.y0(mpVar.W - 1);
                }
                this.f53117b = i13;
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                Point point = org.telegram.messenger.g0.f23609q;
                int i15 = point.x + point.y;
                int i16 = this.f53117b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) this.f53118c;
                    s10Var.f39159y = false;
                    s10Var.a();
                }
                this.f53117b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i7) {
        switch (this.f53116a) {
            case 2:
                super.setVisibility(i7);
                if (i7 == 8) {
                    this.f53117b = -1;
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
        this.f53116a = 0;
        this.f53118c = i8Var;
    }
}
