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
public class uw0 extends org.telegram.ui.Components.dk0 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public tw0[] f52742c;
    public final org.telegram.ui.ActionBar.g2 f52743e;
    public final int f52744f;
    public final Context h;
    public boolean f52749x;
    public mp0 f52750y;
    public final ArrayList d = new ArrayList();
    public ArrayList f52745n = new ArrayList();
    public ArrayList f52746r = new ArrayList();
    public ArrayList f52747s = new ArrayList();
    public final ArrayList f52748w = new ArrayList();

    public uw0(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f52743e = g2Var;
        this.f52744f = g2Var.getCurrentAccount();
        this.h = context;
        this.f52742c = H(g2Var);
        J();
    }

    public static boolean F(int i7, int i10) {
        if (org.telegram.messenger.mp.u1(i7).K3() && !org.telegram.messenger.i10.i(i7).q()) {
            return false;
        }
        if (i10 != -1 && org.telegram.messenger.mp.u1(i7).O0.get(i10, -1) == -1) {
            return false;
        }
        return true;
    }

    public static tw0[] H(final org.telegram.ui.ActionBar.g2 g2Var) {
        tw0 tw0Var;
        tw0 tw0Var2;
        tw0 tw0Var3;
        tw0 tw0Var4;
        tw0 tw0Var5;
        tw0 tw0Var6;
        tw0 tw0Var7;
        tw0 tw0Var8;
        tw0 tw0Var9;
        tw0 tw0Var10;
        tw0 tw0Var11;
        tw0 tw0Var12;
        tw0 tw0Var13;
        tw0 tw0Var14;
        tw0 tw0Var15;
        tw0 tw0Var16;
        tw0 tw0Var17;
        tw0 tw0Var18;
        tw0 tw0Var19;
        tw0 tw0Var20;
        tw0 tw0Var21;
        tw0 tw0Var22;
        tw0 tw0Var23;
        final int currentAccount = g2Var.getCurrentAccount();
        tw0 tw0Var24 = new tw0(500, org.telegram.messenger.gd.M0(2131751252), 0, new mp0(24, g2Var, g2Var.getResourceProvider()));
        tw0 tw0Var25 = new tw0(501, org.telegram.messenger.gd.M0(2131752525), 0, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var25.a("tg://settings/edit/change-number");
        tw0 tw0Var26 = new tw0(502, org.telegram.messenger.gd.M0(2131754465), 0, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var26.a("tg://settings/edit/add-account");
        tw0 tw0Var27 = new tw0(1, org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var27.a("tg://settings/notifications");
        tw0 tw0Var28 = new tw0(2, org.telegram.messenger.gd.M0(2131747684), org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var28.a("tg://settings/notifications/private-chats");
        tw0 tw0Var29 = new tw0(3, org.telegram.messenger.gd.M0(2131747713), org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
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
        tw0Var29.a("tg://settings/notifications/groups");
        tw0 tw0Var30 = new tw0(4, org.telegram.messenger.gd.M0(2131747727), org.telegram.messenger.gd.M0(2131747728), 2131232267, new vf0(7, g2Var));
        tw0Var30.a("tg://settings/notifications/channels");
        tw0 tw0Var31 = new tw0(5, org.telegram.messenger.gd.M0(2131743029), "callsSectionRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new vf0(19, g2Var));
        tw0 tw0Var32 = new tw0(6, org.telegram.messenger.gd.M0(2131753730), "badgeNumberSection", org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var33 = new tw0(7, org.telegram.messenger.gd.M0(2131749026), "inappSectionRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var34 = new tw0(8, org.telegram.messenger.gd.M0(2131751778), "contactJoinedRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new vf0(23, g2Var));
        tw0Var34.a("tg://settings/notifications/new-contacts");
        tw0 tw0Var35 = new tw0(9, org.telegram.messenger.gd.M0(2131747034), "pinnedMessageRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var35.a("tg://settings/notifications/pinned-messages");
        tw0 tw0Var36 = new tw0(10, org.telegram.messenger.gd.M0(2131745916), "resetNotificationsRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var36.a("tg://settings/notifications/reset");
        tw0 tw0Var37 = new tw0(11, org.telegram.messenger.gd.M0(2131747682), "notificationsServiceRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0 tw0Var38 = new tw0(12, org.telegram.messenger.gd.M0(2131747681), "notificationsServiceConnectionRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0 tw0Var39 = new tw0(13, org.telegram.messenger.gd.M0(2131746079), "repeatRow", org.telegram.messenger.gd.M0(2131747728), 2131232267, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0 tw0Var40 = new tw0(100, org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var40.a("tg://settings/privacy");
        tw0 tw0Var41 = new tw0(109, org.telegram.messenger.gd.M0(2131743691), org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var41.a("tg://settings/privacy/2sv");
        tw0 tw0Var42 = new tw0(124, org.telegram.messenger.gd.M0(2131753847), org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.i10.i(i10).f24660q0 >= 0) {
                            g2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.i10.i(i10).q()) {
                            org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(g2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(b02.X(), null);
                            nbVar.d(2131624347, new String[0]);
                            String N0 = org.telegram.messenger.gd.N0(2131746561, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            int indexOf = N0.indexOf(42);
                            int lastIndexOf = N0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) N0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.cb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            nbVar.f37752b.setText(spannableStringBuilder);
                            nbVar.f37752b.setSingleLine(false);
                            nbVar.f37752b.setMaxLines(2);
                            b02.b(nbVar, 2750).j();
                            return;
                        }
                        g2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        tw0Var42.a("tg://settings/privacy/auto-delete");
        tw0 tw0Var43 = new tw0(108, org.telegram.messenger.gd.M0(2131747463), org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var43.a("tg://settings/privacy/passcode");
        tw0 tw0Var44 = null;
        if (org.telegram.messenger.bz.f23304m1) {
            tw0Var = tw0Var41;
            tw0Var2 = new tw0(125, org.telegram.messenger.gd.M0(2131751190), "emailLoginRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f54325s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f52316f == 1) {
                                        y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
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
            tw0Var2.a("tg://settings/privacy/login-email");
        } else {
            tw0Var = tw0Var41;
            tw0Var2 = null;
        }
        tw0 tw0Var45 = new tw0(101, org.telegram.messenger.gd.M0(2131753678), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var45.a("tg://settings/privacy/blocked");
        tw0 tw0Var46 = new tw0(110, org.telegram.messenger.gd.M0(2131745355), 2131232040, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var46.a("tg://settings/devices");
        tw0 tw0Var47 = new tw0(105, org.telegram.messenger.gd.M0(2131746596), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var47.a("tg://settings/privacy/phone-number/");
        tw0 tw0Var48 = new tw0(102, org.telegram.messenger.gd.M0(2131746621), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var48.a("tg://settings/privacy/last-seen");
        tw0 tw0Var49 = new tw0(103, org.telegram.messenger.gd.M0(2131746583), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var49.a("tg://settings/privacy/profile-photos");
        tw0 tw0Var50 = new tw0(104, org.telegram.messenger.gd.M0(2131746643), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var50.a("tg://settings/privacy/forwards");
        tw0 tw0Var51 = new tw0(122, org.telegram.messenger.gd.M0(2131746606), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var51.a("tg://settings/privacy/calls/p2p");
        tw0 tw0Var52 = new tw0(106, org.telegram.messenger.gd.M0(2131752584), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var52.a("tg://settings/privacy/calls");
        tw0 tw0Var53 = new tw0(107, org.telegram.messenger.gd.M0(2131746623), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var53.a("tg://settings/privacy/invites");
        tw0 tw0Var54 = new tw0(123, org.telegram.messenger.gd.M0(2131746564), org.telegram.messenger.gd.M0(2131746577), 2131232360, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.i10.i(i10).f24660q0 >= 0) {
                            g2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.i10.i(i10).q()) {
                            org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(g2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(b02.X(), null);
                            nbVar.d(2131624347, new String[0]);
                            String N0 = org.telegram.messenger.gd.N0(2131746561, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            int indexOf = N0.indexOf(42);
                            int lastIndexOf = N0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) N0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.cb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            nbVar.f37752b.setText(spannableStringBuilder);
                            nbVar.f37752b.setSingleLine(false);
                            nbVar.f37752b.setMaxLines(2);
                            b02.b(nbVar, 2750).j();
                            return;
                        }
                        g2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        tw0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.mp.u1(currentAccount).f25703b4) {
            tw0Var3 = tw0Var54;
            tw0Var4 = new tw0(121, org.telegram.messenger.gd.M0(2131754168), "newChatsRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                    if (org.telegram.messenger.i10.i(i7).p()) {
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
                            g2Var.presentFragment(new y6());
                            return;
                        case 24:
                            g2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new y6());
                            return;
                        case 27:
                            g2Var.presentFragment(new y6());
                            return;
                        case 28:
                            g2Var.presentFragment(new ot());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            tw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            tw0Var3 = tw0Var54;
            tw0Var4 = null;
        }
        tw0 tw0Var55 = new tw0(112, org.telegram.messenger.gd.M0(2131751584), "deleteAccountRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var55.a("tg://settings/privacy/self-destruct");
        tw0 tw0Var56 = new tw0(113, org.telegram.messenger.gd.M0(2131746603), "paymentsClearRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        tw0 tw0Var57 = new tw0(114, org.telegram.messenger.gd.M0(2131742640), org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var57.a("tg://settings/privacy/active-websites");
        tw0 tw0Var58 = new tw0(115, org.telegram.messenger.gd.M0(2131744051), "contactsDeleteRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        tw0 tw0Var59 = new tw0(116, org.telegram.messenger.gd.M0(2131744053), "contactsSyncRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        tw0 tw0Var60 = new tw0(117, org.telegram.messenger.gd.M0(2131744167), "contactsSuggestRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        tw0 tw0Var61 = new tw0(118, org.telegram.messenger.gd.M0(2131748496), "secretMapRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var61.a("tg://settings/privacy/data-settings/map-provider");
        tw0 tw0Var62 = new tw0(119, org.telegram.messenger.gd.M0(2131745488), "secretWebpageRow", org.telegram.messenger.gd.M0(2131746577), 2131232040, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var62.a("tg://settings/privacy/data-settings/link-previews");
        tw0 tw0Var63 = new tw0(120, org.telegram.messenger.gd.M0(2131751443), 2131232028, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var63.a("tg://settings/devices");
        tw0 tw0Var64 = new tw0(121, org.telegram.messenger.gd.M0(2131743963), "terminateAllSessionsRow", org.telegram.messenger.gd.M0(2131751443), 2131232028, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var64.a("tg://settings/devices/terminate-sessions");
        tw0 tw0Var65 = new tw0(122, org.telegram.messenger.gd.M0(2131748724), org.telegram.messenger.gd.M0(2131751443), 2131232028, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var65.a("tg://settings/devices/link-desktop");
        tw0 tw0Var66 = new tw0(200, org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var66.a("tg://settings/privacy/data-settings");
        tw0 tw0Var67 = new tw0(201, org.telegram.messenger.gd.M0(2131751664), "usageSectionRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0 tw0Var68 = new tw0(202, org.telegram.messenger.gd.M0(2131744575), org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var68.a("tg://settings/data/storage");
        tw0 tw0Var69 = new tw0(203, org.telegram.messenger.gd.M0(2131748867), "keepMediaRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131744575), 2131232027, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0 tw0Var70 = new tw0(204, org.telegram.messenger.gd.M0(2131752063), "cacheRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131744575), 2131232027, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0 tw0Var71 = new tw0(205, org.telegram.messenger.gd.M0(2131748581), "databaseRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131744575), 2131232027, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0 tw0Var72 = new tw0(206, org.telegram.messenger.gd.M0(2131748105), org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
                                if (org.telegram.messenger.i10.i(i7).p()) {
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
                        g2Var.presentFragment(new y6());
                        return;
                    case 24:
                        g2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        g2Var.presentFragment(new y6());
                        return;
                    case 27:
                        g2Var.presentFragment(new y6());
                        return;
                    case 28:
                        g2Var.presentFragment(new ot());
                        return;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        tw0Var72.a("tg://settings/data/usage");
        tw0 tw0Var73 = new tw0(207, org.telegram.messenger.gd.M0(2131753764), "mediaDownloadSectionRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var74 = new tw0(208, org.telegram.messenger.gd.M0(2131742613), org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var75 = new tw0(209, org.telegram.messenger.gd.M0(2131742615), org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var76 = new tw0(210, org.telegram.messenger.gd.M0(2131742614), org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var77 = new tw0(211, org.telegram.messenger.gd.M0(2131745915), "resetDownloadRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0Var77.a("tg://settings/data/auto-download/reset");
        tw0 tw0Var78 = new tw0(215, org.telegram.messenger.gd.M0(2131744193), "streamSectionRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var79 = new tw0(216, org.telegram.messenger.gd.M0(2131751132), "enableStreamRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var80 = new tw0(217, org.telegram.messenger.gd.M0(2131752584), "callsSectionRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var81 = new tw0(218, org.telegram.messenger.gd.M0(2131742979), "useLessDataForCallsRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0Var81.a("tg://settings/data/use-less-data");
        tw0 tw0Var82 = new tw0(219, org.telegram.messenger.gd.M0(2131743008), "quickRepliesRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var83 = new tw0(220, org.telegram.messenger.gd.M0(2131746405), org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0Var83.a("tg://settings/data/proxy");
        tw0 tw0Var84 = new tw0(111, org.telegram.messenger.gd.M0(2131746647), "clearDraftsRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        tw0 tw0Var85 = new tw0(222, org.telegram.messenger.gd.M0(2131745733), "saveToGallerySectionRow", org.telegram.messenger.gd.M0(2131751665), 2131232027, new Runnable() {
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
        tw0 tw0Var86 = new tw0(223, org.telegram.messenger.gd.M0(2131745723), "saveToGalleryPeerRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131745733), 2131232027, new Runnable() {
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
        tw0Var86.a("tg://settings/data/save-to-photos/chats");
        tw0 tw0Var87 = new tw0(224, org.telegram.messenger.gd.M0(2131745730), "saveToGalleryGroupsRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131745733), 2131232027, new Runnable() {
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
        tw0Var87.a("tg://settings/data/save-to-photos/groups");
        tw0 tw0Var88 = new tw0(225, org.telegram.messenger.gd.M0(2131745732), "saveToGalleryChannelsRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131745733), 2131232027, new vf0(2, g2Var));
        tw0Var88.a("tg://settings/data/save-to-photos/channels");
        tw0 tw0Var89 = new tw0(300, org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(3, g2Var));
        tw0Var89.a("tg://settings/appearance/themes");
        tw0 tw0Var90 = new tw0(301, org.telegram.messenger.gd.M0(2131743946), "textSizeHeaderRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(4, g2Var));
        tw0Var90.a("tg://settings/appearance/text-size");
        tw0 tw0Var91 = new tw0(302, org.telegram.messenger.gd.M0(2131752538), org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(5, g2Var));
        tw0Var91.a("tg://settings/appearance/wallpapers");
        tw0 tw0Var92 = new tw0(303, org.telegram.messenger.gd.M0(2131745342), null, org.telegram.messenger.gd.M0(2131752198), org.telegram.messenger.gd.M0(2131752232), 2131232029, new vf0(6, g2Var));
        tw0 tw0Var93 = new tw0(304, org.telegram.messenger.gd.M0(2131745912), "resetRow", org.telegram.messenger.gd.M0(2131752198), org.telegram.messenger.gd.M0(2131752232), 2131232029, new vf0(8, g2Var));
        tw0 tw0Var94 = new tw0(306, org.telegram.messenger.gd.M0(2131751999), "themeHeaderRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(9, g2Var));
        tw0 tw0Var95 = new tw0(319, org.telegram.messenger.gd.M0(2131752866), null, org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(10, g2Var));
        tw0 tw0Var96 = new tw0(320, org.telegram.messenger.gd.M0(2131751700), "createNewThemeRow", org.telegram.messenger.gd.M0(2131752198), org.telegram.messenger.gd.M0(2131752866), 2131232029, new vf0(11, g2Var));
        tw0Var96.a("tg://settings/appearance/themes/create");
        tw0 tw0Var97 = new tw0(321, org.telegram.messenger.gd.M0(2131752828), "bubbleRadiusHeaderRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(13, g2Var));
        tw0Var97.a("tg://settings/appearance/message-corners");
        tw0 tw0Var98 = new tw0(322, org.telegram.messenger.gd.M0(2131752213), "chatListHeaderRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(14, g2Var));
        tw0 tw0Var99 = new tw0(323, org.telegram.messenger.gd.M0(2131752210), "swipeGestureHeaderRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(15, g2Var));
        tw0 tw0Var100 = new tw0(324, org.telegram.messenger.gd.M0(2131754237), "appIconHeaderRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(16, g2Var));
        tw0Var100.a("tg://settings/appearance/app-icon");
        tw0 tw0Var101 = new tw0(305, org.telegram.messenger.gd.M0(2131753781), org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(17, g2Var));
        tw0 tw0Var102 = new tw0(328, org.telegram.messenger.gd.M0(2131748056), "nextMediaTapRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(18, g2Var));
        tw0Var102.a("tg://settings/appearance/tap-for-next-media");
        tw0 tw0Var103 = new tw0(327, org.telegram.messenger.gd.M0(2131746231), "raiseToListenRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(20, g2Var));
        tw0Var103.a("tg://settings/data/raise-to-listen");
        tw0 tw0Var104 = new tw0(310, org.telegram.messenger.gd.M0(2131746229), "raiseToSpeakRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(21, g2Var));
        tw0Var104.a("tg://settings/data/raise-to-speak");
        tw0 tw0Var105 = new tw0(326, org.telegram.messenger.gd.M0(2131747238), "pauseOnMediaRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(22, g2Var));
        tw0Var105.a("tg://settings/data/pause-music");
        tw0 tw0Var106 = new tw0(325, org.telegram.messenger.gd.M0(2131748246), "bluetoothScoRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(24, g2Var));
        tw0 tw0Var107 = new tw0(308, org.telegram.messenger.gd.M0(2131751426), "directShareRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(25, g2Var));
        tw0 tw0Var108 = new tw0(311, org.telegram.messenger.gd.M0(2131745436), "sendByEnterRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(26, g2Var));
        tw0 tw0Var109 = new tw0(318, org.telegram.messenger.gd.M0(2131751355), "distanceRow", org.telegram.messenger.gd.M0(2131752198), 2131232029, new vf0(27, g2Var));
        tw0 tw0Var110 = new tw0(600, org.telegram.messenger.gd.M0(2131744616), 2131232043, new vf0(28, g2Var));
        tw0Var110.a("tg://settings/appearance/stickers-and-emoji");
        tw0 tw0Var111 = new tw0(601, org.telegram.messenger.gd.M0(2131744157), "suggestRow", org.telegram.messenger.gd.M0(2131744616), 2131232043, new vf0(29, g2Var));
        tw0 tw0Var112 = new tw0(602, org.telegram.messenger.gd.M0(2131750821), "featuredStickersHeaderRow", org.telegram.messenger.gd.M0(2131744616), 2131232043, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var113 = new tw0(603, org.telegram.messenger.gd.M0(2131748486), null, org.telegram.messenger.gd.M0(2131744616), 2131232043, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var114 = new tw0(604, org.telegram.messenger.gd.M0(2131754125), null, org.telegram.messenger.gd.M0(2131744616), 2131232043, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        tw0 tw0Var115 = new tw0(605, org.telegram.messenger.gd.M0(2131754130), null, org.telegram.messenger.gd.M0(2131744616), 2131232043, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var116 = new tw0(606, org.telegram.messenger.gd.M0(2131748841), "largeEmojiRow", org.telegram.messenger.gd.M0(2131744616), 2131232043, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        tw0 tw0Var117 = new tw0(607, org.telegram.messenger.gd.M0(2131748529), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748657), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var118 = new tw0(608, org.telegram.messenger.gd.M0(2131751184), null, org.telegram.messenger.gd.M0(2131744616), 2131231516, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        tw0 tw0Var119 = new tw0(609, org.telegram.messenger.gd.M0(2131744171), "suggestAnimatedEmojiRow", org.telegram.messenger.gd.M0(2131744616), org.telegram.messenger.gd.M0(2131751184), 2131231516, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        tw0 tw0Var120 = new tw0(610, org.telegram.messenger.gd.M0(2131750823), "featuredStickersHeaderRow", org.telegram.messenger.gd.M0(2131744616), org.telegram.messenger.gd.M0(2131751184), 2131231516, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var121 = new tw0(611, org.telegram.messenger.gd.M0(2131751338), null, org.telegram.messenger.gd.M0(2131744616), 2131232043, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        tw0 tw0Var122 = new tw0(700, org.telegram.messenger.gd.M0(2131750679), null, 2131232031, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var122.a("tg://settings/folders");
        tw0 tw0Var123 = new tw0(701, org.telegram.messenger.gd.M0(2131751704), "createFilterRow", org.telegram.messenger.gd.M0(2131750679), 2131232031, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            tw0Var5 = tw0Var123;
            tw0Var6 = tw0Var114;
            tw0Var7 = tw0Var116;
            tw0Var8 = tw0Var118;
            tw0Var9 = new tw0(800, org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f54325s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f52316f == 1) {
                                        y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
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
            tw0Var5 = tw0Var123;
            tw0Var6 = tw0Var114;
            tw0Var7 = tw0Var116;
            tw0Var8 = tw0Var118;
            tw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            tw0Var10 = new tw0(801, org.telegram.messenger.gd.M0(2131746804), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f54325s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f52316f == 1) {
                                        y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
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
            tw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            tw0Var11 = new tw0(802, org.telegram.messenger.gd.M0(2131746813), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f54325s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f52316f == 1) {
                                        y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
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
            tw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            tw0Var12 = new tw0(803, org.telegram.messenger.gd.M0(2131746770), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                                    if (org.telegram.messenger.i10.i(i7).p()) {
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
                            g2Var.presentFragment(new y6());
                            return;
                        case 24:
                            g2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new y6());
                            return;
                        case 27:
                            g2Var.presentFragment(new y6());
                            return;
                        case 28:
                            g2Var.presentFragment(new ot());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            tw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            tw0Var13 = new tw0(804, org.telegram.messenger.gd.M0(2131746818), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                                    if (org.telegram.messenger.i10.i(i7).p()) {
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
                            g2Var.presentFragment(new y6());
                            return;
                        case 24:
                            g2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new y6());
                            return;
                        case 27:
                            g2Var.presentFragment(new y6());
                            return;
                        case 28:
                            g2Var.presentFragment(new ot());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            tw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            tw0Var14 = new tw0(805, org.telegram.messenger.gd.M0(2131746768), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                                    if (org.telegram.messenger.i10.i(i7).p()) {
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
                            g2Var.presentFragment(new y6());
                            return;
                        case 24:
                            g2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            g2Var.presentFragment(new y6());
                            return;
                        case 27:
                            g2Var.presentFragment(new y6());
                            return;
                        case 28:
                            g2Var.presentFragment(new ot());
                            return;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            tw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            tw0Var15 = new tw0(806, org.telegram.messenger.gd.M0(2131746798), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
            tw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            tw0Var16 = new tw0(807, org.telegram.messenger.gd.M0(2131746789), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
            tw0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            tw0Var17 = new tw0(808, org.telegram.messenger.gd.M0(2131746782), org.telegram.messenger.gd.M0(2131743986), 2131232367, new vf0(12, g2Var));
        } else {
            tw0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            tw0Var18 = new tw0(809, org.telegram.messenger.gd.M0(2131746831), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
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
                            g2Var.presentFragment(new cy0());
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
                            g2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            tw0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            tw0Var19 = new tw0(810, org.telegram.messenger.gd.M0(2131746793), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
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
                            g2Var.presentFragment(new cy0());
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
                            g2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            tw0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            tw0Var20 = new tw0(811, org.telegram.messenger.gd.M0(2131746828), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
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
                            g2Var.presentFragment(new cy0());
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
                            g2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            tw0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            tw0Var21 = new tw0(812, org.telegram.messenger.gd.M0(2131746826), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
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
                            g2Var.presentFragment(new cy0());
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
                            g2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            tw0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            tw0Var22 = new tw0(813, org.telegram.messenger.gd.M0(2131746810), org.telegram.messenger.gd.M0(2131743986), 2131232367, new Runnable() {
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
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
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
                            g2Var.presentFragment(new cy0());
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
                            g2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            tw0Var22 = null;
        }
        tw0 tw0Var124 = new tw0(900, org.telegram.messenger.gd.M0(2131746872), null, 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var124.a("tg://settings/power-saving");
        tw0 tw0Var125 = new tw0(901, org.telegram.messenger.gd.M0(2131748657), org.telegram.messenger.gd.M0(2131746872), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var125.a("tg://settings/power-saving/stickers");
        tw0 tw0Var126 = new tw0(902, org.telegram.messenger.gd.M0(2131748669), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748657), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var127 = new tw0(903, org.telegram.messenger.gd.M0(2131748671), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748657), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var128 = new tw0(904, org.telegram.messenger.gd.M0(2131748662), org.telegram.messenger.gd.M0(2131746872), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var128.a("tg://settings/power-saving/emoji");
        tw0 tw0Var129 = new tw0(905, org.telegram.messenger.gd.M0(2131748669), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748662), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var130 = new tw0(906, org.telegram.messenger.gd.M0(2131748668), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748662), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var131 = new tw0(907, org.telegram.messenger.gd.M0(2131748671), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748662), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0 tw0Var132 = new tw0(908, org.telegram.messenger.gd.M0(2131748663), org.telegram.messenger.gd.M0(2131746872), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var132.a("tg://settings/power-saving/effects");
        tw0 tw0Var133 = new tw0(909, org.telegram.messenger.gd.M0(2131748666), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), 2131232023, new Runnable() {
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
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
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
                        g2Var.presentFragment(new cy0());
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
                        g2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        tw0Var133.a("tg://settings/power-saving/background");
        tw0 tw0Var134 = new tw0(910, org.telegram.messenger.gd.M0(2131748654), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), 2131232023, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0 tw0Var135 = new tw0(911, org.telegram.messenger.gd.M0(2131748658), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), 2131232023, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        if (org.telegram.messenger.bz.o() >= 1) {
            tw0Var23 = new tw0(326, org.telegram.messenger.gd.M0(2131748665), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), 2131232023, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f54325s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f52316f == 1) {
                                        y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
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
            tw0Var23 = null;
        }
        tw0 tw0Var136 = new tw0(912, org.telegram.messenger.gd.M0(2131748659), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), 2131232023, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0 tw0Var137 = new tw0(913, org.telegram.messenger.gd.M0(2131748664), org.telegram.messenger.gd.M0(2131746872), 2131232023, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var137.a("tg://settings/power-saving/call-animations");
        tw0 tw0Var138 = new tw0(214, org.telegram.messenger.gd.M0(2131748667), org.telegram.messenger.gd.M0(2131746872), 2131232023, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var138.a("tg://settings/power-saving/videos");
        tw0 tw0Var139 = new tw0(213, org.telegram.messenger.gd.M0(2131748670), org.telegram.messenger.gd.M0(2131746872), 2131232023, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var139.a("tg://settings/power-saving/gifs");
        tw0 tw0Var140 = new tw0(914, org.telegram.messenger.gd.M0(2131748653), org.telegram.messenger.gd.M0(2131746872), 2131232023, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var140.a("tg://settings/power-saving/transitions");
        tw0 tw0Var141 = new tw0(400, org.telegram.messenger.gd.M0(2131748861), 2131232034, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var141.a("tg://settings/language");
        tw0 tw0Var142 = new tw0(405, org.telegram.messenger.gd.M0(2131745131), org.telegram.messenger.gd.M0(2131748861), 2131232034, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.mp.u1(currentAccount).V1().s()) {
            tw0 tw0Var143 = new tw0(406, org.telegram.messenger.gd.M0(2131751346), org.telegram.messenger.gd.M0(2131748861), 2131232034, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f54325s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f52316f == 1) {
                                        y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            return;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            return;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
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
            tw0Var143.a("tg://settings/language/do-not-translate");
            tw0Var44 = tw0Var143;
        }
        tw0 tw0Var144 = new tw0(402, org.telegram.messenger.gd.M0(2131753983), org.telegram.messenger.gd.M0(2131745283), 2131232033, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var144.a("tg://settings/ask-question");
        tw0 tw0Var145 = new tw0(403, org.telegram.messenger.gd.M0(2131743997), org.telegram.messenger.gd.M0(2131745283), 2131232033, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var145.a("tg://settings/faq");
        tw0 tw0Var146 = new tw0(404, org.telegram.messenger.gd.M0(2131746589), org.telegram.messenger.gd.M0(2131745283), 2131232033, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f54325s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f52316f == 1) {
                                    y90Var8.f54319b.e1(new ai.n1(y90Var8, i10, 14), 700, true);
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
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        return;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        return;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
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
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
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
        tw0Var146.a("tg://settings/privacy-policy");
        return new tw0[]{tw0Var24, tw0Var25, tw0Var26, tw0Var27, tw0Var28, tw0Var29, tw0Var30, tw0Var31, tw0Var32, tw0Var33, tw0Var34, tw0Var35, tw0Var36, tw0Var37, tw0Var38, tw0Var39, tw0Var40, tw0Var, tw0Var42, tw0Var43, tw0Var2, tw0Var45, tw0Var46, tw0Var47, tw0Var48, tw0Var49, tw0Var50, tw0Var51, tw0Var52, tw0Var53, tw0Var3, tw0Var4, tw0Var55, tw0Var56, tw0Var57, tw0Var58, tw0Var59, tw0Var60, tw0Var61, tw0Var62, tw0Var63, tw0Var64, tw0Var65, tw0Var66, tw0Var67, tw0Var68, tw0Var69, tw0Var70, tw0Var71, tw0Var72, tw0Var73, tw0Var74, tw0Var75, tw0Var76, tw0Var77, tw0Var78, tw0Var79, tw0Var80, tw0Var81, tw0Var82, tw0Var83, tw0Var84, tw0Var85, tw0Var86, tw0Var87, tw0Var88, tw0Var89, tw0Var90, tw0Var91, tw0Var92, tw0Var93, tw0Var94, tw0Var95, tw0Var96, tw0Var97, tw0Var98, tw0Var99, tw0Var100, tw0Var101, tw0Var102, tw0Var103, tw0Var104, tw0Var105, tw0Var106, tw0Var107, tw0Var108, tw0Var109, tw0Var110, tw0Var111, tw0Var112, tw0Var113, tw0Var6, tw0Var115, tw0Var7, tw0Var117, tw0Var8, tw0Var119, tw0Var120, tw0Var121, tw0Var122, tw0Var5, tw0Var9, tw0Var10, tw0Var11, tw0Var12, tw0Var13, tw0Var14, tw0Var15, tw0Var16, tw0Var17, tw0Var18, tw0Var19, tw0Var20, tw0Var21, tw0Var22, tw0Var124, tw0Var125, tw0Var126, tw0Var127, tw0Var128, tw0Var129, tw0Var130, tw0Var131, tw0Var132, tw0Var133, tw0Var134, tw0Var135, tw0Var23, tw0Var136, tw0Var137, tw0Var138, tw0Var139, tw0Var140, tw0Var141, tw0Var142, tw0Var44, tw0Var144, tw0Var145, tw0Var146};
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f52748w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f52749x) {
            f();
        }
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof tw0) {
                ((tw0) obj2).f52494g = i7;
            } else if (obj2 instanceof org.telegram.messenger.yo) {
                ((org.telegram.messenger.yo) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.mp.g1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f52744f;
        TLRPC.WebPage webPage = org.telegram.messenger.mp.u1(i7).f25860t2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.mp.u1(i7).f25852s2);
        }
        if (this.F == null && !this.G) {
            this.G = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.gd.N0(2131743995, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWebPage, new l(this, 20));
        }
    }

    public final void I(String str) {
        this.E = str;
        if (this.f52750y != null) {
            Utilities.f22879g.a(this.f52750y);
            this.f52750y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f52749x = false;
            this.f52746r.clear();
            this.f52747s.clear();
            this.f52745n.clear();
            org.telegram.ui.ActionBar.g2 g2Var = this.f52743e;
            if (g2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) g2Var).P.f37551b.getImageReceiver().Q0(false);
                    ((ProfileActivity) this.f52743e).P.d.setText(org.telegram.messenger.gd.N0(2131745281, null));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22879g;
        mp0 mp0Var = new mp0(25, this, str);
        this.f52750y = mp0Var;
        q5Var.d(mp0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        tw0 tw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            tw0[] tw0VarArr = this.f52742c;
            if (i7 >= tw0VarArr.length) {
                break;
            }
            tw0 tw0Var2 = tw0VarArr[i7];
            if (tw0Var2 != null) {
                hashMap.put(Integer.valueOf(tw0Var2.f52493f), this.f52742c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.mp.g1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f52748w;
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
                        org.telegram.messenger.yo yoVar = new org.telegram.messenger.yo(readString, strArr, serializedData.readString(false));
                        yoVar.d = readInt32;
                        arrayList.add(yoVar);
                    } else if (readInt322 == 1 && (tw0Var = (tw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        tw0Var.f52494g = readInt32;
                        arrayList.add(tw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new ow0(this));
    }

    @Override
    public final int b() {
        int size;
        int i7 = 0;
        if (this.f52749x) {
            int size2 = this.f52746r.size();
            if (!this.f52747s.isEmpty()) {
                i7 = this.f52747s.size() + 1;
            }
            return size2 + i7;
        }
        ArrayList arrayList = this.f52748w;
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
        if (this.f52749x) {
            if (i7 < this.f52746r.size() || i7 != this.f52746r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f52748w;
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
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        tw0 tw0Var = null;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.N0(2131745273, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.N0(2131745286, null));
            return;
        }
        org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) view;
        boolean z11 = false;
        if (this.f52749x) {
            if (i7 < this.f52746r.size()) {
                tw0 tw0Var2 = (tw0) this.f52746r.get(i7);
                if (i7 > 0) {
                    tw0Var = (tw0) this.f52746r.get(i7 - 1);
                }
                if (tw0Var != null && tw0Var.f52492e == tw0Var2.f52492e) {
                    i10 = 0;
                } else {
                    i10 = tw0Var2.f52492e;
                }
                CharSequence charSequence = (CharSequence) this.f52745n.get(i7);
                String[] strArr = tw0Var2.d;
                if (i7 >= this.f52746r.size() - 1) {
                    z10 = false;
                }
                v6Var.b(charSequence, strArr, i10, z10);
                return;
            }
            int f10 = i5.c.f(1, i7, this.f52746r);
            CharSequence charSequence2 = (CharSequence) this.f52745n.get(this.f52746r.size() + f10);
            String[] strArr2 = ((org.telegram.messenger.yo) this.f52747s.get(f10)).f28270b;
            if (f10 < this.f52746r.size() - 1) {
                z11 = true;
            }
            v6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.f52748w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 < arrayList.size()) {
            Object obj = arrayList.get(i7);
            if (obj instanceof tw0) {
                tw0 tw0Var3 = (tw0) obj;
                String str = tw0Var3.f52489a;
                String[] strArr3 = tw0Var3.d;
                if (i7 >= arrayList.size() - 1) {
                    z10 = false;
                }
                v6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof org.telegram.messenger.yo) {
                org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) obj;
                String str2 = yoVar.f28269a;
                String[] strArr4 = yoVar.f28270b;
                if (i7 < arrayList.size() - 1) {
                    z11 = true;
                }
                v6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int f11 = i5.c.f(1, i7, arrayList);
        org.telegram.messenger.yo yoVar2 = (org.telegram.messenger.yo) this.d.get(f11);
        String str3 = yoVar2.f28269a;
        String[] strArr5 = yoVar2.f28270b;
        if (f11 < arrayList.size() - 1) {
            z11 = true;
        }
        v6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View v6Var;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                v6Var = new org.telegram.ui.Cells.o4(context, 16);
            } else {
                v6Var = new org.telegram.ui.Cells.y3(context, null);
            }
        } else {
            v6Var = new org.telegram.ui.Cells.v6(context);
        }
        v6Var.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(v6Var);
    }
}
