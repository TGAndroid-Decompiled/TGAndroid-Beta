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
public abstract class yy0 extends FrameLayout implements org.telegram.messenger.vs {
    public final wy0 f43747a;
    public final org.telegram.ui.Components.w71 f43748b;
    public final th.t4 f43749c;
    public final xy0 d;
    public int e;
    public boolean f43750f;
    public ValueAnimator h;
    public float f43751n;
    public boolean f43752r;
    public final Rect f43753s;
    public final vv0 f43754w;

    public yy0(Context context, th.t4 t4Var, final org.telegram.ui.Components.zq0 zq0Var) {
        super(context);
        this.f43753s = new Rect();
        this.f43749c = t4Var;
        Objects.requireNonNull(t4Var);
        this.f43754w = new vv0(t4Var, 10);
        final org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
        wy0 wy0Var = new wy0(ar0Var, context, zq0Var, 0);
        this.f43747a = wy0Var;
        wy0Var.setAllowDisallowInterceptTouch(true);
        xy0 xy0Var = new xy0(ar0Var);
        this.d = xy0Var;
        xy0Var.f43482a = t4Var.a();
        wy0Var.setAdapter(xy0Var);
        wy0Var.setTranslationY(org.telegram.messenger.i0.L(42.0f));
        org.telegram.ui.Components.w71 n10 = wy0Var.n(10, true);
        this.f43748b = n10;
        n10.g(org.telegram.ui.ActionBar.t6.ui, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.si, org.telegram.ui.ActionBar.t6.vi, org.telegram.ui.ActionBar.t6.f21207s8);
        n10.f32159r = 12;
        n10.setPreTabClick(new org.telegram.messenger.l20() {
            @Override
            public final Object d(Number number, Object obj) {
                th.e5 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                org.telegram.ui.Components.ar0 ar0Var2 = ar0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (ar0Var2.f43750f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.s4.R(zq0Var2.f33209a, zq0Var2.f33210b, zq0Var2.f33211c, new org.telegram.ui.Components.px(zq0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ar0Var2.f43750f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.au0 au0Var = zq0Var2.d;
                            org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
                            storiesController = au0Var.getStoriesController();
                            if (storiesController.i(au0Var.l1)) {
                                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, view);
                                H.W(new org.telegram.ui.Components.yq0(zq0Var2));
                                H.c(2131231762, org.telegram.messenger.dd.L0(2131744816, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                au0Var.A(new k2.m0(H), k2Var, au0Var.l1, intValue);
                                H.c(2131232115, org.telegram.messenger.dd.L0(2131744811, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232770, org.telegram.messenger.dd.L0(2131744808, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232107, org.telegram.messenger.dd.L0(2131744814, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
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
        n10.setOnTabLongClick(new org.telegram.messenger.l20() {
            @Override
            public final Object d(Number number, Object obj) {
                th.e5 storiesController;
                int i10 = r3;
                final org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                org.telegram.ui.Components.ar0 ar0Var2 = ar0Var;
                Integer num = (Integer) number;
                switch (i10) {
                    case 0:
                        Integer num2 = (Integer) obj;
                        if (ar0Var2.f43750f) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.s4.R(zq0Var2.f33209a, zq0Var2.f33210b, zq0Var2.f33211c, new org.telegram.ui.Components.px(zq0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ar0Var2.f43750f) {
                            final int intValue = num.intValue();
                            org.telegram.ui.Components.au0 au0Var = zq0Var2.d;
                            org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
                            storiesController = au0Var.getStoriesController();
                            if (storiesController.i(au0Var.l1)) {
                                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(k2Var, view);
                                H.W(new org.telegram.ui.Components.yq0(zq0Var2));
                                H.c(2131231762, org.telegram.messenger.dd.L0(2131744816, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                au0Var.A(new k2.m0(H), k2Var, au0Var.l1, intValue);
                                H.c(2131232115, org.telegram.messenger.dd.L0(2131744811, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232770, org.telegram.messenger.dd.L0(2131744808, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(2131232107, org.telegram.messenger.dd.L0(2131744814, null), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                au0 au0Var2 = zq0Var2.d;
                                                au0Var2.W0(au0Var2.f24568x1, au0Var2.l1, intValue);
                                                return;
                                            case 1:
                                                au0 au0Var3 = zq0Var2.d;
                                                au0Var3.Y0(au0Var3.f24568x1, au0Var3.l1, intValue);
                                                return;
                                            case 2:
                                                zq0Var2.d.o1(intValue);
                                                return;
                                            default:
                                                au0 au0Var4 = zq0Var2.d;
                                                au0Var4.X0(au0Var4.f24568x1, au0Var4.l1, intValue);
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
        org.telegram.ui.Components.w71 w71Var = this.f43748b;
        if (w71Var != null) {
            i10 = w71Var.getCurrentTabId();
        } else {
            i10 = 0;
        }
        th.t4 t4Var = this.f43749c;
        boolean a2 = t4Var.a();
        xy0 xy0Var = this.d;
        xy0Var.f43482a = a2;
        this.f43747a.o(true);
        c(!t4Var.h.isEmpty(), true, false);
        int i11 = this.e;
        if (i11 > 0) {
            if (xy0Var.i(i11) != -1) {
                org.telegram.messenger.i0.h3(new vy0(this, this.e, 1), 500L);
                this.e = 0;
            }
        } else if (w71Var != null && i10 > 0 && t4Var.b(i10) == null) {
            w71Var.d(0, 0);
        }
    }

    public abstract void b();

    public final void c(boolean z10, boolean z11, boolean z12) {
        if (this.f43752r == z10 && !z12) {
            return;
        }
        this.f43752r = z10;
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
            this.f43751n = f7;
            b();
            return;
        }
        float f10 = this.f43751n;
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
        if (i10 == org.telegram.messenger.at.f14731j3 && ((Long) objArr[0]).longValue() == this.f43749c.f49473b) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f43752r && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.f43748b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f43751n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f43751n;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        th.t4 t4Var = this.f43749c;
        org.telegram.messenger.at.f(t4Var.f49472a).c(this, org.telegram.messenger.at.f14731j3);
        if (this.f43752r != t4Var.h.isEmpty() && this.d.f43482a == t4Var.a()) {
            return;
        }
        a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.at.f(this.f43749c.f49472a).n(this, org.telegram.messenger.at.f14731j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.f43753s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.d.i(i10) != -1) {
            org.telegram.messenger.i0.h3(new vy0(this, i10, 0), 500L);
        } else {
            this.e = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f43750f != z10) {
            this.f43750f = z10;
            org.telegram.ui.Components.w71 w71Var = this.f43748b;
            w71Var.setReordering(z10);
            boolean z11 = this.f43750f;
            org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
            org.telegram.ui.Components.au0 au0Var = ar0Var.f24480x;
            TextView textView = au0Var.f24555s0;
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
            scaleX.scaleY(f11).withEndAction(new k2.v(21, ar0Var, z11)).start();
            au0Var.E1(true);
            if (z10) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) T;
                    profileActivity.U4(false);
                    org.telegram.messenger.i0.g3(new na0(profileActivity, 28));
                }
            }
            if (!z10) {
                org.telegram.messenger.i0.r(this.f43754w);
                th.t4 t4Var = this.f43749c;
                t4Var.e();
                t4Var.f(false);
                int currentPosition = w71Var.getCurrentPosition();
                xy0 xy0Var = this.d;
                int f12 = xy0Var.f(currentPosition);
                this.f43747a.o(true);
                int i10 = xy0Var.i(f12);
                w71Var.e(0.0f, i10, i10);
            }
        }
    }
}
