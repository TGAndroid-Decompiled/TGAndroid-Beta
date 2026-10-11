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
public abstract class z11 extends org.telegram.ui.Components.ia implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public final Rect F;
    public final mz0 G;
    public final bi.a h;
    public final org.telegram.ui.Components.o91 f44590n;
    public final ai.y8 f44591r;
    public final y11 f44592s;
    public int v;
    public boolean f44593w;
    public ValueAnimator f44594x;
    public float f44595y;

    public z11(Context context, org.telegram.ui.Components.tw0 tw0Var, ai.y8 y8Var, final org.telegram.ui.Components.ws0 ws0Var) {
        super(context, tw0Var);
        this.F = new Rect();
        this.f44591r = y8Var;
        Objects.requireNonNull(y8Var);
        this.G = new mz0(y8Var, 7);
        final org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this;
        bi.a aVar = new bi.a(xs0Var, context, ws0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        y11 y11Var = new y11(xs0Var);
        this.f44592s = y11Var;
        y11Var.f44269a = y8Var.a();
        aVar.setAdapter(y11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.o91 n10 = aVar.n(10, true);
        this.f44590n = n10;
        n10.g(org.telegram.ui.ActionBar.h6.Gh, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.Eh, org.telegram.ui.ActionBar.h6.Hh, org.telegram.ui.ActionBar.h6.f21101s8);
        n10.f29452r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.m9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (xs0Var.f44593w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ws0 ws0Var2 = ws0Var;
                            org.telegram.ui.Components.g5.R(ws0Var2.f32788a, ws0Var2.f32789b, ws0Var2.f32790c, new org.telegram.ui.Components.cw(ws0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !xs0Var.f44593w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ws0 ws0Var3 = ws0Var;
                            org.telegram.ui.Components.cw0 cw0Var = ws0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
                            storiesController = cw0Var.getStoriesController();
                            if (storiesController.i(cw0Var.f25511j1)) {
                                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.vs0(ws0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                cw0Var.x(H, m2Var, cw0Var.f25511j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
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
                ai.m9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (xs0Var.f44593w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.ws0 ws0Var2 = ws0Var;
                            org.telegram.ui.Components.g5.R(ws0Var2.f32788a, ws0Var2.f32789b, ws0Var2.f32790c, new org.telegram.ui.Components.cw(ws0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !xs0Var.f44593w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.ws0 ws0Var3 = ws0Var;
                            org.telegram.ui.Components.cw0 cw0Var = ws0Var3.d;
                            org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
                            storiesController = cw0Var.getStoriesController();
                            if (storiesController.i(cw0Var.f25511j1)) {
                                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(m2Var, view);
                                H.W(new org.telegram.ui.Components.vs0(ws0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                cw0Var.x(H, m2Var, cw0Var.f25511j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                cw0 cw0Var2 = ws0Var3.d;
                                                cw0Var2.O0(cw0Var2.f25536v1, cw0Var2.f25511j1, intValue);
                                                return;
                                            case 1:
                                                cw0 cw0Var3 = ws0Var3.d;
                                                cw0Var3.Q0(cw0Var3.f25536v1, cw0Var3.f25511j1, intValue);
                                                return;
                                            case 2:
                                                ws0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                cw0 cw0Var4 = ws0Var3.d;
                                                cw0Var4.P0(cw0Var4.f25536v1, cw0Var4.f25511j1, intValue);
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
        addView(n10, w7.x5.e(-1, 42, 48));
        b(!y8Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.E == z10 && !z12) {
            return;
        }
        this.E = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f44594x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f44594x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f44595y = f7;
            a();
            return;
        }
        float f10 = this.f44595y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f44594x = ofFloat;
        ofFloat.setDuration(480L);
        this.f44594x.setInterpolator(org.telegram.ui.Components.is.h);
        this.f44594x.addUpdateListener(new x11(this, 0));
        this.f44594x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.y8 y8Var = this.f44591r;
            if (longValue == y8Var.f1954b) {
                org.telegram.ui.Components.o91 o91Var = this.f44590n;
                if (o91Var != null) {
                    i12 = o91Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = y8Var.a();
                y11 y11Var = this.f44592s;
                y11Var.f44269a = a2;
                this.h.o(true);
                b(!y8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (y11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new v11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (o91Var != null && i12 > 0 && y8Var.b(i12) == null) {
                    o91Var.d(0, 0);
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
        return this.f44592s.f(this.f44590n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f44595y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f44595y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f44591r.f1953a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f44591r.f1953a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f44592s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new v11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f44593w != z10) {
            this.f44593w = z10;
            org.telegram.ui.Components.o91 o91Var = this.f44590n;
            o91Var.setReordering(z10);
            boolean z11 = this.f44593w;
            org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this;
            org.telegram.ui.Components.cw0 cw0Var = xs0Var.H;
            TextView textView = cw0Var.f25523q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.es0(2, xs0Var, z11)).start();
            cw0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new wb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.G);
                ai.y8 y8Var = this.f44591r;
                y8Var.e();
                y8Var.f(false);
                int currentPosition = o91Var.getCurrentPosition();
                y11 y11Var = this.f44592s;
                int f12 = y11Var.f(currentPosition);
                this.h.o(true);
                int i10 = y11Var.i(f12);
                o91Var.e(0.0f, i10, i10);
            }
        }
    }
}
