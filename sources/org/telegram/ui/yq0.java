package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
public final class yq0 extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.ur0 f40208y = new org.telegram.ui.Components.ur0(4);
    public final tq0 f40209a;
    public final tq0 f40210b;
    public org.telegram.ui.ActionBar.u0 f40211c;
    public org.telegram.ui.Components.ku d;
    public boolean e;
    public final Paint f40212f;
    public ScrollSlidingTextTabStrip h;
    public final wq0[] f40213n;
    public AnimatorSet f40214r;
    public boolean f40215s;
    public boolean v;
    public boolean f40216w;
    public int f40217x;

    public yq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, wn wnVar) {
        super(null);
        this.e = true;
        this.f40212f = new Paint();
        this.f40213n = new wq0[2];
        this.f40209a = new tq0(0, null, hashMap, arrayList, i10, z10, wnVar, false);
        this.f40210b = new tq0(1, null, hashMap, arrayList, i10, z10, wnVar, false);
    }

    public static void g0(yq0 yq0Var, float f7) {
        yq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            wq0[] wq0VarArr = yq0Var.f40213n;
            if (i10 < wq0VarArr.length) {
                wq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                yq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(yq0 yq0Var, String str) {
        yq0Var.f40211c.getSearchField().setText(str);
        yq0Var.f40211c.getSearchField().setSelection(str.length());
        yq0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        wq0[] wq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19115h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19151j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z10 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 16));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 14);
        this.f40211c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f40211c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.h6.Y9;
        int i12 = org.telegram.ui.ActionBar.h6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, w7.y5.e(-1, 44, 83));
        this.h.setDelegate(new uq0(this));
        this.f40217x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        vq0 vq0Var = new vq0(this, context);
        this.fragmentView = vq0Var;
        vq0Var.setWillNotDraw(false);
        tq0 tq0Var = this.f40209a;
        tq0Var.setParentFragment(this);
        org.telegram.ui.Components.ku kuVar = tq0Var.f38177d0;
        this.d = kuVar;
        kuVar.setSizeNotifierLayout(vq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = tq0Var.f38176c0;
                    } else {
                        view = tq0Var.f38174b0;
                    }
                } else {
                    view = tq0Var.f38172a0;
                }
            } else {
                view = tq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = tq0Var.Z;
        k0 k0Var = tq0Var.f38172a0;
        n50 n50Var = tq0Var.f38174b0;
        View view2 = tq0Var.f38176c0;
        org.telegram.ui.Components.ku kuVar2 = tq0Var.f38177d0;
        tq0 tq0Var2 = this.f40210b;
        tq0Var2.Z = frameLayout;
        tq0Var2.f38172a0 = k0Var;
        tq0Var2.f38177d0 = kuVar2;
        tq0Var2.f38174b0 = n50Var;
        tq0Var2.f38176c0 = view2;
        tq0Var2.f38191q0 = false;
        tq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            wq0VarArr = this.f40213n;
            if (i14 >= wq0VarArr.length) {
                break;
            }
            wq0 wq0Var = new wq0(this, context);
            wq0VarArr[i14] = wq0Var;
            vq0Var.addView(wq0Var, w7.y5.c(-1.0f, -1));
            if (i14 == 0) {
                wq0 wq0Var2 = wq0VarArr[i14];
                wq0Var2.f39728a = tq0Var;
                wq0Var2.d = tq0Var.K;
            } else if (i14 == 1) {
                wq0 wq0Var3 = wq0VarArr[i14];
                wq0Var3.f39728a = tq0Var2;
                wq0Var3.d = tq0Var2.K;
                wq0Var3.setVisibility(8);
            }
            wq0VarArr[i14].d.setScrollingTouchSlop(1);
            wq0 wq0Var4 = wq0VarArr[i14];
            wq0Var4.f39729b = (FrameLayout) wq0Var4.f39728a.getFragmentView();
            wq0VarArr[i14].d.setClipToPadding(false);
            wq0 wq0Var5 = wq0VarArr[i14];
            wq0Var5.f39730c = wq0Var5.f39728a.getActionBar();
            wq0 wq0Var6 = wq0VarArr[i14];
            wq0Var6.addView(wq0Var6.f39729b, w7.y5.c(-1.0f, -1));
            wq0 wq0Var7 = wq0VarArr[i14];
            wq0Var7.addView(wq0Var7.f39730c, w7.y5.c(-2.0f, -1));
            wq0VarArr[i14].f39730c.setVisibility(8);
            wq0VarArr[i14].d.setOnScrollListener(new ii.n3(7, this, wq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        vq0Var.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        vq0Var.addView(tq0Var.Z, w7.y5.e(-1, 48, 83));
        vq0Var.addView(tq0Var.f38172a0, w7.y5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        vq0Var.addView(tq0Var.f38174b0, w7.y5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                wq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19115h5, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(w02) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f19115h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f19151j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.h6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40211c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.h6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f40209a.getThemeDescriptions());
        arrayList.addAll(this.f40210b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        wq0[] wq0VarArr;
        int i10 = 0;
        while (true) {
            wq0VarArr = this.f40213n;
            if (i10 >= wq0VarArr.length) {
                break;
            }
            wq0VarArr[i10].d.B0();
            i10++;
        }
        wq0VarArr[z10 ? 1 : 0].d.getAdapter();
        wq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) wq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tq0 tq0Var = this.f40209a;
        if (tq0Var != null) {
            tq0Var.onConfigurationChanged(configuration);
        }
        tq0 tq0Var2 = this.f40210b;
        if (tq0Var2 != null) {
            tq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        tq0 tq0Var = this.f40209a;
        if (tq0Var != null) {
            tq0Var.onFragmentDestroy();
        }
        tq0 tq0Var2 = this.f40210b;
        if (tq0Var2 != null) {
            tq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        tq0 tq0Var = this.f40209a;
        if (tq0Var != null) {
            tq0Var.onPause();
        }
        tq0 tq0Var2 = this.f40210b;
        if (tq0Var2 != null) {
            tq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f40211c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        tq0 tq0Var = this.f40209a;
        if (tq0Var != null) {
            tq0Var.onResume();
        }
        tq0 tq0Var2 = this.f40210b;
        if (tq0Var2 != null) {
            tq0Var2.onResume();
        }
    }
}
