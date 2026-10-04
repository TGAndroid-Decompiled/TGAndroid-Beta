package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.yn;
public final class h0 extends FrameLayout {
    public final n2 f53391a;
    public final View f53392b;
    public final boolean f53393c;
    public final MessageObject d;
    public final yn f53394e;
    public final int f53395f;
    public final int h;
    public final boolean f53396n;
    public final float f53397r;
    public final float f53398s;
    public final float v;
    public final o0 f53399w;
    public final k0 f53400x;

    public h0(k0 k0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, yn ynVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f53400x = k0Var;
        this.f53391a = n2Var;
        this.f53392b = view;
        this.f53393c = z10;
        this.d = messageObject;
        this.f53394e = ynVar;
        this.f53395f = i10;
        this.h = i11;
        this.f53396n = z11;
        this.f53397r = f7;
        this.f53398s = f10;
        this.v = f11;
        this.f53399w = o0Var;
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
            k0 k0Var = this.f53400x;
            if (i10 < k0Var.f53437x.size()) {
                ((j0) k0Var.f53437x.get(i10)).f53405a.onAttachedToWindow();
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
            k0 k0Var = this.f53400x;
            if (i10 < k0Var.f53437x.size()) {
                ((j0) k0Var.f53437x.get(i10)).f53405a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
