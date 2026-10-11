package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.zn;
public final class g0 extends FrameLayout {
    public final m2 f54647a;
    public final View f54648b;
    public final boolean f54649c;
    public final MessageObject d;
    public final zn f54650e;
    public final int f54651f;
    public final int h;
    public final boolean f54652n;
    public final float f54653r;
    public final float f54654s;
    public final float v;
    public final n0 f54655w;
    public final j0 f54656x;

    public g0(j0 j0Var, Context context, m2 m2Var, View view, boolean z10, MessageObject messageObject, zn znVar, int i10, int i11, boolean z11, float f7, float f10, float f11, n0 n0Var) {
        super(context);
        this.f54656x = j0Var;
        this.f54647a = m2Var;
        this.f54648b = view;
        this.f54649c = z10;
        this.d = messageObject;
        this.f54650e = znVar;
        this.f54651f = i10;
        this.h = i11;
        this.f54652n = z11;
        this.f54653r = f7;
        this.f54654s = f10;
        this.v = f11;
        this.f54655w = n0Var;
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
            j0 j0Var = this.f54656x;
            if (i10 < j0Var.f54693x.size()) {
                ((i0) j0Var.f54693x.get(i10)).f54661a.onAttachedToWindow();
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
            j0 j0Var = this.f54656x;
            if (i10 < j0Var.f54693x.size()) {
                ((i0) j0Var.f54693x.get(i10)).f54661a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
