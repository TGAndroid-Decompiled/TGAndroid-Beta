package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.xn;
public final class i0 extends FrameLayout {
    public final o2 f49359a;
    public final View f49360b;
    public final boolean f49361c;
    public final MessageObject d;
    public final xn e;
    public final int f49362f;
    public final int h;
    public final boolean f49363n;
    public final float f49364r;
    public final float f49365s;
    public final float v;
    public final p0 f49366w;
    public final l0 f49367x;

    public i0(l0 l0Var, Context context, o2 o2Var, View view, boolean z10, MessageObject messageObject, xn xnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, p0 p0Var) {
        super(context);
        this.f49367x = l0Var;
        this.f49359a = o2Var;
        this.f49360b = view;
        this.f49361c = z10;
        this.d = messageObject;
        this.e = xnVar;
        this.f49362f = i10;
        this.h = i11;
        this.f49363n = z11;
        this.f49364r = f7;
        this.f49365s = f10;
        this.v = f11;
        this.f49366w = p0Var;
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
            l0 l0Var = this.f49367x;
            if (i10 < l0Var.f49403x.size()) {
                ((k0) l0Var.f49403x.get(i10)).f49373a.onAttachedToWindow();
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
            l0 l0Var = this.f49367x;
            if (i10 < l0Var.f49403x.size()) {
                ((k0) l0Var.f49403x.get(i10)).f49373a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
