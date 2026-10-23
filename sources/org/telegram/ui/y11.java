package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class y11 extends FrameLayout {
    public final org.telegram.ui.Components.p5 f43337a;
    public final z11 f43338b;

    public y11(z11 z11Var, Context context) {
        super(context);
        this.f43338b = z11Var;
        TextView f7 = org.telegram.messenger.g0.f(context, 1, 16.0f);
        f7.setTextColor(z11Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        f7.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(f7, w7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f43337a = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        z11 z11Var = this.f43338b;
        String doubleTapReaction = MediaDataController.getInstance(z11.Y(z11Var)).getDoubleTapReaction();
        org.telegram.ui.Components.p5 p5Var = this.f43337a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                p5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(z11.Z(z11Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            p5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.p5 p5Var = this.f43337a;
        p5Var.setBounds((width - p5Var.f29218s) - AndroidUtilities.dp(21.0f), (getHeight() - p5Var.f29218s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + p5Var.f29218s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f43337a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43337a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43337a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
