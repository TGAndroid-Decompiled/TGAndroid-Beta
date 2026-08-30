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
public final class t21 extends FrameLayout {
    public final org.telegram.ui.Components.j5 f38503a;
    public final u21 f38504b;

    public t21(u21 u21Var, Context context) {
        super(context);
        this.f38504b = u21Var;
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(u21Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, k7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.f38503a = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z4) {
        u21 u21Var = this.f38504b;
        String doubleTapReaction = MediaDataController.getInstance(u21.Y(u21Var)).getDoubleTapReaction();
        org.telegram.ui.Components.j5 j5Var = this.f38503a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                j5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z4);
                return;
            } catch (Exception unused) {
            }
        }
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(u21.Z(u21Var)).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            j5Var.i(tL_availableReaction.static_icon, z4);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.j5 j5Var = this.f38503a;
        j5Var.setBounds((width - j5Var.f25878s) - AndroidUtilities.dp(21.0f), (getHeight() - j5Var.f25878s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + j5Var.f25878s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.f38503a.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38503a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38503a.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
