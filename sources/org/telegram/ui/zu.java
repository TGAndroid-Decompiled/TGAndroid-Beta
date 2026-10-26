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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class zu extends org.telegram.ui.ActionBar.r2 {
    public static final org.telegram.ui.Components.qs0 f46362x = new org.telegram.ui.Components.qs0(2);
    public cy f46363a;
    public ContactsActivity f46364b;
    public org.telegram.ui.ActionBar.w0 f46365c;
    public Paint d;
    public ScrollSlidingTextTabStrip e;
    public yu[] f46366f;
    public AnimatorSet h;
    public boolean f46367n;
    public boolean f46368r;
    public boolean f46369s;
    public int v;
    public boolean f46370w;

    public static void V(zu zuVar, TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            org.telegram.ui.Components.g5.v0(zuVar, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(zuVar.currentAccount).blockPeer(user.f22176id);
            org.telegram.ui.Components.g5.v0(zuVar, LocaleController.getString(R.string.UserBlocked));
        }
        zuVar.finishFragment();
    }

    public static org.telegram.ui.ActionBar.k i0(zu zuVar) {
        return zuVar.actionBar;
    }

    public static org.telegram.ui.ActionBar.k j0(zu zuVar) {
        return zuVar.actionBar;
    }

    public static void k0(zu zuVar, float f7) {
        yu[] yuVarArr = zuVar.f46366f;
        zuVar.actionBar.setTranslationY(f7);
        for (int i10 = 0; i10 < yuVarArr.length; i10++) {
            int i11 = (int) f7;
            yuVarArr[i10].d.setPinnedSectionOffsetY(i11);
            bi.r1 r1Var = yuVarArr[i10].e;
            if (r1Var != null) {
                r1Var.setPinnedSectionOffsetY(i11);
            }
        }
        zuVar.fragmentView.invalidate();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
        cy cyVar = this.f46363a;
        if (cyVar != null) {
            cyVar.addThemeColorKeys(hashSet);
        }
        ContactsActivity contactsActivity = this.f46364b;
        if (contactsActivity != null) {
            contactsActivity.addThemeColorKeys(hashSet);
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.Components.mm0 mm0Var;
        bi.r1 r1Var;
        ContactsActivity contactsActivity = this.f46364b;
        cy cyVar = this.f46363a;
        yu[] yuVarArr = this.f46366f;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        boolean z10 = false;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        float f10 = 44.0f;
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 25));
        this.hasOwnBackground = true;
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 10);
        this.f46365c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.e = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.e, org.telegram.ui.Components.gb1.i(-1, 44, 83));
        this.e.setDelegate(new f(this, 14));
        this.v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        xu xuVar = new xu(this, context);
        this.fragmentView = xuVar;
        xuVar.setWillNotDraw(false);
        cyVar.setParentFragment(this);
        contactsActivity.setParentFragment(this);
        int i10 = 0;
        while (i10 < yuVarArr.length) {
            yu yuVar = new yu(this, context);
            yuVarArr[i10] = yuVar;
            xuVar.addView(yuVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            if (i10 == 0) {
                yu yuVar2 = yuVarArr[i10];
                yuVar2.f46111a = cyVar;
                f7 = f10;
                yuVar2.d = cyVar.f38586e0[0].f37913a;
                cyVar.U3();
                jx jxVar = cyVar.C0;
                if (jxVar != null) {
                    r1Var = jxVar.f27933a0;
                } else {
                    r1Var = null;
                }
                yuVar2.e = r1Var;
            } else {
                f7 = f10;
                if (i10 == 1) {
                    yu yuVar3 = yuVarArr[i10];
                    yuVar3.f46111a = contactsActivity;
                    yuVar3.d = contactsActivity.d;
                    yuVar3.setVisibility(8);
                }
            }
            yuVarArr[i10].d.setScrollingTouchSlop(1);
            yu yuVar4 = yuVarArr[i10];
            yuVar4.f46112b = (FrameLayout) yuVar4.f46111a.getFragmentView();
            yu yuVar5 = yuVarArr[i10];
            yuVar5.f46113c = yuVar5.f46111a.getActionBar();
            yu yuVar6 = yuVarArr[i10];
            yuVar6.addView(yuVar6.f46112b, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            AndroidUtilities.removeFromParent(yuVarArr[i10].f46113c);
            yu yuVar7 = yuVarArr[i10];
            yuVar7.addView(yuVar7.f46113c, org.telegram.ui.Components.gb1.g(-2.0f, -1));
            yuVarArr[i10].f46113c.setVisibility(8);
            for (int i11 = 0; i11 < 2; i11++) {
                if (i11 == 0) {
                    mm0Var = yuVarArr[i10].d;
                } else {
                    mm0Var = yuVarArr[i10].e;
                }
                if (mm0Var != null) {
                    mm0Var.setClipToPadding(false);
                    mm0Var.setOnScrollListener(new ai.u0(6, this, mm0Var.getOnScrollListener()));
                }
            }
            i10++;
            f10 = f7;
        }
        float f11 = f10;
        xuVar.addView(this.actionBar, org.telegram.ui.Components.gb1.g(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.e;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.a(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.e.a(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.e.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(f11));
            int currentTabId = this.e.getCurrentTabId();
            if (currentTabId >= 0) {
                yuVarArr[0].f46114f = currentTabId;
            }
            this.e.c();
        }
        n0(false);
        if (this.e.getCurrentTabId() == this.e.getFirstTabId()) {
            z10 = true;
        }
        this.f46370w = z10;
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.I8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.J8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.e.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.K8));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, new Drawable[]{this.e.getSelectorDrawable()}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.L8));
        arrayList.addAll(this.f46363a.getThemeDescriptions());
        arrayList.addAll(this.f46364b.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.f46370w;
    }

    public final void m0(TLRPC.User user) {
        if (user != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String string = LocaleController.getString(R.string.BlockUser);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
            alertDialog$Builder.k(LocaleController.getString(R.string.BlockContact), new org.telegram.ui.Components.voip.k1(6, this, user));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(e2Var);
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
            }
        }
    }

    public final void n0(boolean z10) {
        org.telegram.ui.Components.mm0 mm0Var;
        yu[] yuVarArr = this.f46366f;
        for (int i10 = 0; i10 < yuVarArr.length; i10++) {
            yuVarArr[i10].d.C0();
            bi.r1 r1Var = yuVarArr[i10].e;
            if (r1Var != null) {
                r1Var.C0();
            }
        }
        for (int i11 = 0; i11 < 2; i11++) {
            if (i11 == 0) {
                mm0Var = yuVarArr[z10 ? 1 : 0].d;
            } else {
                mm0Var = yuVarArr[z10 ? 1 : 0].e;
            }
            if (mm0Var != null) {
                mm0Var.getAdapter();
                mm0Var.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((s4.c0) mm0Var.getLayoutManager()).h1(0, (int) this.actionBar.getTranslationY());
                }
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        cy cyVar = this.f46363a;
        if (cyVar != null) {
            cyVar.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.f46364b;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        cy cyVar = this.f46363a;
        if (cyVar != null) {
            cyVar.onPause();
        }
        ContactsActivity contactsActivity = this.f46364b;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        cy cyVar = this.f46363a;
        if (cyVar != null) {
            cyVar.onResume();
        }
        ContactsActivity contactsActivity = this.f46364b;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            cy cyVar = this.f46363a;
            if (cyVar != null && cyVar.fragmentView != null) {
                cyVar.onThemeColorsChanged();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            ContactsActivity contactsActivity = this.f46364b;
            if (contactsActivity != null && contactsActivity.fragmentView != null) {
                contactsActivity.onThemeColorsChanged();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
