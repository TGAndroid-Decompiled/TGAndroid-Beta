package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class r30 extends org.telegram.ui.Components.au {
    public final r50 R;

    public r30(r50 r50Var, LaunchActivity launchActivity, v40 v40Var, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(launchActivity, v40Var, o2Var, 5, true, c6Var);
        this.R = r50Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == getEditText()) {
            canvas.save();
            r50 r50Var = this.R;
            r50Var.D.getEditText().setTranslationY(view.getMeasuredHeight() - r50Var.f41968x3.f49510e);
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
        org.telegram.ui.Components.fz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.f28633s0 = false;
            emojiView.f28638t2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        vd.c cVar = this.R.f41968x3;
        if (cVar.f49510e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override
    public final void p() {
        int i10;
        ah.i iVar = this.R.f41971y1;
        if (this.f26885e) {
            i10 = Math.max(0, getEmojiPadding());
        } else if (this.J) {
            i10 = Math.max(0, getKeyboardHeight());
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            iVar.f(i10);
        } else {
            iVar.h(false);
        }
    }

    @Override
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
        viewGroup.requestApplyInsets();
    }
}
