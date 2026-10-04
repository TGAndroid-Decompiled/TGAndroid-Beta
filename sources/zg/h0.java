package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.yn;
public final class h0 extends FrameLayout {
    public final n2 f53396a;
    public final View f53397b;
    public final boolean f53398c;
    public final MessageObject d;
    public final yn f53399e;
    public final int f53400f;
    public final int h;
    public final boolean f53401n;
    public final float f53402r;
    public final float f53403s;
    public final float v;
    public final o0 f53404w;
    public final k0 f53405x;

    public h0(k0 k0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, yn ynVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f53405x = k0Var;
        this.f53396a = n2Var;
        this.f53397b = view;
        this.f53398c = z10;
        this.d = messageObject;
        this.f53399e = ynVar;
        this.f53400f = i10;
        this.h = i11;
        this.f53401n = z11;
        this.f53402r = f7;
        this.f53403s = f10;
        this.v = f11;
        this.f53404w = o0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: zg.h0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            k0 k0Var = this.f53405x;
            if (i10 < k0Var.f53442x.size()) {
                ((j0) k0Var.f53442x.get(i10)).f53410a.onAttachedToWindow();
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
            k0 k0Var = this.f53405x;
            if (i10 < k0Var.f53442x.size()) {
                ((j0) k0Var.f53442x.get(i10)).f53410a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
