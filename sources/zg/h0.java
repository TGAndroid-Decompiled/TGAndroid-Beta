package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.wn;
public final class h0 extends FrameLayout {
    public final m2 f49301a;
    public final View f49302b;
    public final boolean f49303c;
    public final MessageObject d;
    public final wn e;
    public final int f49304f;
    public final int h;
    public final boolean f49305n;
    public final float f49306r;
    public final float f49307s;
    public final float v;
    public final o0 f49308w;
    public final k0 f49309x;

    public h0(k0 k0Var, Context context, m2 m2Var, View view, boolean z10, MessageObject messageObject, wn wnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f49309x = k0Var;
        this.f49301a = m2Var;
        this.f49302b = view;
        this.f49303c = z10;
        this.d = messageObject;
        this.e = wnVar;
        this.f49304f = i10;
        this.h = i11;
        this.f49305n = z11;
        this.f49306r = f7;
        this.f49307s = f10;
        this.v = f11;
        this.f49308w = o0Var;
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
            k0 k0Var = this.f49309x;
            if (i10 < k0Var.f49344x.size()) {
                ((j0) k0Var.f49344x.get(i10)).f49314a.onAttachedToWindow();
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
            k0 k0Var = this.f49309x;
            if (i10 < k0Var.f49344x.size()) {
                ((j0) k0Var.f49344x.get(i10)).f49314a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
