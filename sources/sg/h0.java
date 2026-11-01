package sg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.kj;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.un;
public final class h0 extends FrameLayout {
    public final k2 f48352a;
    public final View f48353b;
    public final boolean f48354c;
    public final kj d;
    public final un e;
    public final int f48355f;
    public final int h;
    public final boolean f48356n;
    public final float f48357r;
    public final float f48358s;
    public final float f48359w;
    public final o0 f48360x;
    public final k0 f48361y;

    public h0(k0 k0Var, Context context, k2 k2Var, View view, boolean z10, kj kjVar, un unVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f48361y = k0Var;
        this.f48352a = k2Var;
        this.f48353b = view;
        this.f48354c = z10;
        this.d = kjVar;
        this.e = unVar;
        this.f48355f = i10;
        this.h = i11;
        this.f48356n = z11;
        this.f48357r = f7;
        this.f48358s = f10;
        this.f48359w = f11;
        this.f48360x = o0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: sg.h0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            k0 k0Var = this.f48361y;
            if (i10 < k0Var.f48395x.size()) {
                ((j0) k0Var.f48395x.get(i10)).f48366a.P();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            k0 k0Var = this.f48361y;
            if (i10 < k0Var.f48395x.size()) {
                ((j0) k0Var.f48395x.get(i10)).f48366a.R();
                i10++;
            } else {
                return;
            }
        }
    }
}
