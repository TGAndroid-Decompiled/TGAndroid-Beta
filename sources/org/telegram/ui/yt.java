package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class yt extends org.telegram.ui.ActionBar.d2 {
    public static final org.telegram.ui.Components.qp0 f52398y = new org.telegram.ui.Components.qp0(2);
    public uw f52399a;
    public ContactsActivity f52400b;
    public org.telegram.ui.ActionBar.q0 f52401c;
    public Paint d;
    public ScrollSlidingTextTabStrip f52402e;
    public xt[] f52403f;
    public AnimatorSet h;
    public boolean f52404n;
    public boolean f52405r;
    public boolean f52406s;
    public int f52407w;
    public boolean f52408x;

    public static void Z(yt ytVar, TLRPC.User user) {
        if (org.telegram.messenger.hp.F2(user)) {
            org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131751106, null), ytVar);
        } else {
            org.telegram.messenger.hp.s1(ytVar.currentAccount).w(user.f27150id);
            org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131743771, null), ytVar);
        }
        ytVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k m0(yt ytVar) {
        return ytVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k n0(yt ytVar) {
        return ytVar.actionBar;
    }

    public static void o0(yt ytVar, float f10) {
        xt[] xtVarArr = ytVar.f52403f;
        ytVar.actionBar.setTranslationY(f10);
        for (int i3 = 0; i3 < xtVarArr.length; i3++) {
            int i10 = (int) f10;
            xtVarArr[i3].d.setPinnedSectionOffsetY(i10);
            ci.j1 j1Var = xtVarArr[i3].f52099e;
            if (j1Var != null) {
                j1Var.setPinnedSectionOffsetY(i10);
            }
        }
        ytVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        uw uwVar = this.f52399a;
        if (uwVar != null) {
            uwVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f52400b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.Components.tj0 tj0Var;
        ci.j1 j1Var;
        ContactsActivity contactsActivity = this.f52400b;
        uw uwVar = this.f52399a;
        xt[] xtVarArr = this.f52403f;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131753687, null));
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        boolean z10 = false;
        if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f11 = 44.0f;
        this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new o9(this, 27));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(0, 2131232486);
        a10.N();
        a10.I = new lg.w1(this, 10);
        this.f52401c = a10;
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.f52402e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.f52402e, b8.mf.e(-1, 44, 83));
        this.f52402e.setDelegate(new f(this, 13));
        this.f52407w = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        wt wtVar = new wt(this, context);
        this.fragmentView = wtVar;
        wtVar.setWillNotDraw(false);
        uwVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i3 = 0;
        while (i3 < xtVarArr.length) {
            xt xtVar = new xt(this, context);
            xtVarArr[i3] = xtVar;
            wtVar.addView(xtVar, b8.mf.c(-1.0f, -1));
            if (i3 == 0) {
                xt xtVar2 = xtVarArr[i3];
                xtVar2.f52096a = uwVar;
                f10 = f11;
                xtVar2.d = uwVar.f50230f0[0].f49897a;
                uwVar.Y3();
                cw cwVar = uwVar.D0;
                if (cwVar != null) {
                    j1Var = cwVar.f34748b0;
                } else {
                    j1Var = null;
                }
                xtVar2.f52099e = j1Var;
            } else {
                f10 = f11;
                if (i3 == 1) {
                    xt xtVar3 = xtVarArr[i3];
                    xtVar3.f52096a = contactsActivity;
                    xtVar3.d = contactsActivity.d;
                    xtVar3.setVisibility(8);
                }
            }
            xtVarArr[i3].d.setScrollingTouchSlop(1);
            xt xtVar4 = xtVarArr[i3];
            xtVar4.f52097b = (FrameLayout) xtVar4.f52096a.getFragmentView();
            xt xtVar5 = xtVarArr[i3];
            xtVar5.f52098c = xtVar5.f52096a.getActionBar();
            xt xtVar6 = xtVarArr[i3];
            xtVar6.addView(xtVar6.f52097b, b8.mf.c(-1.0f, -1));
            org.telegram.messenger.g0.E2(xtVarArr[i3].f52098c);
            xt xtVar7 = xtVarArr[i3];
            xtVar7.addView(xtVar7.f52098c, b8.mf.c(-2.0f, -1));
            xtVarArr[i3].f52098c.setVisibility(8);
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 == 0) {
                    tj0Var = xtVarArr[i3].d;
                } else {
                    tj0Var = xtVarArr[i3].f52099e;
                }
                if (tj0Var != null) {
                    tj0Var.setClipToPadding(false);
                    tj0Var.setOnScrollListener(new ai.i4(7, this, tj0Var.getOnScrollListener()));
                }
            }
            i3++;
            f11 = f10;
        }
        float f12 = f11;
        wtVar.addView(this.actionBar, b8.mf.c(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.f52402e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, org.telegram.messenger.bd.M0(2131753690, null), null);
            this.f52402e.a(1, org.telegram.messenger.bd.M0(2131753689, null), null);
            this.f52402e.setVisibility(0);
            this.actionBar.setExtraHeight(org.telegram.messenger.g0.L(f12));
            int currentTabId = this.f52402e.getCurrentTabId();
            if (currentTabId >= 0) {
                xtVarArr[0].f52100f = currentTabId;
            }
            this.f52402e.c();
        }
        r0(false);
        if (this.f52402e.getCurrentTabId() == this.f52402e.getFirstTabId()) {
            z10 = true;
        }
        this.f52408x = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52402e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52402e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52402e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.f52402e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L8));
        arrayList.addAll(this.f52399a.getThemeDescriptions());
        arrayList.addAll(this.f52400b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f52408x;
    }

    @Override
    public final void onFragmentDestroy() {
        uw uwVar = this.f52399a;
        if (uwVar != null) {
            uwVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f52400b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        uw uwVar = this.f52399a;
        if (uwVar != null) {
            uwVar.onPause();
        }
        ContactsActivity contactsActivity = this.f52400b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        uw uwVar = this.f52399a;
        if (uwVar != null) {
            uwVar.onResume();
        }
        ContactsActivity contactsActivity = this.f52400b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            uw uwVar = this.f52399a;
            if (uwVar != null && uwVar.fragmentView != null) {
                uwVar.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            ContactsActivity contactsActivity = this.f52400b;
            if (contactsActivity != null && contactsActivity.fragmentView != null) {
                contactsActivity.onThemeColorsChanged();
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void q0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131753692, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureBlockContact2", null, 2131754119, org.telegram.messenger.g5.m(0, user.first_name, user.last_name)));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753693, null), new org.telegram.ui.Components.i41(8, this, user));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
            }
        }
    }

    public final void r0(boolean z10) {
        org.telegram.ui.Components.tj0 tj0Var;
        xt[] xtVarArr = this.f52403f;
        for (int i3 = 0; i3 < xtVarArr.length; i3++) {
            xtVarArr[i3].d.C0();
            ci.j1 j1Var = xtVarArr[i3].f52099e;
            if (j1Var != null) {
                j1Var.C0();
            }
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                tj0Var = xtVarArr[z10 ? 1 : 0].d;
            } else {
                tj0Var = xtVarArr[z10 ? 1 : 0].f52099e;
            }
            if (tj0Var != null) {
                tj0Var.getAdapter();
                tj0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((u4.b0) tj0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }
}
