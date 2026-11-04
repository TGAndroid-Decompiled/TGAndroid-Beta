package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class rx0 extends FrameLayout {
    public final org.telegram.ui.Components.e5 f49302a;
    public final sx0 f49303b;

    public rx0(sx0 sx0Var, Context context) {
        super(context);
        this.f49303b = sx0Var;
        TextView g7 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(g7, org.telegram.ui.ActionBar.k6.G6, sx0Var.getResourceProvider());
        g7.setText(org.telegram.messenger.bd.M0(2131751351, null));
        addView(g7, b8.mf.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f49302a = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        sx0 sx0Var = this.f49303b;
        String Q = org.telegram.messenger.li.b0(sx0.d0(sx0Var)).Q();
        org.telegram.ui.Components.e5 e5Var = this.f49302a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                e5Var.j(Long.parseLong(Q.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(sx0.e0(sx0Var)).f24045r.get(Q);
        if (tL_availableReaction != null) {
            e5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.e5 e5Var = this.f49302a;
        e5Var.setBounds((width - e5Var.f33289s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - e5Var.f33289s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + e5Var.f33289s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f49302a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49302a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49302a.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }
}
