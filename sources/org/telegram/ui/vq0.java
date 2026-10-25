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
public final class vq0 extends org.telegram.ui.ActionBar.r2 {
    public static final org.telegram.ui.Components.qs0 f44881y = new org.telegram.ui.Components.qs0(4);
    public final rq0 f44882a;
    public final rq0 f44883b;
    public org.telegram.ui.ActionBar.w0 f44884c;
    public org.telegram.ui.Components.ru d;
    public boolean e;
    public final Paint f44885f;
    public ScrollSlidingTextTabStrip h;
    public final org.telegram.ui.ActionBar.q5[] f44886n;
    public AnimatorSet f44887r;
    public boolean f44888s;
    public boolean v;
    public boolean f44889w;
    public int f44890x;

    public vq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z10, un unVar) {
        super(null);
        this.e = true;
        this.f44885f = new Paint();
        this.f44886n = new org.telegram.ui.ActionBar.q5[2];
        this.f44882a = new rq0(0, null, hashMap, arrayList, i10, z10, unVar, false);
        this.f44883b = new rq0(1, null, hashMap, arrayList, i10, z10, unVar, false);
    }

    public static void h0(vq0 vq0Var, float f7) {
        vq0Var.actionBar.setTranslationY(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.q5[] q5VarArr = vq0Var.f44886n;
            if (i10 < q5VarArr.length) {
                ((org.telegram.ui.Components.mm0) q5VarArr[i10].f22989f).setPinnedSectionOffsetY((int) f7);
                i10++;
            } else {
                vq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void i0(vq0 vq0Var, String str) {
        vq0Var.f44884c.getSearchField().setText(str);
        vq0Var.f44884c.getSearchField().setSelection(str.length());
        vq0Var.actionBar.u();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        rq0 rq0Var = this.f44882a;
        if (rq0Var != null) {
            rq0Var.addThemeColorKeys(hashSet);
        }
        rq0 rq0Var2 = this.f44883b;
        if (rq0Var2 != null) {
            rq0Var2.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.q5[] q5VarArr;
        View view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, this.actionBar, null);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.m(kVar, 5, i10, null);
        boolean z10 = true;
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f7 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new a20(this, 22));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 16);
        this.f44884c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f44884c.getSearchField();
        org.telegram.ui.ActionBar.f7.V(searchField, i10, null);
        org.telegram.ui.ActionBar.f7.w(searchField, i10, null);
        org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Vd, null);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.y6.Y9;
        int i12 = org.telegram.ui.ActionBar.y6.Z9;
        scrollSlidingTextTabStrip2.L = i11;
        scrollSlidingTextTabStrip2.M = i12;
        scrollSlidingTextTabStrip2.updateColors();
        this.actionBar.addView(this.h, org.telegram.ui.Components.gb1.i(-1, 44, 83));
        this.h.setDelegate(new sq0(this));
        this.f44890x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        tq0 tq0Var = new tq0(this, context);
        this.fragmentView = tq0Var;
        tq0Var.setWillNotDraw(false);
        rq0 rq0Var = this.f44882a;
        rq0Var.setParentFragment(this);
        org.telegram.ui.Components.ru ruVar = rq0Var.f43245d0;
        this.d = ruVar;
        ruVar.setSizeNotifierLayout(tq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = rq0Var.f43244c0;
                    } else {
                        view = rq0Var.f43242b0;
                    }
                } else {
                    view = rq0Var.f43240a0;
                }
            } else {
                view = rq0Var.Z;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = rq0Var.Z;
        k0 k0Var = rq0Var.f43240a0;
        z10 z10Var = rq0Var.f43242b0;
        View view2 = rq0Var.f43244c0;
        org.telegram.ui.Components.ru ruVar2 = rq0Var.f43245d0;
        rq0 rq0Var2 = this.f44883b;
        rq0Var2.Z = frameLayout;
        rq0Var2.f43240a0 = k0Var;
        rq0Var2.f43245d0 = ruVar2;
        rq0Var2.f43242b0 = z10Var;
        rq0Var2.f43244c0 = view2;
        rq0Var2.f43259q0 = false;
        rq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            q5VarArr = this.f44886n;
            if (i14 >= q5VarArr.length) {
                break;
            }
            org.telegram.ui.ActionBar.q5 q5Var = new org.telegram.ui.ActionBar.q5(this, context);
            q5VarArr[i14] = q5Var;
            float f10 = f7;
            tq0Var.addView(q5Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            if (i14 == 0) {
                org.telegram.ui.ActionBar.q5 q5Var2 = q5VarArr[i14];
                q5Var2.f22988c = rq0Var;
                q5Var2.f22989f = rq0Var.K;
            } else if (i14 == 1) {
                org.telegram.ui.ActionBar.q5 q5Var3 = q5VarArr[i14];
                q5Var3.f22988c = rq0Var2;
                q5Var3.f22989f = rq0Var2.K;
                q5Var3.setVisibility(8);
            }
            ((org.telegram.ui.Components.mm0) q5VarArr[i14].f22989f).setScrollingTouchSlop(1);
            org.telegram.ui.ActionBar.q5 q5Var4 = q5VarArr[i14];
            q5Var4.d = (FrameLayout) ((org.telegram.ui.ActionBar.r2) q5Var4.f22988c).getFragmentView();
            ((org.telegram.ui.Components.mm0) q5VarArr[i14].f22989f).setClipToPadding(false);
            org.telegram.ui.ActionBar.q5 q5Var5 = q5VarArr[i14];
            q5Var5.e = ((org.telegram.ui.ActionBar.r2) q5Var5.f22988c).getActionBar();
            org.telegram.ui.ActionBar.q5 q5Var6 = q5VarArr[i14];
            q5Var6.addView((FrameLayout) q5Var6.d, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            org.telegram.ui.ActionBar.q5 q5Var7 = q5VarArr[i14];
            q5Var7.addView((org.telegram.ui.ActionBar.k) q5Var7.e, org.telegram.ui.Components.gb1.g(-2.0f, -1));
            ((org.telegram.ui.ActionBar.k) q5VarArr[i14].e).setVisibility(8);
            ((org.telegram.ui.Components.mm0) q5VarArr[i14].f22989f).setOnScrollListener(new ai.u0(8, this, ((org.telegram.ui.Components.mm0) q5VarArr[i14].f22989f).getOnScrollListener()));
            i14++;
            f7 = f10;
        }
        float f11 = f7;
        tq0Var.addView(this.actionBar, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        tq0Var.addView(rq0Var.Z, org.telegram.ui.Components.gb1.i(-1, 48, 83));
        tq0Var.addView(rq0Var.f43240a0, org.telegram.ui.Components.gb1.h(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        tq0Var.addView(rq0Var.f43242b0, org.telegram.ui.Components.gb1.h(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                q5VarArr[0].f22987b = currentTabId;
            }
            this.h.c();
        }
        k0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z10 = false;
        }
        this.e = z10;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false)) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23425h5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44884c.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23462j5));
        int i10 = org.telegram.ui.ActionBar.y6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.h.getSelectorDrawable()}, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.addAll(this.f44882a.getThemeDescriptions());
        arrayList.addAll(this.f44883b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void k0(boolean z10) {
        org.telegram.ui.ActionBar.q5[] q5VarArr;
        int i10 = 0;
        while (true) {
            q5VarArr = this.f44886n;
            if (i10 >= q5VarArr.length) {
                break;
            }
            ((org.telegram.ui.Components.mm0) q5VarArr[i10].f22989f).C0();
            i10++;
        }
        ((org.telegram.ui.Components.mm0) q5VarArr[z10 ? 1 : 0].f22989f).getAdapter();
        ((org.telegram.ui.Components.mm0) q5VarArr[z10 ? 1 : 0].f22989f).setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((s4.c0) ((org.telegram.ui.Components.mm0) q5VarArr[z10 ? 1 : 0].f22989f).getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        rq0 rq0Var = this.f44882a;
        if (rq0Var != null) {
            rq0Var.onConfigurationChanged(configuration);
        }
        rq0 rq0Var2 = this.f44883b;
        if (rq0Var2 != null) {
            rq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        rq0 rq0Var = this.f44882a;
        if (rq0Var != null) {
            rq0Var.onFragmentDestroy();
        }
        rq0 rq0Var2 = this.f44883b;
        if (rq0Var2 != null) {
            rq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        rq0 rq0Var = this.f44882a;
        if (rq0Var != null) {
            rq0Var.onPause();
        }
        rq0 rq0Var2 = this.f44883b;
        if (rq0Var2 != null) {
            rq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.w0 w0Var = this.f44884c;
        if (w0Var != null) {
            w0Var.F(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        rq0 rq0Var = this.f44882a;
        if (rq0Var != null) {
            rq0Var.onResume();
        }
        rq0 rq0Var2 = this.f44883b;
        if (rq0Var2 != null) {
            rq0Var2.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.w0 w0Var = this.f44884c;
            boolean z10 = false;
            if (w0Var != null && w0Var.getSearchField() != null) {
                this.f44884c.getSearchField().setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false));
            }
            if (this.fragmentView != null) {
                if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false)) >= 0.721f) {
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
            rq0 rq0Var = this.f44882a;
            if (rq0Var != null && rq0Var.fragmentView != null) {
                rq0Var.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            rq0 rq0Var2 = this.f44883b;
            if (rq0Var2 != null && rq0Var2.fragmentView != null) {
                rq0Var2.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }
}
