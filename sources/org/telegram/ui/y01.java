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
public abstract class y01 extends org.telegram.ui.Components.da implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public final Rect B;
    public final ky0 C;
    public final mh.a h;
    public final org.telegram.ui.Components.y71 f44686n;
    public final lh.g6 f44687r;
    public final x01 f44688s;
    public int v;
    public boolean f44689w;
    public ValueAnimator f44690x;
    public float f44691y;

    public y01(Context context, org.telegram.ui.Components.hv0 hv0Var, lh.g6 g6Var, final org.telegram.ui.Components.jr0 jr0Var) {
        super(context, hv0Var);
        this.B = new Rect();
        this.f44687r = g6Var;
        Objects.requireNonNull(g6Var);
        this.C = new ky0(g6Var, 7);
        final org.telegram.ui.Components.kr0 kr0Var = (org.telegram.ui.Components.kr0) this;
        mh.a aVar = new mh.a(kr0Var, context, jr0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        x01 x01Var = new x01(kr0Var);
        this.f44688s = x01Var;
        x01Var.f44425a = g6Var.a();
        aVar.setAdapter(x01Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.y71 n10 = aVar.n(10, true);
        this.f44686n = n10;
        int i10 = org.telegram.ui.ActionBar.g6.Gh;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int i12 = org.telegram.ui.ActionBar.g6.Eh;
        int i13 = org.telegram.ui.ActionBar.g6.Hh;
        int i14 = org.telegram.ui.ActionBar.g6.f23329s8;
        n10.L = i10;
        n10.M = i11;
        n10.N = i12;
        n10.O = i13;
        n10.P = i14;
        n10.K.setColor(org.telegram.ui.ActionBar.g6.v0(i10, n10.f34950f0));
        n10.f34959r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                lh.s6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (kr0Var.f44689w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.jr0 jr0Var2 = jr0Var;
                            org.telegram.ui.Components.c5.S(jr0Var2.f29810a, jr0Var2.f29811b, jr0Var2.f29812c, new org.telegram.ui.Components.cv(jr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !kr0Var.f44689w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.jr0 jr0Var3 = jr0Var;
                            org.telegram.ui.Components.qu0 qu0Var = jr0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
                            storiesController = qu0Var.getStoriesController();
                            if (storiesController.i(qu0Var.f32069f1)) {
                                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(o2Var, view);
                                H.W(new ih.t2(jr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                qu0Var.x(H, o2Var, qu0Var.f32069f1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
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
                lh.s6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (kr0Var.f44689w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.jr0 jr0Var2 = jr0Var;
                            org.telegram.ui.Components.c5.S(jr0Var2.f29810a, jr0Var2.f29811b, jr0Var2.f29812c, new org.telegram.ui.Components.cv(jr0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !kr0Var.f44689w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.jr0 jr0Var3 = jr0Var;
                            org.telegram.ui.Components.qu0 qu0Var = jr0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
                            storiesController = qu0Var.getStoriesController();
                            if (storiesController.i(qu0Var.f32069f1)) {
                                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(o2Var, view);
                                H.W(new ih.t2(jr0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                qu0Var.x(H, o2Var, qu0Var.f32069f1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                qu0 qu0Var2 = jr0Var3.d;
                                                qu0Var2.O0(qu0Var2.f32093r1, qu0Var2.f32069f1, intValue);
                                                return;
                                            case 1:
                                                qu0 qu0Var3 = jr0Var3.d;
                                                qu0Var3.Q0(qu0Var3.f32093r1, qu0Var3.f32069f1, intValue);
                                                return;
                                            case 2:
                                                jr0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                qu0 qu0Var4 = jr0Var3.d;
                                                qu0Var4.P0(qu0Var4.f32093r1, qu0Var4.f32069f1, intValue);
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
        addView(n10, i7.f6.e(-1, 42, 48));
        b(!g6Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.A == z10 && !z12) {
            return;
        }
        this.A = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f44690x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f44690x = null;
        }
        float f9 = 0.0f;
        if (!z11) {
            if (z10) {
                f9 = 1.0f;
            }
            this.f44691y = f9;
            a();
            return;
        }
        float f10 = this.f44691y;
        if (z10) {
            f9 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.f44690x = ofFloat;
        ofFloat.setDuration(480L);
        this.f44690x.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f44690x.addUpdateListener(new w01(this, 0));
        this.f44690x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            lh.g6 g6Var = this.f44687r;
            if (longValue == g6Var.f15635b) {
                org.telegram.ui.Components.y71 y71Var = this.f44686n;
                if (y71Var != null) {
                    i12 = y71Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = g6Var.a();
                x01 x01Var = this.f44688s;
                x01Var.f44425a = a2;
                this.h.o(true);
                b(!g6Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (x01Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new u01(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (y71Var != null && i12 > 0 && g6Var.b(i12) == null) {
                    y71Var.d(0, 0);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public int getCurrentAlbumId() {
        return this.f44688s.f(this.f44686n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f44691y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f44691y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f44687r.f15634a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f44687r.f15634a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.B;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f44688s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new u01(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f9;
        float f10;
        if (this.f44689w != z10) {
            this.f44689w = z10;
            org.telegram.ui.Components.y71 y71Var = this.f44686n;
            y71Var.setReordering(z10);
            boolean z11 = this.f44689w;
            org.telegram.ui.Components.kr0 kr0Var = (org.telegram.ui.Components.kr0) this;
            org.telegram.ui.Components.qu0 qu0Var = kr0Var.D;
            TextView textView = qu0Var.m0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f11 = 1.0f;
            if (z11) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z11) {
                f11 = 0.4f;
            }
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.p90(4, kr0Var, z11)).start();
            qu0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new fb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.C);
                lh.g6 g6Var = this.f44687r;
                g6Var.e();
                g6Var.f(false);
                int currentPosition = y71Var.getCurrentPosition();
                x01 x01Var = this.f44688s;
                int f12 = x01Var.f(currentPosition);
                this.h.o(true);
                int i10 = x01Var.i(f12);
                y71Var.e(0.0f, i10, i10);
            }
        }
    }
}
