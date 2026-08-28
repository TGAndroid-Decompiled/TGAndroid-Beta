package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class se1 extends org.telegram.ui.Cells.r2 {
    public boolean S4;
    public int T4;
    public TLRPC.TL_forumTopic U4;
    public org.telegram.ui.Components.k5 V4;
    public Drawable W4;
    public boolean X4;
    public boolean Y4;
    public boolean Z4;
    public Boolean f42676a5;
    public float f42677b5;
    public ValueAnimator f42678c5;
    public final we1 f42679d5;

    public se1(we1 we1Var, Context context, boolean z10) {
        super(context, z10);
        int i9;
        this.f42679d5 = we1Var;
        this.T4 = -1;
        this.f25069x = false;
        if (we1Var.isInPreviewMode()) {
            i9 = 11;
        } else {
            i9 = 50;
        }
        this.E = i9;
        this.Q = 24.0f;
        this.F = 64;
        this.G = 76;
        this.f24999j1 = true;
    }

    @Override
    public final boolean E() {
        return this.Z4;
    }

    public final void e0() {
        Drawable drawable = this.W4;
        boolean z10 = drawable instanceof vf.b;
        we1 we1Var = this.f42679d5;
        if (z10) {
            ((vf.b) drawable).a(i0.a.d(this.f42677b5, we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.R9), we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.L7)));
        }
        Drawable[] drawableArr = this.f24967d0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof vf.b) {
                ((vf.b) drawable2).a(i0.a.d(this.f42677b5, we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.R9), we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.L7)));
            }
        }
        invalidate();
    }

    public final void f0(boolean z10) {
        boolean z11;
        if (this.f42676a5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f42678c5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f42678c5 = null;
        }
        this.f42676a5 = Boolean.valueOf(z10);
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f42677b5;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f42678c5 = ofFloat;
            ofFloat.addUpdateListener(new v01(this, 18));
            this.f42678c5.setInterpolator(org.telegram.ui.Components.gr.f28845g);
            this.f42678c5.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f42677b5 = f10;
        e0();
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
        float f10;
        org.telegram.ui.Components.uh0 uh0Var;
        int dp;
        kh.k3 k3Var;
        we1 we1Var = this.f42679d5;
        if (we1Var.getMessagesController().isMonoForum(-we1Var.f43741a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f24983g0 && (k3Var = this.f25013m2) != null) {
            f10 = k3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f10 = 0.0f;
        }
        this.B3 = f10;
        canvas.save();
        float f11 = this.B3;
        int i9 = -AndroidUtilities.dp(4.0f);
        this.A3 = i9;
        canvas.translate(f11, i9);
        canvas.drawColor(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f25045s1, 0.0f);
        if (this.S4) {
            if (this.f25029p2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.E);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f25045s1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
            } else {
                canvas.drawLine(dp - this.f25045s1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
            }
        }
        if ((!this.Y4 || (uh0Var = this.a2) == null || uh0Var.C != 0.0f) && (this.V4 != null || this.W4 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.k5 k5Var = this.V4;
            if (k5Var != null) {
                if (LocaleController.isRTL) {
                    k5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    k5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.V4.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.W4.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.W4.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.W4.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.k5 k5Var) {
        org.telegram.ui.Components.k5 k5Var2 = this.V4;
        if (k5Var2 != k5Var) {
            if (k5Var2 != null && this.X4) {
                k5Var2.o(this);
            }
            if (k5Var != null) {
                k5Var.setColorFilter(org.telegram.ui.ActionBar.f6.f23317v3);
            }
            this.V4 = k5Var;
            if (k5Var != null && this.X4) {
                k5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.W4 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        boolean z12;
        this.U4 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z4 = z10;
        if (this.f24983g0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            f0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f22432id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Y4 = z11;
        we1 we1Var = this.f42679d5;
        if (tL_forumTopic != null && this != we1Var.X0) {
            if (tL_forumTopic.hidden) {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.f6.d9;
                this.J1 = org.telegram.ui.ActionBar.f6.f22986c9;
                this.K1 = "Unhide";
                this.L1 = R.string.Unhide;
                this.M1 = org.telegram.ui.ActionBar.f6.f23364y1;
            } else {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.f6.f22986c9;
                this.J1 = org.telegram.ui.ActionBar.f6.d9;
                this.K1 = "Hide";
                this.L1 = R.string.Hide;
                this.M1 = org.telegram.ui.ActionBar.f6.f23346x1;
            }
            invalidate();
        }
        if (this.f24983g0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f22432id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(vf.c.c(getContext(), 1.0f, we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.k5 k5Var = this.V4;
            if (k5Var == null || k5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (we1Var.f43771q0) {
                    i9 = 13;
                } else {
                    i9 = 10;
                }
                i10 = ((org.telegram.ui.ActionBar.o2) we1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.k5(i9, i10, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(vf.c.e(tL_forumTopic));
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
}
