package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public abstract class s11 extends org.telegram.ui.Components.ga implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final vz0 G;
    public final bi.a h;
    public final org.telegram.ui.Components.w81 f37565n;
    public final ai.x8 f37566r;
    public final r11 f37567s;
    public int v;
    public boolean f37568w;
    public ValueAnimator f37569x;
    public float f37570y;

    public s11(Context context, org.telegram.ui.Components.bw0 bw0Var, ai.x8 x8Var, final org.telegram.ui.Components.es0 es0Var) {
        super(context, bw0Var);
        this.F = new Rect();
        this.f37566r = x8Var;
        Objects.requireNonNull(x8Var);
        this.G = new vz0(x8Var, 6);
        final org.telegram.ui.Components.fs0 fs0Var = (org.telegram.ui.Components.fs0) this;
        bi.a aVar = new bi.a(fs0Var, context, es0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        r11 r11Var = new r11(fs0Var);
        this.f37567s = r11Var;
        r11Var.f37165a = x8Var.a();
        aVar.setAdapter(r11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.w81 n10 = aVar.n(10, true);
        this.f37565n = n10;
        int i10 = org.telegram.ui.ActionBar.h6.Gh;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        int i12 = org.telegram.ui.ActionBar.h6.Eh;
        int i13 = org.telegram.ui.ActionBar.h6.Hh;
        int i14 = org.telegram.ui.ActionBar.h6.f19337s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.h6.v0(i10, n10.f29944j0));
        n10.f29952r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (fs0Var.f37568w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.es0 es0Var2 = es0Var;
                            org.telegram.ui.Components.e5.S(es0Var2.f24045a, es0Var2.f24046b, es0Var2.f24047c, new org.telegram.ui.Components.nv(es0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !fs0Var.f37568w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.es0 es0Var3 = es0Var;
                            org.telegram.ui.Components.kv0 kv0Var = es0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
                            storiesController = kv0Var.getStoriesController();
                            if (storiesController.i(kv0Var.f25841j1)) {
                                org.telegram.ui.Components.z70 H = org.telegram.ui.Components.z70.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.ds0(es0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                kv0Var.x(H, m2Var, kv0Var.f25841j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
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
        n10.setOnTabLongClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (fs0Var.f37568w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.es0 es0Var2 = es0Var;
                            org.telegram.ui.Components.e5.S(es0Var2.f24045a, es0Var2.f24046b, es0Var2.f24047c, new org.telegram.ui.Components.nv(es0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !fs0Var.f37568w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.es0 es0Var3 = es0Var;
                            org.telegram.ui.Components.kv0 kv0Var = es0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
                            storiesController = kv0Var.getStoriesController();
                            if (storiesController.i(kv0Var.f25841j1)) {
                                org.telegram.ui.Components.z70 H = org.telegram.ui.Components.z70.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.ds0(es0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                kv0Var.x(H, m2Var, kv0Var.f25841j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                kv0 kv0Var2 = es0Var3.d;
                                                kv0Var2.O0(kv0Var2.f25866v1, kv0Var2.f25841j1, intValue);
                                                return;
                                            case 1:
                                                kv0 kv0Var3 = es0Var3.d;
                                                kv0Var3.Q0(kv0Var3.f25866v1, kv0Var3.f25841j1, intValue);
                                                return;
                                            case 2:
                                                es0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                kv0 kv0Var4 = es0Var3.d;
                                                kv0Var4.P0(kv0Var4.f25866v1, kv0Var4.f25841j1, intValue);
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
        addView(n10, w7.y5.e(-1, 42, 48));
        b(!x8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f37569x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37569x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f37570y = f7;
            a();
            return;
        }
        float f10 = this.f37570y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f37569x = ofFloat;
        ofFloat.setDuration(480L);
        this.f37569x.setInterpolator(org.telegram.ui.Components.sr.h);
        this.f37569x.addUpdateListener(new q11(this, 0));
        this.f37569x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.x8 x8Var = this.f37566r;
            if (longValue == x8Var.f1699b) {
                org.telegram.ui.Components.w81 w81Var = this.f37565n;
                if (w81Var != null) {
                    i12 = w81Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = x8Var.a();
                r11 r11Var = this.f37567s;
                r11Var.f37165a = a2;
                this.h.o(true);
                b(!x8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (r11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new o11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (w81Var != null && i12 > 0 && x8Var.b(i12) == null) {
                    w81Var.d(0, 0);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.E && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.f37567s.f(this.f37565n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f37570y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f37570y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f37566r.f1698a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f37566r.f1698a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f37567s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new o11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f37568w != z10) {
            this.f37568w = z10;
            org.telegram.ui.Components.w81 w81Var = this.f37565n;
            w81Var.setReordering(z10);
            boolean z11 = this.f37568w;
            org.telegram.ui.Components.fs0 fs0Var = (org.telegram.ui.Components.fs0) this;
            org.telegram.ui.Components.kv0 kv0Var = fs0Var.H;
            TextView textView = kv0Var.f25853q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.zr0(1, fs0Var, z11)).start();
            kv0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new sb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ai.x8 x8Var = this.f37566r;
                x8Var.e();
                x8Var.f(false);
                int currentPosition = w81Var.getCurrentPosition();
                r11 r11Var = this.f37567s;
                int f12 = r11Var.f(currentPosition);
                this.h.o(true);
                int i10 = r11Var.i(f12);
                w81Var.e(0.0f, i10, i10);
            }
        }
    }
}
