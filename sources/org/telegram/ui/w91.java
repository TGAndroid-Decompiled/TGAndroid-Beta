package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
public final class w91 extends org.telegram.ui.Cells.t2 {
    public boolean f50953a5;
    public int f50954b5;
    public TLRPC.TL_forumTopic f50955c5;
    public org.telegram.ui.Components.h5 f50956d5;
    public Drawable f50957e5;
    public boolean f50958f5;
    public boolean f50959g5;
    public boolean f50960h5;
    public Boolean f50961i5;
    public float f50962j5;
    public ValueAnimator f50963k5;
    public final z91 f50964l5;

    public w91(z91 z91Var, Context context, boolean z9) {
        super(context, z9);
        int i7;
        this.f50964l5 = z91Var;
        this.f50954b5 = -1;
        this.f30525y = false;
        if (z91Var.isInPreviewMode()) {
            i7 = 11;
        } else {
            i7 = 50;
        }
        this.I = i7;
        this.U = 24.0f;
        this.J = 64;
        this.K = 76;
        this.n1 = true;
    }

    @Override
    public final boolean J() {
        return this.f50960h5;
    }

    public final void n0() {
        Drawable drawable = this.f50957e5;
        boolean z9 = drawable instanceof qg.c;
        z91 z91Var = this.f50964l5;
        if (z9) {
            ((qg.c) drawable).a(i0.a.f(this.f50962j5, z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.R9), z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.L7)));
        }
        Drawable[] drawableArr = this.f30440h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof qg.c) {
                ((qg.c) drawable2).a(i0.a.f(this.f50962j5, z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.R9), z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.L7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z9) {
        boolean z10;
        if (this.f50961i5 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ValueAnimator valueAnimator = this.f50963k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50963k5 = null;
        }
        this.f50961i5 = Boolean.valueOf(z9);
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f50962j5;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f50963k5 = ofFloat;
            ofFloat.addUpdateListener(new kz0(this, 14));
            this.f50963k5.setInterpolator(org.telegram.ui.Components.wq.f40047g);
            this.f50963k5.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        this.f50962j5 = f10;
        n0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50958f5 = true;
        org.telegram.ui.Components.h5 h5Var = this.f50956d5;
        if (h5Var != null) {
            h5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50958f5 = false;
        org.telegram.ui.Components.h5 h5Var = this.f50956d5;
        if (h5Var != null) {
            h5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.kg0 kg0Var;
        int L;
        fi.a3 a3Var;
        z91 z91Var = this.f50964l5;
        if (z91Var.getMessagesController().y2(-z91Var.f52343a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f30454k0 && (a3Var = this.f30483q2) != null) {
            f10 = a3Var.getProgress() * org.telegram.messenger.g0.L(30.0f);
        } else {
            f10 = 0.0f;
        }
        this.F3 = f10;
        canvas.save();
        float f11 = this.F3;
        int i7 = -org.telegram.messenger.g0.L(4.0f);
        this.E3 = i7;
        canvas.translate(f11, i7);
        canvas.drawColor(z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f30515w1, 0.0f);
        if (this.f50953a5) {
            if (this.f30500t2) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(this.I);
            }
            if (org.telegram.messenger.id.f23161a0) {
                canvas.drawLine(0.0f - this.f30515w1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
            } else {
                canvas.drawLine(L - this.f30515w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
            }
        }
        if ((!this.f50959g5 || (kg0Var = this.f30426e2) == null || kg0Var.C != 0.0f) && (this.f50956d5 != null || this.f50957e5 != null)) {
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(28.0f);
            org.telegram.ui.Components.h5 h5Var = this.f50956d5;
            if (h5Var != null) {
                if (org.telegram.messenger.id.f23161a0) {
                    h5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    h5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f50956d5.draw(canvas);
            } else {
                if (org.telegram.messenger.id.f23161a0) {
                    this.f50957e5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.f50957e5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f50957e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.h5 h5Var) {
        org.telegram.ui.Components.h5 h5Var2 = this.f50956d5;
        if (h5Var2 != h5Var) {
            if (h5Var2 != null && this.f50958f5) {
                h5Var2.n(this);
            }
            if (h5Var != null) {
                h5Var.setColorFilter(org.telegram.ui.ActionBar.m6.f28222v3);
            }
            this.f50956d5 = h5Var;
            if (h5Var != null && this.f50958f5) {
                h5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f50957e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        this.f50955c5 = tL_forumTopic;
        boolean z12 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f50960h5 = z9;
        if (this.f30454k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z11 = true;
            } else {
                z11 = false;
            }
            o0(z11);
        }
        if (tL_forumTopic != null && tL_forumTopic.f27012id == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50959g5 = z10;
        z91 z91Var = this.f50964l5;
        if (tL_forumTopic != null && this != z91Var.f52351c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.m6.f27893d9;
                this.N1 = org.telegram.ui.ActionBar.m6.f27875c9;
                this.O1 = "Unhide";
                this.P1 = 2131743884;
                this.Q1 = org.telegram.ui.ActionBar.m6.f28277y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.m6.f27875c9;
                this.N1 = org.telegram.ui.ActionBar.m6.f27893d9;
                this.O1 = "Hide";
                this.P1 = 2131749325;
                this.Q1 = org.telegram.ui.ActionBar.m6.f28258x1;
            }
            invalidate();
        }
        if (this.f30454k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f27012id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.d.c(getContext(), 1.0f, z91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f28097od), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.h5 h5Var = this.f50956d5;
            if (h5Var == null || h5Var.h() != tL_forumTopic.icon_emoji_id) {
                if (z91Var.f52384u0) {
                    i7 = 13;
                } else {
                    i7 = 10;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) z91Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.h5(i7, i10, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.d.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z12 = true;
        }
        o0(z12);
        x();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.f50961i5 != null) {
                n0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void x() {
        super.x();
        n0();
    }
}
