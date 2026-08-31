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
public final class v21 extends FrameLayout {
    public final org.telegram.ui.Components.j5 f42106a;
    public final w21 f42107b;

    public v21(w21 w21Var, Context context) {
        super(context);
        this.f42107b = w21Var;
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(w21Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, k7.c6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f42106a = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z4) {
        w21 w21Var = this.f42107b;
        String doubleTapReaction = MediaDataController.getInstance(w21.Y(w21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.j5 j5Var = this.f42106a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                j5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z4);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(w21.Z(w21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            j5Var.i(tL_availableReaction.static_icon, z4);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.j5 j5Var = this.f42106a;
        j5Var.setBounds((width - j5Var.f28001s) - AndroidUtilities.dp(21.0f), (getHeight() - j5Var.f28001s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + j5Var.f28001s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f42106a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42106a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42106a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
