package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
public final class r91 extends org.telegram.ui.Cells.t2 {
    public boolean f50880b5;
    public int f50881c5;
    public TLRPC.TL_forumTopic f50882d5;
    public org.telegram.ui.Components.g5 f50883e5;
    public Drawable f50884f5;
    public boolean f50885g5;
    public boolean f50886h5;
    public boolean f50887i5;
    public Boolean f50888j5;
    public float f50889k5;
    public ValueAnimator f50890l5;
    public final u91 f50891m5;

    public r91(u91 u91Var, Context context, boolean z10) {
        super(context, z10);
        int i7;
        this.f50891m5 = u91Var;
        this.f50881c5 = -1;
        this.f31662y = false;
        if (u91Var.isInPreviewMode()) {
            i7 = 11;
        } else {
            i7 = 50;
        }
        this.J = i7;
        this.V = 24.0f;
        this.K = 64;
        this.L = 76;
        this.f31610o1 = true;
    }

    @Override
    public final boolean M() {
        return this.f50887i5;
    }

    public final void o0() {
        Drawable drawable = this.f50884f5;
        boolean z10 = drawable instanceof qg.b;
        u91 u91Var = this.f50891m5;
        if (z10) {
            ((qg.b) drawable).a(i0.a.f(this.f50889k5, u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
        }
        Drawable[] drawableArr = this.f31582i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof qg.b) {
                ((qg.b) drawable2).a(i0.a.f(this.f50889k5, u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.R9), u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.L7)));
            }
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50885g5 = true;
        org.telegram.ui.Components.g5 g5Var = this.f50883e5;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50885g5 = false;
        org.telegram.ui.Components.g5 g5Var = this.f50883e5;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.ng0 ng0Var;
        int L;
        hi.y2 y2Var;
        u91 u91Var = this.f50891m5;
        if (u91Var.getMessagesController().y2(-u91Var.f51834a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f31596l0 && (y2Var = this.f31626r2) != null) {
            f10 = y2Var.getProgress() * org.telegram.messenger.g0.L(30.0f);
        } else {
            f10 = 0.0f;
        }
        this.G3 = f10;
        canvas.save();
        float f11 = this.G3;
        int i7 = -org.telegram.messenger.g0.L(4.0f);
        this.F3 = i7;
        canvas.translate(f11, i7);
        canvas.drawColor(u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f31658x1, 0.0f);
        if (this.f50880b5) {
            if (this.f31642u2) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(this.J);
            }
            if (org.telegram.messenger.hd.f24101a0) {
                canvas.drawLine(0.0f - this.f31658x1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
            } else {
                canvas.drawLine(L - this.f31658x1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
            }
        }
        if ((!this.f50886h5 || (ng0Var = this.f31569f2) == null || ng0Var.C != 0.0f) && (this.f50883e5 != null || this.f50884f5 != null)) {
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(28.0f);
            org.telegram.ui.Components.g5 g5Var = this.f50883e5;
            if (g5Var != null) {
                if (org.telegram.messenger.hd.f24101a0) {
                    g5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    g5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f50883e5.draw(canvas);
            } else {
                if (org.telegram.messenger.hd.f24101a0) {
                    this.f50884f5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.f50884f5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f50884f5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public final void p0(boolean z10) {
        boolean z11;
        if (this.f50888j5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f50890l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f50890l5 = null;
        }
        this.f50888j5 = Boolean.valueOf(z10);
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f50889k5;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f50890l5 = ofFloat;
            ofFloat.addUpdateListener(new ez0(this, 14));
            this.f50890l5.setInterpolator(org.telegram.ui.Components.er.f34421g);
            this.f50890l5.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f50889k5 = f10;
        o0();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.g5 g5Var) {
        org.telegram.ui.Components.g5 g5Var2 = this.f50883e5;
        if (g5Var2 != g5Var) {
            if (g5Var2 != null && this.f50885g5) {
                g5Var2.n(this);
            }
            if (g5Var != null) {
                g5Var.setColorFilter(org.telegram.ui.ActionBar.j6.f29181v3);
            }
            this.f50883e5 = g5Var;
            if (g5Var != null && this.f50885g5) {
                g5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f50884f5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        boolean z12;
        this.f50882d5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f50887i5 = z10;
        if (this.f31596l0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            p0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f28103id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f50886h5 = z11;
        u91 u91Var = this.f50891m5;
        if (tL_forumTopic != null && this != u91Var.f51844d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.j6.f28852d9;
                this.O1 = org.telegram.ui.ActionBar.j6.f28834c9;
                this.P1 = "Unhide";
                this.Q1 = 2131743884;
                this.R1 = org.telegram.ui.ActionBar.j6.f29236y1;
            } else {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.j6.f28834c9;
                this.O1 = org.telegram.ui.ActionBar.j6.f28852d9;
                this.P1 = "Hide";
                this.Q1 = 2131749325;
                this.R1 = org.telegram.ui.ActionBar.j6.f29217x1;
            }
            invalidate();
        }
        if (this.f31596l0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f28103id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.c.c(getContext(), 1.0f, u91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f29115rd), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.g5 g5Var = this.f50883e5;
            if (g5Var == null || g5Var.h() != tL_forumTopic.icon_emoji_id) {
                if (u91Var.f51877v0) {
                    i7 = 13;
                } else {
                    i7 = 10;
                }
                i10 = ((org.telegram.ui.ActionBar.e2) u91Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.g5(i7, i10, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.c.e(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        p0(z13);
        x();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.f50888j5 != null) {
                o0();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void x() {
        super.x();
        o0();
    }
}
