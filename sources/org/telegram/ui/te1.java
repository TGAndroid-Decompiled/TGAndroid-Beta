package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class te1 extends org.telegram.ui.Cells.p2 {
    public boolean S4;
    public int T4;
    public TLRPC.TL_forumTopic U4;
    public org.telegram.ui.Components.k5 V4;
    public Drawable W4;
    public boolean X4;
    public boolean Y4;
    public boolean Z4;

    public Boolean f42926a5;

    public float f42927b5;

    public ValueAnimator f42928c5;

    public final we1 f42929d5;

    public te1(we1 we1Var, Context context, boolean z10) {
        super(context, z10);
        this.f42929d5 = we1Var;
        this.T4 = -1;
        this.f24952x = false;
        this.E = we1Var.isInPreviewMode() ? 11 : 50;
        this.Q = 24.0f;
        this.F = 64;
        this.G = 76;
        this.f24882j1 = true;
    }

    @Override
    public final boolean F() {
        return this.Z4;
    }

    public final void f0() {
        Drawable drawable = this.W4;
        boolean z10 = drawable instanceof wf.b;
        we1 we1Var = this.f42929d5;
        if (z10) {
            ((wf.b) drawable).a(i0.b.d(this.f42927b5, we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.R9), we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.L7)));
        }
        Drawable[] drawableArr = this.f24850d0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof wf.b) {
                ((wf.b) drawable2).a(i0.b.d(this.f42927b5, we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.R9), we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11 = this.f42926a5 != null;
        ValueAnimator valueAnimator = this.f42928c5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42928c5 = null;
        }
        this.f42926a5 = Boolean.valueOf(z10);
        if (!z11) {
            this.f42927b5 = z10 ? 1.0f : 0.0f;
            f0();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f42927b5, z10 ? 1.0f : 0.0f);
        this.f42928c5 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new w01(this, 18));
        this.f42928c5.setInterpolator(org.telegram.ui.Components.er.f28123g);
        this.f42928c5.start();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X4 = true;
        org.telegram.ui.Components.k5 k5Var = this.V4;
        if (k5Var != null) {
            k5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X4 = false;
        org.telegram.ui.Components.k5 k5Var = this.V4;
        if (k5Var != null) {
            k5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.wh0 wh0Var;
        lh.j3 j3Var;
        we1 we1Var = this.f42929d5;
        if (we1Var.getMessagesController().isMonoForum(-we1Var.f43719a)) {
            super.onDraw(canvas);
            return;
        }
        this.B3 = (!this.f24866g0 || (j3Var = this.f24896m2) == null) ? 0.0f : j3Var.getProgress() * AndroidUtilities.dp(30.0f);
        canvas.save();
        float f10 = this.B3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.A3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f24928s1, 0.0f);
        if (this.S4) {
            int iDp = this.f24912p2 ? 0 : AndroidUtilities.dp(this.E);
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f24928s1, getMeasuredHeight() - 1, getMeasuredWidth() - iDp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            } else {
                canvas.drawLine(iDp - this.f24928s1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
            }
        }
        if ((!this.Y4 || (wh0Var = this.a2) == null || wh0Var.C != 0.0f) && (this.V4 != null || this.W4 != null)) {
            int iDp2 = AndroidUtilities.dp(10.0f);
            int iDp3 = AndroidUtilities.dp(10.0f);
            int iDp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.k5 k5Var = this.V4;
            if (k5Var != null) {
                if (LocaleController.isRTL) {
                    k5Var.setBounds((getWidth() - iDp2) - iDp4, iDp3, getWidth() - iDp2, iDp4 + iDp3);
                } else {
                    k5Var.setBounds(iDp2, iDp3, iDp2 + iDp4, iDp4 + iDp3);
                }
                this.V4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.W4.setBounds((getWidth() - iDp2) - iDp4, iDp3, getWidth() - iDp2, iDp4 + iDp3);
                } else {
                    this.W4.setBounds(iDp2, iDp3, iDp2 + iDp4, iDp4 + iDp3);
                }
                this.W4.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.k5 k5Var) {
        org.telegram.ui.Components.k5 k5Var2 = this.V4;
        if (k5Var2 == k5Var) {
            return;
        }
        if (k5Var2 != null && this.X4) {
            k5Var2.o(this);
        }
        if (k5Var != null) {
            k5Var.setColorFilter(org.telegram.ui.ActionBar.g6.f23371v3);
        }
        this.V4 = k5Var;
        if (k5Var == null || !this.X4) {
            return;
        }
        k5Var.a(this);
    }

    public void setForumIcon(Drawable drawable) {
        this.W4 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        this.U4 = tL_forumTopic;
        boolean z10 = false;
        this.Z4 = tL_forumTopic != null && tL_forumTopic.closed;
        if (this.f24866g0) {
            g0(tL_forumTopic != null && tL_forumTopic.hidden);
        }
        this.Y4 = tL_forumTopic != null && tL_forumTopic.f22432id == 1;
        we1 we1Var = this.f42929d5;
        if (tL_forumTopic != null && this != we1Var.X0) {
            if (tL_forumTopic.hidden) {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.g6.f23056d9;
                this.J1 = org.telegram.ui.ActionBar.g6.f23039c9;
                this.K1 = "Unhide";
                this.L1 = R.string.Unhide;
                this.M1 = org.telegram.ui.ActionBar.g6.f23418y1;
            } else {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.g6.f23039c9;
                this.J1 = org.telegram.ui.ActionBar.g6.f23056d9;
                this.K1 = "Hide";
                this.L1 = R.string.Hide;
                this.M1 = org.telegram.ui.ActionBar.g6.f23401x1;
            }
            invalidate();
        }
        if (this.f24866g0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f22432id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(wf.c.c(getContext(), 1.0f, we1Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ac), false));
        } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(wf.c.e(tL_forumTopic));
        } else {
            setForumIcon(null);
            org.telegram.ui.Components.k5 k5Var = this.V4;
            if (k5Var == null || k5Var.i() != tL_forumTopic.icon_emoji_id) {
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.k5(we1Var.f43749q0 ? 13 : 10, ((org.telegram.ui.ActionBar.n2) we1Var).currentAccount, tL_forumTopic.icon_emoji_id));
            }
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z10 = true;
        }
        g0(z10);
        u();
    }

    @Override
    public final void u() {
        super.u();
        f0();
    }
}
