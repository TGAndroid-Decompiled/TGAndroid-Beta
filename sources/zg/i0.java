package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.zn;
public final class i0 extends FrameLayout {
    public final n2 f49363a;
    public final View f49364b;
    public final boolean f49365c;
    public final MessageObject d;
    public final zn e;
    public final int f49366f;
    public final int h;
    public final boolean f49367n;
    public final float f49368r;
    public final float f49369s;
    public final float v;
    public final p0 f49370w;
    public final l0 f49371x;

    public i0(l0 l0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, zn znVar, int i10, int i11, boolean z11, float f7, float f10, float f11, p0 p0Var) {
        super(context);
        this.f49371x = l0Var;
        this.f49363a = n2Var;
        this.f49364b = view;
        this.f49365c = z10;
        this.d = messageObject;
        this.e = znVar;
        this.f49366f = i10;
        this.h = i11;
        this.f49367n = z11;
        this.f49368r = f7;
        this.f49369s = f10;
        this.v = f11;
        this.f49370w = p0Var;
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
            l0 l0Var = this.f49371x;
            if (i10 < l0Var.f49406x.size()) {
                ((k0) l0Var.f49406x.get(i10)).f49376a.onAttachedToWindow();
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
            l0 l0Var = this.f49371x;
            if (i10 < l0Var.f49406x.size()) {
                ((k0) l0Var.f49406x.get(i10)).f49376a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
