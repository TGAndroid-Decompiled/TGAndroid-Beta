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
public final class ue1 extends org.telegram.ui.Cells.q2 {
    public boolean f42403a5;
    public int f42404b5;
    public TLRPC.TL_forumTopic f42405c5;
    public org.telegram.ui.Components.r5 f42406d5;
    public Drawable f42407e5;
    public boolean f42408f5;
    public boolean f42409g5;
    public boolean f42410h5;
    public Boolean f42411i5;
    public float f42412j5;
    public ValueAnimator f42413k5;
    public final ye1 f42414l5;

    public ue1(ye1 ye1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f42414l5 = ye1Var;
        this.f42404b5 = -1;
        this.f23034x = false;
        if (ye1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f22982n1 = true;
    }

    @Override
    public final boolean D() {
        return this.f42410h5;
    }

    public final void e0() {
        Drawable drawable = this.f42407e5;
        boolean z10 = drawable instanceof og.c;
        ye1 ye1Var = this.f42414l5;
        if (z10) {
            ((og.c) drawable).a(i0.a.f(this.f42412j5, ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
        }
        Drawable[] drawableArr = this.f22953h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof og.c) {
                ((og.c) drawable2).a(i0.a.f(this.f42412j5, ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
            }
        }
        invalidate();
    }

    public final void f0(boolean z10) {
        boolean z11;
        if (this.f42411i5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f42413k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42413k5 = null;
        }
        this.f42411i5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f42412j5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f42413k5 = ofFloat;
            ofFloat.addUpdateListener(new g11(this, 16));
            this.f42413k5.setInterpolator(org.telegram.ui.Components.bs.f25134g);
            this.f42413k5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f42412j5 = f7;
        e0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42408f5 = true;
        org.telegram.ui.Components.r5 r5Var = this.f42406d5;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42408f5 = false;
        org.telegram.ui.Components.r5 r5Var = this.f42406d5;
        if (r5Var != null) {
            r5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.ij0 ij0Var;
        int dp;
        ei.k3 k3Var;
        ye1 ye1Var = this.f42414l5;
        if (ye1Var.getMessagesController().isMonoForum(-ye1Var.f43792a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f22968k0 && (k3Var = this.f22998q2) != null) {
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
        canvas.drawColor(ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f23030w1, 0.0f);
        if (this.f42403a5) {
            if (this.f23015t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f23030w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21304k0);
            } else {
                canvas.drawLine(dp - this.f23030w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21304k0);
            }
        }
        if ((!this.f42409g5 || (ij0Var = this.f22939e2) == null || ij0Var.C != 0.0f) && (this.f42406d5 != null || this.f42407e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.r5 r5Var = this.f42406d5;
            if (r5Var != null) {
                if (LocaleController.isRTL) {
                    r5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    r5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f42406d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f42407e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f42407e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f42407e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.r5 r5Var) {
        org.telegram.ui.Components.r5 r5Var2 = this.f42406d5;
        if (r5Var2 != r5Var) {
            if (r5Var2 != null && this.f42408f5) {
                r5Var2.o(this);
            }
            if (r5Var != null) {
                r5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f21513v3);
            }
            this.f42406d5 = r5Var;
            if (r5Var != null && this.f42408f5) {
                r5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f42407e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.f42405c5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42410h5 = z10;
        if (this.f22968k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            f0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f20395id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42409g5 = z11;
        ye1 ye1Var = this.f42414l5;
        if (tL_forumTopic != null && this != ye1Var.f43800c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.f21186d9;
                this.N1 = org.telegram.ui.ActionBar.k6.f21167c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.k6.f21567y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.f21167c9;
                this.N1 = org.telegram.ui.ActionBar.k6.f21186d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.k6.f21548x1;
            }
            invalidate();
        }
        if (this.f22968k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f20395id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(og.d.c(getContext(), 1.0f, ye1Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.r5 r5Var = this.f42406d5;
            if (r5Var == null || r5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (ye1Var.f43833u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.r5(i10, i11, tL_forumTopic.icon_emoji_id));
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
            if (this.f42411i5 != null) {
                e0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
