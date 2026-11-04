package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
public final class x7 extends FrameLayout {
    public final int f51874a;
    public int f51875b;
    public final org.telegram.messenger.cs f51876c;

    public x7(org.telegram.messenger.cs csVar, Context context, int i3) {
        super(context);
        this.f51874a = i3;
        this.f51876c = csVar;
        this.f51875b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f51874a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f51875b != measuredWidth) {
                    this.f51875b = measuredWidth;
                    ((i8) this.f51876c).M.f();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.f51875b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    ip ipVar = (ip) this.f51876c;
                    ipVar.f46326b.y0(ipVar.W - 1);
                }
                this.f51875b = i13;
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                Point point = org.telegram.messenger.g0.f22608q;
                int i15 = point.x + point.y;
                int i16 = this.f51875b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.l10 l10Var = (org.telegram.ui.Components.l10) this.f51876c;
                    l10Var.f35560x = false;
                    l10Var.a();
                }
                this.f51875b = i15;
                return;
        }
    }

    @Override
    public void setVisibility(int i3) {
        switch (this.f51874a) {
            case 2:
                super.setVisibility(i3);
                if (i3 == 8) {
                    this.f51875b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i3);
                return;
        }
    }

    public x7(i8 i8Var, Context context) {
        super(context);
        this.f51874a = 0;
        this.f51876c = i8Var;
    }
}
