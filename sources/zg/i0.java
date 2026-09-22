package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.bo;
public final class i0 extends FrameLayout {
    public final n2 f49036a;
    public final View f49037b;
    public final boolean f49038c;
    public final MessageObject d;
    public final bo e;
    public final int f49039f;
    public final int h;
    public final boolean f49040n;
    public final float f49041r;
    public final float f49042s;
    public final float v;
    public final p0 f49043w;
    public final l0 f49044x;

    public i0(l0 l0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, bo boVar, int i10, int i11, boolean z11, float f7, float f10, float f11, p0 p0Var) {
        super(context);
        this.f49044x = l0Var;
        this.f49036a = n2Var;
        this.f49037b = view;
        this.f49038c = z10;
        this.d = messageObject;
        this.e = boVar;
        this.f49039f = i10;
        this.h = i11;
        this.f49040n = z11;
        this.f49041r = f7;
        this.f49042s = f10;
        this.v = f11;
        this.f49043w = p0Var;
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
            l0 l0Var = this.f49044x;
            if (i10 < l0Var.f49079x.size()) {
                ((k0) l0Var.f49079x.get(i10)).f49049a.onAttachedToWindow();
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
            l0 l0Var = this.f49044x;
            if (i10 < l0Var.f49079x.size()) {
                ((k0) l0Var.f49079x.get(i10)).f49049a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
