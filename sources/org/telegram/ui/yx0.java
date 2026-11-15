package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class yx0 extends FrameLayout {
    public final org.telegram.ui.Components.e5 f53746a;
    public final zx0 f53747b;

    public yx0(zx0 zx0Var, Context context) {
        super(context);
        this.f53747b = zx0Var;
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(g10, org.telegram.ui.ActionBar.j6.G6, zx0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.hd.M0(2131751350, null));
        addView(g10, c8.ja.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f53746a = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        zx0 zx0Var = this.f53747b;
        String Q = org.telegram.messenger.si.b0(zx0.d0(zx0Var)).Q();
        org.telegram.ui.Components.e5 e5Var = this.f53746a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                e5Var.j(Long.parseLong(Q.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.b0(zx0.e0(zx0Var)).f26505r.get(Q);
        if (tL_availableReaction != null) {
            e5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.e5 e5Var = this.f53746a;
        e5Var.setBounds((width - e5Var.f34184s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - e5Var.f34184s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + e5Var.f34184s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f53746a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53746a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53746a.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
