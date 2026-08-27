package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

public final class r30 extends org.telegram.ui.Components.tt {
    public final s50 R;

    public r30(s50 s50Var, LaunchActivity launchActivity, w40 w40Var, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(launchActivity, w40Var, n2Var, 5, true, c6Var);
        this.R = s50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        s50 s50Var = this.R;
        s50Var.D.getEditText().setTranslationY(view.getMeasuredHeight() - s50Var.f42510x3.f48502e);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void f() {
        super.f();
        org.telegram.ui.Components.yy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f35035s0 = false;
            emojiView.f35040t2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(((org.telegram.ui.ActionBar.e3) this.R).containerView.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ud.c cVar = this.R.f42510x3;
        if (cVar.f48502e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int iMax;
        yg.i iVar = this.R.f42513y1;
        if (this.f32878e) {
            iMax = Math.max(0, getEmojiPadding());
        } else {
            iMax = this.J ? Math.max(0, getKeyboardHeight()) : 0;
        }
        if (iMax > 0) {
            iVar.f(iMax);
        } else {
            iVar.h(false);
        }
    }

    @Override
    public final void y() {
        ((org.telegram.ui.ActionBar.e3) this.R).containerView.requestApplyInsets();
    }
}
