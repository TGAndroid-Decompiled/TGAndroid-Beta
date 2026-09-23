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
public final class zg0 extends th1 implements NotificationCenter.NotificationCenterDelegate, le.e {
    public FrameLayout E;
    public bh0 F;
    public ch.d G;
    public View H;
    public Integer I;
    public ry J;
    public oh.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public ci.e4 P;
    public boolean Q;
    public final fh.c R;
    public final fh.d S;
    public IUpdateLayout f40124w;
    public boolean f40125x;
    public bh1 f40126y;
    public final le.c v = new le.c(0, this, org.telegram.ui.Components.rr.h, 380, true);
    public final RectF T = new RectF();

    public zg0() {
        if (Build.VERSION.SDK_INT >= 31) {
            fh.d dVar = new fh.d(null);
            this.S = dVar;
            dVar.j(new wg0(this));
        } else {
            this.S = null;
        }
        this.R = new fh.c();
        z8 z8Var = new z8(this, 5);
        setBulletinDelegate(z8Var);
        org.telegram.ui.Components.qc.a(this.f37685b, z8Var);
    }

    public static void Y(zg0 zg0Var, int i10, org.telegram.ui.Components.o70 o70Var) {
        if (zg0Var.currentAccount != i10) {
            o70Var.u();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        }
    }

    public static boolean Z(org.telegram.ui.zg0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zg0.Z(org.telegram.ui.zg0, android.view.View):boolean");
    }

