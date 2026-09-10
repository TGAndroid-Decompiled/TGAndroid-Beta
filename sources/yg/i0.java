package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.eo;
public final class i0 extends FrameLayout {
    public final p2 f47017a;
    public final View f47018b;
    public final boolean f47019c;
    public final MessageObject d;
    public final eo e;
    public final int f47020f;
    public final int h;
    public final boolean f47021n;
    public final float f47022r;
    public final float f47023s;
    public final float v;
    public final p0 f47024w;
    public final l0 f47025x;

    public i0(l0 l0Var, Context context, p2 p2Var, View view, boolean z10, MessageObject messageObject, eo eoVar, int i10, int i11, boolean z11, float f7, float f10, float f11, p0 p0Var) {
        super(context);
        this.f47025x = l0Var;
        this.f47017a = p2Var;
        this.f47018b = view;
        this.f47019c = z10;
        this.d = messageObject;
        this.e = eoVar;
        this.f47020f = i10;
        this.h = i11;
        this.f47021n = z11;
        this.f47022r = f7;
        this.f47023s = f10;
        this.v = f11;
        this.f47024w = p0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: yg.i0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            l0 l0Var = this.f47025x;
            if (i10 < l0Var.f47060x.size()) {
                ((k0) l0Var.f47060x.get(i10)).f47030a.onAttachedToWindow();
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
            l0 l0Var = this.f47025x;
            if (i10 < l0Var.f47060x.size()) {
                ((k0) l0Var.f47060x.get(i10)).f47030a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
