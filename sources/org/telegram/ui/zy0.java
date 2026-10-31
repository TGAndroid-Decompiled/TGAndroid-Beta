package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
public abstract class zy0 extends FrameLayout implements org.telegram.messenger.us {
    public final xy0 f44253a;
    public final org.telegram.ui.Components.v71 f44254b;
    public final th.t4 f44255c;
    public final yy0 d;
    public int e;
    public boolean f44256f;
    public ValueAnimator h;
    public float f44257n;
    public boolean f44258r;
    public final Rect f44259s;
    public final wv0 f44260w;

    public zy0(Context context, th.t4 t4Var, final org.telegram.ui.Components.yq0 yq0Var) {
        super(context);
        this.f44259s = new Rect();
        this.f44255c = t4Var;
        Objects.requireNonNull(t4Var);
        this.f44260w = new wv0(t4Var, 10);
        final org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this;
        xy0 xy0Var = new xy0(zq0Var, context, yq0Var, 0);
        this.f44253a = xy0Var;
        xy0Var.setAllowDisallowInterceptTouch(true);
        yy0 yy0Var = new yy0(zq0Var);
        this.d = yy0Var;
        yy0Var.f43916a = t4Var.a();
        xy0Var.setAdapter(yy0Var);
        xy0Var.setTranslationY(org.telegram.messenger.i0.L(42.0f));
        org.telegram.ui.Components.v71 n10 = xy0Var.n(10, true);
        this.f44254b = n10;
        n10.g(org.telegram.ui.ActionBar.t6.ui, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.si, org.telegram.ui.ActionBar.t6.vi, org.telegram.ui.ActionBar.t6.f21206s8);
        n10.f31181r = 12;
        n10.setPreTabClick(new org.telegram.messenger.k20() {
            @Override
            public final Object d(Number number, Object obj) {
                th.e5 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.yq0 yq0Var2 = yq0Var;
                org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (zq0Var2.f44256f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.s4.R(yq0Var2.f32774a, yq0Var2.f32775b, yq0Var2.f32776c, new org.telegram.ui.Components.px(yq0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zq0Var2.f44256f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.zt0 zt0Var = yq0Var2.d;
                            org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
                            storiesController = zt0Var.getStoriesController();
                            if (storiesController.i(zt0Var.l1)) {
                                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, view);
                                H.W(new org.telegram.ui.Components.xq0(yq0Var2));
                                H.c(2131231762, org.telegram.messenger.cd.L0(2131744816, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zt0Var.A(new k2.m0(H), k2Var, zt0Var.l1, intValue);
                                H.c(2131232115, org.telegram.messenger.cd.L0(2131744811, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232770, org.telegram.messenger.cd.L0(2131744808, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232107, org.telegram.messenger.cd.L0(2131744814, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        n10.setOnTabLongClick(new org.telegram.messenger.k20() {
            @Override
            public final Object d(Number number, Object obj) {
                th.e5 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.yq0 yq0Var2 = yq0Var;
                org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (zq0Var2.f44256f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.s4.R(yq0Var2.f32774a, yq0Var2.f32775b, yq0Var2.f32776c, new org.telegram.ui.Components.px(yq0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zq0Var2.f44256f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.zt0 zt0Var = yq0Var2.d;
                            org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
                            storiesController = zt0Var.getStoriesController();
                            if (storiesController.i(zt0Var.l1)) {
                                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, view);
                                H.W(new org.telegram.ui.Components.xq0(yq0Var2));
                                H.c(2131231762, org.telegram.messenger.cd.L0(2131744816, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                zt0Var.A(new k2.m0(H), k2Var, zt0Var.l1, intValue);
                                H.c(2131232115, org.telegram.messenger.cd.L0(2131744811, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232770, org.telegram.messenger.cd.L0(2131744808, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232107, org.telegram.messenger.cd.L0(2131744814, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                zt0 zt0Var2 = yq0Var2.d;
                                                zt0Var2.V0(zt0Var2.f33240x1, zt0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                zt0 zt0Var3 = yq0Var2.d;
                                                zt0Var3.X0(zt0Var3.f33240x1, zt0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                yq0Var2.d.n1(intValue);
                                                return;
                                            default:
                                                zt0 zt0Var4 = yq0Var2.d;
                                                zt0Var4.W0(zt0Var4.f33240x1, zt0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, true);
                                H.Z();
                            }
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                }
            }
        });
        addView(n10, w7.b6.e(-1, 42, 48));
        c(!t4Var.h.isEmpty(), false, true);
    }

    public final void a() {
        int i10;
        org.telegram.ui.Components.v71 v71Var = this.f44254b;
        if (v71Var != null) {
            i10 = v71Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        th.t4 t4Var = this.f44255c;
        boolean a2 = t4Var.a();
        yy0 yy0Var = this.d;
        yy0Var.f43916a = a2;
        this.f44253a.o(true);
        c(!t4Var.h.isEmpty(), true, false);
        int i11 = this.e;
        if (i11 > 0) {
            if (yy0Var.i(i11) != -1) {
                org.telegram.messenger.i0.h3(new wy0(this, this.e, 1), 500L);
                this.e = 0;
            }
        } else if (v71Var != null && i10 > 0 && t4Var.b(i10) == null) {
            v71Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f44258r == z10 && !z12) {
            return;
        }
        this.f44258r = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.h = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f44257n = f7;
            b();
            return;
        }
        float f10 = this.f44257n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.h = ofFloat;
        ofFloat.setDuration(480L);
        this.h.setInterpolator(org.telegram.ui.Components.gr.h);
        this.h.addUpdateListener(new a3(this, 28));
        this.h.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19635j3 && ((Long) objArr[0]).longValue() == this.f44255c.f49459b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f44258r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f44254b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f44257n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f44257n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        th.t4 t4Var = this.f44255c;
        org.telegram.messenger.zs.f(t4Var.f49458a).c(this, org.telegram.messenger.zs.f19635j3);
        if (this.f44258r != t4Var.h.isEmpty() && this.d.f43916a == t4Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.f44255c.f49458a).n(this, org.telegram.messenger.zs.f19635j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.f44259s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.d.i(i10) != -1) {
            org.telegram.messenger.i0.h3(new wy0(this, i10, 0), 500L);
        } else {
            this.e = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f44256f != z10) {
            this.f44256f = z10;
            org.telegram.ui.Components.v71 v71Var = this.f44254b;
            v71Var.setReordering(z10);
            boolean z11 = this.f44256f;
            org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this;
            org.telegram.ui.Components.zt0 zt0Var = zq0Var.f33150x;
            TextView textView = zt0Var.f33227s0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 1.0f;
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z11) {
                f11 = 0.4f;
            }
            scaleX.scaleY(f11).withEndAction(new k2.v(21, zq0Var, z11)).start();
            zt0Var.D1(true);
            if (z10) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.T4(false);
                    org.telegram.messenger.i0.g3(new oa0(profileActivity, 28));
                }
            }
            if (!z10) {
                org.telegram.messenger.i0.r(this.f44260w);
                th.t4 t4Var = this.f44255c;
                t4Var.e();
                t4Var.f(false);
                int currentPosition = v71Var.getCurrentPosition();
                yy0 yy0Var = this.d;
                int f12 = yy0Var.f(currentPosition);
                this.f44253a.o(true);
                int i10 = yy0Var.i(f12);
                v71Var.e(0.0f, i10, i10);
            }
        }
    }
}
