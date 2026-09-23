package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.xn;
public final class i0 extends FrameLayout {
    public final n2 f48987a;
    public final View f48988b;
    public final boolean f48989c;
    public final MessageObject d;
    public final xn e;
    public final int f48990f;
    public final int h;
    public final boolean f48991n;
    public final float f48992r;
    public final float f48993s;
    public final float v;
    public final p0 f48994w;
    public final l0 f48995x;

    public i0(l0 l0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, xn xnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, p0 p0Var) {
        super(context);
        this.f48995x = l0Var;
        this.f48987a = n2Var;
        this.f48988b = view;
        this.f48989c = z10;
        this.d = messageObject;
        this.e = xnVar;
        this.f48990f = i10;
        this.h = i11;
        this.f48991n = z11;
        this.f48992r = f7;
        this.f48993s = f10;
        this.v = f11;
        this.f48994w = p0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: zg.i0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            l0 l0Var = this.f48995x;
            if (i10 < l0Var.f49030x.size()) {
                ((k0) l0Var.f49030x.get(i10)).f49000a.onAttachedToWindow();
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
            l0 l0Var = this.f48995x;
            if (i10 < l0Var.f49030x.size()) {
                ((k0) l0Var.f49030x.get(i10)).f49000a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
