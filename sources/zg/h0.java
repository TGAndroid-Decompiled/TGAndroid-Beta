package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.zn;
public final class h0 extends FrameLayout {
    public final n2 f49293a;
    public final View f49294b;
    public final boolean f49295c;
    public final MessageObject d;
    public final zn e;
    public final int f49296f;
    public final int h;
    public final boolean f49297n;
    public final float f49298r;
    public final float f49299s;
    public final float v;
    public final o0 f49300w;
    public final k0 f49301x;

    public h0(k0 k0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, zn znVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f49301x = k0Var;
        this.f49293a = n2Var;
        this.f49294b = view;
        this.f49295c = z10;
        this.d = messageObject;
        this.e = znVar;
        this.f49296f = i10;
        this.h = i11;
        this.f49297n = z11;
        this.f49298r = f7;
        this.f49299s = f10;
        this.v = f11;
        this.f49300w = o0Var;
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
            k0 k0Var = this.f49301x;
            if (i10 < k0Var.f49336x.size()) {
                ((j0) k0Var.f49336x.get(i10)).f49306a.onAttachedToWindow();
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
            k0 k0Var = this.f49301x;
            if (i10 < k0Var.f49336x.size()) {
                ((j0) k0Var.f49336x.get(i10)).f49306a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
