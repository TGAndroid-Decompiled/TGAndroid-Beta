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
    public final org.telegram.ui.Components.f91 f40668n;
    public final ai.x8 f40669r;
    public final s11 f40670s;
    public int v;
    public boolean f40671w;
    public ValueAnimator f40672x;
    public float f40673y;

    public t11(Context context, org.telegram.ui.Components.lw0 lw0Var, ai.x8 x8Var, final org.telegram.ui.Components.js0 js0Var) {
        super(context, lw0Var);
        this.F = new Rect();
        this.f40669r = x8Var;
        Objects.requireNonNull(x8Var);
        this.G = new hz0(x8Var, 7);
        final org.telegram.ui.Components.ks0 ks0Var = (org.telegram.ui.Components.ks0) this;
        bi.a aVar = new bi.a(ks0Var, context, js0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        s11 s11Var = new s11(ks0Var);
        this.f40670s = s11Var;
        s11Var.f40322a = x8Var.a();
        aVar.setAdapter(s11Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.f91 n10 = aVar.n(10, true);
        this.f40668n = n10;
        int i10 = org.telegram.ui.ActionBar.i6.Gh;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        int i12 = org.telegram.ui.ActionBar.i6.Eh;
        int i13 = org.telegram.ui.ActionBar.i6.Hh;
        int i14 = org.telegram.ui.ActionBar.i6.f21100s8;
        n10.P = i10;
        n10.Q = i11;
        n10.R = i12;
        n10.S = i13;
        n10.T = i14;
        n10.O.setColor(org.telegram.ui.ActionBar.i6.v0(i10, n10.f26407j0));
        n10.f26415r = 12;
        n10.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                ai.l9 storiesController;
                Integer num = (Integer) obj;
                switch (r3) {
                    case 0:
                        Integer num2 = (Integer) obj2;
                        if (ks0Var.f40671w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.js0 js0Var2 = js0Var;
                            org.telegram.ui.Components.e5.S(js0Var2.f27889a, js0Var2.f27890b, js0Var2.f27891c, new org.telegram.ui.Components.pv(js0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ks0Var.f40671w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.js0 js0Var3 = js0Var;
                            org.telegram.ui.Components.pv0 pv0Var = js0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29801v1;
                            storiesController = pv0Var.getStoriesController();
                            if (storiesController.i(pv0Var.f29776j1)) {
                                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.is0(js0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                pv0Var.x(H, n2Var, pv0Var.f29776j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
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
                        if (ks0Var.f40671w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() == -1) {
                            org.telegram.ui.Components.js0 js0Var2 = js0Var;
                            org.telegram.ui.Components.e5.S(js0Var2.f27889a, js0Var2.f27890b, js0Var2.f27891c, new org.telegram.ui.Components.pv(js0Var2, 20));
                            return Boolean.TRUE;
                        }
                        return Boolean.FALSE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ks0Var.f40671w) {
                            final int intValue = num.intValue();
                            final org.telegram.ui.Components.js0 js0Var3 = js0Var;
                            org.telegram.ui.Components.pv0 pv0Var = js0Var3.d;
                            org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29801v1;
                            storiesController = pv0Var.getStoriesController();
                            if (storiesController.i(pv0Var.f29776j1)) {
                                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(n2Var, view);
                                H.W(new org.telegram.ui.Components.is0(js0Var3));
                                H.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                pv0Var.x(H, n2Var, pv0Var.f29776j1, intValue);
                                H.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
                                                return;
                                        }
                                    }
                                }, false);
                                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                pv0 pv0Var2 = js0Var3.d;
                                                pv0Var2.O0(pv0Var2.f29801v1, pv0Var2.f29776j1, intValue);
                                                return;
                                            case 1:
                                                pv0 pv0Var3 = js0Var3.d;
                                                pv0Var3.Q0(pv0Var3.f29801v1, pv0Var3.f29776j1, intValue);
                                                return;
                                            case 2:
                                                js0Var3.d.d1(intValue);
                                                return;
                                            default:
                                                pv0 pv0Var4 = js0Var3.d;
                                                pv0Var4.P0(pv0Var4.f29801v1, pv0Var4.f29776j1, intValue);
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
        ValueAnimator valueAnimator = this.f40672x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f40672x = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f40673y = f7;
            a();
            return;
        }
        float f10 = this.f40673y;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f40672x = ofFloat;
        ofFloat.setDuration(480L);
        this.f40672x.setInterpolator(org.telegram.ui.Components.tr.h);
        this.f40672x.addUpdateListener(new c3(this, 29));
        this.f40672x.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            ai.x8 x8Var = this.f40669r;
            if (longValue == x8Var.f1850b) {
                org.telegram.ui.Components.f91 f91Var = this.f40668n;
                if (f91Var != null) {
                    i12 = f91Var.getCurrentTabId();
                } else {
                    i12 = 0;
                }
                boolean a2 = x8Var.a();
                s11 s11Var = this.f40670s;
                s11Var.f40322a = a2;
                this.h.o(true);
                b(!x8Var.h.isEmpty(), true, false);
                int i13 = this.v;
                if (i13 > 0) {
                    if (s11Var.i(i13) != -1) {
                        AndroidUtilities.runOnUIThread(new q11(this, this.v, 1), 500L);
                        this.v = 0;
                    }
                } else if (f91Var != null && i12 > 0 && x8Var.b(i12) == null) {
                    f91Var.d(0, 0);
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
        return this.f40670s.f(this.f40668n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f40673y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f40673y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f40669r.f1849a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f40669r.f1849a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Rect rect = this.F;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f40670s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new q11(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        float f7;
        float f10;
        if (this.f40671w != z10) {
            this.f40671w = z10;
            org.telegram.ui.Components.f91 f91Var = this.f40668n;
            f91Var.setReordering(z10);
            boolean z11 = this.f40671w;
            org.telegram.ui.Components.ks0 ks0Var = (org.telegram.ui.Components.ks0) this;
            org.telegram.ui.Components.pv0 pv0Var = ks0Var.H;
            TextView textView = pv0Var.f29788q0;
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
            scaleX.scaleY(f11).withEndAction(new org.telegram.ui.Components.es0(1, ks0Var, z11)).start();
            pv0Var.q1(true);
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
                ai.x8 x8Var = this.f40669r;
                x8Var.e();
                x8Var.f(false);
                int currentPosition = f91Var.getCurrentPosition();
                s11 s11Var = this.f40670s;
                int f12 = s11Var.f(currentPosition);
                this.h.o(true);
                int i10 = s11Var.i(f12);
                f91Var.e(0.0f, i10, i10);
            }
        }
    }
}
