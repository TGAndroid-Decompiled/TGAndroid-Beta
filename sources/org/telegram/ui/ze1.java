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
public final class ze1 extends org.telegram.ui.Cells.p2 {
    public boolean f46243a5;
    public int f46244b5;
    public TLRPC.TL_forumTopic f46245c5;
    public org.telegram.ui.Components.t5 f46246d5;
    public Drawable f46247e5;
    public boolean f46248f5;
    public boolean f46249g5;
    public boolean f46250h5;
    public Boolean f46251i5;
    public float f46252j5;
    public ValueAnimator f46253k5;
    public final cf1 f46254l5;

    public ze1(cf1 cf1Var, Context context, boolean z10) {
        super(context, z10);
        int i10;
        this.f46254l5 = cf1Var;
        this.f46244b5 = -1;
        this.f24747x = false;
        if (cf1Var.isInPreviewMode()) {
            i10 = 11;
        } else {
            i10 = 50;
        }
        this.I = i10;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.f24695n1 = true;
    }

    @Override
    public final boolean D() {
        return this.f46250h5;
    }

    public final void e0() {
        Drawable drawable = this.f46247e5;
        boolean z10 = drawable instanceof pg.c;
        cf1 cf1Var = this.f46254l5;
        if (z10) {
            ((pg.c) drawable).a(i0.a.f(this.f46252j5, cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.R9), cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.L7)));
        }
        Drawable[] drawableArr = this.f24666h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof pg.c) {
                ((pg.c) drawable2).a(i0.a.f(this.f46252j5, cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.R9), cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.L7)));
            }
        }
        invalidate();
    }

    public final void f0(boolean z10) {
        boolean z11;
        if (this.f46251i5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f46253k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46253k5 = null;
        }
        this.f46251i5 = Boolean.valueOf(z10);
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.f46252j5;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f46253k5 = ofFloat;
            ofFloat.addUpdateListener(new x11(this, 15));
            this.f46253k5.setInterpolator(org.telegram.ui.Components.ds.f27531g);
            this.f46253k5.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.f46252j5 = f7;
        e0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46248f5 = true;
        org.telegram.ui.Components.t5 t5Var = this.f46246d5;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46248f5 = false;
        org.telegram.ui.Components.t5 t5Var = this.f46246d5;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Components.ij0 ij0Var;
        int dp;
        fi.i3 i3Var;
        cf1 cf1Var = this.f46254l5;
        if (cf1Var.getMessagesController().isMonoForum(-cf1Var.f38288a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f24681k0 && (i3Var = this.f24711q2) != null) {
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
        canvas.drawColor(cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f24743w1, 0.0f);
        if (this.f46243a5) {
            if (this.f24728t2) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(this.I);
            }
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f - this.f24743w1, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
            } else {
                canvas.drawLine(dp - this.f24743w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
            }
        }
        if ((!this.f46249g5 || (ij0Var = this.f24652e2) == null || ij0Var.C != 0.0f) && (this.f46246d5 != null || this.f46247e5 != null)) {
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(28.0f);
            org.telegram.ui.Components.t5 t5Var = this.f46246d5;
            if (t5Var != null) {
                if (LocaleController.isRTL) {
                    t5Var.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    t5Var.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f46246d5.draw(canvas);
            } else {
                if (LocaleController.isRTL) {
                    this.f46247e5.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                } else {
                    this.f46247e5.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                }
                this.f46247e5.draw(canvas);
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
        org.telegram.ui.Components.t5 t5Var2 = this.f46246d5;
        if (t5Var2 != t5Var) {
            if (t5Var2 != null && this.f46248f5) {
                t5Var2.o(this);
            }
            if (t5Var != null) {
                t5Var.setColorFilter(org.telegram.ui.ActionBar.y6.f23690v3);
            }
            this.f46246d5 = t5Var;
            if (t5Var != null && this.f46248f5) {
                t5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f46247e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        this.f46245c5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46250h5 = z10;
        if (this.f24681k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            f0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f22080id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f46249g5 = z11;
        cf1 cf1Var = this.f46254l5;
        if (tL_forumTopic != null && this != cf1Var.f38296c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.y6.f23360d9;
                this.N1 = org.telegram.ui.ActionBar.y6.f23341c9;
                this.O1 = "Unhide";
                this.P1 = R.string.Unhide;
                this.Q1 = org.telegram.ui.ActionBar.y6.f23745y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.y6.f23341c9;
                this.N1 = org.telegram.ui.ActionBar.y6.f23360d9;
                this.O1 = "Hide";
                this.P1 = R.string.Hide;
                this.Q1 = org.telegram.ui.ActionBar.y6.f23727x1;
            }
            invalidate();
        }
        if (this.f24681k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f22080id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(pg.d.c(getContext(), 1.0f, cf1Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ac), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.t5 t5Var = this.f46246d5;
            if (t5Var == null || t5Var.i() != tL_forumTopic.icon_emoji_id) {
                if (cf1Var.f38329u0) {
                    i10 = 13;
                } else {
                    i10 = 10;
                }
                i11 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
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
            if (this.f46251i5 != null) {
                e0();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
