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
public final class rq0 extends org.telegram.ui.ActionBar.p2 {
    public static final org.telegram.ui.Components.kr0 f37945y = new org.telegram.ui.Components.kr0(4);
    public final mq0 f37946a;
    public final mq0 f37947b;
    public org.telegram.ui.ActionBar.w0 f37948c;
    public org.telegram.ui.Components.cu d;
    public boolean e;
    public final Paint f37949f;
    public ScrollSlidingTextTabStrip h;
    public final pq0[] f37950n;
    public AnimatorSet f37951r;
    public boolean f37952s;
    public boolean v;
    public boolean f37953w;
    public int f37954x;

    public rq0(HashMap hashMap, ArrayList arrayList, int i10, boolean z4, zn znVar) {
        super(null);
        this.e = true;
        this.f37949f = new Paint();
        this.f37950n = new pq0[2];
        this.f37946a = new mq0(0, null, hashMap, arrayList, i10, z4, znVar, false);
        this.f37947b = new mq0(1, null, hashMap, arrayList, i10, z4, znVar, false);
    }

    public static org.telegram.ui.ActionBar.k c0(rq0 rq0Var) {
        return rq0Var.actionBar;
    }

    public static void g0(rq0 rq0Var, float f10) {
        rq0Var.actionBar.setTranslationY(f10);
        int i10 = 0;
        while (true) {
            pq0[] pq0VarArr = rq0Var.f37950n;
            if (i10 < pq0VarArr.length) {
                pq0VarArr[i10].d.setPinnedSectionOffsetY((int) f10);
                i10++;
            } else {
                rq0Var.fragmentView.invalidate();
                return;
            }
        }
    }

    public static void h0(rq0 rq0Var, String str) {
        rq0Var.f37948c.getSearchField().setText(str);
        rq0Var.f37948c.getSearchField().setSelection(str.length());
        rq0Var.actionBar.w();
    }

