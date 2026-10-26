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
public final class xe1 extends org.telegram.ui.Cells.p2 {
    public boolean f45749a5;
    public int f45750b5;
    public TLRPC.TL_forumTopic f45751c5;
    public org.telegram.ui.Components.t5 f45752d5;
    public Drawable f45753e5;
    public boolean f45754f5;
    public boolean f45755g5;
    public boolean f45756h5;
    public Boolean f45757i5;
    public float f45758j5;
    public ValueAnimator f45759k5;
    public final af1 f45760l5;

    public xe1(af1 af1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f45760l5 = af1Var;
        this.f45750b5 = -1;
        this.f24745x = false;
        if (af1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f24693n1 = true;
    }

    @Override
    public final boolean D() {
        return this.f45756h5;
    }

    public final void e0() {
        Drawable drawable = this.f45753e5;
        boolean z10 = drawable instanceof pg.c;
        af1 af1Var = this.f45760l5;
        if (z10) {
            ((pg.c) drawable).a(i0.a.f(this.f45758j5, af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.R9), af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.L7)));
        }
        Drawable[] drawableArr = this.f24664h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof pg.c) {
                ((pg.c) drawable2).a(i0.a.f(this.f45758j5, af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.R9), af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.L7)));
            }
        }
        invalidate();
    }

    public final void f0(boolean z10) {
        boolean z11;
        if (this.f45757i5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f45759k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45759k5 = null;
        }
        this.f45757i5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f45758j5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f45759k5 = ofFloat;
            ofFloat.addUpdateListener(new v11(this, 15));
            this.f45759k5.setInterpolator(org.telegram.ui.Components.ds.f27587g);
            this.f45759k5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f45758j5 = f7;
        e0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45754f5 = true;
        org.telegram.ui.Components.t5 t5Var = this.f45752d5;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45754f5 = false;
        org.telegram.ui.Components.t5 t5Var = this.f45752d5;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.hj0 hj0Var;
        int dp;
        fi.i3 i3Var;
        af1 af1Var = this.f45760l5;
        if (af1Var.getMessagesController().isMonoForum(-af1Var.f37734a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f24679k0 && (i3Var = this.f24709q2) != null) {
            f7 = i3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f7 = 0.0f;
        }
        this.F3 = f7;
        canvas.save();
        float f10 = this.F3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.E3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f24741w1, 0.0f);
        if (this.f45749a5) {
            if (this.f24726t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f24741w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
            } else {
                canvas.drawLine(dp - this.f24741w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23478k0);
            }
        }
        if ((!this.f45755g5 || (hj0Var = this.f24650e2) == null || hj0Var.C != 0.0f) && (this.f45752d5 != null || this.f45753e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.t5 t5Var = this.f45752d5;
            if (t5Var != null) {
                if (LocaleController.isRTL) {
                    t5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    t5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f45752d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f45753e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f45753e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f45753e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override
    public final void s() {
        super.s();
        e0();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.t5 t5Var) {
        org.telegram.ui.Components.t5 t5Var2 = this.f45752d5;
        if (t5Var2 != t5Var) {
            if (t5Var2 != null && this.f45754f5) {
                t5Var2.o(this);
            }
            if (t5Var != null) {
                t5Var.setColorFilter(org.telegram.ui.ActionBar.y6.f23689v3);
            }
            this.f45752d5 = t5Var;
            if (t5Var != null && this.f45754f5) {
                t5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f45753e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.f45751c5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45756h5 = z10;
        if (this.f24679k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            f0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f22079id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45755g5 = z11;
        af1 af1Var = this.f45760l5;
        if (tL_forumTopic != null && this != af1Var.f37742c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.y6.f23359d9;
                this.N1 = org.telegram.ui.ActionBar.y6.f23340c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.y6.f23744y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.y6.f23340c9;
                this.N1 = org.telegram.ui.ActionBar.y6.f23359d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.y6.f23726x1;
            }
            invalidate();
        }
        if (this.f24679k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f22079id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(pg.d.c(getContext(), 1.0f, af1Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.t5 t5Var = this.f45752d5;
            if (t5Var == null || t5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (af1Var.f37775u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.r2) af1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.t5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(pg.d.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        f0(z13);
        s();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.f45757i5 != null) {
                e0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
