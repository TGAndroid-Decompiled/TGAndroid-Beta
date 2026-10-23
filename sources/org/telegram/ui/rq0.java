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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class rq0 extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.js0 f41222y = new org.telegram.ui.Components.js0(4);
    public final mq0 f41223a;
    public final mq0 f41224b;
    public org.telegram.ui.ActionBar.u0 f41225c;
    public org.telegram.ui.Components.qu d;
    public boolean e;
    public final Paint f41226f;
    public ScrollSlidingTextTabStrip h;
    public final pq0[] f41227n;
    public AnimatorSet f41228r;
    public boolean f41229s;
    public boolean v;
    public boolean f41230w;
    public int f41231x;

    public rq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, sn snVar) {
        super(null);
        this.e = true;
        this.f41226f = new Paint();
        this.f41227n = new pq0[2];
        this.f41223a = new mq0(0, null, hashMap, arrayList, i10, z10, snVar, false);
        this.f41224b = new mq0(1, null, hashMap, arrayList, i10, z10, snVar, false);
    }

    public static void g0(rq0 rq0Var, float f7) {
        rq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            pq0[] pq0VarArr = rq0Var.f41227n;
            if (i10 < pq0VarArr.length) {
                pq0VarArr[i10].d.setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                rq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(rq0 rq0Var, String str) {
        rq0Var.f41225c.getSearchField().setText(str);
        rq0Var.f41225c.getSearchField().setSelection(str.length());
        rq0Var.actionBar.w();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        mq0 mq0Var = this.f41223a;
        if (mq0Var != null) {
            mq0Var.addThemeColorKeys(hashSet);
        }
        mq0 mq0Var2 = this.f41224b;
        if (mq0Var2 != null) {
            mq0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        pq0[] pq0VarArr;
        View view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i10, null);
        boolean z10 = true;
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f7 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 19));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 14);
        this.f41225c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f41225c.getSearchField();
        org.telegram.ui.ActionBar.r6.W(searchField, i10, null);
        org.telegram.ui.ActionBar.r6.x(searchField, i10, null);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Vd, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.k6.Y9;
        int i12 = org.telegram.ui.ActionBar.k6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, w7.z5.e(-1, 44, 83));
        this.h.setDelegate(new nq0(this));
        this.f41231x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        oq0 oq0Var = new oq0(this, context);
        this.fragmentView = oq0Var;
        oq0Var.setWillNotDraw(false);
        mq0 mq0Var = this.f41223a;
        mq0Var.setParentFragment(this);
        org.telegram.ui.Components.qu quVar = mq0Var.f39649d0;
        this.d = quVar;
        quVar.setSizeNotifierLayout(oq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = mq0Var.f39648c0;
                    } else {
                        view = mq0Var.f39646b0;
                    }
                } else {
                    view = mq0Var.f39644a0;
                }
            } else {
                view = mq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = mq0Var.Z;
        l0 l0Var = mq0Var.f39644a0;
        e50 e50Var = mq0Var.f39646b0;
        View view2 = mq0Var.f39648c0;
        org.telegram.ui.Components.qu quVar2 = mq0Var.f39649d0;
        mq0 mq0Var2 = this.f41224b;
        mq0Var2.Z = frameLayout;
        mq0Var2.f39644a0 = l0Var;
        mq0Var2.f39649d0 = quVar2;
        mq0Var2.f39646b0 = e50Var;
        mq0Var2.f39648c0 = view2;
        mq0Var2.f39663q0 = false;
        mq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            pq0VarArr = this.f41227n;
            if (i14 >= pq0VarArr.length) {
                break;
            }
            pq0 pq0Var = new pq0(this, context);
            pq0VarArr[i14] = pq0Var;
            float f10 = f7;
            oq0Var.addView(pq0Var, w7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                pq0 pq0Var2 = pq0VarArr[i14];
                pq0Var2.f40523a = mq0Var;
                pq0Var2.d = mq0Var.K;
            } else if (i14 == 1) {
                pq0 pq0Var3 = pq0VarArr[i14];
                pq0Var3.f40523a = mq0Var2;
                pq0Var3.d = mq0Var2.K;
                pq0Var3.setVisibility(8);
            }
            pq0VarArr[i14].d.setScrollingTouchSlop(1);
            pq0 pq0Var4 = pq0VarArr[i14];
            pq0Var4.f40524b = (FrameLayout) pq0Var4.f40523a.getFragmentView();
            pq0VarArr[i14].d.setClipToPadding(false);
            pq0 pq0Var5 = pq0VarArr[i14];
            pq0Var5.f40525c = pq0Var5.f40523a.getActionBar();
            pq0 pq0Var6 = pq0VarArr[i14];
            pq0Var6.addView(pq0Var6.f40524b, w7.z5.c(-1.0f, -1));
            pq0 pq0Var7 = pq0VarArr[i14];
            pq0Var7.addView(pq0Var7.f40525c, w7.z5.c(-2.0f, -1));
            pq0VarArr[i14].f40525c.setVisibility(8);
            pq0VarArr[i14].d.setOnScrollListener(new ki.m3(7, this, pq0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        oq0Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        oq0Var.addView(mq0Var.Z, w7.z5.e(-1, 48, 83));
        oq0Var.addView(mq0Var.f39644a0, w7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        oq0Var.addView(mq0Var.f39646b0, w7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                pq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21254h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41225c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21289j5));
        int i10 = org.telegram.ui.ActionBar.k6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.addAll(this.f41223a.getThemeDescriptions());
        arrayList.addAll(this.f41224b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z10) {
        pq0[] pq0VarArr;
        int i10 = 0;
        while (true) {
            pq0VarArr = this.f41227n;
            if (i10 >= pq0VarArr.length) {
                break;
            }
            pq0VarArr[i10].d.B0();
            i10++;
        }
        pq0VarArr[z10 ? 1 : 0].d.getAdapter();
        pq0VarArr[z10 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.b0) pq0VarArr[z10 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mq0 mq0Var = this.f41223a;
        if (mq0Var != null) {
            mq0Var.onConfigurationChanged(configuration);
        }
        mq0 mq0Var2 = this.f41224b;
        if (mq0Var2 != null) {
            mq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        mq0 mq0Var = this.f41223a;
        if (mq0Var != null) {
            mq0Var.onFragmentDestroy();
        }
        mq0 mq0Var2 = this.f41224b;
        if (mq0Var2 != null) {
            mq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        mq0 mq0Var = this.f41223a;
        if (mq0Var != null) {
            mq0Var.onPause();
        }
        mq0 mq0Var2 = this.f41224b;
        if (mq0Var2 != null) {
            mq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f41225c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        mq0 mq0Var = this.f41223a;
        if (mq0Var != null) {
            mq0Var.onResume();
        }
        mq0 mq0Var2 = this.f41224b;
        if (mq0Var2 != null) {
            mq0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.u0 u0Var = this.f41225c;
            boolean z10 = false;
            if (u0Var != null && u0Var.getSearchField() != null) {
                this.f41225c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21289j5, false));
            }
            if (this.fragmentView != null) {
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21254h5, false)) >= 0.721f) {
                    z10 = true;
                }
                int systemUiVisibility = this.fragmentView.getSystemUiVisibility();
                if (z10) {
                    i10 = systemUiVisibility | 8192;
                } else {
                    i10 = systemUiVisibility & (-8193);
                }
                if (i10 != systemUiVisibility) {
                    this.fragmentView.setSystemUiVisibility(i10);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            mq0 mq0Var = this.f41223a;
            if (mq0Var != null && mq0Var.fragmentView != null) {
                mq0Var.onThemeColorsChanged();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            mq0 mq0Var2 = this.f41224b;
            if (mq0Var2 != null && mq0Var2.fragmentView != null) {
                mq0Var2.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
