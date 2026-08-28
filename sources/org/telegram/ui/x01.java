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
public abstract class x01 extends org.telegram.ui.Components.y9 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public final Rect B;
    public final ky0 C;
    public final jh.a h;
    public final org.telegram.ui.Components.m71 f44301n;
    public final ih.j6 f44302r;
    public final w01 f44303s;
    public int v;
    public boolean f44304w;
    public ValueAnimator f44305x;
    public float f44306y;

    public x01(Context context, org.telegram.ui.Components.xu0 xu0Var, ih.j6 j6Var, final org.telegram.ui.Components.yq0 yq0Var) {
        super(context, xu0Var);
        this.B = new Rect();
        this.f44302r = j6Var;
        Objects.requireNonNull(j6Var);
        this.C = new ky0(j6Var, 7);
        final org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this;
        jh.a aVar = new jh.a(zq0Var, context, yq0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        w01 w01Var = new w01(zq0Var);
        this.f44303s = w01Var;
        w01Var.f43622a = j6Var.a();
        aVar.setAdapter(w01Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.m71 n10 = aVar.n(10, true);
        this.f44301n = n10;
        int i9 = org.telegram.ui.ActionBar.f6.Gh;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        int i11 = org.telegram.ui.ActionBar.f6.Eh;
        int i12 = org.telegram.ui.ActionBar.f6.Hh;
        int i13 = org.telegram.ui.ActionBar.f6.f23269s8;
        n10.L = i9;
        n10.M = i10;
        n10.N = i11;
        n10.O = i12;
        n10.P = i13;
        n10.K.setColor(org.telegram.ui.ActionBar.f6.v0(i9, n10.f30746f0));
        n10.f30755r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ih.v6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (zq0Var.f44304w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.yq0 yq0Var2 = yq0Var;
                            org.telegram.ui.Components.y4.S(yq0Var2.f35051a, yq0Var2.f35052b, yq0Var2.f35053c, new org.telegram.ui.Components.wu(yq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zq0Var.f44304w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.yq0 yq0Var3 = yq0Var;
                            org.telegram.ui.Components.eu0 eu0Var = yq0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
                            storiesController = eu0Var.getStoriesController();
                            if (storiesController.i(eu0Var.f28136f1)) {
                                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(o2Var, view);
                                H.W(new fh.e3(yq0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                eu0Var.x(H, o2Var, eu0Var.f28136f1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
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
                ih.v6 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (zq0Var.f44304w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.yq0 yq0Var2 = yq0Var;
                            org.telegram.ui.Components.y4.S(yq0Var2.f35051a, yq0Var2.f35052b, yq0Var2.f35053c, new org.telegram.ui.Components.wu(yq0Var2, 19));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !zq0Var.f44304w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.yq0 yq0Var3 = yq0Var;
                            org.telegram.ui.Components.eu0 eu0Var = yq0Var3.d;
                            org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
                            storiesController = eu0Var.getStoriesController();
                            if (storiesController.i(eu0Var.f28136f1)) {
                                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(o2Var, view);
                                H.W(new fh.e3(yq0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                eu0Var.x(H, o2Var, eu0Var.f28136f1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                eu0 eu0Var2 = yq0Var3.d;
                                                eu0Var2.O0(eu0Var2.f28160r1, eu0Var2.f28136f1, intValue);
                                                return;
                                            case 1:
                                                eu0 eu0Var3 = yq0Var3.d;
                                                eu0Var3.Q0(eu0Var3.f28160r1, eu0Var3.f28136f1, intValue);
                                                return;
                                            case 2:
                                                yq0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                eu0 eu0Var4 = yq0Var3.d;
                                                eu0Var4.P0(eu0Var4.f28160r1, eu0Var4.f28136f1, intValue);
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
        addView(n10, g7.e6.e(-1, 42, 48));
        b(!j6Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.A == z10 && !z12) {
            return;
        }
        this.A = z10;
        setEnabled(z10);
        ValueAnimator valueAnimator = this.f44305x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f44305x = null;
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f44306y = f10;
            a();
            return;
        }
        float f11 = this.f44306y;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f44305x = ofFloat;
        ofFloat.setDuration(480L);
        this.f44305x.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f44305x.addUpdateListener(new v01(this, 0));
        this.f44305x.start();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        if (i9 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ih.j6 j6Var = this.f44302r;
            if (longValue == j6Var.f11632b) {
                org.telegram.ui.Components.m71 m71Var = this.f44301n;
                if (m71Var != null) {
                    i11 = m71Var.getCurrentTabId();
                } else {
                    i11 = 0;
                }
                boolean a2 = j6Var.a();
                w01 w01Var = this.f44303s;
                w01Var.f43622a = a2;
                this.h.o(true);
                b(!j6Var.h.isEmpty(), true, false);
                int i12 = this.v;
                if (i12 > 0) {
                    if (w01Var.i(i12) != -1) {
                        AndroidUtilities.runOnUIThread(new t01(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (m71Var != null && i11 > 0 && j6Var.b(i11) == null) {
                    m71Var.d(0, 0);
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
        return this.f44303s.f(this.f44301n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f44306y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f44306y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f44302r.f11631a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f44302r.f11631a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        Rect rect = this.B;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i9) {
        if (this.f44303s.i(i9) != -1) {
            AndroidUtilities.runOnUIThread(new t01(this, i9, 0), 500L);
        } else {
            this.v = i9;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f10;
        float f11;
        if (this.f44304w != z10) {
            this.f44304w = z10;
            org.telegram.ui.Components.m71 m71Var = this.f44301n;
            m71Var.setReordering(z10);
            boolean z11 = this.f44304w;
            org.telegram.ui.Components.zq0 zq0Var = (org.telegram.ui.Components.zq0) this;
            org.telegram.ui.Components.eu0 eu0Var = zq0Var.D;
            TextView textView = eu0Var.m0;
            textView.setVisibility(0);
            ViewPropertyAnimator animate = textView.animate();
            float f12 = 1.0f;
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.4f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!z11) {
                f12 = 0.4f;
            }
            scaleX.scaleY(f12).withEndAction(new org.telegram.ui.Components.a50(5, zq0Var, z11)).start();
            eu0Var.q1(true);
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new cb0(profileActivity, 27));
                }
            }
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(this.C);
                ih.j6 j6Var = this.f44302r;
                j6Var.e();
                j6Var.f(false);
                int currentPosition = m71Var.getCurrentPosition();
                w01 w01Var = this.f44303s;
                int f13 = w01Var.f(currentPosition);
                this.h.o(true);
                int i9 = w01Var.i(f13);
                m71Var.e(0.0f, i9, i9);
            }
        }
    }
}
