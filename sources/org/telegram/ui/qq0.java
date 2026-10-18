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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class qq0 extends org.telegram.ui.ActionBar.n2 {
    public static final org.telegram.ui.Components.es0 f40470y = new org.telegram.ui.Components.es0(4);
    public final lq0 f40471a;
    public final lq0 f40472b;
    public org.telegram.ui.ActionBar.u0 f40473c;
    public org.telegram.ui.Components.qu d;
    public boolean e;
    public final Paint f40474f;
    public ScrollSlidingTextTabStrip h;
    public final oq0[] f40475n;
    public AnimatorSet f40476r;
    public boolean f40477s;
    public boolean v;
    public boolean f40478w;
    public int f40479x;

    public qq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, sn snVar) {
        super(null);
        this.e = true;
        this.f40474f = new Paint();
        this.f40475n = new oq0[2];
        this.f40471a = new lq0(0, null, hashMap, arrayList, i10, z10, snVar, false);
        this.f40472b = new lq0(1, null, hashMap, arrayList, i10, z10, snVar, false);
    }

    public static void g0(qq0 qq0Var, float f7) {
        qq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            oq0[] oq0VarArr = qq0Var.f40475n;
            if (i10 < oq0VarArr.length) {
                oq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                qq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(qq0 qq0Var, String str) {
        qq0Var.f40473c.getSearchField().setText(str);
        qq0Var.f40473c.getSearchField().setSelection(str.length());
        qq0Var.actionBar.x();
    }

    @Override
    public final View createView(Context context) {
        oq0[] oq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21092j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f7 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new q60(this, 19));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 14);
        this.f40473c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f40473c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.h6.Y9;
        int i12 = org.telegram.ui.ActionBar.h6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.d();
        this.actionBar.addView(this.h, w7.z5.e(-1, 44, 83));
        this.h.setDelegate(new mq0(this));
        this.f40479x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        nq0 nq0Var = new nq0(this, context);
        this.fragmentView = nq0Var;
        nq0Var.setWillNotDraw(false);
        lq0 lq0Var = this.f40471a;
        lq0Var.setParentFragment(this);
        org.telegram.ui.Components.qu quVar = lq0Var.f38873d0;
        this.d = quVar;
        quVar.setSizeNotifierLayout(nq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = lq0Var.f38872c0;
                    } else {
                        view = lq0Var.f38870b0;
                    }
                } else {
                    view = lq0Var.f38868a0;
                }
            } else {
                view = lq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = lq0Var.Z;
        m0 m0Var = lq0Var.f38868a0;
        x10 x10Var = lq0Var.f38870b0;
        View view2 = lq0Var.f38872c0;
        org.telegram.ui.Components.qu quVar2 = lq0Var.f38873d0;
        lq0 lq0Var2 = this.f40472b;
        lq0Var2.Z = frameLayout;
        lq0Var2.f38868a0 = m0Var;
        lq0Var2.f38873d0 = quVar2;
        lq0Var2.f38870b0 = x10Var;
        lq0Var2.f38872c0 = view2;
        lq0Var2.f38887q0 = false;
        lq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            oq0VarArr = this.f40475n;
            if (i14 >= oq0VarArr.length) {
                break;
            }
            oq0 oq0Var = new oq0(this, context);
            oq0VarArr[i14] = oq0Var;
            float f10 = f7;
            nq0Var.addView(oq0Var, w7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                oq0 oq0Var2 = oq0VarArr[i14];
                oq0Var2.f39846a = lq0Var;
                oq0Var2.d = lq0Var.K;
            } else if (i14 == 1) {
                oq0 oq0Var3 = oq0VarArr[i14];
                oq0Var3.f39846a = lq0Var2;
                oq0Var3.d = lq0Var2.K;
                oq0Var3.setVisibility(8);
            }
            oq0VarArr[i14].d.setScrollingTouchSlop(1);
            oq0 oq0Var4 = oq0VarArr[i14];
            oq0Var4.f39847b = (FrameLayout) oq0Var4.f39846a.getFragmentView();
            oq0VarArr[i14].d.setClipToPadding(false);
            oq0 oq0Var5 = oq0VarArr[i14];
            oq0Var5.f39848c = oq0Var5.f39846a.getActionBar();
            oq0 oq0Var6 = oq0VarArr[i14];
            oq0Var6.addView(oq0Var6.f39847b, w7.z5.c(-1.0f, -1));
            oq0 oq0Var7 = oq0VarArr[i14];
            oq0Var7.addView(oq0Var7.f39848c, w7.z5.c(-2.0f, -1));
            oq0VarArr[i14].f39848c.setVisibility(8);
            oq0VarArr[i14].d.setOnScrollListener(new ki.m3(7, this, oq0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        nq0Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        nq0Var.addView(lq0Var.Z, w7.z5.e(-1, 48, 83));
        nq0Var.addView(lq0Var.f38868a0, w7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        nq0Var.addView(lq0Var.f38870b0, w7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                oq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f21057h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40473c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f40471a.getThemeDescriptions());
        arrayList.addAll(this.f40472b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        oq0[] oq0VarArr;
        int i10 = 0;
        while (true) {
            oq0VarArr = this.f40475n;
            if (i10 >= oq0VarArr.length) {
                break;
            }
            oq0VarArr[i10].d.B0();
            i10++;
        }
        oq0VarArr[z10 ? 1 : 0].d.getAdapter();
        oq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.b0) oq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        lq0 lq0Var = this.f40471a;
        if (lq0Var != null) {
            lq0Var.onConfigurationChanged(configuration);
        }
        lq0 lq0Var2 = this.f40472b;
        if (lq0Var2 != null) {
            lq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        lq0 lq0Var = this.f40471a;
        if (lq0Var != null) {
            lq0Var.onFragmentDestroy();
        }
        lq0 lq0Var2 = this.f40472b;
        if (lq0Var2 != null) {
            lq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lq0 lq0Var = this.f40471a;
        if (lq0Var != null) {
            lq0Var.onPause();
        }
        lq0 lq0Var2 = this.f40472b;
        if (lq0Var2 != null) {
            lq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f40473c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        lq0 lq0Var = this.f40471a;
        if (lq0Var != null) {
            lq0Var.onResume();
        }
        lq0 lq0Var2 = this.f40472b;
        if (lq0Var2 != null) {
            lq0Var2.onResume();
        }
    }
}
