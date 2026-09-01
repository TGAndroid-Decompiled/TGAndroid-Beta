package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class wg0 extends jh1 implements NotificationCenter.NotificationCenterDelegate, xd.b {
    public FrameLayout B;
    public yg0 C;
    public qg.b D;
    public View E;
    public Integer F;
    public py G;
    public ch.b[] H;
    public int I;
    public int J;
    public int K;
    public NotificationCenter.ObserversGroup L;
    public NotificationCenter.ObserversGroup M;
    public qh.f3 N;
    public boolean O;
    public final tg.c P;
    public final tg.d Q;
    public IUpdateLayout f42806w;
    public boolean f42807x;
    public sg1 f42808y;
    public final xd.a v = new xd.a(0, this, org.telegram.ui.Components.pr.h, 380, true);
    public final RectF R = new RectF();

    public wg0() {
        if (Build.VERSION.SDK_INT >= 31) {
            tg.d dVar = new tg.d(null);
            this.Q = dVar;
            dVar.j(new tg0(this));
        } else {
            this.Q = null;
        }
        this.P = new tg.c();
        a9 a9Var = new a9(this, 5);
        setBulletinDelegate(a9Var);
        org.telegram.ui.Components.ic.a(this.f38157b, a9Var);
    }

    public static void Y(wg0 wg0Var, int i10, org.telegram.ui.Components.q70 q70Var) {
        if (wg0Var.currentAccount != i10) {
            q70Var.u();
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        }
    }

    public static boolean Z(org.telegram.ui.wg0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wg0.Z(org.telegram.ui.wg0, android.view.View):boolean");
    }

    public static void a0(wg0 wg0Var) {
        wg0Var.getUserConfig().setShowCallsTab(true);
        wg0Var.g0(true, true);
        NotificationCenter.getInstance(wg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(wg0 wg0Var) {
        wg0Var.getClass();
        int i10 = 0;
        Integer num = null;
        for (int i11 = 3; i11 >= 0; i11--) {
            if (!UserConfig.getInstance(i11).isClientActivated()) {
                i10++;
                if (num == null) {
                    num = Integer.valueOf(i11);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i10--;
        }
        if (i10 > 0 && num != null) {
            wg0Var.presentFragment(new og0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            wg0Var.showDialog(new fg.v0(7, wg0Var.currentAccount, wg0Var.getParentActivity(), wg0Var, null));
        }
    }

    public static void c0(wg0 wg0Var) {
        wg0Var.getUserConfig().setShowCallsTab(false);
        wg0Var.g0(false, true);
        NotificationCenter.getInstance(wg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 V(int i10) {
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i10 == 2) {
            if (getUserConfig().showCallsTab) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new l9(bundle2);
            }
            return new p81(android.support.v4.media.a.i("hasMainTabs", true));
        } else if (i10 == 0) {
            py pyVar = new py(android.support.v4.media.a.i("hasMainTabs", true));
            this.G = pyVar;
            pyVar.F3 = new tg0(this);
            return pyVar;
        } else if (i10 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null && X.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        super.createView(context);
        yg0 yg0Var = new yg0(context, this.resourceProvider);
        this.C = yg0Var;
        yg0Var.setClipChildren(false);
        this.C.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.C.setMaxWidth(AndroidUtilities.dp(344.0f));
        ch.b[] bVarArr = new ch.b[5];
        this.H = bVarArr;
        bVarArr[0] = ch.b.b(context, this.resourceProvider, ch.a.CHATS, R.string.MainTabsChats);
        this.H[1] = ch.b.b(context, this.resourceProvider, ch.a.CONTACTS, R.string.MainTabsContacts);
        this.H[2] = ch.b.b(context, this.resourceProvider, ch.a.SETTINGS, R.string.Settings);
        this.H[3] = ch.b.b(context, this.resourceProvider, ch.a.CALLS, R.string.MainTabsCalls);
        ch.b[] bVarArr2 = this.H;
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        ch.b bVar = new ch.b(context);
        bVar.f2519a.setText(LocaleController.getString(i12));
        bVar.f2520b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.e(user, z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f2521c = p9Var;
        bVar.addView(p9Var, k7.c6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f2527w = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.cl, g6Var);
        bVar.f2526s = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.al, g6Var);
        bVar.v = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.bl, g6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.H[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final wg0 f40960b;

            {
                this.f40960b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return wg0.Z(this.f40960b, view);
                    case 1:
                        wg0 wg0Var = this.f40960b;
                        if (wg0Var.getParentActivity() == null || wg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(wg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new sg0(wg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new sg0(wg0Var, 6), false);
                        H.f30331u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f30311i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        wg0 wg0Var2 = this.f40960b;
                        if (wg0Var2.getParentActivity() == null || wg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H2 = org.telegram.ui.Components.q70.H(wg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new sg0(wg0Var2, 1), false);
                        if (wg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new sg0(wg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new sg0(wg0Var2, 3), false);
                        }
                        H2.f30331u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f40960b.k0(view);
                        return true;
                }
            }
        });
        this.H[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final wg0 f40960b;

            {
                this.f40960b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return wg0.Z(this.f40960b, view);
                    case 1:
                        wg0 wg0Var = this.f40960b;
                        if (wg0Var.getParentActivity() == null || wg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(wg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new sg0(wg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new sg0(wg0Var, 6), false);
                        H.f30331u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f30311i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        wg0 wg0Var2 = this.f40960b;
                        if (wg0Var2.getParentActivity() == null || wg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H2 = org.telegram.ui.Components.q70.H(wg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new sg0(wg0Var2, 1), false);
                        if (wg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new sg0(wg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new sg0(wg0Var2, 3), false);
                        }
                        H2.f30331u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f40960b.k0(view);
                        return true;
                }
            }
        });
        this.H[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final wg0 f40960b;

            {
                this.f40960b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return wg0.Z(this.f40960b, view);
                    case 1:
                        wg0 wg0Var = this.f40960b;
                        if (wg0Var.getParentActivity() == null || wg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(wg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new sg0(wg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new sg0(wg0Var, 6), false);
                        H.f30331u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f30311i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        wg0 wg0Var2 = this.f40960b;
                        if (wg0Var2.getParentActivity() == null || wg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H2 = org.telegram.ui.Components.q70.H(wg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new sg0(wg0Var2, 1), false);
                        if (wg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new sg0(wg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new sg0(wg0Var2, 3), false);
                        }
                        H2.f30331u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f40960b.k0(view);
                        return true;
                }
            }
        });
        this.H[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final wg0 f40960b;

            {
                this.f40960b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return wg0.Z(this.f40960b, view);
                    case 1:
                        wg0 wg0Var = this.f40960b;
                        if (wg0Var.getParentActivity() == null || wg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(wg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new sg0(wg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new sg0(wg0Var, 6), false);
                        H.f30331u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f30311i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        wg0 wg0Var2 = this.f40960b;
                        if (wg0Var2.getParentActivity() == null || wg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.q70 H2 = org.telegram.ui.Components.q70.H(wg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new sg0(wg0Var2, 1), false);
                        if (wg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new sg0(wg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new sg0(wg0Var2, 3), false);
                        }
                        H2.f30331u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), wg0Var2.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f40960b.k0(view);
                        return true;
                }
            }
        });
        this.C.M.add(this.H[0]);
        this.C.M.add(this.H[1]);
        this.C.M.add(this.H[4]);
        this.C.M.add(this.H[3]);
        int i13 = 0;
        while (true) {
            ch.b[] bVarArr3 = this.H;
            if (i13 >= bVarArr3.length) {
                break;
            }
            ch.b bVar2 = bVarArr3[i13];
            if (i13 > 2) {
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            bVar2.setOnClickListener(new mh.x0(this, i10, 16));
            this.C.addView(this.H[i13]);
            this.C.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f38158c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6);
        tg.c cVar = this.P;
        cVar.a(themedColor);
        vg.i iVar = new vg.i(this.f38157b);
        tg.a aVar = this.Q;
        if (aVar == null) {
            aVar = cVar;
        }
        l0 l0Var = this.f38157b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        yg0 yg0Var2 = this.C;
        rg.d f10 = sg.b.f(this.resourceProvider);
        qg.b k10 = aVar.k();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (k10 instanceof qg.c)) {
            qg.c cVar2 = (qg.c) k10;
            cVar2.N = new og.f(cVar2.I);
        }
        k10.n(f10);
        if (l0Var != null && yg0Var2 != null) {
            iVar.d(yg0Var2, l0Var, new ng.w(2, k10, yg0Var2), false);
        }
        this.D = k10;
        k10.p(AndroidUtilities.dp(28.0f));
        this.D.o(AndroidUtilities.dp(7.666f));
        this.C.setBackground(this.D);
        l0 l0Var2 = this.f38157b;
        this.E = new View(context);
        View view = this.E;
        qg.d dVar = new qg.d(cVar);
        dVar.n(null);
        if (l0Var2 != null && view != null) {
            iVar.d(view, l0Var2, new ng.w(2, dVar, view), false);
        }
        og.b bVar3 = new og.b(dVar);
        bVar3.b(AndroidUtilities.dp(60.0f), true);
        this.E.setBackground(bVar3);
        this.f38157b.addView(this.E, k7.c6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.B = frameLayout;
        frameLayout.setOnClickListener(new eg.m(22));
        this.B.addView(this.C, k7.c6.e(-1, 72, 81));
        this.B.setClipToPadding(false);
        this.f38157b.addView(this.B, k7.c6.e(-1, -2, 80));
        sg1 sg1Var = new sg1(context);
        this.f42808y = sg1Var;
        this.f38157b.addView(sg1Var, k7.c6.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f42808y);
        this.f42806w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f38157b;
    }

    public final void d0() {
        tg.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.Q) != null && (view = this.fragmentView) != null) {
            dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ch.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z4 = false;
        boolean z10 = false;
        z4 = false;
        if (i10 != NotificationCenter.notificationsCountUpdated && i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f42806w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f42806w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f42806w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f42806w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f42806w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f42806w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.D1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f34136a0.size() == 1) {
                        z10 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z10);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f38158c.getCurrentPosition();
                SparseArray sparseArray = this.f38156a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    hh1 hh1Var = (hh1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && hh1Var != null) {
                        hh1Var.f37508a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                ih1 ih1Var = this.f38158c;
                if (ih1Var != null && ih1Var.getCurrentPosition() == 2) {
                    this.f38158c.D(0);
                    m0(0, true);
                    this.f42807x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                ch.b[] bVarArr = this.H;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f2521c.e(user, new org.telegram.ui.Components.z8(0, user));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.contactsPermissionBadgeCheck) {
                f0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        if (view != null && view.isAttachedToWindow()) {
            z4 = true;
        }
        j0(z4);
    }

    public final void e0() {
        float f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6);
        ih1 ih1Var = this.f38158c;
        if (ih1Var != null) {
            f10 = ih1Var.r(0);
        } else {
            f10 = 1.0f;
        }
        this.P.a(i0.a.d(f10, themedColor, themedColor2));
        View view = this.E;
        if (view != null) {
            view.invalidate();
        }
        qg.b bVar = this.D;
        if (bVar != null) {
            bVar.u();
        }
        d0();
        View view2 = this.E;
        if (view2 != null) {
            view2.invalidate();
        }
        yg0 yg0Var = this.C;
        if (yg0Var != null) {
            yg0Var.invalidate();
        }
        ch.b[] bVarArr = this.H;
        if (bVarArr != null) {
            for (ch.b bVar2 : bVarArr) {
                bVar2.getClass();
                bVar2.f2527w = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.cl, bVar2.d);
                bVar2.f2526s = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.al, bVar2.d);
                bVar2.v = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.bl, bVar2.d);
                bVar2.f();
                bVar2.invalidate();
            }
        }
    }

    public final void f0() {
        boolean z4;
        if (this.C != null && this.H[1] != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && ContactsController.hasContactsPermission()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (i10 >= 23 && UserConfig.getInstance(this.currentAccount).syncContacts && !z4 && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
                this.H[1].d("!", true, true);
            } else {
                this.H[1].d(null, true, true);
            }
        }
    }

    public final void g0(boolean z4, boolean z10) {
        yg0 yg0Var = this.C;
        if (yg0Var != null) {
            yg0Var.i(this.H[2], !z4, z10);
            this.C.i(this.H[3], z4, z10);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z4, boolean z10, float f10) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z4, z10, f10);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f21182c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        f fVar = new f(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21659d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21731h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        ih1 ih1Var = this.f38158c;
        if (ih1Var != null && this.E != null) {
            float a2 = 1.0f - k7.o.a(Math.abs(3.0f - ih1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.I)) * a2)) * this.v.f50505e;
            this.E.setAlpha(navigationBarThirdButtonsFactor);
            this.E.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
            View view = this.E;
            if (navigationBarThirdButtonsFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    public final void i0() {
        int i10;
        boolean z4;
        View view = this.f42808y.f41286b;
        int i11 = 0;
        if (view != null && view.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f10 = this.v.f50505e;
        AndroidUtilities.lerp(0.85f, 1.0f, f10);
        this.B.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i12, i12, f10));
        yg0 yg0Var = this.C;
        boolean z10 = true;
        int i13 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i13 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        yg0Var.setClickable(z4);
        yg0 yg0Var2 = this.C;
        if (i13 <= 0) {
            z10 = false;
        }
        yg0Var2.setEnabled(z10);
        this.C.setAlpha(f10);
        yg0 yg0Var3 = this.C;
        if (f10 <= 0.0f) {
            i11 = 8;
        }
        yg0Var3.setVisibility(i11);
    }

    public final void j0(boolean z4) {
        if (this.C == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount > 0) {
            this.H[0].d(LocaleController.formatNumber(mainUnreadCount, ','), false, z4);
            return;
        }
        this.H[0].d(null, false, z4);
    }

    public final void k0(View view) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new du(4));
        org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new sg0(this, 0), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.k6.Y(getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
                z8Var.r(currentUser);
                fg.y yVar = new fg.y(this, getParentActivity(), z4);
                linearLayout.addView(yVar, k7.c6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
                if (z4) {
                    p9Var.setScaleX(0.833f);
                    p9Var.setScaleY(0.833f);
                }
                p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                p9Var.getImageReceiver().setCurrentAccount(intValue);
                p9Var.e(currentUser, z8Var);
                yVar.addView(p9Var, k7.c6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21766j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, k7.c6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new eg.k2(this, intValue, H, 16));
                H.r(linearLayout, k7.c6.n(230, 48));
            }
        }
        H.f30331u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.k6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.n40.f29390r.a();
    }

    public final py l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        py pyVar = new py(bundle);
        this.G = pyVar;
        pyVar.F3 = new tg0(this);
        this.f38156a.put(0, new hh1(pyVar));
        return this.G;
    }

    public final void m0(int i10, boolean z4) {
        int i11;
        boolean z10;
        int i12 = 0;
        while (true) {
            ch.b[] bVarArr = this.H;
            if (i12 < bVarArr.length) {
                ch.b bVar = bVarArr[i12];
                if (i12 > 2) {
                    i11 = i12 - 1;
                } else {
                    i11 = i12;
                }
                if (i11 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.e(z10, z4);
                i12++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f10, boolean z4) {
        for (int i10 = 0; i10 < this.H.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f10));
            ch.b bVar = this.H[i10];
            bVar.G = max;
            bVar.F = z4;
            bVar.invalidate();
        }
        this.C.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        boolean onBackPressed = super.onBackPressed(z4);
        if (onBackPressed && this.f38158c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z4) {
                this.f38158c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.L = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.M = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.ic.h(this.f38157b);
        NotificationCenter.ObserversGroup observersGroup = this.L;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.L = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.M;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.M = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        qh.f3 f3Var = this.N;
        if (f3Var != null) {
            f3Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.O) {
            return;
        }
        if (this.N == null && org.telegram.ui.Components.n40.f29390r.c()) {
            AndroidUtilities.runOnUIThread(new sg0(this, 7), 1500L);
        }
        this.O = true;
    }

    @Override
    public final void onSlideProgress(boolean z4, float f10) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onSlideProgress(z4, f10);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z4, z10);
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
