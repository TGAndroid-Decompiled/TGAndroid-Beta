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
public abstract class t11 extends org.telegram.ui.Components.ha implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final hz0 G;
    public final bi.a h;
    public final org.telegram.ui.Components.g91 f40686n;
    public final ai.x8 f40687r;
    public final s11 f40688s;
    public int v;
    public boolean f40689w;
    public ValueAnimator f40690x;
    public float f40691y;

    public t11(Context context, org.telegram.ui.Components.mw0 mw0Var, ai.x8 x8Var, final org.telegram.ui.Components.ks0 ks0Var) {
        super(context, mw0Var);
        this.F = new Rect();
        this.f40687r = x8Var;
        Objects.requireNonNull(x8Var);
        this.G = new hz0(x8Var, 7);
        final org.telegram.ui.Components.ls0 ls0Var = (org.telegram.ui.Components.ls0) this;
        bi.a aVar = new bi.a(ls0Var, context, ks0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        s11 s11Var = new s11(ls0Var);
        this.f40688s = s11Var;
        s11Var.f40302a = x8Var.a();
        aVar.setAdapter(s11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.g91 n10 = aVar.n(10, true);
        this.f40686n = n10;
        int i10 = org.telegram.ui.ActionBar.i6.Gh;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        int i12 = org.telegram.ui.ActionBar.i6.Eh;
        int i13 = org.telegram.ui.ActionBar.i6.Hh;
        int i14 = org.telegram.ui.ActionBar.i6.f21109s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.i6.v0(i10, n10.f26781j0));
        n10.f26789r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ls0Var.f40689w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ks0 ks0Var2 = ks0Var;
                            org.telegram.ui.Components.e5.S(ks0Var2.f28284a, ks0Var2.f28285b, ks0Var2.f28286c, new org.telegram.ui.Components.pv(ks0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ls0Var.f40689w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ks0 ks0Var3 = ks0Var;
                            org.telegram.ui.Components.qv0 qv0Var = ks0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
                            storiesController = qv0Var.getStoriesController();
                            if (storiesController.i(qv0Var.f30238j1)) {
                                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.js0(ks0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                qv0Var.x(H, n2Var, qv0Var.f30238j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
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
                        if (ls0Var.f40689w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ks0 ks0Var2 = ks0Var;
                            org.telegram.ui.Components.e5.S(ks0Var2.f28284a, ks0Var2.f28285b, ks0Var2.f28286c, new org.telegram.ui.Components.pv(ks0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ls0Var.f40689w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ks0 ks0Var3 = ks0Var;
                            org.telegram.ui.Components.qv0 qv0Var = ks0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
                            storiesController = qv0Var.getStoriesController();
                            if (storiesController.i(qv0Var.f30238j1)) {
                                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.js0(ks0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                qv0Var.x(H, n2Var, qv0Var.f30238j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qv0 qv0Var2 = ks0Var3.d;
                                                qv0Var2.O0(qv0Var2.f30263v1, qv0Var2.f30238j1, intValue);
                                                return;
                                            case 1:
                                                qv0 qv0Var3 = ks0Var3.d;
                                                qv0Var3.Q0(qv0Var3.f30263v1, qv0Var3.f30238j1, intValue);
                                                return;
                                            case 2:
                                                ks0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qv0 qv0Var4 = ks0Var3.d;
                                                qv0Var4.P0(qv0Var4.f30263v1, qv0Var4.f30238j1, intValue);
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
        addView(n10, w7.z5.e(-1, 42, 48));
        b(!x8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f40690x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40690x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f40691y = f7;
            a();
            return;
        }
        float f10 = this.f40691y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40690x = ofFloat;
        ofFloat.setDuration(480L);
        this.f40690x.setInterpolator(org.telegram.ui.Components.tr.h);
        this.f40690x.addUpdateListener(new c3(this, 29));
        this.f40690x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.x8 x8Var = this.f40687r;
            if (longValue == x8Var.f1850b) {
                org.telegram.ui.Components.g91 g91Var = this.f40686n;
                if (g91Var != null) {
                    i12 = g91Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = x8Var.a();
                s11 s11Var = this.f40688s;
                s11Var.f40302a = a2;
                this.h.o(true);
                b(!x8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (s11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new q11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (g91Var != null && i12 > 0 && x8Var.b(i12) == null) {
                    g91Var.d(0, 0);
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
        return this.f40688s.f(this.f40686n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f40691y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f40691y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f40687r.f1849a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f40687r.f1849a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f40688s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new q11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f40689w != z10) {
            this.f40689w = z10;
            org.telegram.ui.Components.g91 g91Var = this.f40686n;
            g91Var.setReordering(z10);
            boolean z11 = this.f40689w;
            org.telegram.ui.Components.ls0 ls0Var = (org.telegram.ui.Components.ls0) this;
            org.telegram.ui.Components.qv0 qv0Var = ls0Var.H;
            TextView textView = qv0Var.f30250q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.fs0(1, ls0Var, z11)).start();
            qv0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new wb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ai.x8 x8Var = this.f40687r;
                x8Var.e();
                x8Var.f(false);
                int currentPosition = g91Var.getCurrentPosition();
                s11 s11Var = this.f40688s;
                int f12 = s11Var.f(currentPosition);
                this.h.o(true);
                int i10 = s11Var.i(f12);
                g91Var.e(0.0f, i10, i10);
            }
        }
    }
}
