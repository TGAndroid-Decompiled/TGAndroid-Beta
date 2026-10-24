package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class te1 extends org.telegram.ui.Cells.q2 {
    public boolean f42025a5;
    public int f42026b5;
    public TLRPC.TL_forumTopic f42027c5;
    public org.telegram.ui.Components.p5 f42028d5;
    public Drawable f42029e5;
    public boolean f42030f5;
    public boolean f42031g5;
    public boolean f42032h5;
    public Boolean f42033i5;
    public float f42034j5;
    public ValueAnimator f42035k5;
    public final xe1 f42036l5;

    public te1(xe1 xe1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f42036l5 = xe1Var;
        this.f42026b5 = -1;
        this.f23035x = false;
        if (xe1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f22983n1 = true;
    }

    @Override
    public final boolean D() {
        return this.f42032h5;
    }

    public final void e0() {
        Drawable drawable = this.f42029e5;
        boolean z10 = drawable instanceof og.c;
        xe1 xe1Var = this.f42036l5;
        if (z10) {
            ((og.c) drawable).a(i0.a.f(this.f42034j5, xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
        }
        Drawable[] drawableArr = this.f22954h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof og.c) {
                ((og.c) drawable2).a(i0.a.f(this.f42034j5, xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
            }
        }
        invalidate();
    }

    public final void f0(boolean z10) {
        boolean z11;
        if (this.f42033i5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f42035k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42035k5 = null;
        }
        this.f42033i5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f42034j5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f42035k5 = ofFloat;
            ofFloat.addUpdateListener(new f11(this, 16));
            this.f42035k5.setInterpolator(org.telegram.ui.Components.zr.f33338g);
            this.f42035k5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f42034j5 = f7;
        e0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42030f5 = true;
        org.telegram.ui.Components.p5 p5Var = this.f42028d5;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42030f5 = false;
        org.telegram.ui.Components.p5 p5Var = this.f42028d5;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.hj0 hj0Var;
        int dp;
        ei.k3 k3Var;
        xe1 xe1Var = this.f42036l5;
        if (xe1Var.getMessagesController().isMonoForum(-xe1Var.f43545a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f22969k0 && (k3Var = this.f22999q2) != null) {
            f7 = k3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        this.F3 = f7;
        canvas.save();
        float f10 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f23031w1, 0.0f);
        if (this.f42025a5) {
            if (this.f23016t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f23031w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
            } else {
                canvas.drawLine(dp - this.f23031w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
            }
        }
        if ((!this.f42031g5 || (hj0Var = this.f22940e2) == null || hj0Var.C != 0.0f) && (this.f42028d5 != null || this.f42029e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.p5 p5Var = this.f42028d5;
            if (p5Var != null) {
                if (LocaleController.isRTL) {
                    p5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    p5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f42028d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f42029e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f42029e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f42029e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2 = this.f42028d5;
        if (p5Var2 != p5Var) {
            if (p5Var2 != null && this.f42030f5) {
                p5Var2.o(this);
            }
            if (p5Var != null) {
                p5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f21514v3);
            }
            this.f42028d5 = p5Var;
            if (p5Var != null && this.f42030f5) {
                p5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f42029e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.f42027c5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42032h5 = z10;
        if (this.f22969k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            f0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f20396id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42031g5 = z11;
        xe1 xe1Var = this.f42036l5;
        if (tL_forumTopic != null && this != xe1Var.f43553c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.f21187d9;
                this.N1 = org.telegram.ui.ActionBar.k6.f21168c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.k6.f21568y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.f21168c9;
                this.N1 = org.telegram.ui.ActionBar.k6.f21187d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.k6.f21549x1;
            }
            invalidate();
        }
        if (this.f22969k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f20396id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.c(getContext(), 1.0f, xe1Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.p5 p5Var = this.f42028d5;
            if (p5Var == null || p5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (xe1Var.f43586u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.p5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        f0(z13);
        t();
    }

    @Override
    public final void t() {
        super.t();
        e0();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.f42033i5 != null) {
                e0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
