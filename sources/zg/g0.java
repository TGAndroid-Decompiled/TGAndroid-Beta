package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.zn;
public final class g0 extends FrameLayout {
    public final n2 f54570a;
    public final View f54571b;
    public final boolean f54572c;
    public final MessageObject d;
    public final zn f54573e;
    public final int f54574f;
    public final int h;
    public final boolean f54575n;
    public final float f54576r;
    public final float f54577s;
    public final float v;
    public final n0 f54578w;
    public final j0 f54579x;

    public g0(j0 j0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, zn znVar, int i10, int i11, boolean z11, float f7, float f10, float f11, n0 n0Var) {
        super(context);
        this.f54579x = j0Var;
        this.f54570a = n2Var;
        this.f54571b = view;
        this.f54572c = z10;
        this.d = messageObject;
        this.f54573e = znVar;
        this.f54574f = i10;
        this.h = i11;
        this.f54575n = z11;
        this.f54576r = f7;
        this.f54577s = f10;
        this.v = f11;
        this.f54578w = n0Var;
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
            j0 j0Var = this.f54579x;
            if (i10 < j0Var.f54616x.size()) {
                ((i0) j0Var.f54616x.get(i10)).f54584a.onAttachedToWindow();
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
            j0 j0Var = this.f54579x;
            if (i10 < j0Var.f54616x.size()) {
                ((i0) j0Var.f54616x.get(i10)).f54584a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
