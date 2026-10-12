package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.eo;
public final class g0 extends FrameLayout {
    public final m2 f54750a;
    public final View f54751b;
    public final boolean f54752c;
    public final MessageObject d;
    public final eo f54753e;
    public final int f54754f;
    public final int h;
    public final boolean f54755n;
    public final float f54756r;
    public final float f54757s;
    public final float v;
    public final n0 f54758w;
    public final j0 f54759x;

    public g0(j0 j0Var, Context context, m2 m2Var, View view, boolean z10, MessageObject messageObject, eo eoVar, int i10, int i11, boolean z11, float f7, float f10, float f11, n0 n0Var) {
        super(context);
        this.f54759x = j0Var;
        this.f54750a = m2Var;
        this.f54751b = view;
        this.f54752c = z10;
        this.d = messageObject;
        this.f54753e = eoVar;
        this.f54754f = i10;
        this.h = i11;
        this.f54755n = z11;
        this.f54756r = f7;
        this.f54757s = f10;
        this.v = f11;
        this.f54758w = n0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: zg.g0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            j0 j0Var = this.f54759x;
            if (i10 < j0Var.f54796x.size()) {
                ((i0) j0Var.f54796x.get(i10)).f54764a.onAttachedToWindow();
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
            j0 j0Var = this.f54759x;
            if (i10 < j0Var.f54796x.size()) {
                ((i0) j0Var.f54796x.get(i10)).f54764a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
