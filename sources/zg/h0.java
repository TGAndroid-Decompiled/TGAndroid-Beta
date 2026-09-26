package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.wn;
public final class h0 extends FrameLayout {
    public final m2 f49311a;
    public final View f49312b;
    public final boolean f49313c;
    public final MessageObject d;
    public final wn e;
    public final int f49314f;
    public final int h;
    public final boolean f49315n;
    public final float f49316r;
    public final float f49317s;
    public final float v;
    public final o0 f49318w;
    public final k0 f49319x;

    public h0(k0 k0Var, Context context, m2 m2Var, View view, boolean z10, MessageObject messageObject, wn wnVar, int i10, int i11, boolean z11, float f7, float f10, float f11, o0 o0Var) {
        super(context);
        this.f49319x = k0Var;
        this.f49311a = m2Var;
        this.f49312b = view;
        this.f49313c = z10;
        this.d = messageObject;
        this.e = wnVar;
        this.f49314f = i10;
        this.h = i11;
        this.f49315n = z11;
        this.f49316r = f7;
        this.f49317s = f10;
        this.v = f11;
        this.f49318w = o0Var;
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
            k0 k0Var = this.f49319x;
            if (i10 < k0Var.f49354x.size()) {
                ((j0) k0Var.f49354x.get(i10)).f49324a.onAttachedToWindow();
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
            k0 k0Var = this.f49319x;
            if (i10 < k0Var.f49354x.size()) {
                ((j0) k0Var.f49354x.get(i10)).f49324a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
