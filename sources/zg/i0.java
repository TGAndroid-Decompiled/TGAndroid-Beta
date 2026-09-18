package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.bo;
public final class i0 extends FrameLayout {
    public final o2 f49071a;
    public final View f49072b;
    public final boolean f49073c;
    public final MessageObject d;
    public final bo e;
    public final int f49074f;
    public final int h;
    public final boolean f49075n;
    public final float f49076r;
    public final float f49077s;
    public final float v;
    public final p0 f49078w;
    public final l0 f49079x;

    public i0(l0 l0Var, Context context, o2 o2Var, View view, boolean z10, MessageObject messageObject, bo boVar, int i10, int i11, boolean z11, float f7, float f10, float f11, p0 p0Var) {
        super(context);
        this.f49079x = l0Var;
        this.f49071a = o2Var;
        this.f49072b = view;
        this.f49073c = z10;
        this.d = messageObject;
        this.e = boVar;
        this.f49074f = i10;
        this.h = i11;
        this.f49075n = z11;
        this.f49076r = f7;
        this.f49077s = f10;
        this.v = f11;
        this.f49078w = p0Var;
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
            l0 l0Var = this.f49079x;
            if (i10 < l0Var.f49114x.size()) {
                ((k0) l0Var.f49114x.get(i10)).f49084a.onAttachedToWindow();
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
            l0 l0Var = this.f49079x;
            if (i10 < l0Var.f49114x.size()) {
                ((k0) l0Var.f49114x.get(i10)).f49084a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
