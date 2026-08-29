package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class we1 extends org.telegram.ui.Cells.p2 {
    public boolean S4;
    public int T4;
    public TLRPC.TL_forumTopic U4;
    public org.telegram.ui.Components.p5 V4;
    public Drawable W4;
    public boolean X4;
    public boolean Y4;
    public boolean Z4;
    public Boolean f43959a5;
    public float f43960b5;
    public ValueAnimator f43961c5;
    public final ze1 f43962d5;

    public we1(ze1 ze1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f43962d5 = ze1Var;
        this.T4 = -1;
        this.f24944x = false;
        if (ze1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.E = i10;
        this.Q = 24.0f;
        this.F = 64;
        this.G = 76;
        this.f24873j1 = true;
    }

    @Override
    public final boolean E() {
        return this.Z4;
    }

    public final void f0() {
        Drawable drawable = this.W4;
        boolean z10 = drawable instanceof yf.c;
        ze1 ze1Var = this.f43962d5;
        if (z10) {
            ((yf.c) drawable).a(i0.a.d(this.f43960b5, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.R9), ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.L7)));
        }
        Drawable[] drawableArr = this.f24841d0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof yf.c) {
                ((yf.c) drawable2).a(i0.a.d(this.f43960b5, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.R9), ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.L7)));
            }
        }
        invalidate();
    }

    public final void g0(boolean z10) {
        boolean z11;
        if (this.f43959a5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f43961c5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f43961c5 = null;
        }
        this.f43959a5 = Boolean.valueOf(z10);
        float f9 = 0.0f;
        if (z11) {
            float f10 = this.f43960b5;
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f43961c5 = ofFloat;
            ofFloat.addUpdateListener(new w01(this, 18));
            this.f43961c5.setInterpolator(org.telegram.ui.Components.jr.f29801g);
            this.f43961c5.start();
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        this.f43960b5 = f9;
        f0();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X4 = true;
        org.telegram.ui.Components.p5 p5Var = this.V4;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X4 = false;
        org.telegram.ui.Components.p5 p5Var = this.V4;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        org.telegram.ui.Components.ei0 ei0Var;
        int dp;
        nh.h3 h3Var;
        ze1 ze1Var = this.f43962d5;
        if (ze1Var.getMessagesController().isMonoForum(-ze1Var.f45155a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f24857g0 && (h3Var = this.f24887m2) != null) {
            f9 = h3Var.getProgress() * AndroidUtilities.dp(30.0f);
        } else {
            f9 = 0.0f;
        }
        this.B3 = f9;
        canvas.save();
        float f10 = this.B3;
        int i10 = -AndroidUtilities.dp(4.0f);
        this.A3 = i10;
        canvas.translate(f10, i10);
        canvas.drawColor(ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f24919s1, 0.0f);
        if (this.S4) {
            if (this.f24903p2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.E);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f24919s1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
            } else {
                canvas.drawLine(dp - this.f24919s1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
            }
        }
        if ((!this.Y4 || (ei0Var = this.a2) == null || ei0Var.C != 0.0f) && (this.V4 != null || this.W4 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.p5 p5Var = this.V4;
            if (p5Var != null) {
                if (LocaleController.isRTL) {
                    p5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    p5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
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

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2 = this.V4;
        if (p5Var2 != p5Var) {
            if (p5Var2 != null && this.X4) {
                p5Var2.o(this);
            }
            if (p5Var != null) {
                p5Var.setColorFilter(org.telegram.ui.ActionBar.g6.f23380v3);
            }
            this.V4 = p5Var;
            if (p5Var != null && this.X4) {
                p5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.W4 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.U4 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z4 = z10;
        if (this.f24857g0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            g0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f22444id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.Y4 = z11;
        ze1 ze1Var = this.f43962d5;
        if (tL_forumTopic != null && this != ze1Var.X0) {
            if (tL_forumTopic.hidden) {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.g6.f23065d9;
                this.J1 = org.telegram.ui.ActionBar.g6.f23047c9;
                this.K1 = "Unhide";
                this.L1 = R.string.Unhide;
                this.M1 = org.telegram.ui.ActionBar.g6.f23428y1;
            } else {
                this.H1 = true;
                this.I1 = org.telegram.ui.ActionBar.g6.f23047c9;
                this.J1 = org.telegram.ui.ActionBar.g6.f23065d9;
                this.K1 = "Hide";
                this.L1 = R.string.Hide;
                this.M1 = org.telegram.ui.ActionBar.g6.f23414x1;
            }
            invalidate();
        }
        if (this.f24857g0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f22444id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(yf.d.c(getContext(), 1.0f, ze1Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.p5 p5Var = this.V4;
            if (p5Var == null || p5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (ze1Var.f45185q0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.p5(i10, i11, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(yf.d.e(tL_forumTopic));
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
