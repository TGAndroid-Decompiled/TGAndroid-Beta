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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class sv extends org.telegram.ui.ActionBar.m2 {
    public static final org.telegram.ui.Components.js0 f39948x = new org.telegram.ui.Components.js0(2);
    public yy f39949a;
    public ContactsActivity f39950b;
    public org.telegram.ui.ActionBar.u0 f39951c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public rv[] f39952f;
    public AnimatorSet h;
    public boolean f39953n;
    public boolean f39954r;
    public boolean f39955s;
    public int v;
    public boolean f39956w;

    public static void U(sv svVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(svVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(svVar.currentAccount).blockPeer(user.f19063id);
            org.telegram.ui.Components.g5.v0(svVar, LocaleController.getString(R.string.UserBlocked));
        }
        svVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k h0(sv svVar) {
        return svVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k i0(sv svVar) {
        return svVar.actionBar;
    }

    public static void j0(sv svVar, float f7) {
        rv[] rvVarArr = svVar.f39952f;
        svVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < rvVarArr.length; i10++) {
            int i11 = (int) f7;
            rvVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.o0 o0Var = rvVarArr[i10].e;
            if (o0Var != null) {
                o0Var.setPinnedSectionOffsetY(i11);
            }
        }
        svVar.fragmentView.invalidate();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.mm0 mm0Var;
        bi.o0 o0Var;
        ContactsActivity contactsActivity = this.f39950b;
        yy yyVar = this.f39949a;
        rv[] rvVarArr = this.f39952f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        boolean z10 = false;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 22));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 9);
        this.f39951c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, w7.z5.e(-1, 44, 83));
        this.e.setDelegate(new g(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        qv qvVar = new qv(this, context);
        this.fragmentView = qvVar;
        qvVar.setWillNotDraw(false);
        yyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < rvVarArr.length) {
            rv rvVar = new rv(this, context);
            rvVarArr[i10] = rvVar;
            qvVar.addView(rvVar, w7.z5.d(-1.0f, -1));
            if (i10 == 0) {
                rv rvVar2 = rvVarArr[i10];
                rvVar2.f39591a = yyVar;
                f7 = f10;
                rvVar2.d = yyVar.f42004e0[0].f41679a;
                yyVar.K3();
                iy iyVar = yyVar.C0;
                if (iyVar != null) {
                    o0Var = iyVar.V;
                } else {
                    o0Var = null;
                }
                rvVar2.e = o0Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    rv rvVar3 = rvVarArr[i10];
                    rvVar3.f39591a = contactsActivity;
                    rvVar3.d = contactsActivity.f31733f;
                    rvVar3.setVisibility(8);
                }
            }
            rvVarArr[i10].d.setScrollingTouchSlop(1);
            rv rvVar4 = rvVarArr[i10];
            rvVar4.f39592b = (FrameLayout) rvVar4.f39591a.getFragmentView();
            rv rvVar5 = rvVarArr[i10];
            rvVar5.f39593c = rvVar5.f39591a.getActionBar();
            rv rvVar6 = rvVarArr[i10];
            rvVar6.addView(rvVar6.f39592b, w7.z5.d(-1.0f, -1));
            AndroidUtilities.removeFromParent(rvVarArr[i10].f39593c);
            rv rvVar7 = rvVarArr[i10];
            rvVar7.addView(rvVar7.f39593c, w7.z5.d(-2.0f, -1));
            rvVarArr[i10].f39593c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    mm0Var = rvVarArr[i10].d;
                } else {
                    mm0Var = rvVarArr[i10].e;
                }
                if (mm0Var != null) {
                    mm0Var.setClipToPadding(false);
                    mm0Var.setOnScrollListener(new ji.n3(5, this, mm0Var.getOnScrollListener()));
                }
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        qvVar.addView(this.actionBar, w7.z5.d(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                rvVarArr[0].f39594f = currentTabId;
            }
            this.e.c();
        }
        m0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f39956w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, org.telegram.ui.ActionBar.g6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{this.e.getSelectorDrawable()}, null, org.telegram.ui.ActionBar.g6.L8));
        arrayList.addAll(this.f39949a.getThemeDescriptions());
        arrayList.addAll(this.f39950b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f39956w;
    }

    public final void l0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.u2(28, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
            }
        }
    }

    public final void m0(boolean z10) {
        org.telegram.ui.Components.mm0 mm0Var;
        rv[] rvVarArr = this.f39952f;
        for (int i10 = 0; i10 < rvVarArr.length; i10++) {
            rvVarArr[i10].d.B0();
            bi.o0 o0Var = rvVarArr[i10].e;
            if (o0Var != null) {
                o0Var.B0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                mm0Var = rvVarArr[z10 ? 1 : 0].d;
            } else {
                mm0Var = rvVarArr[z10 ? 1 : 0].e;
            }
            if (mm0Var != null) {
                mm0Var.getAdapter();
                mm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.b0) mm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        yy yyVar = this.f39949a;
        if (yyVar != null) {
            yyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f39950b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        yy yyVar = this.f39949a;
        if (yyVar != null) {
            yyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f39950b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yy yyVar = this.f39949a;
        if (yyVar != null) {
            yyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f39950b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }
}
