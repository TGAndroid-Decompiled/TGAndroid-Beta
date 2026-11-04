package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class vm0 extends org.telegram.ui.ActionBar.d2 {
    public static final org.telegram.ui.Components.qp0 E = new org.telegram.ui.Components.qp0(4);
    public final sm0 f50553a;
    public final sm0 f50554b;
    public org.telegram.ui.ActionBar.q0 f50555c;
    public org.telegram.ui.Components.jt d;
    public boolean f50556e;
    public final Paint f50557f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.x4[] f50558n;
    public AnimatorSet f50559r;
    public boolean f50560s;
    public boolean f50561w;
    public boolean f50562x;
    public int f50563y;

    public vm0(HashMap hashMap, ArrayList arrayList, int i3, boolean z10, wm wmVar) {
        super(null);
        this.f50556e = true;
        this.f50557f = new Paint();
        this.f50558n = new org.telegram.ui.ActionBar.x4[2];
        this.f50553a = new sm0(0, null, hashMap, arrayList, i3, z10, wmVar, false);
        this.f50554b = new sm0(1, null, hashMap, arrayList, i3, z10, wmVar, false);
    }

    public static org.telegram.ui.ActionBar.k j0(vm0 vm0Var) {
        return vm0Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k k0(vm0 vm0Var) {
        return vm0Var.actionBar;
    }

    public static void l0(vm0 vm0Var, float f10) {
        vm0Var.actionBar.setTranslationY(f10);
        int i3 = 0;
        while (true) {
            org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.f50558n;
            if (i3 < x4VarArr.length) {
                ((org.telegram.ui.Components.tj0) x4VarArr[i3].f28806f).setPinnedSectionOffsetY((int) f10);
                i3++;
            } else {
                vm0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void m0(vm0 vm0Var, String str) {
        vm0Var.f50555c.getSearchField().setText(str);
        vm0Var.f50555c.getSearchField().setSelection(str.length());
        vm0Var.actionBar.z();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        sm0 sm0Var = this.f50553a;
        if (sm0Var != null) {
            sm0Var.addThemeColorKeys(hashSet);
        }
        sm0 sm0Var2 = this.f50554b;
        if (sm0Var2 != null) {
            sm0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        View view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i3, null);
        boolean z10 = true;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i3, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new hx(this, 26));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.I = new lg.w1(this, 18);
        this.f50555c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745771, null));
        EditTextBoldCursor searchField = this.f50555c.getSearchField();
        org.telegram.ui.ActionBar.r6.V(searchField, i3, null);
        org.telegram.ui.ActionBar.r6.w(searchField, i3, null);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i10 = org.telegram.ui.ActionBar.k6.Y9;
        int i11 = org.telegram.ui.ActionBar.k6.Z9;
        scrollSlidingTextTabStrip2.M = i10;
        scrollSlidingTextTabStrip2.N = i11;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, b8.mf.e(-1, 44, 83));
        this.h.setDelegate(new tm0(this, 0));
        this.f50563y = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        um0 um0Var = new um0(this, context);
        this.fragmentView = um0Var;
        um0Var.setWillNotDraw(false);
        sm0 sm0Var = this.f50553a;
        sm0Var.setParentFragment(this);
        org.telegram.ui.Components.jt jtVar = sm0Var.f49546e0;
        this.d = jtVar;
        jtVar.setSizeNotifierLayout(um0Var);
        for (int i12 = 0; i12 < 4; i12++) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        view = sm0Var.f49544d0;
                    } else {
                        view = sm0Var.f49543c0;
                    }
                } else {
                    view = sm0Var.f49541b0;
                }
            } else {
                view = sm0Var.f49539a0;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = sm0Var.f49539a0;
        l0 l0Var = sm0Var.f49541b0;
        org.telegram.ui.Components.voip.r0 r0Var = sm0Var.f49543c0;
        View view2 = sm0Var.f49544d0;
        org.telegram.ui.Components.jt jtVar2 = sm0Var.f49546e0;
        sm0 sm0Var2 = this.f50554b;
        sm0Var2.f49539a0 = frameLayout;
        sm0Var2.f49541b0 = l0Var;
        sm0Var2.f49546e0 = jtVar2;
        sm0Var2.f49543c0 = r0Var;
        sm0Var2.f49544d0 = view2;
        sm0Var2.f49561r0 = false;
        sm0Var2.setParentFragment(this);
        int i13 = 0;
        while (true) {
            x4VarArr = this.f50558n;
            if (i13 >= x4VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.x4 x4Var = new org.telegram.ui.ActionBar.x4(this, context);
            x4VarArr[i13] = x4Var;
            float f11 = f10;
            um0Var.addView(x4Var, b8.mf.c(-1.0f, -1));
            if (i13 == 0) {
                org.telegram.ui.ActionBar.x4 x4Var2 = x4VarArr[i13];
                x4Var2.f28804c = sm0Var;
                x4Var2.f28806f = sm0Var.L;
            } else if (i13 == 1) {
                org.telegram.ui.ActionBar.x4 x4Var3 = x4VarArr[i13];
                x4Var3.f28804c = sm0Var2;
                x4Var3.f28806f = sm0Var2.L;
                x4Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.tj0) x4VarArr[i13].f28806f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.x4 x4Var4 = x4VarArr[i13];
            x4Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.d2) x4Var4.f28804c).getFragmentView();
            ((org.telegram.ui.Components.tj0) x4VarArr[i13].f28806f).setClipToPadding(false);
            org.telegram.ui.ActionBar.x4 x4Var5 = x4VarArr[i13];
            x4Var5.f28805e = ((org.telegram.ui.ActionBar.d2) x4Var5.f28804c).getActionBar();
            org.telegram.ui.ActionBar.x4 x4Var6 = x4VarArr[i13];
            x4Var6.addView((FrameLayout) x4Var6.d, b8.mf.c(-1.0f, -1));
            org.telegram.ui.ActionBar.x4 x4Var7 = x4VarArr[i13];
            x4Var7.addView((org.telegram.ui.ActionBar.k) x4Var7.f28805e, b8.mf.c(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) x4VarArr[i13].f28805e).setVisibility(8);
            ((org.telegram.ui.Components.tj0) x4VarArr[i13].f28806f).setOnScrollListener(new ai.i4(9, this, ((org.telegram.ui.Components.tj0) x4VarArr[i13].f28806f).getOnScrollListener()));
            i13++;
            f10 = f11;
        }
        float f12 = f10;
        um0Var.addView(this.actionBar, b8.mf.c(-2.0f, -1));
        um0Var.addView(sm0Var.f49539a0, b8.mf.e(-1, 48, 83));
        um0Var.addView(sm0Var.f49541b0, b8.mf.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        um0Var.addView(sm0Var.f49543c0, b8.mf.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, org.telegram.messenger.bd.M0(2131749278, null), null);
            this.h.a(1, org.telegram.messenger.bd.M0(2131750476, null), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                x4VarArr[0].f28803b = currentTabId;
            }
            this.h.c();
        }
        o0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.f50556e = z10;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27954h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Je));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50555c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27988j5));
        int i3 = org.telegram.ui.ActionBar.k6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.addAll(this.f50553a.getThemeDescriptions());
        arrayList.addAll(this.f50554b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f50556e;
    }

    public final void o0(boolean z10) {
        org.telegram.ui.ActionBar.x4[] x4VarArr;
        int i3 = 0;
        while (true) {
            x4VarArr = this.f50558n;
            if (i3 >= x4VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.tj0) x4VarArr[i3].f28806f).C0();
            i3++;
        }
        ((org.telegram.ui.Components.tj0) x4VarArr[z10 ? 1 : 0].f28806f).getAdapter();
        ((org.telegram.ui.Components.tj0) x4VarArr[z10 ? 1 : 0].f28806f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((u4.b0) ((org.telegram.ui.Components.tj0) x4VarArr[z10 ? 1 : 0].f28806f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sm0 sm0Var = this.f50553a;
        if (sm0Var != null) {
            sm0Var.onConfigurationChanged(configuration);
        }
        sm0 sm0Var2 = this.f50554b;
        if (sm0Var2 != null) {
            sm0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        sm0 sm0Var = this.f50553a;
        if (sm0Var != null) {
            sm0Var.onFragmentDestroy();
        }
        sm0 sm0Var2 = this.f50554b;
        if (sm0Var2 != null) {
            sm0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        sm0 sm0Var = this.f50553a;
        if (sm0Var != null) {
            sm0Var.onPause();
        }
        sm0 sm0Var2 = this.f50554b;
        if (sm0Var2 != null) {
            sm0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.q0 q0Var = this.f50555c;
        if (q0Var != null) {
            q0Var.F(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        sm0 sm0Var = this.f50553a;
        if (sm0Var != null) {
            sm0Var.onResume();
        }
        sm0 sm0Var2 = this.f50554b;
        if (sm0Var2 != null) {
            sm0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i3;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.q0 q0Var = this.f50555c;
            boolean z10 = false;
            if (q0Var != null && q0Var.getSearchField() != null) {
                this.f50555c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false));
            }
            if (this.fragmentView != null) {
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false)) >= 0.721f) {
                    z10 = true;
                }
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                if (z10) {
                    i3 = systemUiVisibility | 8192;
                } else {
                    i3 = systemUiVisibility & (-8193);
                }
                if (i3 != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i3);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            sm0 sm0Var = this.f50553a;
            if (sm0Var != null && sm0Var.fragmentView != null) {
                sm0Var.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        try {
            sm0 sm0Var2 = this.f50554b;
            if (sm0Var2 != null && sm0Var2.fragmentView != null) {
                sm0Var2.onThemeColorsChanged();
            }
        } catch (Exception e12) {
            org.telegram.messenger.a8.g(e12, true);
        }
    }
}
