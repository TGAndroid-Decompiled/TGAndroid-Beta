package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.eo;
public final class g0 extends FrameLayout {
    public final m2 f54758a;
    public final View f54759b;
    public final boolean f54760c;
    public final MessageObject d;
    public final eo f54761e;
    public final int f54762f;
    public final int h;
    public final boolean f54763n;
    public final float f54764r;
    public final float f54765s;
    public final float v;
    public final n0 f54766w;
    public final j0 f54767x;

    public g0(j0 j0Var, Context context, m2 m2Var, View view, boolean z10, MessageObject messageObject, eo eoVar, int i10, int i11, boolean z11, float f7, float f10, float f11, n0 n0Var) {
        super(context);
        this.f54767x = j0Var;
        this.f54758a = m2Var;
        this.f54759b = view;
        this.f54760c = z10;
        this.d = messageObject;
        this.f54761e = eoVar;
        this.f54762f = i10;
        this.h = i11;
        this.f54763n = z11;
        this.f54764r = f7;
        this.f54765s = f10;
        this.v = f11;
        this.f54766w = n0Var;
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
            j0 j0Var = this.f54767x;
            if (i10 < j0Var.f54804x.size()) {
                ((i0) j0Var.f54804x.get(i10)).f54772a.onAttachedToWindow();
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
            j0 j0Var = this.f54767x;
            if (i10 < j0Var.f54804x.size()) {
                ((i0) j0Var.f54804x.get(i10)).f54772a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
