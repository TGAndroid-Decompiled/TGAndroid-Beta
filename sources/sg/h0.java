package sg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.jj;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.un;
public final class h0 extends FrameLayout {
    public final k2 f48341a;
    public final View f48342b;
    public final boolean f48343c;
    public final jj d;
    public final un e;
    public final int f48344f;
    public final int h;
    public final boolean f48345n;
    public final float f48346r;
    public final float f48347s;
    public final float f48348w;
    public final o0 f48349x;
    public final k0 f48350y;

    public h0(k0 k0Var, Context context, k2 k2Var, View view, boolean z10, jj jjVar, un unVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f48350y = k0Var;
        this.f48341a = k2Var;
        this.f48342b = view;
        this.f48343c = z10;
        this.d = jjVar;
        this.e = unVar;
        this.f48344f = i10;
        this.h = i11;
        this.f48345n = z11;
        this.f48346r = f7;
        this.f48347s = f10;
        this.f48348w = f11;
        this.f48349x = o0Var;
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
            k0 k0Var = this.f48350y;
            if (i10 < k0Var.f48384x.size()) {
                ((j0) k0Var.f48384x.get(i10)).f48355a.P();
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
            k0 k0Var = this.f48350y;
            if (i10 < k0Var.f48384x.size()) {
                ((j0) k0Var.f48384x.get(i10)).f48355a.R();
                i10++;
            } else {
                return;
            }
        }
    }
}
