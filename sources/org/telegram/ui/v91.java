package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
public final class v91 extends org.telegram.ui.Cells.u2 {
    public boolean f52762b5;
    public int f52763c5;
    public TLRPC.TL_forumTopic f52764d5;
    public org.telegram.ui.Components.p5 f52765e5;
    public Drawable f52766f5;
    public boolean f52767g5;
    public boolean f52768h5;
    public boolean f52769i5;
    public Boolean f52770j5;
    public float f52771k5;
    public ValueAnimator f52772l5;
    public final y91 f52773m5;

    public v91(y91 y91Var, Context context, boolean z10) {
        super(context, z10);
        int i7;
        this.f52773m5 = y91Var;
        this.f52763c5 = -1;
        this.f32043y = false;
        if (y91Var.isInPreviewMode()) {
            i7 = 11;
        } else {
            i7 = 50;
        }
        this.J = i7;
        this.V = 24.0f;
        this.K = 64;
        this.L = 76;
        this.f31991o1 = true;
    }

    @Override
    public final boolean K() {
        return this.f52769i5;
    }

    public final void n0() {
        Drawable drawable = this.f52766f5;
        boolean z10 = drawable instanceof qg.b;
        y91 y91Var = this.f52773m5;
        if (z10) {
            ((qg.b) drawable).a(i0.a.f(this.f52771k5, y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.R9), y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.L7)));
        }
        Drawable[] drawableArr = this.f31963i0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof qg.b) {
                ((qg.b) drawable2).a(i0.a.f(this.f52771k5, y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.R9), y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.L7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z10) {
        boolean z11;
        if (this.f52770j5 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        ValueAnimator valueAnimator = this.f52772l5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52772l5 = null;
        }
        this.f52770j5 = Boolean.valueOf(z10);
        float f10 = 0.0f;
        if (z11) {
            float f11 = this.f52771k5;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f52772l5 = ofFloat;
            ofFloat.addUpdateListener(new iz0(this, 14));
            this.f52772l5.setInterpolator(org.telegram.ui.Components.nr.f37961g);
            this.f52772l5.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.f52771k5 = f10;
        n0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f52767g5 = true;
        org.telegram.ui.Components.p5 p5Var = this.f52765e5;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52767g5 = false;
        org.telegram.ui.Components.p5 p5Var = this.f52765e5;
        if (p5Var != null) {
            p5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.zg0 zg0Var;
        int L;
        hi.y2 y2Var;
        y91 y91Var = this.f52773m5;
        if (y91Var.getMessagesController().E2(-y91Var.f54099a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f31977l0 && (y2Var = this.f32007r2) != null) {
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
        canvas.drawColor(y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f32039x1, 0.0f);
        if (this.f52762b5) {
            if (this.f32023u2) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(this.J);
            }
            if (org.telegram.messenger.hd.f24444a0) {
                canvas.drawLine(0.0f - this.f32039x1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
            } else {
                canvas.drawLine(L - this.f32039x1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
            }
        }
        if ((!this.f52768h5 || (zg0Var = this.f31950f2) == null || zg0Var.C != 0.0f) && (this.f52765e5 != null || this.f52766f5 != null)) {
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(28.0f);
            org.telegram.ui.Components.p5 p5Var = this.f52765e5;
            if (p5Var != null) {
                if (org.telegram.messenger.hd.f24444a0) {
                    p5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    p5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f52765e5.draw(canvas);
            } else {
                if (org.telegram.messenger.hd.f24444a0) {
                    this.f52766f5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.f52766f5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f52766f5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.p5 p5Var) {
        org.telegram.ui.Components.p5 p5Var2 = this.f52765e5;
        if (p5Var2 != p5Var) {
            if (p5Var2 != null && this.f52767g5) {
                p5Var2.n(this);
            }
            if (p5Var != null) {
                p5Var.setColorFilter(org.telegram.ui.ActionBar.m6.f29713v3);
            }
            this.f52765e5 = p5Var;
            if (p5Var != null && this.f52767g5) {
                p5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f52766f5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        boolean z12;
        this.f52764d5 = tL_forumTopic;
        boolean z13 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52769i5 = z10;
        if (this.f31977l0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z12 = true;
            } else {
                z12 = false;
            }
            o0(z12);
        }
        if (tL_forumTopic != null && tL_forumTopic.f28486id == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f52768h5 = z11;
        y91 y91Var = this.f52773m5;
        if (tL_forumTopic != null && this != y91Var.f54109d1) {
            if (tL_forumTopic.hidden) {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.m6.f29384d9;
                this.O1 = org.telegram.ui.ActionBar.m6.f29366c9;
                this.P1 = "Unhide";
                this.Q1 = 2131743639;
                this.R1 = org.telegram.ui.ActionBar.m6.f29768y1;
            } else {
                this.M1 = true;
                this.N1 = org.telegram.ui.ActionBar.m6.f29366c9;
                this.O1 = org.telegram.ui.ActionBar.m6.f29384d9;
                this.P1 = "Hide";
                this.Q1 = 2131749132;
                this.R1 = org.telegram.ui.ActionBar.m6.f29749x1;
            }
            invalidate();
        }
        if (this.f31977l0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f28486id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.c.d(getContext(), 1.0f, y91Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29647rd), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.p5 p5Var = this.f52765e5;
            if (p5Var == null || p5Var.h() != tL_forumTopic.icon_emoji_id) {
                if (y91Var.f54143v0) {
                    i7 = 13;
                } else {
                    i7 = 10;
                }
                i10 = ((org.telegram.ui.ActionBar.g2) y91Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.p5(i7, i10, tL_forumTopic.icon_emoji_id));
            }
        } else {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.c.f(tL_forumTopic));
        }
        if (tL_forumTopic != null && tL_forumTopic.hidden) {
            z13 = true;
        }
        o0(z13);
        x();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            if (this.f52770j5 != null) {
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
