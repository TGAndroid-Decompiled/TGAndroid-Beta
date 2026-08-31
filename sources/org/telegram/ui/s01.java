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
public class s01 extends org.telegram.ui.Components.sl0 {
    public TLRPC.WebPage B;
    public boolean C;
    public r01[] f41094c;
    public final org.telegram.ui.ActionBar.p2 f41095e;
    public final int f41096f;
    public final Context h;
    public boolean f41100w;
    public br0 f41101x;
    public String f41102y;
    public final ArrayList d = new ArrayList();
    public ArrayList f41097n = new ArrayList();
    public ArrayList f41098r = new ArrayList();
    public ArrayList f41099s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public s01(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f41095e = p2Var;
        this.f41096f = p2Var.getCurrentAccount();
        this.h = context;
        this.f41094c = H(p2Var);
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

    public static r01[] H(final org.telegram.ui.ActionBar.p2 p2Var) {
        r01 r01Var;
        r01 r01Var2;
        r01 r01Var3;
        r01 r01Var4;
        r01 r01Var5;
        r01 r01Var6;
        r01 r01Var7;
        r01 r01Var8;
        r01 r01Var9;
        r01 r01Var10;
        r01 r01Var11;
        r01 r01Var12;
        r01 r01Var13;
        r01 r01Var14;
        r01 r01Var15;
        r01 r01Var16;
        r01 r01Var17;
        r01 r01Var18;
        r01 r01Var19;
        r01 r01Var20;
        r01 r01Var21;
        r01 r01Var22;
        final int currentAccount = p2Var.getCurrentAccount();
        r01 r01Var23 = new r01(LocaleController.getString(R.string.EditName), 500, 0, new br0(27, p2Var, p2Var.getResourceProvider()));
        r01 r01Var24 = new r01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var24.a("tg://settings/edit/change-number");
        r01 r01Var25 = new r01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var25.a("tg://settings/edit/add-account");
        r01 r01Var26 = new r01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var26.a("tg://settings/notifications");
        r01 r01Var27 = new r01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var27.a("tg://settings/notifications/private-chats");
        r01 r01Var28 = new r01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var28.a("tg://settings/notifications/groups");
        r01 r01Var29 = new r01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(8, p2Var));
        r01Var29.a("tg://settings/notifications/channels");
        r01 r01Var30 = new r01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(20, p2Var));
        r01 r01Var31 = new r01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var32 = new r01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var33 = new r01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(23, p2Var));
        r01Var33.a("tg://settings/notifications/new-contacts");
        r01 r01Var34 = new r01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var34.a("tg://settings/notifications/pinned-messages");
        r01 r01Var35 = new r01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var35.a("tg://settings/notifications/reset");
        r01 r01Var36 = new r01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01 r01Var37 = new r01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01 r01Var38 = new r01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01 r01Var39 = new r01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var39.a("tg://settings/privacy");
        r01 r01Var40 = new r01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var40.a("tg://settings/privacy/2sv");
        r01 r01Var41 = new r01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                                spannableStringBuilder.setSpan(new fg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            qbVar.f30359b.setText(spannableStringBuilder);
                            qbVar.f30359b.setSingleLine(false);
                            qbVar.f30359b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        r01Var41.a("tg://settings/privacy/auto-delete");
        r01 r01Var42 = new r01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var42.a("tg://settings/privacy/passcode");
        r01 r01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            r01Var = r01Var40;
            r01Var2 = new r01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(360928);
                            return;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(360928);
                            fc0Var2.V(32);
                            return;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(360928);
                            fc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(360928);
                            fc0Var4.V(128);
                            return;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(360928);
                            fc0Var5.V(256);
                            return;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(360928);
                            fc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            return;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            return;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            return;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.f36850s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                        fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ox0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            r01Var2.a("tg://settings/privacy/login-email");
        } else {
            r01Var = r01Var40;
            r01Var2 = null;
        }
        r01 r01Var44 = new r01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var44.a("tg://settings/privacy/blocked");
        r01 r01Var45 = new r01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var45.a("tg://settings/devices");
        r01 r01Var46 = new r01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var46.a("tg://settings/privacy/phone-number/");
        r01 r01Var47 = new r01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var47.a("tg://settings/privacy/last-seen");
        r01 r01Var48 = new r01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var48.a("tg://settings/privacy/profile-photos");
        r01 r01Var49 = new r01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var49.a("tg://settings/privacy/forwards");
        r01 r01Var50 = new r01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var50.a("tg://settings/privacy/calls/p2p");
        r01 r01Var51 = new r01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var51.a("tg://settings/privacy/calls");
        r01 r01Var52 = new r01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var52.a("tg://settings/privacy/invites");
        r01 r01Var53 = new r01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                                spannableStringBuilder.setSpan(new fg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            qbVar.f30359b.setText(spannableStringBuilder);
                            qbVar.f30359b.setSingleLine(false);
                            qbVar.f30359b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        r01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            r01Var3 = new r01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i10));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            r01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            r01Var3 = null;
        }
        r01 r01Var54 = new r01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var54.a("tg://settings/privacy/self-destruct");
        r01 r01Var55 = new r01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        r01 r01Var56 = new r01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var56.a("tg://settings/privacy/active-websites");
        r01 r01Var57 = new r01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        r01 r01Var58 = new r01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        r01 r01Var59 = new r01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        r01 r01Var60 = new r01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var60.a("tg://settings/privacy/data-settings/map-provider");
        r01 r01Var61 = new r01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var61.a("tg://settings/privacy/data-settings/link-previews");
        r01 r01Var62 = new r01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var62.a("tg://settings/devices");
        r01 r01Var63 = new r01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var63.a("tg://settings/devices/terminate-sessions");
        r01 r01Var64 = new r01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var64.a("tg://settings/devices/link-desktop");
        r01 r01Var65 = new r01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var65.a("tg://settings/privacy/data-settings");
        r01 r01Var66 = new r01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01 r01Var67 = new r01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01Var67.a("tg://settings/data/storage");
        r01 r01Var68 = new r01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01 r01Var69 = new r01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01 r01Var70 = new r01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i10));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        r01 r01Var71 = new r01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var71.a("tg://settings/data/usage");
        r01 r01Var72 = new r01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var73 = new r01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var74 = new r01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var75 = new r01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var76 = new r01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var76.a("tg://settings/data/auto-download/reset");
        r01 r01Var77 = new r01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var78 = new r01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var79 = new r01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var80 = new r01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var80.a("tg://settings/data/use-less-data");
        r01 r01Var81 = new r01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var82 = new r01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var82.a("tg://settings/data/proxy");
        r01 r01Var83 = new r01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var83.a("tg://settings/data/proxy/use-for-calls");
        r01 r01Var84 = new r01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        r01 r01Var85 = new r01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                }
            }
        });
        r01 r01Var86 = new r01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(2, p2Var));
        r01Var86.a("tg://settings/data/save-to-photos/chats");
        r01 r01Var87 = new r01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(3, p2Var));
        r01Var87.a("tg://settings/data/save-to-photos/groups");
        r01 r01Var88 = new r01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(4, p2Var));
        r01Var88.a("tg://settings/data/save-to-photos/channels");
        r01 r01Var89 = new r01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ii0(5, p2Var));
        r01Var89.a("tg://settings/appearance/themes");
        r01 r01Var90 = new r01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(6, p2Var));
        r01Var90.a("tg://settings/appearance/text-size");
        r01 r01Var91 = new r01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(7, p2Var));
        r01Var91.a("tg://settings/appearance/wallpapers");
        r01 r01Var92 = new r01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ii0(9, p2Var));
        r01 r01Var93 = new r01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ii0(10, p2Var));
        r01 r01Var94 = new r01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(11, p2Var));
        r01 r01Var95 = new r01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(13, p2Var));
        r01 r01Var96 = new r01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ii0(14, p2Var));
        r01Var96.a("tg://settings/appearance/themes/create");
        r01 r01Var97 = new r01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(15, p2Var));
        r01Var97.a("tg://settings/appearance/message-corners");
        r01 r01Var98 = new r01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(16, p2Var));
        r01 r01Var99 = new r01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(17, p2Var));
        r01 r01Var100 = new r01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(18, p2Var));
        r01Var100.a("tg://settings/appearance/app-icon");
        r01 r01Var101 = new r01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(19, p2Var));
        r01 r01Var102 = new r01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(21, p2Var));
        r01Var102.a("tg://settings/appearance/tap-for-next-media");
        r01 r01Var103 = new r01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(22, p2Var));
        r01Var103.a("tg://settings/data/raise-to-listen");
        r01 r01Var104 = new r01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(24, p2Var));
        r01Var104.a("tg://settings/data/raise-to-speak");
        r01 r01Var105 = new r01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(25, p2Var));
        r01Var105.a("tg://settings/data/pause-music");
        r01 r01Var106 = new r01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(26, p2Var));
        r01 r01Var107 = new r01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(27, p2Var));
        r01 r01Var108 = new r01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(28, p2Var));
        r01 r01Var109 = new r01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(29, p2Var));
        r01 r01Var110 = new r01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var110.a("tg://settings/appearance/stickers-and-emoji");
        r01 r01Var111 = new r01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var112 = new r01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var113 = new r01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var114 = new r01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        r01 r01Var115 = new r01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var116 = new r01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        r01 r01Var117 = new r01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var118 = new r01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        r01 r01Var119 = new r01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        r01 r01Var120 = new r01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var121 = new r01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        r01 r01Var122 = new r01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var122.a("tg://settings/folders");
        r01 r01Var123 = new r01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            r01Var4 = r01Var123;
            r01Var5 = r01Var114;
            r01Var6 = r01Var116;
            r01Var7 = r01Var118;
            r01Var8 = new r01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(360928);
                            return;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(360928);
                            fc0Var2.V(32);
                            return;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(360928);
                            fc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(360928);
                            fc0Var4.V(128);
                            return;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(360928);
                            fc0Var5.V(256);
                            return;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(360928);
                            fc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            return;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            return;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            return;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.f36850s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                        fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ox0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            r01Var4 = r01Var123;
            r01Var5 = r01Var114;
            r01Var6 = r01Var116;
            r01Var7 = r01Var118;
            r01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            r01Var9 = new r01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(360928);
                            return;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(360928);
                            fc0Var2.V(32);
                            return;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(360928);
                            fc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(360928);
                            fc0Var4.V(128);
                            return;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(360928);
                            fc0Var5.V(256);
                            return;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(360928);
                            fc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            return;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            return;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            return;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.f36850s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                        fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ox0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            r01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            r01Var10 = new r01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i10));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            r01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            r01Var11 = new r01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i10));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            r01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            r01Var12 = new r01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i10));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            r01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            r01Var13 = new r01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                    }
                }
            });
        } else {
            r01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            r01Var14 = new r01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                    }
                }
            });
        } else {
            r01Var14 = null;
        }
        if (F(currentAccount, 4)) {
            r01Var15 = new r01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ii0(12, p2Var));
        } else {
            r01Var15 = null;
        }
        if (F(currentAccount, 5)) {
            r01Var16 = new r01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new w21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            return;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            return;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(28700);
                            return;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(28700);
                            fc0Var5.V(16388);
                            return;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(28700);
                            fc0Var6.V(8200);
                            return;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(28700);
                            fc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            r01Var16 = null;
        }
        if (F(currentAccount, 9)) {
            r01Var17 = new r01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new w21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            return;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            return;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(28700);
                            return;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(28700);
                            fc0Var5.V(16388);
                            return;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(28700);
                            fc0Var6.V(8200);
                            return;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(28700);
                            fc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            r01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            r01Var18 = new r01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new w21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            return;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            return;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(28700);
                            return;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(28700);
                            fc0Var5.V(16388);
                            return;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(28700);
                            fc0Var6.V(8200);
                            return;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(28700);
                            fc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            r01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            r01Var19 = new r01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new w21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            return;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            return;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(28700);
                            return;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(28700);
                            fc0Var5.V(16388);
                            return;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(28700);
                            fc0Var6.V(8200);
                            return;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(28700);
                            fc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            r01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            r01Var20 = new r01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new w21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            return;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            return;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(28700);
                            return;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(28700);
                            fc0Var5.V(16388);
                            return;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(28700);
                            fc0Var6.V(8200);
                            return;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(28700);
                            fc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            r01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            r01Var21 = new r01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new w21());
                            return;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            return;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            return;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            return;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            return;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            return;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            return;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            return;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(28700);
                            return;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(28700);
                            fc0Var5.V(16388);
                            return;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(28700);
                            fc0Var6.V(8200);
                            return;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(28700);
                            fc0Var7.V(4112);
                            return;
                    }
                }
            });
        } else {
            r01Var21 = null;
        }
        r01 r01Var124 = new r01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var124.a("tg://settings/power-saving");
        r01 r01Var125 = new r01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var125.a("tg://settings/power-saving/stickers");
        r01 r01Var126 = new r01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var127 = new r01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var128 = new r01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01Var128.a("tg://settings/power-saving/emoji");
        r01 r01Var129 = new r01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var130 = new r01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var131 = new r01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new w21());
                        return;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        return;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        return;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        return;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        return;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        return;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        return;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        return;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(28700);
                        return;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(28700);
                        fc0Var5.V(16388);
                        return;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(28700);
                        fc0Var6.V(8200);
                        return;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(28700);
                        fc0Var7.V(4112);
                        return;
                }
            }
        });
        r01 r01Var132 = new r01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var132.a("tg://settings/power-saving/effects");
        r01 r01Var133 = new r01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var133.a("tg://settings/power-saving/background");
        r01 r01Var134 = new r01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01 r01Var135 = new r01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            r01Var22 = new r01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(360928);
                            return;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(360928);
                            fc0Var2.V(32);
                            return;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(360928);
                            fc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(360928);
                            fc0Var4.V(128);
                            return;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(360928);
                            fc0Var5.V(256);
                            return;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(360928);
                            fc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            return;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            return;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            return;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.f36850s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                        fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ox0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            r01Var22 = null;
        }
        r01 r01Var136 = new r01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01 r01Var137 = new r01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var137.a("tg://settings/power-saving/call-animations");
        r01 r01Var138 = new r01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var138.a("tg://settings/power-saving/videos");
        r01 r01Var139 = new r01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var139.a("tg://settings/power-saving/gifs");
        r01 r01Var140 = new r01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var140.a("tg://settings/power-saving/transitions");
        r01 r01Var141 = new r01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var141.a("tg://settings/language");
        r01 r01Var142 = new r01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            r01 r01Var143 = new r01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(360928);
                            return;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(360928);
                            fc0Var2.V(32);
                            return;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(360928);
                            fc0Var3.V(64);
                            return;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(360928);
                            fc0Var4.V(128);
                            return;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(360928);
                            fc0Var5.V(256);
                            return;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(360928);
                            fc0Var6.V(32768);
                            return;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            return;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            return;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            return;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.f36850s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                        fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ox0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            r01Var143.a("tg://settings/language/do-not-translate");
            r01Var43 = r01Var143;
        }
        r01 r01Var144 = new r01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var144.a("tg://settings/ask-question");
        r01 r01Var145 = new r01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var145.a("tg://settings/faq");
        r01 r01Var146 = new r01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(360928);
                        return;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(360928);
                        fc0Var2.V(32);
                        return;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(360928);
                        fc0Var3.V(64);
                        return;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(360928);
                        fc0Var4.V(128);
                        return;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(360928);
                        fc0Var5.V(256);
                        return;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(360928);
                        fc0Var6.V(32768);
                        return;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        return;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        return;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        return;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.f36850s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43889f == 1) {
                                    fc0Var10.f36844b.e1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ox0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        r01Var146.a("tg://settings/privacy-policy");
        return new r01[]{r01Var23, r01Var24, r01Var25, r01Var26, r01Var27, r01Var28, r01Var29, r01Var30, r01Var31, r01Var32, r01Var33, r01Var34, r01Var35, r01Var36, r01Var37, r01Var38, r01Var39, r01Var, r01Var41, r01Var42, r01Var2, r01Var44, r01Var45, r01Var46, r01Var47, r01Var48, r01Var49, r01Var50, r01Var51, r01Var52, r01Var53, r01Var3, r01Var54, r01Var55, r01Var56, r01Var57, r01Var58, r01Var59, r01Var60, r01Var61, r01Var62, r01Var63, r01Var64, r01Var65, r01Var66, r01Var67, r01Var68, r01Var69, r01Var70, r01Var71, r01Var72, r01Var73, r01Var74, r01Var75, r01Var76, r01Var77, r01Var78, r01Var79, r01Var80, r01Var81, r01Var82, r01Var83, r01Var84, r01Var85, r01Var86, r01Var87, r01Var88, r01Var89, r01Var90, r01Var91, r01Var92, r01Var93, r01Var94, r01Var95, r01Var96, r01Var97, r01Var98, r01Var99, r01Var100, r01Var101, r01Var102, r01Var103, r01Var104, r01Var105, r01Var106, r01Var107, r01Var108, r01Var109, r01Var110, r01Var111, r01Var112, r01Var113, r01Var5, r01Var115, r01Var6, r01Var117, r01Var7, r01Var119, r01Var120, r01Var121, r01Var122, r01Var4, r01Var8, r01Var9, r01Var10, r01Var11, r01Var12, r01Var13, r01Var14, r01Var15, r01Var16, r01Var17, r01Var18, r01Var19, r01Var20, r01Var21, r01Var124, r01Var125, r01Var126, r01Var127, r01Var128, r01Var129, r01Var130, r01Var131, r01Var132, r01Var133, r01Var134, r01Var135, r01Var22, r01Var136, r01Var137, r01Var138, r01Var139, r01Var140, r01Var141, r01Var142, r01Var43, r01Var144, r01Var145, r01Var146};
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
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
        if (!this.f41100w) {
            l();
        }
        if (arrayList.size() > 20) {
            android.support.v4.media.a.u(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof r01) {
                ((r01) obj2).f40742g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f41096f;
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
        this.f41102y = str;
        if (this.f41101x != null) {
            Utilities.searchQueue.cancelRunnable(this.f41101x);
            this.f41101x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f41100w = false;
            this.f41098r.clear();
            this.f41099s.clear();
            this.f41097n.clear();
            org.telegram.ui.ActionBar.p2 p2Var = this.f41095e;
            if (p2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) p2Var).M.f25362b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.f41095e).M.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        br0 br0Var = new br0(28, this, str);
        this.f41101x = br0Var;
        dispatchQueue.postRunnable(br0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        r01 r01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            r01[] r01VarArr = this.f41094c;
            if (i10 >= r01VarArr.length) {
                break;
            }
            r01 r01Var2 = r01VarArr[i10];
            if (r01Var2 != null) {
                hashMap.put(Integer.valueOf(r01Var2.f40741f), this.f41094c[i10]);
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
                    } else if (readInt322 == 1 && (r01Var = (r01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        r01Var.f40742g = readInt32;
                        arrayList.add(r01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new du(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f41100w) {
            int size2 = this.f41098r.size();
            if (!this.f41099s.isEmpty()) {
                i10 = this.f41099s.size() + 1;
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
        if (this.f41100w) {
            if (i10 < this.f41098r.size() || i10 != this.f41098r.size()) {
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
    public final void v(f2.m1 m1Var, int i10) {
        r01 r01Var;
        int i11;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
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
        if (this.f41100w) {
            if (i10 < this.f41098r.size()) {
                r01 r01Var2 = (r01) this.f41098r.get(i10);
                if (i10 > 0) {
                    r01Var = (r01) this.f41098r.get(i10 - 1);
                } else {
                    r01Var = null;
                }
                if (r01Var != null && r01Var.f40740e == r01Var2.f40740e) {
                    i11 = 0;
                } else {
                    i11 = r01Var2.f40740e;
                }
                CharSequence charSequence = (CharSequence) this.f41097n.get(i10);
                String[] strArr = r01Var2.d;
                if (i10 >= this.f41098r.size() - 1) {
                    z4 = false;
                }
                w6Var.b(charSequence, strArr, i11, z4);
                return;
            }
            int e6 = yh.e(1, i10, this.f41098r);
            CharSequence charSequence2 = (CharSequence) this.f41097n.get(this.f41098r.size() + e6);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f41099s.get(e6)).path;
            if (e6 < this.f41098r.size() - 1) {
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
            if (obj instanceof r01) {
                r01 r01Var3 = (r01) obj;
                String str = r01Var3.f40737a;
                String[] strArr3 = r01Var3.d;
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
        int e10 = yh.e(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(e10);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (e10 < arrayList.size() - 1) {
            z10 = true;
        }
        w6Var.a(str3, strArr5, true, z10);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
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
        w6Var.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(w6Var);
    }
}
