package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class u30 extends org.telegram.ui.Components.ru {
    public final v50 V;

    public u30(v50 v50Var, LaunchActivity launchActivity, z40 z40Var, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(launchActivity, z40Var, r2Var, 5, true, u6Var);
        this.V = v50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            v50 v50Var = this.V;
            v50Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - v50Var.B3.f19334f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.sz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f32778w0 = false;
            emojiView.f32784x2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        oe.e eVar = this.V.B3;
        if (eVar.f19334f == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        rh.i iVar = this.V.C1;
        if (this.e) {
            i10 = Math.max(0, getEmojiPadding());
        } else if (this.N) {
            i10 = Math.max(0, getKeyboardHeight());
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            iVar.g(i10);
        } else {
            iVar.i(false);
        }
    }

    @Override
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
