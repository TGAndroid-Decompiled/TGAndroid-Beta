package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

public abstract class y01 extends org.telegram.ui.Components.w9 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public final Rect B;
    public final ky0 C;
    public final kh.a h;

    public final org.telegram.ui.Components.o71 f44655n;

    public final jh.f6 f44656r;

    public final x01 f44657s;
    public int v;

    public boolean f44658w;

    public ValueAnimator f44659x;

    public float f44660y;

    public y01(Context context, org.telegram.ui.Components.zu0 zu0Var, jh.f6 f6Var, final org.telegram.ui.Components.zq0 zq0Var) {
        super(context, zu0Var);
        this.B = new Rect();
        this.f44656r = f6Var;
        Objects.requireNonNull(f6Var);
        this.C = new ky0(f6Var, 7);
        final org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
        kh.a aVar = new kh.a(ar0Var, context, zq0Var);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        x01 x01Var = new x01(ar0Var);
        this.f44657s = x01Var;
        x01Var.f44233a = f6Var.a();
        aVar.setAdapter(x01Var);
        aVar.setTranslationY(AndroidUtilities.dp(42.0f));
        org.telegram.ui.Components.o71 o71VarN = aVar.n(10, true);
        this.f44655n = o71VarN;
        int i10 = org.telegram.ui.ActionBar.g6.Gh;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        int i12 = org.telegram.ui.ActionBar.g6.Eh;
        int i13 = org.telegram.ui.ActionBar.g6.Hh;
        int i14 = org.telegram.ui.ActionBar.g6.f23322s8;
        o71VarN.L = i10;
        o71VarN.M = i11;
        o71VarN.N = i12;
        o71VarN.O = i13;
        o71VarN.P = i14;
        o71VarN.K.setColor(org.telegram.ui.ActionBar.g6.v0(i10, o71VarN.f31214f0));
        o71VarN.f31223r = 12;
        final int i15 = 0;
        o71VarN.setPreTabClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                switch (i15) {
                    case 0:
                        if (ar0Var.f44658w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() != -1) {
                            return Boolean.FALSE;
                        }
                        org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                        org.telegram.ui.Components.y4.S(zq0Var2.f35323a, zq0Var2.f35324b, zq0Var2.f35325c, new org.telegram.ui.Components.vu(zq0Var2, 19));
                        return Boolean.TRUE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() == -1 || num.intValue() == 0 || ar0Var.f44658w) {
                            return Boolean.FALSE;
                        }
                        final int iIntValue = num.intValue();
                        final org.telegram.ui.Components.zq0 zq0Var3 = zq0Var;
                        org.telegram.ui.Components.hu0 hu0Var = zq0Var3.d;
                        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
                        if (hu0Var.getStoriesController().i(hu0Var.f29121f1)) {
                            org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(n2Var, view);
                            b70VarH.W(new gh.z2(zq0Var3));
                            final int i16 = 0;
                            b70VarH.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            hu0Var.x(b70VarH, n2Var, hu0Var.f29121f1, iIntValue);
                            final int i17 = 1;
                            b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i18 = 2;
                            b70VarH.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i19 = 3;
                            b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i19) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, true);
                            b70VarH.Z();
                        }
                        return Boolean.TRUE;
                }
            }
        });
        final int i16 = 1;
        o71VarN.setOnTabLongClick(new Utilities.Callback2Return() {
            @Override
            public final Object run(Object obj, Object obj2) {
                Integer num = (Integer) obj;
                switch (i16) {
                    case 0:
                        if (ar0Var.f44658w) {
                            return Boolean.TRUE;
                        }
                        if (num.intValue() != -1) {
                            return Boolean.FALSE;
                        }
                        org.telegram.ui.Components.zq0 zq0Var2 = zq0Var;
                        org.telegram.ui.Components.y4.S(zq0Var2.f35323a, zq0Var2.f35324b, zq0Var2.f35325c, new org.telegram.ui.Components.vu(zq0Var2, 19));
                        return Boolean.TRUE;
                    default:
                        View view = (View) obj2;
                        if (num.intValue() == -1 || num.intValue() == 0 || ar0Var.f44658w) {
                            return Boolean.FALSE;
                        }
                        final int iIntValue = num.intValue();
                        final org.telegram.ui.Components.zq0 zq0Var3 = zq0Var;
                        org.telegram.ui.Components.hu0 hu0Var = zq0Var3.d;
                        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
                        if (hu0Var.getStoriesController().i(hu0Var.f29121f1)) {
                            org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(n2Var, view);
                            b70VarH.W(new gh.z2(zq0Var3));
                            final int i17 = 0;
                            b70VarH.c(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            hu0Var.x(b70VarH, n2Var, hu0Var.f29121f1, iIntValue);
                            final int i18 = 1;
                            b70VarH.c(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i19 = 2;
                            b70VarH.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i19) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, false);
                            final int i110 = 3;
                            b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i110) {
                                        case 0:
                                            hu0 hu0Var2 = zq0Var3.d;
                                            hu0Var2.O0(hu0Var2.f29145r1, hu0Var2.f29121f1, iIntValue);
                                            break;
                                        case 1:
                                            hu0 hu0Var3 = zq0Var3.d;
                                            hu0Var3.Q0(hu0Var3.f29145r1, hu0Var3.f29121f1, iIntValue);
                                            break;
                                        case 2:
                                            zq0Var3.d.d1(iIntValue);
                                            break;
                                        default:
                                            hu0 hu0Var4 = zq0Var3.d;
                                            hu0Var4.P0(hu0Var4.f29145r1, hu0Var4.f29121f1, iIntValue);
                                            break;
                                    }
                                }
                            }, true);
                            b70VarH.Z();
                        }
                        return Boolean.TRUE;
                }
            }
        });
        addView(o71VarN, h7.z5.e(-1, 42, 48));
        b(!f6Var.h.isEmpty(), false, true);
    }

    public abstract void a();

    public final void b(boolean z10, boolean z11, boolean z12) {
        if (this.A != z10 || z12) {
            this.A = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.f44659x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f44659x = null;
            }
            if (!z11) {
                this.f44660y = z10 ? 1.0f : 0.0f;
                a();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f44660y, z10 ? 1.0f : 0.0f);
            this.f44659x = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(480L);
            this.f44659x.setInterpolator(org.telegram.ui.Components.er.h);
            this.f44659x.addUpdateListener(new w01(this, 0));
            this.f44659x.start();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storyAlbumsCollectionsUpdate) {
            long jLongValue = ((Long) objArr[0]).longValue();
            jh.f6 f6Var = this.f44656r;
            if (jLongValue != f6Var.f13324b) {
                return;
            }
            org.telegram.ui.Components.o71 o71Var = this.f44655n;
            int currentTabId = o71Var != null ? o71Var.getCurrentTabId() : 0;
            boolean zA = f6Var.a();
            x01 x01Var = this.f44657s;
            x01Var.f44233a = zA;
            this.h.o(true);
            b(!f6Var.h.isEmpty(), true, false);
            int i12 = this.v;
            if (i12 > 0) {
                if (x01Var.i(i12) != -1) {
                    AndroidUtilities.runOnUIThread(new u01(this, this.v, 1), 500L);
                    this.v = 0;
                    return;
                }
                return;
            }
            if (o71Var == null || currentTabId <= 0 || f6Var.b(currentTabId) != null) {
                return;
            }
            o71Var.d(0, 0);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.f44657s.f(this.f44655n.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.f44660y;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.f44660y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f44656r.f13323a).addObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f44656r.f13323a).removeObserver(this, NotificationCenter.storyAlbumsCollectionsUpdate);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.B;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i10) {
        if (this.f44657s.i(i10) != -1) {
            AndroidUtilities.runOnUIThread(new u01(this, i10, 0), 500L);
        } else {
            this.v = i10;
        }
    }

    public void setReorderingAlbums(boolean z10) {
        if (this.f44658w == z10) {
            return;
        }
        this.f44658w = z10;
        org.telegram.ui.Components.o71 o71Var = this.f44655n;
        o71Var.setReordering(z10);
        boolean z11 = this.f44658w;
        org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this;
        org.telegram.ui.Components.hu0 hu0Var = ar0Var.D;
        TextView textView = hu0Var.m0;
        textView.setVisibility(0);
        textView.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.4f).scaleY(z11 ? 1.0f : 0.4f).withEndAction(new org.telegram.ui.Components.f50(5, ar0Var, z11)).start();
        hu0Var.q1(true);
        if (z10) {
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) n2VarU;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new gb0(profileActivity, 27));
            }
        }
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.C);
        jh.f6 f6Var = this.f44656r;
        f6Var.e();
        f6Var.f(false);
        int currentPosition = o71Var.getCurrentPosition();
        x01 x01Var = this.f44657s;
        int iF = x01Var.f(currentPosition);
        this.h.o(true);
        int i10 = x01Var.i(iF);
        o71Var.e(0.0f, i10, i10);
    }
}
