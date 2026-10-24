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
public final class qq0 extends org.telegram.ui.ActionBar.o2 {
    public static final org.telegram.ui.Components.is0 f40919y = new org.telegram.ui.Components.is0(4);
    public final lq0 f40920a;
    public final lq0 f40921b;
    public org.telegram.ui.ActionBar.u0 f40922c;
    public org.telegram.ui.Components.ou d;
    public boolean e;
    public final Paint f40923f;
    public ScrollSlidingTextTabStrip h;
    public final oq0[] f40924n;
    public AnimatorSet f40925r;
    public boolean f40926s;
    public boolean v;
    public boolean f40927w;
    public int f40928x;

    public qq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, sn snVar) {
        super(null);
        this.e = true;
        this.f40923f = new Paint();
        this.f40924n = new oq0[2];
        this.f40920a = new lq0(0, null, hashMap, arrayList, i10, z10, snVar, false);
        this.f40921b = new lq0(1, null, hashMap, arrayList, i10, z10, snVar, false);
    }

    public static void g0(qq0 qq0Var, float f7) {
        qq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            oq0[] oq0VarArr = qq0Var.f40924n;
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
        qq0Var.f40922c.getSearchField().setText(str);
        qq0Var.f40922c.getSearchField().setSelection(str.length());
        qq0Var.actionBar.w();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        lq0 lq0Var = this.f40920a;
        if (lq0Var != null) {
            lq0Var.addThemeColorKeys(hashSet);
        }
        lq0 lq0Var2 = this.f40921b;
        if (lq0Var2 != null) {
            lq0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        oq0[] oq0VarArr;
        View view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
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
        this.f40922c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f40922c.getSearchField();
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
        this.h.setDelegate(new mq0(this));
        this.f40928x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        nq0 nq0Var = new nq0(this, context);
        this.fragmentView = nq0Var;
        nq0Var.setWillNotDraw(false);
        lq0 lq0Var = this.f40920a;
        lq0Var.setParentFragment(this);
        org.telegram.ui.Components.ou ouVar = lq0Var.f39339d0;
        this.d = ouVar;
        ouVar.setSizeNotifierLayout(nq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = lq0Var.f39338c0;
                    } else {
                        view = lq0Var.f39336b0;
                    }
                } else {
                    view = lq0Var.f39334a0;
                }
            } else {
                view = lq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = lq0Var.Z;
        l0 l0Var = lq0Var.f39334a0;
        e50 e50Var = lq0Var.f39336b0;
        View view2 = lq0Var.f39338c0;
        org.telegram.ui.Components.ou ouVar2 = lq0Var.f39339d0;
        lq0 lq0Var2 = this.f40921b;
        lq0Var2.Z = frameLayout;
        lq0Var2.f39334a0 = l0Var;
        lq0Var2.f39339d0 = ouVar2;
        lq0Var2.f39336b0 = e50Var;
        lq0Var2.f39338c0 = view2;
        lq0Var2.f39353q0 = false;
        lq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            oq0VarArr = this.f40924n;
            if (i14 >= oq0VarArr.length) {
                break;
            }
            oq0 oq0Var = new oq0(this, context);
            oq0VarArr[i14] = oq0Var;
            float f10 = f7;
            nq0Var.addView(oq0Var, w7.z5.c(-1.0f, -1));
            if (i14 == 0) {
                oq0 oq0Var2 = oq0VarArr[i14];
                oq0Var2.f40234a = lq0Var;
                oq0Var2.d = lq0Var.K;
            } else if (i14 == 1) {
                oq0 oq0Var3 = oq0VarArr[i14];
                oq0Var3.f40234a = lq0Var2;
                oq0Var3.d = lq0Var2.K;
                oq0Var3.setVisibility(8);
            }
            oq0VarArr[i14].d.setScrollingTouchSlop(1);
            oq0 oq0Var4 = oq0VarArr[i14];
            oq0Var4.f40235b = (FrameLayout) oq0Var4.f40234a.getFragmentView();
            oq0VarArr[i14].d.setClipToPadding(false);
            oq0 oq0Var5 = oq0VarArr[i14];
            oq0Var5.f40236c = oq0Var5.f40234a.getActionBar();
            oq0 oq0Var6 = oq0VarArr[i14];
            oq0Var6.addView(oq0Var6.f40235b, w7.z5.c(-1.0f, -1));
            oq0 oq0Var7 = oq0VarArr[i14];
            oq0Var7.addView(oq0Var7.f40236c, w7.z5.c(-2.0f, -1));
            oq0VarArr[i14].f40236c.setVisibility(8);
            oq0VarArr[i14].d.setOnScrollListener(new ki.m3(7, this, oq0VarArr[i14].d.getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        nq0Var.addView(this.actionBar, w7.z5.c(-2.0f, -1));
        nq0Var.addView(lq0Var.Z, w7.z5.e(-1, 48, 83));
        nq0Var.addView(lq0Var.f39334a0, w7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        nq0Var.addView(lq0Var.f39336b0, w7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
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
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40922c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21290j5));
        int i10 = org.telegram.ui.ActionBar.k6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.addAll(this.f40920a.getThemeDescriptions());
        arrayList.addAll(this.f40921b.getThemeDescriptions());
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
            oq0VarArr = this.f40924n;
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
        lq0 lq0Var = this.f40920a;
        if (lq0Var != null) {
            lq0Var.onConfigurationChanged(configuration);
        }
        lq0 lq0Var2 = this.f40921b;
        if (lq0Var2 != null) {
            lq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        lq0 lq0Var = this.f40920a;
        if (lq0Var != null) {
            lq0Var.onFragmentDestroy();
        }
        lq0 lq0Var2 = this.f40921b;
        if (lq0Var2 != null) {
            lq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lq0 lq0Var = this.f40920a;
        if (lq0Var != null) {
            lq0Var.onPause();
        }
        lq0 lq0Var2 = this.f40921b;
        if (lq0Var2 != null) {
            lq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.u0 u0Var = this.f40922c;
        if (u0Var != null) {
            u0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        lq0 lq0Var = this.f40920a;
        if (lq0Var != null) {
            lq0Var.onResume();
        }
        lq0 lq0Var2 = this.f40921b;
        if (lq0Var2 != null) {
            lq0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.u0 u0Var = this.f40922c;
            boolean z10 = false;
            if (u0Var != null && u0Var.getSearchField() != null) {
                this.f40922c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false));
            }
            if (this.fragmentView != null) {
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21255h5, false)) >= 0.721f) {
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
            lq0 lq0Var = this.f40920a;
            if (lq0Var != null && lq0Var.fragmentView != null) {
                lq0Var.onThemeColorsChanged();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            lq0 lq0Var2 = this.f40921b;
            if (lq0Var2 != null && lq0Var2.fragmentView != null) {
                lq0Var2.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