    public static void a0(zg0 zg0Var) {
        zg0Var.getUserConfig().setShowCallsTab(true);
        zg0Var.g0(true, true);
        NotificationCenter.getInstance(zg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(zg0 zg0Var) {
        zg0Var.getClass();
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
            zg0Var.presentFragment(new rg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            zg0Var.showDialog(new rg.j0(7, zg0Var.currentAccount, zg0Var.getParentActivity(), zg0Var, null));
        }
    }

    public static void c0(zg0 zg0Var) {
        zg0Var.getUserConfig().setShowCallsTab(false);
        zg0Var.g0(false, true);
        NotificationCenter.getInstance(zg0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 V(int i10) {
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
                return new k9(bundle2);
            }
            return new x81(a4.a.i("hasMainTabs", true));
        } else if (i10 == 0) {
            ry ryVar = new ry(a4.a.i("hasMainTabs", true));
            this.J = ryVar;
            ryVar.I3 = new wg0(this);
            return ryVar;
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
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null && X.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        super.createView(context);
        bh0 bh0Var = new bh0(context, this.resourceProvider);
        this.F = bh0Var;
        bh0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        oh.b[] bVarArr = new oh.b[5];
        this.K = bVarArr;
        bVarArr[0] = oh.b.b(context, this.resourceProvider, oh.a.CHATS, R.string.MainTabsChats);
        this.K[1] = oh.b.b(context, this.resourceProvider, oh.a.CONTACTS, R.string.MainTabsContacts);
        this.K[2] = oh.b.b(context, this.resourceProvider, oh.a.SETTINGS, R.string.Settings);
        this.K[3] = oh.b.b(context, this.resourceProvider, oh.a.CALLS, R.string.MainTabsCalls);
        oh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.d6 d6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        oh.b bVar = new oh.b(context);
        bVar.f15521a.setText(LocaleController.getString(i12));
        bVar.f15522b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(0, user);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.e(user, h9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f15523c = w9Var;
        bVar.addView(w9Var, w7.x5.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f15528w = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.cl, d6Var);
        bVar.f15527s = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.al, d6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.bl, d6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final zg0 f38106b;

            {
                this.f38106b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return zg0.Z(this.f38106b, view);
                    case 1:
                        zg0 zg0Var = this.f38106b;
                        if (zg0Var.getParentActivity() == null || zg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(zg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new vg0(zg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new vg0(zg0Var, 6), false);
                        H.f26671u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26651i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        zg0 zg0Var2 = this.f38106b;
                        if (zg0Var2.getParentActivity() == null || zg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H2 = org.telegram.ui.Components.o70.H(zg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new vg0(zg0Var2, 1), false);
                        if (zg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new vg0(zg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new vg0(zg0Var2, 3), false);
                        }
                        H2.f26671u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f38106b.k0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final zg0 f38106b;

            {
                this.f38106b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return zg0.Z(this.f38106b, view);
                    case 1:
                        zg0 zg0Var = this.f38106b;
                        if (zg0Var.getParentActivity() == null || zg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(zg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new vg0(zg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new vg0(zg0Var, 6), false);
                        H.f26671u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26651i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        zg0 zg0Var2 = this.f38106b;
                        if (zg0Var2.getParentActivity() == null || zg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H2 = org.telegram.ui.Components.o70.H(zg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new vg0(zg0Var2, 1), false);
                        if (zg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new vg0(zg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new vg0(zg0Var2, 3), false);
                        }
                        H2.f26671u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f38106b.k0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final zg0 f38106b;

            {
                this.f38106b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return zg0.Z(this.f38106b, view);
                    case 1:
                        zg0 zg0Var = this.f38106b;
                        if (zg0Var.getParentActivity() == null || zg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(zg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new vg0(zg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new vg0(zg0Var, 6), false);
                        H.f26671u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26651i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        zg0 zg0Var2 = this.f38106b;
                        if (zg0Var2.getParentActivity() == null || zg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H2 = org.telegram.ui.Components.o70.H(zg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new vg0(zg0Var2, 1), false);
                        if (zg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new vg0(zg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new vg0(zg0Var2, 3), false);
                        }
                        H2.f26671u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f38106b.k0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final zg0 f38106b;

            {
                this.f38106b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return zg0.Z(this.f38106b, view);
                    case 1:
                        zg0 zg0Var = this.f38106b;
                        if (zg0Var.getParentActivity() == null || zg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(zg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new vg0(zg0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new vg0(zg0Var, 6), false);
                        H.f26671u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26651i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        zg0 zg0Var2 = this.f38106b;
                        if (zg0Var2.getParentActivity() == null || zg0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.o70 H2 = org.telegram.ui.Components.o70.H(zg0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new vg0(zg0Var2, 1), false);
                        if (zg0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new vg0(zg0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new vg0(zg0Var2, 3), false);
                        }
                        H2.f26671u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), zg0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f38106b.k0(view);
                        return true;
                }
            }
        });
        this.F.P.add(this.K[0]);
        this.F.P.add(this.K[1]);
        this.F.P.add(this.K[4]);
        this.F.P.add(this.K[3]);
        int i13 = 0;
        while (true) {
            oh.b[] bVarArr3 = this.K;
            if (i13 >= bVarArr3.length) {
                break;
            }
            oh.b bVar2 = bVarArr3[i13];
            if (i13 > 2) {
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            bVar2.setOnClickListener(new ci.n4(this, i10, 19));
            this.F.addView(this.K[i13]);
            this.F.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f37686c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6);
        fh.c cVar = this.R;
        cVar.a(themedColor);
        hh.k kVar = new hh.k(this.f37685b);
        fh.a aVar = this.S;
        if (aVar == null) {
            aVar = cVar;
        }
        ah.c cVar2 = new ah.c(aVar);
        k0 k0Var = this.f37685b;
        cVar2.f425f = kVar;
        cVar2.f426g = k0Var;
        cVar2.f427i = LiteMode.isEnabled(262144);
        ch.d c10 = cVar2.c(this.F, eh.b.f(this.resourceProvider), false);
        this.G = c10;
        c10.q(AndroidUtilities.dp(28.0f));
        this.G.p(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        ah.c cVar3 = new ah.c(cVar);
        k0 k0Var2 = this.f37685b;
        cVar3.f425f = kVar;
        cVar3.f426g = k0Var2;
        this.H = new View(context);
        ah.d dVar = new ah.d(cVar3.c(this.H, null, false));
        dVar.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(dVar);
        this.f37685b.addView(this.H, w7.x5.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new ai.e2(20));
        this.E.addView(this.F, w7.x5.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f37685b.addView(this.E, w7.x5.e(-1, -2, 80));
        bh1 bh1Var = new bh1(context);
        this.f40126y = bh1Var;
        this.f37685b.addView(bh1Var, w7.x5.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f40126y);
        this.f40124w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f37685b;
    }

    public final void d0() {
        fh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.S) != null && (view = this.fragmentView) != null) {
            dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.k();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oh.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i10 != NotificationCenter.notificationsCountUpdated && i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f40124w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f40124w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f40124w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f40124w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f40124w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f40124w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.G1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f30791d0.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f37686c.getCurrentPosition();
                SparseArray sparseArray = this.f37684a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    rh1 rh1Var = (rh1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && rh1Var != null) {
                        rh1Var.f36853a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                sh1 sh1Var = this.f37686c;
                if (sh1Var != null && sh1Var.getCurrentPosition() == 2) {
                    this.f37686c.D(0);
                    m0(0, true);
                    this.f40125x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                oh.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f15523c.e(user, new org.telegram.ui.Components.h9(0, user));
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
            z10 = true;
        }
        j0(z10);
    }

    public final void e0() {
        float f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f18733a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6);
        sh1 sh1Var = this.f37686c;
        if (sh1Var != null) {
            f7 = sh1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.R.a(i0.a.d(f7, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        ch.d dVar = this.G;
        if (dVar != null) {
            dVar.v();
        }
        d0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        bh0 bh0Var = this.F;
        if (bh0Var != null) {
            bh0Var.invalidate();
        }
        oh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (oh.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f15528w = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.cl, bVar.d);
                bVar.f15527s = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    public final void f0() {
        boolean z10;
        if (this.F != null && this.K[1] != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && ContactsController.hasContactsPermission()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (i10 >= 23 && UserConfig.getInstance(this.currentAccount).syncContacts && !z10 && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
                this.K[1].d("!", true, true);
            } else {
                this.K[1].d(null, true, true);
            }
        }
    }

    public final void g0(boolean z10, boolean z11) {
        bh0 bh0Var = this.F;
        if (bh0Var != null) {
            bh0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f19712c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f18789d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f18859h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        sh1 sh1Var = this.f37686c;
        if (sh1Var != null && this.H != null) {
            float a2 = 1.0f - w7.p.a(Math.abs(3.0f - sh1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.L)) * a2)) * this.v.e;
            this.H.setAlpha(navigationBarThirdButtonsFactor);
            this.H.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
            View view = this.H;
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
        boolean z10;
        View view = this.f40126y.f32120b;
        int i11 = 0;
        if (view != null && view.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f7 = this.v.e;
        AndroidUtilities.lerp(0.85f, 1.0f, f7);
        this.E.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i12, i12, f7));
        bh0 bh0Var = this.F;
        boolean z11 = true;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bh0Var.setClickable(z10);
        bh0 bh0Var2 = this.F;
        if (i13 <= 0) {
            z11 = false;
        }
        bh0Var2.setEnabled(z11);
        this.F.setAlpha(f7);
        bh0 bh0Var3 = this.F;
        if (f7 <= 0.0f) {
            i11 = 8;
        }
        bh0Var3.setVisibility(i11);
    }

    public final void j0(boolean z10) {
        if (this.F == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount > 0) {
            this.K[0].d(LocaleController.formatNumber(mainUnreadCount, ','), false, z10);
            return;
        }
        this.K[0].d(null, false, z10);
    }

    public final void k0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new df(23));
        org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new vg0(this, 0), false);
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Y(getThemedColor(org.telegram.ui.ActionBar.h6.f18878i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.r(currentUser);
                org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(this, getParentActivity(), z10);
                linearLayout.addView(ig0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, h9Var);
                ig0Var.addView(w9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f18895j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.wa(this, intValue, H, 12));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        H.f26671u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.h6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.k40.f25504r.a();
    }

    public final ry l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        ry ryVar = new ry(bundle);
        this.J = ryVar;
        ryVar.I3 = new wg0(this);
        this.f37684a.put(0, new rh1(ryVar));
        return this.J;
    }

    public final void m0(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12 = 0;
        while (true) {
            oh.b[] bVarArr = this.K;
            if (i12 < bVarArr.length) {
                oh.b bVar = bVarArr[i12];
                if (i12 > 2) {
                    i11 = i12 - 1;
                } else {
                    i11 = i12;
                }
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i12++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.K.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f7));
            oh.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.F.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f37686c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f37686c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.O = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck).addGlobal(NotificationCenter.appUpdateAvailable).addGlobal(NotificationCenter.appUpdateLoading).addGlobal(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.qc.h(this.f37685b);
        NotificationCenter.ObserversGroup observersGroup = this.O;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ci.e4 e4Var = this.P;
        if (e4Var != null) {
            e4Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.Q) {
            return;
        }
        if (this.P == null && org.telegram.ui.Components.k40.f25504r.c()) {
            AndroidUtilities.runOnUIThread(new vg0(this, 7), 1500L);
        }
        this.Q = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
