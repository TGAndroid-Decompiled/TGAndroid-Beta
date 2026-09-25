package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tf1 extends org.telegram.ui.Cells.s2 {
    public boolean W4;
    public int X4;
    public TLRPC.TL_forumTopic Y4;
    public org.telegram.ui.Components.q5 Z4;
    public Drawable f38103a5;
    public boolean f38104b5;
    public boolean f38105c5;
    public boolean f38106d5;
    public Boolean f38107e5;
    public float f38108f5;
    public ValueAnimator f38109g5;
    public final wf1 f38110h5;

    public tf1(wf1 wf1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f38110h5 = wf1Var;
        this.X4 = -1;
        this.f21037x = false;
        if (wf1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f20985n1 = true;
    }

    @Override
    public final boolean F() {
        return this.f38106d5;
    }

    public final void f0() {
        Drawable drawable = this.f38103a5;
        boolean z10 = drawable instanceof ng.c;
        wf1 wf1Var = this.f38110h5;
        if (z10) {
            ((ng.c) drawable).a(i0.a.d(this.f38108f5, wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.R9), wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.L7)));
        }
        Drawable[] drawableArr = this.f20957h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof ng.c) {
                ((ng.c) drawable2).a(i0.a.d(this.f38108f5, wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.R9), wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11;
        if (this.f38107e5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f38109g5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f38109g5 = null;
        }
        this.f38107e5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f38108f5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f38109g5 = ofFloat;
            ofFloat.addUpdateListener(new q11(this, 18));
            this.f38109g5.setInterpolator(org.telegram.ui.Components.rr.f28032g);
            this.f38109g5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f38108f5 = f7;
        f0();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38104b5 = true;
        org.telegram.ui.Components.q5 q5Var = this.Z4;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38104b5 = false;
        org.telegram.ui.Components.q5 q5Var = this.Z4;
        if (q5Var != null) {
            q5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.ti0 ti0Var;
        int dp;
        ci.p3 p3Var;
        wf1 wf1Var = this.f38110h5;
        if (wf1Var.getMessagesController().isMonoForum(-wf1Var.f39309a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f20971k0 && (p3Var = this.f21001q2) != null) {
            f7 = p3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        this.F3 = f7;
        canvas.save();
        float f10 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f21033w1, 0.0f);
        if (this.W4) {
            if (this.f21018t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f21033w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
            } else {
                canvas.drawLine(dp - this.f21033w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f19181k0);
            }
        }
        if ((!this.f38105c5 || (ti0Var = this.f20943e2) == null || ti0Var.C != 0.0f) && (this.Z4 != null || this.f38103a5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.q5 q5Var = this.Z4;
            if (q5Var != null) {
                if (LocaleController.isRTL) {
                    q5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    q5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.Z4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f38103a5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f38103a5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f38103a5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.q5 q5Var) {
        org.telegram.ui.Components.q5 q5Var2 = this.Z4;
        if (q5Var2 != q5Var) {
            if (q5Var2 != null && this.f38104b5) {
                q5Var2.o(this);
            }
            if (q5Var != null) {
                q5Var.setColorFilter(org.telegram.ui.ActionBar.h6.f19388v3);
            }
            this.Z4 = q5Var;
            if (q5Var != null && this.f38104b5) {
                q5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f38103a5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.Y4 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38106d5 = z10;
        if (this.f20971k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            g0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f18388id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38105c5 = z11;
        wf1 wf1Var = this.f38110h5;
        if (tL_forumTopic != null && this != wf1Var.f39314b1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.h6.f19063d9;
                this.N1 = org.telegram.ui.ActionBar.h6.f19045c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.h6.f19439y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.h6.f19045c9;
                this.N1 = org.telegram.ui.ActionBar.h6.f19063d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.h6.f19421x1;
            }
            invalidate();
        }
        if (this.f20971k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f18388id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.c(getContext(), 1.0f, wf1Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.q5 q5Var = this.Z4;
            if (q5Var == null || q5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (wf1Var.f39347u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.q5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(ng.d.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        g0(z13);
        t();
    }

    @Override
    public final void t() {
        super.t();
        f0();
    }
}
