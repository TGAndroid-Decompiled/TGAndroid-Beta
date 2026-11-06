package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.tgnet.TLRPC;
public final class s91 extends org.telegram.ui.Cells.t2 {
    public boolean f49704a5;
    public int f49705b5;
    public TLRPC.TL_forumTopic f49706c5;
    public org.telegram.ui.Components.i5 f49707d5;
    public Drawable f49708e5;
    public boolean f49709f5;
    public boolean f49710g5;
    public boolean f49711h5;
    public Boolean f49712i5;
    public float f49713j5;
    public ValueAnimator f49714k5;
    public final v91 f49715l5;

    public s91(v91 v91Var, Context context, boolean z9) {
        super(context, z9);
        int i7;
        this.f49715l5 = v91Var;
        this.f49705b5 = -1;
        this.f30506y = false;
        if (v91Var.isInPreviewMode()) {
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
        return this.f49711h5;
    }

    public final void n0() {
        Drawable drawable = this.f49708e5;
        boolean z9 = drawable instanceof qg.c;
        v91 v91Var = this.f49715l5;
        if (z9) {
            ((qg.c) drawable).a(i0.a.f(this.f49713j5, v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
        }
        Drawable[] drawableArr = this.f30421h0;
        if (drawableArr != null) {
            Drawable drawable2 = drawableArr[0];
            if (drawable2 instanceof qg.c) {
                ((qg.c) drawable2).a(i0.a.f(this.f49713j5, v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.R9), v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.L7)));
            }
        }
        invalidate();
    }

    public final void o0(boolean z9) {
        boolean z10;
        if (this.f49712i5 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        ValueAnimator valueAnimator = this.f49714k5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49714k5 = null;
        }
        this.f49712i5 = Boolean.valueOf(z9);
        float f10 = 0.0f;
        if (z10) {
            float f11 = this.f49713j5;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f49714k5 = ofFloat;
            ofFloat.addUpdateListener(new gz0(this, 14));
            this.f49714k5.setInterpolator(org.telegram.ui.Components.xq.f40346g);
            this.f49714k5.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        this.f49713j5 = f10;
        n0();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49709f5 = true;
        org.telegram.ui.Components.i5 i5Var = this.f49707d5;
        if (i5Var != null) {
            i5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49709f5 = false;
        org.telegram.ui.Components.i5 i5Var = this.f49707d5;
        if (i5Var != null) {
            i5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        org.telegram.ui.Components.kg0 kg0Var;
        int L;
        fi.a3 a3Var;
        v91 v91Var = this.f49715l5;
        if (v91Var.getMessagesController().y2(-v91Var.f50628a)) {
            super.onDraw(canvas);
            return;
        }
        if (this.f30435k0 && (a3Var = this.f30464q2) != null) {
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
        canvas.drawColor(v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6));
        super.onDraw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(this.f30496w1, 0.0f);
        if (this.f49704a5) {
            if (this.f30481t2) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(this.I);
            }
            if (org.telegram.messenger.hd.f22878a0) {
                canvas.drawLine(0.0f - this.f30496w1, getMeasuredHeight() - 1, getMeasuredWidth() - L, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
            } else {
                canvas.drawLine(L - this.f30496w1, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
            }
        }
        if ((!this.f49710g5 || (kg0Var = this.f30407e2) == null || kg0Var.C != 0.0f) && (this.f49707d5 != null || this.f49708e5 != null)) {
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(28.0f);
            org.telegram.ui.Components.i5 i5Var = this.f49707d5;
            if (i5Var != null) {
                if (org.telegram.messenger.hd.f22878a0) {
                    i5Var.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    i5Var.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f49707d5.draw(canvas);
            } else {
                if (org.telegram.messenger.hd.f22878a0) {
                    this.f49708e5.setBounds((getWidth() - L2) - L4, L3, getWidth() - L2, L4 + L3);
                } else {
                    this.f49708e5.setBounds(L2, L3, L2 + L4, L4 + L3);
                }
                this.f49708e5.draw(canvas);
            }
        }
        canvas.restore();
    }

    public void setAnimatedEmojiDrawable(org.telegram.ui.Components.i5 i5Var) {
        org.telegram.ui.Components.i5 i5Var2 = this.f49707d5;
        if (i5Var2 != i5Var) {
            if (i5Var2 != null && this.f49709f5) {
                i5Var2.n(this);
            }
            if (i5Var != null) {
                i5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f28181v3);
            }
            this.f49707d5 = i5Var;
            if (i5Var != null && this.f49709f5) {
                i5Var.a(this);
            }
        }
    }

    public void setForumIcon(Drawable drawable) {
        this.f49708e5 = drawable;
    }

    public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        boolean z11;
        this.f49706c5 = tL_forumTopic;
        boolean z12 = false;
        if (tL_forumTopic != null && tL_forumTopic.closed) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f49711h5 = z9;
        if (this.f30435k0) {
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z11 = true;
            } else {
                z11 = false;
            }
            o0(z11);
        }
        if (tL_forumTopic != null && tL_forumTopic.f27005id == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49710g5 = z10;
        v91 v91Var = this.f49715l5;
        if (tL_forumTopic != null && this != v91Var.f50636c1) {
            if (tL_forumTopic.hidden) {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.f27852d9;
                this.N1 = org.telegram.ui.ActionBar.k6.f27834c9;
                this.O1 = "Unhide";
                this.P1 = 2131743885;
                this.Q1 = org.telegram.ui.ActionBar.k6.f28236y1;
            } else {
                this.L1 = true;
                this.M1 = org.telegram.ui.ActionBar.k6.f27834c9;
                this.N1 = org.telegram.ui.ActionBar.k6.f27852d9;
                this.O1 = "Hide";
                this.P1 = 2131749324;
                this.Q1 = org.telegram.ui.ActionBar.k6.f28217x1;
            }
            invalidate();
        }
        if (this.f30435k0) {
            return;
        }
        if (tL_forumTopic != null && tL_forumTopic.f27005id == 1) {
            setAnimatedEmojiDrawable(null);
            setForumIcon(qg.d.c(getContext(), 1.0f, v91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28056od), false));
        } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
            setForumIcon(null);
            org.telegram.ui.Components.i5 i5Var = this.f49707d5;
            if (i5Var == null || i5Var.h() != tL_forumTopic.icon_emoji_id) {
                if (v91Var.f50669u0) {
                    i7 = 13;
                } else {
                    i7 = 10;
                }
                i10 = ((org.telegram.ui.ActionBar.f2) v91Var).currentAccount;
                setAnimatedEmojiDrawable(new org.telegram.ui.Components.i5(i7, i10, tL_forumTopic.icon_emoji_id));
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
            if (this.f49712i5 != null) {
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
