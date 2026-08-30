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
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public class r01 extends org.telegram.ui.Components.rl0 {
    public TLRPC.WebPage B;
    public boolean C;
    public q01[] f37893c;
    public final org.telegram.ui.ActionBar.p2 e;
    public final int f37894f;
    public final Context h;
    public boolean f37898w;
    public zq0 f37899x;
    public String f37900y;
    public final ArrayList d = new ArrayList();
    public ArrayList f37895n = new ArrayList();
    public ArrayList f37896r = new ArrayList();
    public ArrayList f37897s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public r01(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = p2Var;
        this.f37894f = p2Var.getCurrentAccount();
        this.h = context;
        this.f37893c = H(p2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (MessagesController.getInstance(i10).premiumFeaturesBlocked() && !UserConfig.getInstance(i10).isPremium()) {
            return false;
        }
        if (i11 != -1 && MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) == -1) {
            return false;
        }
        return true;
    }

    public static q01[] H(final org.telegram.ui.ActionBar.p2 p2Var) {
        q01 q01Var;
        q01 q01Var2;
        q01 q01Var3;
        q01 q01Var4;
        q01 q01Var5;
        q01 q01Var6;
        q01 q01Var7;
        q01 q01Var8;
        q01 q01Var9;
        q01 q01Var10;
        q01 q01Var11;
        q01 q01Var12;
        q01 q01Var13;
        q01 q01Var14;
        q01 q01Var15;
        q01 q01Var16;
        q01 q01Var17;
        q01 q01Var18;
        q01 q01Var19;
        q01 q01Var20;
        q01 q01Var21;
        q01 q01Var22;
        final int currentAccount = p2Var.getCurrentAccount();
        q01 q01Var23 = new q01(LocaleController.getString(R.string.EditName), 500, 0, new zq0(28, p2Var, p2Var.getResourceProvider()));
        q01 q01Var24 = new q01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var24.a("tg://settings/edit/change-number");
        q01 q01Var25 = new q01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var25.a("tg://settings/edit/add-account");
        q01 q01Var26 = new q01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var26.a("tg://settings/notifications");
        q01 q01Var27 = new q01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var27.a("tg://settings/notifications/private-chats");
        q01 q01Var28 = new q01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var28.a("tg://settings/notifications/groups");
        q01 q01Var29 = new q01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new hi0(8, p2Var));
        q01Var29.a("tg://settings/notifications/channels");
        q01 q01Var30 = new q01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new hi0(20, p2Var));
        q01 q01Var31 = new q01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var32 = new q01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var33 = new q01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new hi0(23, p2Var));
        q01Var33.a("tg://settings/notifications/new-contacts");
        q01 q01Var34 = new q01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var34.a("tg://settings/notifications/pinned-messages");
        q01 q01Var35 = new q01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var35.a("tg://settings/notifications/reset");
        q01 q01Var36 = new q01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01 q01Var37 = new q01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01 q01Var38 = new q01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01 q01Var39 = new q01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var39.a("tg://settings/privacy");
        q01 q01Var40 = new q01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var40.a("tg://settings/privacy/2sv");
        q01 q01Var41 = new q01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new s4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), null);
                            qbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new eg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            qbVar.f28100b.setText(spannableStringBuilder);
                            qbVar.f28100b.setSingleLine(false);
                            qbVar.f28100b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        q01Var41.a("tg://settings/privacy/auto-delete");
        q01 q01Var42 = new q01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var42.a("tg://settings/privacy/passcode");
        q01 q01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            q01Var = q01Var40;
            q01Var2 = new q01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(360928);
                            return;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(360928);
                            ec0Var2.V(32);
                            return;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(360928);
                            ec0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(360928);
                            ec0Var4.V(128);
                            return;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(360928);
                            ec0Var5.V(256);
                            return;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(360928);
                            ec0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            return;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            return;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            return;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.f33988s;
                                if (i10 < arrayList.size()) {
                                    if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                        ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            return;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            q01Var2.a("tg://settings/privacy/login-email");
        } else {
            q01Var = q01Var40;
            q01Var2 = null;
        }
        q01 q01Var44 = new q01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var44.a("tg://settings/privacy/blocked");
        q01 q01Var45 = new q01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var45.a("tg://settings/devices");
        q01 q01Var46 = new q01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var46.a("tg://settings/privacy/phone-number/");
        q01 q01Var47 = new q01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var47.a("tg://settings/privacy/last-seen");
        q01 q01Var48 = new q01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var48.a("tg://settings/privacy/profile-photos");
        q01 q01Var49 = new q01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var49.a("tg://settings/privacy/forwards");
        q01 q01Var50 = new q01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var50.a("tg://settings/privacy/calls/p2p");
        q01 q01Var51 = new q01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var51.a("tg://settings/privacy/calls");
        q01 q01Var52 = new q01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var52.a("tg://settings/privacy/invites");
        q01 q01Var53 = new q01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new s4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), null);
                            qbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new eg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            qbVar.f28100b.setText(spannableStringBuilder);
                            qbVar.f28100b.setSingleLine(false);
                            qbVar.f28100b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        q01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            q01Var3 = new q01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                p2Var.presentFragment(new ng0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new b7());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new b7());
                            return;
                        case 28:
                            p2Var.presentFragment(new b7());
                            return;
                        default:
                            p2Var.presentFragment(new b7());
                            return;
                    }
                }
            });
            q01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            q01Var3 = null;
        }
        q01 q01Var54 = new q01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var54.a("tg://settings/privacy/self-destruct");
        q01 q01Var55 = new q01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        q01 q01Var56 = new q01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var56.a("tg://settings/privacy/active-websites");
        q01 q01Var57 = new q01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        q01 q01Var58 = new q01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        q01 q01Var59 = new q01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        q01 q01Var60 = new q01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var60.a("tg://settings/privacy/data-settings/map-provider");
        q01 q01Var61 = new q01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var61.a("tg://settings/privacy/data-settings/link-previews");
        q01 q01Var62 = new q01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var62.a("tg://settings/devices");
        q01 q01Var63 = new q01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var63.a("tg://settings/devices/terminate-sessions");
        q01 q01Var64 = new q01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var64.a("tg://settings/devices/link-desktop");
        q01 q01Var65 = new q01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var65.a("tg://settings/privacy/data-settings");
        q01 q01Var66 = new q01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01 q01Var67 = new q01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01Var67.a("tg://settings/data/storage");
        q01 q01Var68 = new q01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01 q01Var69 = new q01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01 q01Var70 = new q01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 8:
                        int i10 = 0;
                        while (true) {
                            if (i10 < 4) {
                                if (UserConfig.getInstance(i10).isClientActivated()) {
                                    i10++;
                                }
                            } else {
                                i10 = -1;
                            }
                        }
                        if (i10 >= 0) {
                            p2Var.presentFragment(new ng0(i10));
                            return;
                        }
                        return;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        return;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 25:
                        p2Var.presentFragment(new b7());
                        return;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 27:
                        p2Var.presentFragment(new b7());
                        return;
                    case 28:
                        p2Var.presentFragment(new b7());
                        return;
                    default:
                        p2Var.presentFragment(new b7());
                        return;
                }
            }
        });
        q01 q01Var71 = new q01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var71.a("tg://settings/data/usage");
        q01 q01Var72 = new q01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var73 = new q01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var74 = new q01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var75 = new q01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var76 = new q01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var76.a("tg://settings/data/auto-download/reset");
        q01 q01Var77 = new q01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var78 = new q01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var79 = new q01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var80 = new q01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var80.a("tg://settings/data/use-less-data");
        q01 q01Var81 = new q01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var82 = new q01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var82.a("tg://settings/data/proxy");
        q01 q01Var83 = new q01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var83.a("tg://settings/data/proxy/use-for-calls");
        q01 q01Var84 = new q01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        q01 q01Var85 = new q01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                        return;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                }
            }
        });
        q01 q01Var86 = new q01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new hi0(2, p2Var));
        q01Var86.a("tg://settings/data/save-to-photos/chats");
        q01 q01Var87 = new q01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new hi0(3, p2Var));
        q01Var87.a("tg://settings/data/save-to-photos/groups");
        q01 q01Var88 = new q01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new hi0(4, p2Var));
        q01Var88.a("tg://settings/data/save-to-photos/channels");
        q01 q01Var89 = new q01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new hi0(5, p2Var));
        q01Var89.a("tg://settings/appearance/themes");
        q01 q01Var90 = new q01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(6, p2Var));
        q01Var90.a("tg://settings/appearance/text-size");
        q01 q01Var91 = new q01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(7, p2Var));
        q01Var91.a("tg://settings/appearance/wallpapers");
        q01 q01Var92 = new q01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new hi0(9, p2Var));
        q01 q01Var93 = new q01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new hi0(10, p2Var));
        q01 q01Var94 = new q01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(11, p2Var));
        q01 q01Var95 = new q01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(13, p2Var));
        q01 q01Var96 = new q01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new hi0(14, p2Var));
        q01Var96.a("tg://settings/appearance/themes/create");
        q01 q01Var97 = new q01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(15, p2Var));
        q01Var97.a("tg://settings/appearance/message-corners");
        q01 q01Var98 = new q01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(16, p2Var));
        q01 q01Var99 = new q01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(17, p2Var));
        q01 q01Var100 = new q01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(18, p2Var));
        q01Var100.a("tg://settings/appearance/app-icon");
        q01 q01Var101 = new q01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(19, p2Var));
        q01 q01Var102 = new q01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(21, p2Var));
        q01Var102.a("tg://settings/appearance/tap-for-next-media");
        q01 q01Var103 = new q01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(22, p2Var));
        q01Var103.a("tg://settings/data/raise-to-listen");
        q01 q01Var104 = new q01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(24, p2Var));
        q01Var104.a("tg://settings/data/raise-to-speak");
        q01 q01Var105 = new q01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(25, p2Var));
        q01Var105.a("tg://settings/data/pause-music");
        q01 q01Var106 = new q01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(26, p2Var));
        q01 q01Var107 = new q01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(27, p2Var));
        q01 q01Var108 = new q01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(28, p2Var));
        q01 q01Var109 = new q01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(29, p2Var));
        q01 q01Var110 = new q01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var110.a("tg://settings/appearance/stickers-and-emoji");
        q01 q01Var111 = new q01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var112 = new q01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var113 = new q01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var114 = new q01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        q01 q01Var115 = new q01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var116 = new q01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        q01 q01Var117 = new q01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var118 = new q01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        q01 q01Var119 = new q01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        q01 q01Var120 = new q01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var121 = new q01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        q01 q01Var122 = new q01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var122.a("tg://settings/folders");
        q01 q01Var123 = new q01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            q01Var4 = q01Var123;
            q01Var5 = q01Var114;
            q01Var6 = q01Var116;
            q01Var7 = q01Var118;
            q01Var8 = new q01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(360928);
                            return;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(360928);
                            ec0Var2.V(32);
                            return;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(360928);
                            ec0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(360928);
                            ec0Var4.V(128);
                            return;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(360928);
                            ec0Var5.V(256);
                            return;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(360928);
                            ec0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            return;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            return;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            return;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.f33988s;
                                if (i10 < arrayList.size()) {
                                    if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                        ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            return;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            q01Var4 = q01Var123;
            q01Var5 = q01Var114;
            q01Var6 = q01Var116;
            q01Var7 = q01Var118;
            q01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            q01Var9 = new q01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(360928);
                            return;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(360928);
                            ec0Var2.V(32);
                            return;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(360928);
                            ec0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(360928);
                            ec0Var4.V(128);
                            return;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(360928);
                            ec0Var5.V(256);
                            return;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(360928);
                            ec0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            return;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            return;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            return;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.f33988s;
                                if (i10 < arrayList.size()) {
                                    if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                        ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            return;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            q01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            q01Var10 = new q01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                p2Var.presentFragment(new ng0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new b7());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new b7());
                            return;
                        case 28:
                            p2Var.presentFragment(new b7());
                            return;
                        default:
                            p2Var.presentFragment(new b7());
                            return;
                    }
                }
            });
        } else {
            q01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            q01Var11 = new q01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                p2Var.presentFragment(new ng0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new b7());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new b7());
                            return;
                        case 28:
                            p2Var.presentFragment(new b7());
                            return;
                        default:
                            p2Var.presentFragment(new b7());
                            return;
                    }
                }
            });
        } else {
            q01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            q01Var12 = new q01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 8:
                            int i10 = 0;
                            while (true) {
                                if (i10 < 4) {
                                    if (UserConfig.getInstance(i10).isClientActivated()) {
                                        i10++;
                                    }
                                } else {
                                    i10 = -1;
                                }
                            }
                            if (i10 >= 0) {
                                p2Var.presentFragment(new ng0(i10));
                                return;
                            }
                            return;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            return;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 25:
                            p2Var.presentFragment(new b7());
                            return;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 27:
                            p2Var.presentFragment(new b7());
                            return;
                        case 28:
                            p2Var.presentFragment(new b7());
                            return;
                        default:
                            p2Var.presentFragment(new b7());
                            return;
                    }
                }
            });
        } else {
            q01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            q01Var13 = new q01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                            return;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                    }
                }
            });
        } else {
            q01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            q01Var14 = new q01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new org.telegram.ui.ActionBar.p2(null));
                            return;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                    }
                }
            });
        } else {
            q01Var14 = null;
        }
        if (F(currentAccount, 4)) {
            q01Var15 = new q01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new hi0(12, p2Var));
        } else {
            q01Var15 = null;
        }
        if (F(currentAccount, 5)) {
            q01Var16 = new q01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new u21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            return;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            return;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(28700);
                            return;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(28700);
                            ec0Var5.V(16388);
                            return;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(28700);
                            ec0Var6.V(8200);
                            return;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(28700);
                            ec0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            q01Var16 = null;
        }
        if (F(currentAccount, 9)) {
            q01Var17 = new q01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new u21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            return;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            return;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(28700);
                            return;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(28700);
                            ec0Var5.V(16388);
                            return;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(28700);
                            ec0Var6.V(8200);
                            return;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(28700);
                            ec0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            q01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            q01Var18 = new q01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new u21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            return;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            return;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(28700);
                            return;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(28700);
                            ec0Var5.V(16388);
                            return;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(28700);
                            ec0Var6.V(8200);
                            return;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(28700);
                            ec0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            q01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            q01Var19 = new q01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new u21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            return;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            return;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(28700);
                            return;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(28700);
                            ec0Var5.V(16388);
                            return;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(28700);
                            ec0Var6.V(8200);
                            return;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(28700);
                            ec0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            q01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            q01Var20 = new q01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new u21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            return;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            return;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(28700);
                            return;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(28700);
                            ec0Var5.V(16388);
                            return;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(28700);
                            ec0Var6.V(8200);
                            return;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(28700);
                            ec0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            q01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            q01Var21 = new q01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            return;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            return;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            return;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 13:
                            p2Var.presentFragment(new u21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            return;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            return;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(28700);
                            return;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(28700);
                            ec0Var5.V(16388);
                            return;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(28700);
                            ec0Var6.V(8200);
                            return;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(28700);
                            ec0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            q01Var21 = null;
        }
        q01 q01Var124 = new q01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var124.a("tg://settings/power-saving");
        q01 q01Var125 = new q01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var125.a("tg://settings/power-saving/stickers");
        q01 q01Var126 = new q01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var127 = new q01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var128 = new q01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01Var128.a("tg://settings/power-saving/emoji");
        q01 q01Var129 = new q01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var130 = new q01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var131 = new q01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        return;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        return;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        return;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 13:
                        p2Var.presentFragment(new u21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        return;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        return;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(28700);
                        return;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(28700);
                        ec0Var5.V(16388);
                        return;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(28700);
                        ec0Var6.V(8200);
                        return;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(28700);
                        ec0Var7.V(4112);
                        return;
                }
            }
        });
        q01 q01Var132 = new q01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var132.a("tg://settings/power-saving/effects");
        q01 q01Var133 = new q01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var133.a("tg://settings/power-saving/background");
        q01 q01Var134 = new q01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01 q01Var135 = new q01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            q01Var22 = new q01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(360928);
                            return;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(360928);
                            ec0Var2.V(32);
                            return;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(360928);
                            ec0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(360928);
                            ec0Var4.V(128);
                            return;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(360928);
                            ec0Var5.V(256);
                            return;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(360928);
                            ec0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            return;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            return;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            return;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.f33988s;
                                if (i10 < arrayList.size()) {
                                    if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                        ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            return;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            q01Var22 = null;
        }
        q01 q01Var136 = new q01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01 q01Var137 = new q01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var137.a("tg://settings/power-saving/call-animations");
        q01 q01Var138 = new q01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var138.a("tg://settings/power-saving/videos");
        q01 q01Var139 = new q01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var139.a("tg://settings/power-saving/gifs");
        q01 q01Var140 = new q01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var140.a("tg://settings/power-saving/transitions");
        q01 q01Var141 = new q01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var141.a("tg://settings/language");
        q01 q01Var142 = new q01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            q01 q01Var143 = new q01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(360928);
                            return;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(360928);
                            ec0Var2.V(32);
                            return;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(360928);
                            ec0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(360928);
                            ec0Var4.V(128);
                            return;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(360928);
                            ec0Var5.V(256);
                            return;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(360928);
                            ec0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            return;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            return;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            return;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.f33988s;
                                if (i10 < arrayList.size()) {
                                    if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                        ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            return;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            return;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            return;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            return;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            q01Var143.a("tg://settings/language/do-not-translate");
            q01Var43 = q01Var143;
        }
        q01 q01Var144 = new q01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var144.a("tg://settings/ask-question");
        q01 q01Var145 = new q01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var145.a("tg://settings/faq");
        q01 q01Var146 = new q01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(360928);
                        return;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(360928);
                        ec0Var2.V(32);
                        return;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(360928);
                        ec0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(360928);
                        ec0Var4.V(128);
                        return;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(360928);
                        ec0Var5.V(256);
                        return;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(360928);
                        ec0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        return;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        return;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        return;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.f33988s;
                            if (i10 < arrayList.size()) {
                                if (((yb0) arrayList.get(i10)).f40469f == 1) {
                                    ec0Var10.f33983b.e1(new gg.m2(ec0Var10, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        return;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        return;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        return;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        return;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        q01Var146.a("tg://settings/privacy-policy");
        return new q01[]{q01Var23, q01Var24, q01Var25, q01Var26, q01Var27, q01Var28, q01Var29, q01Var30, q01Var31, q01Var32, q01Var33, q01Var34, q01Var35, q01Var36, q01Var37, q01Var38, q01Var39, q01Var, q01Var41, q01Var42, q01Var2, q01Var44, q01Var45, q01Var46, q01Var47, q01Var48, q01Var49, q01Var50, q01Var51, q01Var52, q01Var53, q01Var3, q01Var54, q01Var55, q01Var56, q01Var57, q01Var58, q01Var59, q01Var60, q01Var61, q01Var62, q01Var63, q01Var64, q01Var65, q01Var66, q01Var67, q01Var68, q01Var69, q01Var70, q01Var71, q01Var72, q01Var73, q01Var74, q01Var75, q01Var76, q01Var77, q01Var78, q01Var79, q01Var80, q01Var81, q01Var82, q01Var83, q01Var84, q01Var85, q01Var86, q01Var87, q01Var88, q01Var89, q01Var90, q01Var91, q01Var92, q01Var93, q01Var94, q01Var95, q01Var96, q01Var97, q01Var98, q01Var99, q01Var100, q01Var101, q01Var102, q01Var103, q01Var104, q01Var105, q01Var106, q01Var107, q01Var108, q01Var109, q01Var110, q01Var111, q01Var112, q01Var113, q01Var5, q01Var115, q01Var6, q01Var117, q01Var7, q01Var119, q01Var120, q01Var121, q01Var122, q01Var4, q01Var8, q01Var9, q01Var10, q01Var11, q01Var12, q01Var13, q01Var14, q01Var15, q01Var16, q01Var17, q01Var18, q01Var19, q01Var20, q01Var21, q01Var124, q01Var125, q01Var126, q01Var127, q01Var128, q01Var129, q01Var130, q01Var131, q01Var132, q01Var133, q01Var134, q01Var135, q01Var22, q01Var136, q01Var137, q01Var138, q01Var139, q01Var140, q01Var141, q01Var142, q01Var43, q01Var144, q01Var145, q01Var146};
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f37898w) {
            l();
        }
        if (arrayList.size() > 20) {
            android.support.v4.media.a.u(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof q01) {
                ((q01) obj2).f37569g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f37894f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i10).faqWebPage;
        this.B = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.B == null && !this.C) {
            this.C = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new o(this, 20));
        }
    }

    public final void I(String str) {
        this.f37900y = str;
        if (this.f37899x != null) {
            Utilities.searchQueue.cancelRunnable(this.f37899x);
            this.f37899x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f37898w = false;
            this.f37896r.clear();
            this.f37897s.clear();
            this.f37895n.clear();
            org.telegram.ui.ActionBar.p2 p2Var = this.e;
            if (p2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) p2Var).M.f31455b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).M.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        zq0 zq0Var = new zq0(29, this, str);
        this.f37899x = zq0Var;
        dispatchQueue.postRunnable(zq0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        q01 q01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            q01[] q01VarArr = this.f37893c;
            if (i10 >= q01VarArr.length) {
                break;
            }
            q01 q01Var2 = q01VarArr[i10];
            if (q01Var2 != null) {
                hashMap.put(Integer.valueOf(q01Var2.f37568f), this.f37893c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.v;
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
                    int readInt32 = serializedData.readInt32(false);
                    int readInt322 = serializedData.readInt32(false);
                    if (readInt322 == 0) {
                        String readString = serializedData.readString(false);
                        int readInt323 = serializedData.readInt32(false);
                        if (readInt323 > 0) {
                            strArr = new String[readInt323];
                            for (int i11 = 0; i11 < readInt323; i11++) {
                                strArr[i11] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(readString, strArr, serializedData.readString(false));
                        faqSearchResult.num = readInt32;
                        arrayList.add(faqSearchResult);
                    } else if (readInt322 == 1 && (q01Var = (q01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        q01Var.f37569g = readInt32;
                        arrayList.add(q01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new cu(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f37898w) {
            int size2 = this.f37896r.size();
            if (!this.f37897s.isEmpty()) {
                i10 = this.f37897s.size() + 1;
            }
            return size2 + i10;
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            size = arrayList.size() + 1;
        }
        ArrayList arrayList2 = this.d;
        if (!arrayList2.isEmpty()) {
            i10 = arrayList2.size() + 1;
        }
        return size + i10;
    }

    @Override
    public final int j(int i10) {
        if (this.f37898w) {
            if (i10 < this.f37896r.size() || i10 != this.f37896r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.v;
            if (i10 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i10 != arrayList.size() + 1) {
                return 0;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        q01 q01Var;
        int i11;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z4 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
            return;
        }
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        boolean z10 = false;
        if (this.f37898w) {
            if (i10 < this.f37896r.size()) {
                q01 q01Var2 = (q01) this.f37896r.get(i10);
                if (i10 > 0) {
                    q01Var = (q01) this.f37896r.get(i10 - 1);
                } else {
                    q01Var = null;
                }
                if (q01Var != null && q01Var.e == q01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = q01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f37895n.get(i10);
                String[] strArr = q01Var2.d;
                if (i10 >= this.f37896r.size() - 1) {
                    z4 = false;
                }
                w6Var.b(charSequence, strArr, i11, z4);
                return;
            }
            int f10 = yh.f(1, i10, this.f37896r);
            CharSequence charSequence2 = (CharSequence) this.f37895n.get(this.f37896r.size() + f10);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f37897s.get(f10)).path;
            if (f10 < this.f37896r.size() - 1) {
                z10 = true;
            }
            w6Var.a(charSequence2, strArr2, true, z10);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof q01) {
                q01 q01Var3 = (q01) obj;
                String str = q01Var3.f37565a;
                String[] strArr3 = q01Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z4 = false;
                }
                w6Var.a(str, strArr3, false, z4);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z10 = true;
                }
                w6Var.a(str2, strArr4, true, z10);
                return;
            } else {
                return;
            }
        }
        int f11 = yh.f(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(f11);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (f11 < arrayList.size() - 1) {
            z10 = true;
        }
        w6Var.a(str3, strArr5, true, z10);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                w6Var = new org.telegram.ui.Cells.m4(context, 16);
            } else {
                w6Var = new org.telegram.ui.Cells.u3(context, null);
            }
        } else {
            w6Var = new org.telegram.ui.Cells.w6(context);
        }
        w6Var.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(w6Var);
    }
}
