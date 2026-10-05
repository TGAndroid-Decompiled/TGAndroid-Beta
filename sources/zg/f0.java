package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.yn;
public final class f0 extends FrameLayout {
    public final n2 f53381a;
    public final View f53382b;
    public final boolean f53383c;
    public final MessageObject d;
    public final yn f53384e;
    public final int f53385f;
    public final int h;
    public final boolean f53386n;
    public final float f53387r;
    public final float f53388s;
    public final float v;
    public final m0 f53389w;
    public final i0 f53390x;

    public f0(i0 i0Var, Context context, n2 n2Var, View view, boolean z10, MessageObject messageObject, yn ynVar, int i10, int i11, boolean z11, float f7, float f10, float f11, m0 m0Var) {
        super(context);
        this.f53390x = i0Var;
        this.f53381a = n2Var;
        this.f53382b = view;
        this.f53383c = z10;
        this.d = messageObject;
        this.f53384e = ynVar;
        this.f53385f = i10;
        this.h = i11;
        this.f53386n = z11;
        this.f53387r = f7;
        this.f53388s = f10;
        this.v = f11;
        this.f53389w = m0Var;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: zg.f0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            i0 i0Var = this.f53390x;
            if (i10 < i0Var.f53427x.size()) {
                ((h0) i0Var.f53427x.get(i10)).f53395a.onAttachedToWindow();
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
            i0 i0Var = this.f53390x;
            if (i10 < i0Var.f53427x.size()) {
                ((h0) i0Var.f53427x.get(i10)).f53395a.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }
}