    @Override
    public final View createView(Context context) {
        pq0[] pq0VarArr;
        View view;
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19987j5;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        boolean z4 = true;
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 3));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new hb(this, 13);
        this.f37948c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.f37948c.getSearchField();
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vd, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.h = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.Y9;
        int i12 = org.telegram.ui.ActionBar.j6.Z9;
        scrollSlidingTextTabStrip2.I = i11;
        scrollSlidingTextTabStrip2.J = i12;
        scrollSlidingTextTabStrip2.e();
        this.actionBar.addView(this.h, k7.b6.e(-1, 44, 83));
        this.h.setDelegate(new nq0(this));
        this.f37954x = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        oq0 oq0Var = new oq0(this, context);
        this.fragmentView = oq0Var;
        oq0Var.setWillNotDraw(false);
        mq0 mq0Var = this.f37946a;
        mq0Var.setParentFragment(this);
        org.telegram.ui.Components.cu cuVar = mq0Var.f36162a0;
        this.d = cuVar;
        cuVar.setSizeNotifierLayout(oq0Var);
        for (int i13 = 0; i13 < 4; i13++) {
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        view = mq0Var.Z;
                    } else {
                        view = mq0Var.Y;
                    }
                } else {
                    view = mq0Var.X;
                }
            } else {
                view = mq0Var.W;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout frameLayout = mq0Var.W;
        n0 n0Var = mq0Var.X;
        eg.h0 h0Var = mq0Var.Y;
        View view2 = mq0Var.Z;
        org.telegram.ui.Components.cu cuVar2 = mq0Var.f36162a0;
        mq0 mq0Var2 = this.f37947b;
        mq0Var2.W = frameLayout;
        mq0Var2.X = n0Var;
        mq0Var2.f36162a0 = cuVar2;
        mq0Var2.Y = h0Var;
        mq0Var2.Z = view2;
        mq0Var2.f36178n0 = false;
        mq0Var2.setParentFragment(this);
        int i14 = 0;
        while (true) {
            pq0VarArr = this.f37950n;
            if (i14 >= pq0VarArr.length) {
                break;
            }
            pq0 pq0Var = new pq0(this, context);
            pq0VarArr[i14] = pq0Var;
            oq0Var.addView(pq0Var, k7.b6.c(-1.0f, -1));
            if (i14 == 0) {
                pq0 pq0Var2 = pq0VarArr[i14];
                pq0Var2.f37211a = mq0Var;
                pq0Var2.d = mq0Var.H;
            } else if (i14 == 1) {
                pq0 pq0Var3 = pq0VarArr[i14];
                pq0Var3.f37211a = mq0Var2;
                pq0Var3.d = mq0Var2.H;
                pq0Var3.setVisibility(8);
            }
            pq0VarArr[i14].d.setScrollingTouchSlop(1);
            pq0 pq0Var4 = pq0VarArr[i14];
            pq0Var4.f37212b = (FrameLayout) pq0Var4.f37211a.getFragmentView();
            pq0VarArr[i14].d.setClipToPadding(false);
            pq0 pq0Var5 = pq0VarArr[i14];
            pq0Var5.f37213c = pq0Var5.f37211a.getActionBar();
            pq0 pq0Var6 = pq0VarArr[i14];
            pq0Var6.addView(pq0Var6.f37212b, k7.b6.c(-1.0f, -1));
            pq0 pq0Var7 = pq0VarArr[i14];
            pq0Var7.addView(pq0Var7.f37213c, k7.b6.c(-2.0f, -1));
            pq0VarArr[i14].f37213c.setVisibility(8);
            pq0VarArr[i14].d.setOnScrollListener(new jh.l(8, this, pq0VarArr[i14].d.getOnScrollListener()));
            i14++;
        }
        oq0Var.addView(this.actionBar, k7.b6.c(-2.0f, -1));
        oq0Var.addView(mq0Var.W, k7.b6.e(-1, 48, 83));
        oq0Var.addView(mq0Var.X, k7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        oq0Var.addView(mq0Var.Y, k7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.h;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.a(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.h.a(1, LocaleController.getString(R.string.GifsTab2), null);
            this.h.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.h.getCurrentTabId();
            if (currentTabId >= 0) {
                pq0VarArr[0].e = currentTabId;
            }
            this.h.c();
        }
        j0(false);
        if (this.h.getCurrentTabId() != this.h.getFirstTabId()) {
            z4 = false;
        }
        this.e = z4;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19952h5, false);
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
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar2, 256, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.Vd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37948c.getSearchField(), 16777216, null, null, null, null, i11));
        int i13 = org.telegram.ui.ActionBar.j6.Y9;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.j6.Z9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, new Drawable[]{this.h.getSelectorDrawable()}, null, i13));
        arrayList.addAll(this.f37946a.getThemeDescriptions());
        arrayList.addAll(this.f37947b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.e;
    }

    public final void j0(boolean z4) {
        pq0[] pq0VarArr;
        int i10 = 0;
        while (true) {
            pq0VarArr = this.f37950n;
            if (i10 >= pq0VarArr.length) {
                break;
            }
            pq0VarArr[i10].d.B0();
            i10++;
        }
        pq0VarArr[z4 ? 1 : 0].d.getAdapter();
        pq0VarArr[z4 ? 1 : 0].d.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((f2.i0) pq0VarArr[z4 ? 1 : 0].d.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mq0 mq0Var = this.f37946a;
        if (mq0Var != null) {
            mq0Var.onConfigurationChanged(configuration);
        }
        mq0 mq0Var2 = this.f37947b;
        if (mq0Var2 != null) {
            mq0Var2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        mq0 mq0Var = this.f37946a;
        if (mq0Var != null) {
            mq0Var.onFragmentDestroy();
        }
        mq0 mq0Var2 = this.f37947b;
        if (mq0Var2 != null) {
            mq0Var2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        mq0 mq0Var = this.f37946a;
        if (mq0Var != null) {
            mq0Var.onPause();
        }
        mq0 mq0Var2 = this.f37947b;
        if (mq0Var2 != null) {
            mq0Var2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.w0 w0Var = this.f37948c;
        if (w0Var != null) {
            w0Var.z(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        mq0 mq0Var = this.f37946a;
        if (mq0Var != null) {
            mq0Var.onResume();
        }
        mq0 mq0Var2 = this.f37947b;
        if (mq0Var2 != null) {
            mq0Var2.onResume();
        }
    }
}
