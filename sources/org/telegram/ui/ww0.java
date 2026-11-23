package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public class ww0 extends org.telegram.ui.Components.dk0 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public vw0[] f53543c;
    public final org.telegram.ui.ActionBar.g2 f53544e;
    public final int f53545f;
    public final Context h;
    public boolean f53550x;
    public tr0 f53551y;
    public final ArrayList d = new ArrayList();
    public ArrayList f53546n = new ArrayList();
    public ArrayList f53547r = new ArrayList();
    public ArrayList f53548s = new ArrayList();
    public final ArrayList f53549w = new ArrayList();

    public ww0(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f53544e = g2Var;
        this.f53545f = g2Var.getCurrentAccount();
        this.h = context;
        this.f53543c = H(g2Var);
        J();
    }

    public static boolean F(int i7, int i10) {
        if (org.telegram.messenger.np.u1(i7).K3() && !org.telegram.messenger.k10.i(i7).q()) {
            return false;
        }
        if (i10 != -1 && org.telegram.messenger.np.u1(i7).O0.get(i10, -1) == -1) {
            return false;
        }
        return true;
    }

    public static vw0[] H(final org.telegram.ui.ActionBar.g2 g2Var) {
        vw0 vw0Var;
        vw0 vw0Var2;
        vw0 vw0Var3;
        vw0 vw0Var4;
        vw0 vw0Var5;
        vw0 vw0Var6;
        vw0 vw0Var7;
        vw0 vw0Var8;
        vw0 vw0Var9;
        vw0 vw0Var10;
        vw0 vw0Var11;
        vw0 vw0Var12;
        vw0 vw0Var13;
        vw0 vw0Var14;
        vw0 vw0Var15;
        vw0 vw0Var16;
        vw0 vw0Var17;
        vw0 vw0Var18;
        vw0 vw0Var19;
        vw0 vw0Var20;
        vw0 vw0Var21;
        vw0 vw0Var22;
        vw0 vw0Var23;
        final int currentAccount = g2Var.getCurrentAccount();
        vw0 vw0Var24 = new vw0(500, org.telegram.messenger.hd.M0(2131751252), 0, new tr0(20, g2Var, g2Var.getResourceProvider()));
        vw0 vw0Var25 = new vw0(501, org.telegram.messenger.hd.M0(2131752525), 0, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var25.a("tg://settings/edit/change-number");
        vw0 vw0Var26 = new vw0(502, org.telegram.messenger.hd.M0(2131754465), 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var26.a("tg://settings/edit/add-account");
        vw0 vw0Var27 = new vw0(1, org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var27.a("tg://settings/notifications");
        vw0 vw0Var28 = new vw0(2, org.telegram.messenger.hd.M0(2131747684), org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var28.a("tg://settings/notifications/private-chats");
        vw0 vw0Var29 = new vw0(3, org.telegram.messenger.hd.M0(2131747713), org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0Var29.a("tg://settings/notifications/groups");
        vw0 vw0Var30 = new vw0(4, org.telegram.messenger.hd.M0(2131747727), org.telegram.messenger.hd.M0(2131747728), 2131232264, new wf0(7, g2Var));
        vw0Var30.a("tg://settings/notifications/channels");
        vw0 vw0Var31 = new vw0(5, org.telegram.messenger.hd.M0(2131743034), "callsSectionRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new wf0(19, g2Var));
        vw0 vw0Var32 = new vw0(6, org.telegram.messenger.hd.M0(2131753730), "badgeNumberSection", org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var33 = new vw0(7, org.telegram.messenger.hd.M0(2131749026), "inappSectionRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var34 = new vw0(8, org.telegram.messenger.hd.M0(2131751778), "contactJoinedRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new wf0(23, g2Var));
        vw0Var34.a("tg://settings/notifications/new-contacts");
        vw0 vw0Var35 = new vw0(9, org.telegram.messenger.hd.M0(2131747034), "pinnedMessageRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var35.a("tg://settings/notifications/pinned-messages");
        vw0 vw0Var36 = new vw0(10, org.telegram.messenger.hd.M0(2131745916), "resetNotificationsRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var36.a("tg://settings/notifications/reset");
        vw0 vw0Var37 = new vw0(11, org.telegram.messenger.hd.M0(2131747682), "notificationsServiceRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var38 = new vw0(12, org.telegram.messenger.hd.M0(2131747681), "notificationsServiceConnectionRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var39 = new vw0(13, org.telegram.messenger.hd.M0(2131746079), "repeatRow", org.telegram.messenger.hd.M0(2131747728), 2131232264, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var40 = new vw0(100, org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var40.a("tg://settings/privacy");
        vw0 vw0Var41 = new vw0(109, org.telegram.messenger.hd.M0(2131743693), org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var41.a("tg://settings/privacy/2sv");
        vw0 vw0Var42 = new vw0(124, org.telegram.messenger.hd.M0(2131753847), org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.k10.i(i10).f24991q0 >= 0) {
                            g2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.k10.i(i10).q()) {
                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(g2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(b02.X(), null);
                            obVar.d(2131624347, new String[0]);
                            String N0 = org.telegram.messenger.hd.N0(2131746561, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            int indexOf = N0.indexOf(42);
                            int lastIndexOf = N0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) N0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.ha(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            obVar.f38158b.setText(spannableStringBuilder);
                            obVar.f38158b.setSingleLine(false);
                            obVar.f38158b.setMaxLines(2);
                            b02.b(obVar, 2750).j();
                            return;
                        }
                        g2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        vw0Var42.a("tg://settings/privacy/auto-delete");
        vw0 vw0Var43 = new vw0(108, org.telegram.messenger.hd.M0(2131747463), org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var43.a("tg://settings/privacy/passcode");
        vw0 vw0Var44 = null;
        if (org.telegram.messenger.cz.f23424m1) {
            vw0Var = vw0Var41;
            vw0Var2 = new vw0(125, org.telegram.messenger.hd.M0(2131751190), "emailLoginRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            g2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            g2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            g2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            g2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            g2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            g2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            g2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            g2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f54510s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f52485f == 1) {
                                        z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                            return;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            return;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(st0Var);
                            return;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            vw0Var2.a("tg://settings/privacy/login-email");
        } else {
            vw0Var = vw0Var41;
            vw0Var2 = null;
        }
        vw0 vw0Var45 = new vw0(101, org.telegram.messenger.hd.M0(2131753678), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var45.a("tg://settings/privacy/blocked");
        vw0 vw0Var46 = new vw0(110, org.telegram.messenger.hd.M0(2131745355), 2131232037, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var46.a("tg://settings/devices");
        vw0 vw0Var47 = new vw0(105, org.telegram.messenger.hd.M0(2131746596), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var47.a("tg://settings/privacy/phone-number/");
        vw0 vw0Var48 = new vw0(102, org.telegram.messenger.hd.M0(2131746621), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var48.a("tg://settings/privacy/last-seen");
        vw0 vw0Var49 = new vw0(103, org.telegram.messenger.hd.M0(2131746583), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var49.a("tg://settings/privacy/profile-photos");
        vw0 vw0Var50 = new vw0(104, org.telegram.messenger.hd.M0(2131746643), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var50.a("tg://settings/privacy/forwards");
        vw0 vw0Var51 = new vw0(122, org.telegram.messenger.hd.M0(2131746606), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var51.a("tg://settings/privacy/calls/p2p");
        vw0 vw0Var52 = new vw0(106, org.telegram.messenger.hd.M0(2131752584), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var52.a("tg://settings/privacy/calls");
        vw0 vw0Var53 = new vw0(107, org.telegram.messenger.hd.M0(2131746623), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var53.a("tg://settings/privacy/invites");
        vw0 vw0Var54 = new vw0(123, org.telegram.messenger.hd.M0(2131746564), org.telegram.messenger.hd.M0(2131746577), 2131232357, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.k10.i(i10).f24991q0 >= 0) {
                            g2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.k10.i(i10).q()) {
                            org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(g2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(b02.X(), null);
                            obVar.d(2131624347, new String[0]);
                            String N0 = org.telegram.messenger.hd.N0(2131746561, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            int indexOf = N0.indexOf(42);
                            int lastIndexOf = N0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) N0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.ha(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            obVar.f38158b.setText(spannableStringBuilder);
                            obVar.f38158b.setSingleLine(false);
                            obVar.f38158b.setMaxLines(2);
                            b02.b(obVar, 2750).j();
                            return;
                        }
                        g2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        vw0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.np.u1(currentAccount).f25807b4) {
            vw0Var3 = vw0Var54;
            vw0Var4 = new vw0(121, org.telegram.messenger.hd.M0(2131754168), "newChatsRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.k10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                g2Var.presentFragment(new de0(i7));
                                return;
                            }
                            return;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            g2Var.presentFragment(new x6());
                            return;
                        case 24:
                            g2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new x6());
                            return;
                        case 27:
                            g2Var.presentFragment(new x6());
                            return;
                        case 28:
                            g2Var.presentFragment(new pt());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            vw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            vw0Var3 = vw0Var54;
            vw0Var4 = null;
        }
        vw0 vw0Var55 = new vw0(112, org.telegram.messenger.hd.M0(2131751584), "deleteAccountRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var55.a("tg://settings/privacy/self-destruct");
        vw0 vw0Var56 = new vw0(113, org.telegram.messenger.hd.M0(2131746603), "paymentsClearRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        vw0 vw0Var57 = new vw0(114, org.telegram.messenger.hd.M0(2131742645), org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var57.a("tg://settings/privacy/active-websites");
        vw0 vw0Var58 = new vw0(115, org.telegram.messenger.hd.M0(2131744053), "contactsDeleteRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        vw0 vw0Var59 = new vw0(116, org.telegram.messenger.hd.M0(2131744055), "contactsSyncRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        vw0 vw0Var60 = new vw0(117, org.telegram.messenger.hd.M0(2131744169), "contactsSuggestRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        vw0 vw0Var61 = new vw0(118, org.telegram.messenger.hd.M0(2131748496), "secretMapRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var61.a("tg://settings/privacy/data-settings/map-provider");
        vw0 vw0Var62 = new vw0(119, org.telegram.messenger.hd.M0(2131745488), "secretWebpageRow", org.telegram.messenger.hd.M0(2131746577), 2131232037, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var62.a("tg://settings/privacy/data-settings/link-previews");
        vw0 vw0Var63 = new vw0(120, org.telegram.messenger.hd.M0(2131751443), 2131232025, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var63.a("tg://settings/devices");
        vw0 vw0Var64 = new vw0(121, org.telegram.messenger.hd.M0(2131743965), "terminateAllSessionsRow", org.telegram.messenger.hd.M0(2131751443), 2131232025, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var64.a("tg://settings/devices/terminate-sessions");
        vw0 vw0Var65 = new vw0(122, org.telegram.messenger.hd.M0(2131748724), org.telegram.messenger.hd.M0(2131751443), 2131232025, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var65.a("tg://settings/devices/link-desktop");
        vw0 vw0Var66 = new vw0(200, org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var66.a("tg://settings/privacy/data-settings");
        vw0 vw0Var67 = new vw0(201, org.telegram.messenger.hd.M0(2131751664), "usageSectionRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var68 = new vw0(202, org.telegram.messenger.hd.M0(2131744573), org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var68.a("tg://settings/data/storage");
        vw0 vw0Var69 = new vw0(203, org.telegram.messenger.hd.M0(2131748867), "keepMediaRow", org.telegram.messenger.hd.M0(2131751665), org.telegram.messenger.hd.M0(2131744573), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var70 = new vw0(204, org.telegram.messenger.hd.M0(2131752063), "cacheRow", org.telegram.messenger.hd.M0(2131751665), org.telegram.messenger.hd.M0(2131744573), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var71 = new vw0(205, org.telegram.messenger.hd.M0(2131748581), "databaseRow", org.telegram.messenger.hd.M0(2131751665), org.telegram.messenger.hd.M0(2131744573), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var72 = new vw0(206, org.telegram.messenger.hd.M0(2131748105), org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.k10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            g2Var.presentFragment(new de0(i7));
                            return;
                        }
                        return;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        g2Var.presentFragment(new x6());
                        return;
                    case 24:
                        g2Var.presentFragment(new x6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new x6());
                        return;
                    case 27:
                        g2Var.presentFragment(new x6());
                        return;
                    case 28:
                        g2Var.presentFragment(new pt());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var72.a("tg://settings/data/usage");
        vw0 vw0Var73 = new vw0(207, org.telegram.messenger.hd.M0(2131753764), "mediaDownloadSectionRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var74 = new vw0(208, org.telegram.messenger.hd.M0(2131742618), org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var75 = new vw0(209, org.telegram.messenger.hd.M0(2131742620), org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var76 = new vw0(210, org.telegram.messenger.hd.M0(2131742619), org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var77 = new vw0(211, org.telegram.messenger.hd.M0(2131745915), "resetDownloadRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0Var77.a("tg://settings/data/auto-download/reset");
        vw0 vw0Var78 = new vw0(215, org.telegram.messenger.hd.M0(2131744195), "streamSectionRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var79 = new vw0(216, org.telegram.messenger.hd.M0(2131751132), "enableStreamRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var80 = new vw0(217, org.telegram.messenger.hd.M0(2131752584), "callsSectionRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var81 = new vw0(218, org.telegram.messenger.hd.M0(2131742984), "useLessDataForCallsRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0Var81.a("tg://settings/data/use-less-data");
        vw0 vw0Var82 = new vw0(219, org.telegram.messenger.hd.M0(2131743013), "quickRepliesRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var83 = new vw0(220, org.telegram.messenger.hd.M0(2131746405), org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0Var83.a("tg://settings/data/proxy");
        vw0 vw0Var84 = new vw0(111, org.telegram.messenger.hd.M0(2131746647), "clearDraftsRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        vw0 vw0Var85 = new vw0(222, org.telegram.messenger.hd.M0(2131745733), "saveToGallerySectionRow", org.telegram.messenger.hd.M0(2131751665), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var86 = new vw0(223, org.telegram.messenger.hd.M0(2131745723), "saveToGalleryPeerRow", org.telegram.messenger.hd.M0(2131751665), org.telegram.messenger.hd.M0(2131745733), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0Var86.a("tg://settings/data/save-to-photos/chats");
        vw0 vw0Var87 = new vw0(224, org.telegram.messenger.hd.M0(2131745730), "saveToGalleryGroupsRow", org.telegram.messenger.hd.M0(2131751665), org.telegram.messenger.hd.M0(2131745733), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        vw0Var87.a("tg://settings/data/save-to-photos/groups");
        vw0 vw0Var88 = new vw0(225, org.telegram.messenger.hd.M0(2131745732), "saveToGalleryChannelsRow", org.telegram.messenger.hd.M0(2131751665), org.telegram.messenger.hd.M0(2131745733), 2131232024, new wf0(2, g2Var));
        vw0Var88.a("tg://settings/data/save-to-photos/channels");
        vw0 vw0Var89 = new vw0(300, org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(3, g2Var));
        vw0Var89.a("tg://settings/appearance/themes");
        vw0 vw0Var90 = new vw0(301, org.telegram.messenger.hd.M0(2131743948), "textSizeHeaderRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(4, g2Var));
        vw0Var90.a("tg://settings/appearance/text-size");
        vw0 vw0Var91 = new vw0(302, org.telegram.messenger.hd.M0(2131752538), org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(5, g2Var));
        vw0Var91.a("tg://settings/appearance/wallpapers");
        vw0 vw0Var92 = new vw0(303, org.telegram.messenger.hd.M0(2131745342), null, org.telegram.messenger.hd.M0(2131752198), org.telegram.messenger.hd.M0(2131752232), 2131232026, new wf0(6, g2Var));
        vw0 vw0Var93 = new vw0(304, org.telegram.messenger.hd.M0(2131745912), "resetRow", org.telegram.messenger.hd.M0(2131752198), org.telegram.messenger.hd.M0(2131752232), 2131232026, new wf0(8, g2Var));
        vw0 vw0Var94 = new vw0(306, org.telegram.messenger.hd.M0(2131751999), "themeHeaderRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(9, g2Var));
        vw0 vw0Var95 = new vw0(319, org.telegram.messenger.hd.M0(2131752866), null, org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(10, g2Var));
        vw0 vw0Var96 = new vw0(320, org.telegram.messenger.hd.M0(2131751700), "createNewThemeRow", org.telegram.messenger.hd.M0(2131752198), org.telegram.messenger.hd.M0(2131752866), 2131232026, new wf0(11, g2Var));
        vw0Var96.a("tg://settings/appearance/themes/create");
        vw0 vw0Var97 = new vw0(321, org.telegram.messenger.hd.M0(2131752828), "bubbleRadiusHeaderRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(13, g2Var));
        vw0Var97.a("tg://settings/appearance/message-corners");
        vw0 vw0Var98 = new vw0(322, org.telegram.messenger.hd.M0(2131752213), "chatListHeaderRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(14, g2Var));
        vw0 vw0Var99 = new vw0(323, org.telegram.messenger.hd.M0(2131752210), "swipeGestureHeaderRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(15, g2Var));
        vw0 vw0Var100 = new vw0(324, org.telegram.messenger.hd.M0(2131754237), "appIconHeaderRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(16, g2Var));
        vw0Var100.a("tg://settings/appearance/app-icon");
        vw0 vw0Var101 = new vw0(305, org.telegram.messenger.hd.M0(2131753781), org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(17, g2Var));
        vw0 vw0Var102 = new vw0(328, org.telegram.messenger.hd.M0(2131748056), "nextMediaTapRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(18, g2Var));
        vw0Var102.a("tg://settings/appearance/tap-for-next-media");
        vw0 vw0Var103 = new vw0(327, org.telegram.messenger.hd.M0(2131746231), "raiseToListenRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(20, g2Var));
        vw0Var103.a("tg://settings/data/raise-to-listen");
        vw0 vw0Var104 = new vw0(310, org.telegram.messenger.hd.M0(2131746229), "raiseToSpeakRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(21, g2Var));
        vw0Var104.a("tg://settings/data/raise-to-speak");
        vw0 vw0Var105 = new vw0(326, org.telegram.messenger.hd.M0(2131747238), "pauseOnMediaRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(22, g2Var));
        vw0Var105.a("tg://settings/data/pause-music");
        vw0 vw0Var106 = new vw0(325, org.telegram.messenger.hd.M0(2131748246), "bluetoothScoRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(24, g2Var));
        vw0 vw0Var107 = new vw0(308, org.telegram.messenger.hd.M0(2131751426), "directShareRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(25, g2Var));
        vw0 vw0Var108 = new vw0(311, org.telegram.messenger.hd.M0(2131745436), "sendByEnterRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(26, g2Var));
        vw0 vw0Var109 = new vw0(318, org.telegram.messenger.hd.M0(2131751355), "distanceRow", org.telegram.messenger.hd.M0(2131752198), 2131232026, new wf0(27, g2Var));
        vw0 vw0Var110 = new vw0(600, org.telegram.messenger.hd.M0(2131744614), 2131232040, new wf0(28, g2Var));
        vw0Var110.a("tg://settings/appearance/stickers-and-emoji");
        vw0 vw0Var111 = new vw0(601, org.telegram.messenger.hd.M0(2131744159), "suggestRow", org.telegram.messenger.hd.M0(2131744614), 2131232040, new wf0(29, g2Var));
        vw0 vw0Var112 = new vw0(602, org.telegram.messenger.hd.M0(2131750821), "featuredStickersHeaderRow", org.telegram.messenger.hd.M0(2131744614), 2131232040, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var113 = new vw0(603, org.telegram.messenger.hd.M0(2131748486), null, org.telegram.messenger.hd.M0(2131744614), 2131232040, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var114 = new vw0(604, org.telegram.messenger.hd.M0(2131754125), null, org.telegram.messenger.hd.M0(2131744614), 2131232040, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        vw0 vw0Var115 = new vw0(605, org.telegram.messenger.hd.M0(2131754130), null, org.telegram.messenger.hd.M0(2131744614), 2131232040, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var116 = new vw0(606, org.telegram.messenger.hd.M0(2131748841), "largeEmojiRow", org.telegram.messenger.hd.M0(2131744614), 2131232040, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        vw0 vw0Var117 = new vw0(607, org.telegram.messenger.hd.M0(2131748529), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748657), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var118 = new vw0(608, org.telegram.messenger.hd.M0(2131751184), null, org.telegram.messenger.hd.M0(2131744614), 2131231513, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        vw0 vw0Var119 = new vw0(609, org.telegram.messenger.hd.M0(2131744173), "suggestAnimatedEmojiRow", org.telegram.messenger.hd.M0(2131744614), org.telegram.messenger.hd.M0(2131751184), 2131231513, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        vw0 vw0Var120 = new vw0(610, org.telegram.messenger.hd.M0(2131750823), "featuredStickersHeaderRow", org.telegram.messenger.hd.M0(2131744614), org.telegram.messenger.hd.M0(2131751184), 2131231513, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var121 = new vw0(611, org.telegram.messenger.hd.M0(2131751338), null, org.telegram.messenger.hd.M0(2131744614), 2131232040, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        vw0 vw0Var122 = new vw0(700, org.telegram.messenger.hd.M0(2131750679), null, 2131232028, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var122.a("tg://settings/folders");
        vw0 vw0Var123 = new vw0(701, org.telegram.messenger.hd.M0(2131751704), "createFilterRow", org.telegram.messenger.hd.M0(2131750679), 2131232028, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            vw0Var5 = vw0Var123;
            vw0Var6 = vw0Var114;
            vw0Var7 = vw0Var116;
            vw0Var8 = vw0Var118;
            vw0Var9 = new vw0(800, org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            g2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            g2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            g2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            g2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            g2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            g2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            g2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            g2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f54510s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f52485f == 1) {
                                        z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                            return;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            return;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(st0Var);
                            return;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var5 = vw0Var123;
            vw0Var6 = vw0Var114;
            vw0Var7 = vw0Var116;
            vw0Var8 = vw0Var118;
            vw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            vw0Var10 = new vw0(801, org.telegram.messenger.hd.M0(2131746804), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            g2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            g2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            g2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            g2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            g2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            g2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            g2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            g2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f54510s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f52485f == 1) {
                                        z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                            return;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            return;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(st0Var);
                            return;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            vw0Var11 = new vw0(802, org.telegram.messenger.hd.M0(2131746813), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            g2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            g2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            g2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            g2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            g2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            g2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            g2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            g2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f54510s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f52485f == 1) {
                                        z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                            return;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            return;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(st0Var);
                            return;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            vw0Var12 = new vw0(803, org.telegram.messenger.hd.M0(2131746770), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.k10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                g2Var.presentFragment(new de0(i7));
                                return;
                            }
                            return;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            g2Var.presentFragment(new x6());
                            return;
                        case 24:
                            g2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new x6());
                            return;
                        case 27:
                            g2Var.presentFragment(new x6());
                            return;
                        case 28:
                            g2Var.presentFragment(new pt());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            vw0Var13 = new vw0(804, org.telegram.messenger.hd.M0(2131746818), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.k10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                g2Var.presentFragment(new de0(i7));
                                return;
                            }
                            return;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            g2Var.presentFragment(new x6());
                            return;
                        case 24:
                            g2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new x6());
                            return;
                        case 27:
                            g2Var.presentFragment(new x6());
                            return;
                        case 28:
                            g2Var.presentFragment(new pt());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            vw0Var14 = new vw0(805, org.telegram.messenger.hd.M0(2131746768), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.k10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                g2Var.presentFragment(new de0(i7));
                                return;
                            }
                            return;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            g2Var.presentFragment(new x6());
                            return;
                        case 24:
                            g2Var.presentFragment(new x6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new x6());
                            return;
                        case 27:
                            g2Var.presentFragment(new x6());
                            return;
                        case 28:
                            g2Var.presentFragment(new pt());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            vw0Var15 = new vw0(806, org.telegram.messenger.hd.M0(2131746798), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            g2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            g2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            g2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            g2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            vw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            vw0Var16 = new vw0(807, org.telegram.messenger.hd.M0(2131746789), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            g2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            g2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            g2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            g2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            g2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            vw0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            vw0Var17 = new vw0(808, org.telegram.messenger.hd.M0(2131746782), org.telegram.messenger.hd.M0(2131743988), 2131232364, new wf0(12, g2Var));
        } else {
            vw0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            vw0Var18 = new vw0(809, org.telegram.messenger.hd.M0(2131746831), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            z90 z90Var = new z90();
                            g2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
                            return;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            g2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            g2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            g2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            g2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            g2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            g2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            g2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            g2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            g2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            g2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            g2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            vw0Var19 = new vw0(810, org.telegram.messenger.hd.M0(2131746793), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            z90 z90Var = new z90();
                            g2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
                            return;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            g2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            g2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            g2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            g2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            g2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            g2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            g2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            g2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            g2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            g2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            g2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            vw0Var20 = new vw0(811, org.telegram.messenger.hd.M0(2131746828), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            z90 z90Var = new z90();
                            g2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
                            return;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            g2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            g2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            g2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            g2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            g2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            g2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            g2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            g2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            g2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            g2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            g2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            vw0Var21 = new vw0(812, org.telegram.messenger.hd.M0(2131746826), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            z90 z90Var = new z90();
                            g2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
                            return;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            g2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            g2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            g2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            g2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            g2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            g2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            g2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            g2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            g2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            g2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            g2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            vw0Var22 = new vw0(813, org.telegram.messenger.hd.M0(2131746810), org.telegram.messenger.hd.M0(2131743988), 2131232364, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            z90 z90Var = new z90();
                            g2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
                            return;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            g2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            g2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            g2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            g2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            g2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            g2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            g2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            g2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            g2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            g2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            g2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var22 = null;
        }
        vw0 vw0Var124 = new vw0(900, org.telegram.messenger.hd.M0(2131746872), null, 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var124.a("tg://settings/power-saving");
        vw0 vw0Var125 = new vw0(901, org.telegram.messenger.hd.M0(2131748657), org.telegram.messenger.hd.M0(2131746872), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var125.a("tg://settings/power-saving/stickers");
        vw0 vw0Var126 = new vw0(902, org.telegram.messenger.hd.M0(2131748669), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748657), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var127 = new vw0(903, org.telegram.messenger.hd.M0(2131748671), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748657), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var128 = new vw0(904, org.telegram.messenger.hd.M0(2131748662), org.telegram.messenger.hd.M0(2131746872), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var128.a("tg://settings/power-saving/emoji");
        vw0 vw0Var129 = new vw0(905, org.telegram.messenger.hd.M0(2131748669), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748662), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var130 = new vw0(906, org.telegram.messenger.hd.M0(2131748668), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748662), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var131 = new vw0(907, org.telegram.messenger.hd.M0(2131748671), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748662), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var132 = new vw0(908, org.telegram.messenger.hd.M0(2131748663), org.telegram.messenger.hd.M0(2131746872), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var132.a("tg://settings/power-saving/effects");
        vw0 vw0Var133 = new vw0(909, org.telegram.messenger.hd.M0(2131748666), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748663), 2131232020, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        z90 z90Var = new z90();
                        g2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
                        return;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        g2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        g2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        g2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        g2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        g2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        g2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        g2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        g2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        g2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        g2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        g2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var133.a("tg://settings/power-saving/background");
        vw0 vw0Var134 = new vw0(910, org.telegram.messenger.hd.M0(2131748654), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748663), 2131232020, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var135 = new vw0(911, org.telegram.messenger.hd.M0(2131748658), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748663), 2131232020, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (org.telegram.messenger.cz.o() >= 1) {
            vw0Var23 = new vw0(326, org.telegram.messenger.hd.M0(2131748665), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748663), 2131232020, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            g2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            g2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            g2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            g2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            g2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            g2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            g2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            g2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f54510s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f52485f == 1) {
                                        z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                            return;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            return;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(st0Var);
                            return;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var23 = null;
        }
        vw0 vw0Var136 = new vw0(912, org.telegram.messenger.hd.M0(2131748659), null, org.telegram.messenger.hd.M0(2131746872), org.telegram.messenger.hd.M0(2131748663), 2131232020, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var137 = new vw0(913, org.telegram.messenger.hd.M0(2131748664), org.telegram.messenger.hd.M0(2131746872), 2131232020, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var137.a("tg://settings/power-saving/call-animations");
        vw0 vw0Var138 = new vw0(214, org.telegram.messenger.hd.M0(2131748667), org.telegram.messenger.hd.M0(2131746872), 2131232020, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var138.a("tg://settings/power-saving/videos");
        vw0 vw0Var139 = new vw0(213, org.telegram.messenger.hd.M0(2131748670), org.telegram.messenger.hd.M0(2131746872), 2131232020, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var139.a("tg://settings/power-saving/gifs");
        vw0 vw0Var140 = new vw0(914, org.telegram.messenger.hd.M0(2131748653), org.telegram.messenger.hd.M0(2131746872), 2131232020, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var140.a("tg://settings/power-saving/transitions");
        vw0 vw0Var141 = new vw0(400, org.telegram.messenger.hd.M0(2131748861), 2131232031, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var141.a("tg://settings/language");
        vw0 vw0Var142 = new vw0(405, org.telegram.messenger.hd.M0(2131745131), org.telegram.messenger.hd.M0(2131748861), 2131232031, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.np.u1(currentAccount).V1().s()) {
            vw0 vw0Var143 = new vw0(406, org.telegram.messenger.hd.M0(2131751346), org.telegram.messenger.hd.M0(2131748861), 2131232031, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            g2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            g2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            g2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            g2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            g2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            g2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            g2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            g2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f54510s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f52485f == 1) {
                                        z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                            return;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            return;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(st0Var);
                            return;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            vw0Var143.a("tg://settings/language/do-not-translate");
            vw0Var44 = vw0Var143;
        }
        vw0 vw0Var144 = new vw0(402, org.telegram.messenger.hd.M0(2131753983), org.telegram.messenger.hd.M0(2131745283), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var144.a("tg://settings/ask-question");
        vw0 vw0Var145 = new vw0(403, org.telegram.messenger.hd.M0(2131743999), org.telegram.messenger.hd.M0(2131745283), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var145.a("tg://settings/faq");
        vw0 vw0Var146 = new vw0(404, org.telegram.messenger.hd.M0(2131746589), org.telegram.messenger.hd.M0(2131745283), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        g2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        g2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        g2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        g2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        g2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        g2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        g2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        g2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f54510s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f52485f == 1) {
                                    z90Var8.f54504b.e1(new ai.v1(z90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.c5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743997, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131746587, null));
                        return;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        return;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(st0Var);
                        return;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var146.a("tg://settings/privacy-policy");
        return new vw0[]{vw0Var24, vw0Var25, vw0Var26, vw0Var27, vw0Var28, vw0Var29, vw0Var30, vw0Var31, vw0Var32, vw0Var33, vw0Var34, vw0Var35, vw0Var36, vw0Var37, vw0Var38, vw0Var39, vw0Var40, vw0Var, vw0Var42, vw0Var43, vw0Var2, vw0Var45, vw0Var46, vw0Var47, vw0Var48, vw0Var49, vw0Var50, vw0Var51, vw0Var52, vw0Var53, vw0Var3, vw0Var4, vw0Var55, vw0Var56, vw0Var57, vw0Var58, vw0Var59, vw0Var60, vw0Var61, vw0Var62, vw0Var63, vw0Var64, vw0Var65, vw0Var66, vw0Var67, vw0Var68, vw0Var69, vw0Var70, vw0Var71, vw0Var72, vw0Var73, vw0Var74, vw0Var75, vw0Var76, vw0Var77, vw0Var78, vw0Var79, vw0Var80, vw0Var81, vw0Var82, vw0Var83, vw0Var84, vw0Var85, vw0Var86, vw0Var87, vw0Var88, vw0Var89, vw0Var90, vw0Var91, vw0Var92, vw0Var93, vw0Var94, vw0Var95, vw0Var96, vw0Var97, vw0Var98, vw0Var99, vw0Var100, vw0Var101, vw0Var102, vw0Var103, vw0Var104, vw0Var105, vw0Var106, vw0Var107, vw0Var108, vw0Var109, vw0Var110, vw0Var111, vw0Var112, vw0Var113, vw0Var6, vw0Var115, vw0Var7, vw0Var117, vw0Var8, vw0Var119, vw0Var120, vw0Var121, vw0Var122, vw0Var5, vw0Var9, vw0Var10, vw0Var11, vw0Var12, vw0Var13, vw0Var14, vw0Var15, vw0Var16, vw0Var17, vw0Var18, vw0Var19, vw0Var20, vw0Var21, vw0Var22, vw0Var124, vw0Var125, vw0Var126, vw0Var127, vw0Var128, vw0Var129, vw0Var130, vw0Var131, vw0Var132, vw0Var133, vw0Var134, vw0Var135, vw0Var23, vw0Var136, vw0Var137, vw0Var138, vw0Var139, vw0Var140, vw0Var141, vw0Var142, vw0Var44, vw0Var144, vw0Var145, vw0Var146};
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59169f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f53549w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f53550x) {
            f();
        }
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof vw0) {
                ((vw0) obj2).f52912g = i7;
            } else if (obj2 instanceof org.telegram.messenger.zo) {
                ((org.telegram.messenger.zo) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.np.g1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f53545f;
        TLRPC.WebPage webPage = org.telegram.messenger.np.u1(i7).f25964t2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.np.u1(i7).f25956s2);
        }
        if (this.F == null && !this.G) {
            this.G = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.hd.N0(2131743997, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWebPage, new l(this, 20));
        }
    }

    public final void I(String str) {
        this.E = str;
        if (this.f53551y != null) {
            Utilities.f22812g.a(this.f53551y);
            this.f53551y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f53550x = false;
            this.f53547r.clear();
            this.f53548s.clear();
            this.f53546n.clear();
            org.telegram.ui.ActionBar.g2 g2Var = this.f53544e;
            if (g2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) g2Var).P.f37994b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.f53544e).P.d.setText(org.telegram.messenger.hd.N0(2131745281, null));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22812g;
        tr0 tr0Var = new tr0(21, this, str);
        this.f53551y = tr0Var;
        q5Var.d(tr0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        vw0 vw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            vw0[] vw0VarArr = this.f53543c;
            if (i7 >= vw0VarArr.length) {
                break;
            }
            vw0 vw0Var2 = vw0VarArr[i7];
            if (vw0Var2 != null) {
                hashMap.put(Integer.valueOf(vw0Var2.f52911f), this.f53543c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.np.g1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f53549w;
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(str));
                    int readInt32 = serializedData.readInt32(false);
                    int readInt322 = serializedData.readInt32(false);
                    if (readInt322 == 0) {
                        String readString = serializedData.readString(false);
                        int readInt323 = serializedData.readInt32(false);
                        if (readInt323 > 0) {
                            strArr = new String[readInt323];
                            for (int i10 = 0; i10 < readInt323; i10++) {
                                strArr[i10] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        org.telegram.messenger.zo zoVar = new org.telegram.messenger.zo(readString, strArr, serializedData.readString(false));
                        zoVar.d = readInt32;
                        arrayList.add(zoVar);
                    } else if (readInt322 == 1 && (vw0Var = (vw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        vw0Var.f52912g = readInt32;
                        arrayList.add(vw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new qw0(this));
    }

    @Override
    public final int b() {
        int size;
        int i7 = 0;
        if (this.f53550x) {
            int size2 = this.f53547r.size();
            if (!this.f53548s.isEmpty()) {
                i7 = this.f53548s.size() + 1;
            }
            return size2 + i7;
        }
        ArrayList arrayList = this.f53549w;
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            size = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.d;
        if (!arrayList2.isEmpty()) {
            i7 = arrayList2.size() + 1;
        }
        return size + i7;
    }

    @Override
    public final int d(int i7) {
        if (this.f53550x) {
            if (i7 < this.f53547r.size() || i7 != this.f53547r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f53549w;
            if (i7 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i7 != arrayList.size() + 1) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11 = f1Var.f59169f;
        View view = f1Var.f59165a;
        vw0 vw0Var = null;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.hd.N0(2131745273, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.hd.N0(2131745286, null));
            return;
        }
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        boolean z11 = false;
        if (this.f53550x) {
            if (i7 < this.f53547r.size()) {
                vw0 vw0Var2 = (vw0) this.f53547r.get(i7);
                if (i7 > 0) {
                    vw0Var = (vw0) this.f53547r.get(i7 - 1);
                }
                if (vw0Var != null && vw0Var.f52910e == vw0Var2.f52910e) {
                    i10 = 0;
                } else {
                    i10 = vw0Var2.f52910e;
                }
                CharSequence charSequence = (CharSequence) this.f53546n.get(i7);
                String[] strArr = vw0Var2.d;
                if (i7 >= this.f53547r.size() - 1) {
                    z10 = false;
                }
                w6Var.b(charSequence, strArr, i10, z10);
                return;
            }
            int f10 = i5.c.f(1, i7, this.f53547r);
            CharSequence charSequence2 = (CharSequence) this.f53546n.get(this.f53547r.size() + f10);
            String[] strArr2 = ((org.telegram.messenger.zo) this.f53548s.get(f10)).f28366b;
            if (f10 < this.f53547r.size() - 1) {
                z11 = true;
            }
            w6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.f53549w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 < arrayList.size()) {
            Object obj = arrayList.get(i7);
            if (obj instanceof vw0) {
                vw0 vw0Var3 = (vw0) obj;
                String str = vw0Var3.f52907a;
                String[] strArr3 = vw0Var3.d;
                if (i7 >= arrayList.size() - 1) {
                    z10 = false;
                }
                w6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof org.telegram.messenger.zo) {
                org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) obj;
                String str2 = zoVar.f28365a;
                String[] strArr4 = zoVar.f28366b;
                if (i7 < arrayList.size() - 1) {
                    z11 = true;
                }
                w6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int f11 = i5.c.f(1, i7, arrayList);
        org.telegram.messenger.zo zoVar2 = (org.telegram.messenger.zo) this.d.get(f11);
        String str3 = zoVar2.f28365a;
        String[] strArr5 = zoVar2.f28366b;
        if (f11 < arrayList.size() - 1) {
            z11 = true;
        }
        w6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View w6Var;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                w6Var = new org.telegram.ui.Cells.o4(context, 16);
            } else {
                w6Var = new org.telegram.ui.Cells.y3(context, null);
            }
        } else {
            w6Var = new org.telegram.ui.Cells.w6(context);
        }
        w6Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(w6Var);
    }
}
