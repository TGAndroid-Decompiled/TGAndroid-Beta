package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.yn;
public final class h0 extends FrameLayout {
    public final n2 f53390a;
    public final View f53391b;
    public final boolean f53392c;
    public final MessageObject d;
    public final yn f53393e;
    public final int f53394f;
    public final int h;
    public final boolean f53395n;
    public final float f53396r;
    public final float f53397s;
    public final float v;
    public final o0 f53398w;
    public final k0 f53399x;

    public h0(k0 k0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, yn ynVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f53399x = k0Var;
        this.f53390a = n2Var;
        this.f53391b = view;
        this.f53392c = z10;
        this.d = messageObject;
        this.f53393e = ynVar;
        this.f53394f = i10;
        this.h = i11;
        this.f53395n = z11;
        this.f53396r = f7;
        this.f53397s = f10;
        this.v = f11;
        this.f53398w = o0Var;
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
            k0 k0Var = this.f53399x;
            if (i10 < k0Var.f53436x.size()) {
                ((j0) k0Var.f53436x.get(i10)).f53404a.onAttachedToWindow();
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
            k0 k0Var = this.f53399x;
            if (i10 < k0Var.f53436x.size()) {
                ((j0) k0Var.f53436x.get(i10)).f53404a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
