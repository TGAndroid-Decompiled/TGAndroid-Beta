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
public class x01 extends org.telegram.ui.Components.rl0 {
    public TLRPC.WebPage B;
    public boolean C;
    public w01[] f42885c;
    public final org.telegram.ui.ActionBar.p2 f42886e;
    public final int f42887f;
    public final Context h;
    public boolean f42891w;
    public pr0 f42892x;
    public String f42893y;
    public final ArrayList d = new ArrayList();
    public ArrayList f42888n = new ArrayList();
    public ArrayList f42889r = new ArrayList();
    public ArrayList f42890s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public x01(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f42886e = p2Var;
        this.f42887f = p2Var.getCurrentAccount();
        this.h = context;
        this.f42885c = H(p2Var);
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

    public static w01[] H(final org.telegram.ui.ActionBar.p2 p2Var) {
        w01 w01Var;
        w01 w01Var2;
        w01 w01Var3;
        w01 w01Var4;
        w01 w01Var5;
        w01 w01Var6;
        w01 w01Var7;
        w01 w01Var8;
        w01 w01Var9;
        w01 w01Var10;
        w01 w01Var11;
        w01 w01Var12;
        w01 w01Var13;
        w01 w01Var14;
        w01 w01Var15;
        w01 w01Var16;
        w01 w01Var17;
        w01 w01Var18;
        w01 w01Var19;
        w01 w01Var20;
        w01 w01Var21;
        w01 w01Var22;
        final int currentAccount = p2Var.getCurrentAccount();
        w01 w01Var23 = new w01(LocaleController.getString(R.string.EditName), 500, 0, new pr0(26, p2Var, p2Var.getResourceProvider()));
        w01 w01Var24 = new w01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var24.a("tg://settings/edit/change-number");
        w01 w01Var25 = new w01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
        w01Var25.a("tg://settings/edit/add-account");
        w01 w01Var26 = new w01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
        w01Var26.a("tg://settings/notifications");
        w01 w01Var27 = new w01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
        w01Var27.a("tg://settings/notifications/private-chats");
        w01 w01Var28 = new w01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
        w01Var28.a("tg://settings/notifications/groups");
        w01 w01Var29 = new w01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(8, p2Var));
        w01Var29.a("tg://settings/notifications/channels");
        w01 w01Var30 = new w01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(20, p2Var));
        w01 w01Var31 = new w01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var32 = new w01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var33 = new w01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(23, p2Var));
        w01Var33.a("tg://settings/notifications/new-contacts");
        w01 w01Var34 = new w01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var34.a("tg://settings/notifications/pinned-messages");
        w01 w01Var35 = new w01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var35.a("tg://settings/notifications/reset");
        w01 w01Var36 = new w01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01 w01Var37 = new w01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01 w01Var38 = new w01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01 w01Var39 = new w01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var39.a("tg://settings/privacy");
        w01 w01Var40 = new w01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var40.a("tg://settings/privacy/2sv");
        w01 w01Var41 = new w01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            qbVar.f30375b.setText(spannableStringBuilder);
                            qbVar.f30375b.setSingleLine(false);
                            qbVar.f30375b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        w01Var41.a("tg://settings/privacy/auto-delete");
        w01 w01Var42 = new w01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var42.a("tg://settings/privacy/passcode");
        w01 w01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            w01Var = w01Var40;
            w01Var2 = new w01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                                ArrayList arrayList = fc0Var10.f36769s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                        fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            w01Var2.a("tg://settings/privacy/login-email");
        } else {
            w01Var = w01Var40;
            w01Var2 = null;
        }
        w01 w01Var44 = new w01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var44.a("tg://settings/privacy/blocked");
        w01 w01Var45 = new w01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var45.a("tg://settings/devices");
        w01 w01Var46 = new w01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
        w01Var46.a("tg://settings/privacy/phone-number/");
        w01 w01Var47 = new w01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
        w01Var47.a("tg://settings/privacy/last-seen");
        w01 w01Var48 = new w01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
        w01Var48.a("tg://settings/privacy/profile-photos");
        w01 w01Var49 = new w01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
        w01Var49.a("tg://settings/privacy/forwards");
        w01 w01Var50 = new w01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
        w01Var50.a("tg://settings/privacy/calls/p2p");
        w01 w01Var51 = new w01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
        w01Var51.a("tg://settings/privacy/calls");
        w01 w01Var52 = new w01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
        w01Var52.a("tg://settings/privacy/invites");
        w01 w01Var53 = new w01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            qbVar.f30375b.setText(spannableStringBuilder);
                            qbVar.f30375b.setSingleLine(false);
                            qbVar.f30375b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            return;
                        }
                        p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        w01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            w01Var3 = new w01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
            w01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            w01Var3 = null;
        }
        w01 w01Var54 = new w01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var54.a("tg://settings/privacy/self-destruct");
        w01 w01Var55 = new w01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        w01 w01Var56 = new w01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var56.a("tg://settings/privacy/active-websites");
        w01 w01Var57 = new w01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        w01 w01Var58 = new w01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        w01 w01Var59 = new w01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        w01 w01Var60 = new w01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var60.a("tg://settings/privacy/data-settings/map-provider");
        w01 w01Var61 = new w01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
        w01Var61.a("tg://settings/privacy/data-settings/link-previews");
        w01 w01Var62 = new w01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
        w01Var62.a("tg://settings/devices");
        w01 w01Var63 = new w01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
        w01Var63.a("tg://settings/devices/terminate-sessions");
        w01 w01Var64 = new w01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
        w01Var64.a("tg://settings/devices/link-desktop");
        w01 w01Var65 = new w01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
        w01Var65.a("tg://settings/privacy/data-settings");
        w01 w01Var66 = new w01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var67 = new w01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01Var67.a("tg://settings/data/storage");
        w01 w01Var68 = new w01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var69 = new w01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var70 = new w01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var71 = new w01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01Var71.a("tg://settings/data/usage");
        w01 w01Var72 = new w01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var73 = new w01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var74 = new w01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var75 = new w01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var76 = new w01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01Var76.a("tg://settings/data/auto-download/reset");
        w01 w01Var77 = new w01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var78 = new w01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var79 = new w01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var80 = new w01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01Var80.a("tg://settings/data/use-less-data");
        w01 w01Var81 = new w01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var82 = new w01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01Var82.a("tg://settings/data/proxy");
        w01 w01Var83 = new w01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() {
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
        w01Var83.a("tg://settings/data/proxy/use-for-calls");
        w01 w01Var84 = new w01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        w01 w01Var85 = new w01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        w01 w01Var86 = new w01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(2, p2Var));
        w01Var86.a("tg://settings/data/save-to-photos/chats");
        w01 w01Var87 = new w01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(3, p2Var));
        w01Var87.a("tg://settings/data/save-to-photos/groups");
        w01 w01Var88 = new w01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(4, p2Var));
        w01Var88.a("tg://settings/data/save-to-photos/channels");
        w01 w01Var89 = new w01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ii0(5, p2Var));
        w01Var89.a("tg://settings/appearance/themes");
        w01 w01Var90 = new w01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(6, p2Var));
        w01Var90.a("tg://settings/appearance/text-size");
        w01 w01Var91 = new w01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(7, p2Var));
        w01Var91.a("tg://settings/appearance/wallpapers");
        w01 w01Var92 = new w01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ii0(9, p2Var));
        w01 w01Var93 = new w01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ii0(10, p2Var));
        w01 w01Var94 = new w01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(11, p2Var));
        w01 w01Var95 = new w01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(13, p2Var));
        w01 w01Var96 = new w01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ii0(14, p2Var));
        w01Var96.a("tg://settings/appearance/themes/create");
        w01 w01Var97 = new w01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(15, p2Var));
        w01Var97.a("tg://settings/appearance/message-corners");
        w01 w01Var98 = new w01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(16, p2Var));
        w01 w01Var99 = new w01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(17, p2Var));
        w01 w01Var100 = new w01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(18, p2Var));
        w01Var100.a("tg://settings/appearance/app-icon");
        w01 w01Var101 = new w01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(19, p2Var));
        w01 w01Var102 = new w01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(21, p2Var));
        w01Var102.a("tg://settings/appearance/tap-for-next-media");
        w01 w01Var103 = new w01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(22, p2Var));
        w01Var103.a("tg://settings/data/raise-to-listen");
        w01 w01Var104 = new w01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(24, p2Var));
        w01Var104.a("tg://settings/data/raise-to-speak");
        w01 w01Var105 = new w01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(25, p2Var));
        w01Var105.a("tg://settings/data/pause-music");
        w01 w01Var106 = new w01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(26, p2Var));
        w01 w01Var107 = new w01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(27, p2Var));
        w01 w01Var108 = new w01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(28, p2Var));
        w01 w01Var109 = new w01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(29, p2Var));
        w01 w01Var110 = new w01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var110.a("tg://settings/appearance/stickers-and-emoji");
        w01 w01Var111 = new w01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var112 = new w01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var113 = new w01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var114 = new w01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        w01 w01Var115 = new w01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var116 = new w01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        w01 w01Var117 = new w01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var118 = new w01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        w01 w01Var119 = new w01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        w01 w01Var120 = new w01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var121 = new w01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        w01 w01Var122 = new w01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var122.a("tg://settings/folders");
        w01 w01Var123 = new w01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            w01Var4 = w01Var123;
            w01Var5 = w01Var114;
            w01Var6 = w01Var116;
            w01Var7 = w01Var118;
            w01Var8 = new w01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
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
                                ArrayList arrayList = fc0Var10.f36769s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                        fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            w01Var4 = w01Var123;
            w01Var5 = w01Var114;
            w01Var6 = w01Var116;
            w01Var7 = w01Var118;
            w01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            w01Var9 = new w01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                ArrayList arrayList = fc0Var10.f36769s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                        fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            w01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            w01Var10 = new w01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            w01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            w01Var11 = new w01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            w01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            w01Var12 = new w01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            w01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            w01Var13 = new w01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            w01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            w01Var14 = new w01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            w01Var14 = null;
        }
        if (F(currentAccount, 4)) {
            w01Var15 = new w01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ii0(12, p2Var));
        } else {
            w01Var15 = null;
        }
        if (F(currentAccount, 5)) {
            w01Var16 = new w01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            p2Var.presentFragment(new b31());
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
            w01Var16 = null;
        }
        if (F(currentAccount, 9)) {
            w01Var17 = new w01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            p2Var.presentFragment(new b31());
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
            w01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            w01Var18 = new w01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            p2Var.presentFragment(new b31());
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
            w01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            w01Var19 = new w01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            p2Var.presentFragment(new b31());
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
            w01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            w01Var20 = new w01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            p2Var.presentFragment(new b31());
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
            w01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            w01Var21 = new w01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            p2Var.presentFragment(new b31());
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
            w01Var21 = null;
        }
        w01 w01Var124 = new w01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var124.a("tg://settings/power-saving");
        w01 w01Var125 = new w01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var125.a("tg://settings/power-saving/stickers");
        w01 w01Var126 = new w01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var127 = new w01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var128 = new w01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01Var128.a("tg://settings/power-saving/emoji");
        w01 w01Var129 = new w01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var130 = new w01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var131 = new w01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        p2Var.presentFragment(new b31());
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
        w01 w01Var132 = new w01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var132.a("tg://settings/power-saving/effects");
        w01 w01Var133 = new w01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var133.a("tg://settings/power-saving/background");
        w01 w01Var134 = new w01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01 w01Var135 = new w01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            w01Var22 = new w01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                                ArrayList arrayList = fc0Var10.f36769s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                        fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
        } else {
            w01Var22 = null;
        }
        w01 w01Var136 = new w01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01 w01Var137 = new w01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var137.a("tg://settings/power-saving/call-animations");
        w01 w01Var138 = new w01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var138.a("tg://settings/power-saving/videos");
        w01 w01Var139 = new w01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var139.a("tg://settings/power-saving/gifs");
        w01 w01Var140 = new w01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var140.a("tg://settings/power-saving/transitions");
        w01 w01Var141 = new w01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var141.a("tg://settings/language");
        w01 w01Var142 = new w01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            w01 w01Var143 = new w01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
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
                                ArrayList arrayList = fc0Var10.f36769s;
                                if (i10 < arrayList.size()) {
                                    if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                        fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            return;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            return;
                    }
                }
            });
            w01Var143.a("tg://settings/language/do-not-translate");
            w01Var43 = w01Var143;
        }
        w01 w01Var144 = new w01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var144.a("tg://settings/ask-question");
        w01 w01Var145 = new w01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var145.a("tg://settings/faq");
        w01 w01Var146 = new w01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
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
                            ArrayList arrayList = fc0Var10.f36769s;
                            if (i10 < arrayList.size()) {
                                if (((zb0) arrayList.get(i10)).f43887f == 1) {
                                    fc0Var10.f36763b.d1(new hg.m2(fc0Var10, i10, 12), 700, true);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        return;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        return;
                }
            }
        });
        w01Var146.a("tg://settings/privacy-policy");
        return new w01[]{w01Var23, w01Var24, w01Var25, w01Var26, w01Var27, w01Var28, w01Var29, w01Var30, w01Var31, w01Var32, w01Var33, w01Var34, w01Var35, w01Var36, w01Var37, w01Var38, w01Var39, w01Var, w01Var41, w01Var42, w01Var2, w01Var44, w01Var45, w01Var46, w01Var47, w01Var48, w01Var49, w01Var50, w01Var51, w01Var52, w01Var53, w01Var3, w01Var54, w01Var55, w01Var56, w01Var57, w01Var58, w01Var59, w01Var60, w01Var61, w01Var62, w01Var63, w01Var64, w01Var65, w01Var66, w01Var67, w01Var68, w01Var69, w01Var70, w01Var71, w01Var72, w01Var73, w01Var74, w01Var75, w01Var76, w01Var77, w01Var78, w01Var79, w01Var80, w01Var81, w01Var82, w01Var83, w01Var84, w01Var85, w01Var86, w01Var87, w01Var88, w01Var89, w01Var90, w01Var91, w01Var92, w01Var93, w01Var94, w01Var95, w01Var96, w01Var97, w01Var98, w01Var99, w01Var100, w01Var101, w01Var102, w01Var103, w01Var104, w01Var105, w01Var106, w01Var107, w01Var108, w01Var109, w01Var110, w01Var111, w01Var112, w01Var113, w01Var5, w01Var115, w01Var6, w01Var117, w01Var7, w01Var119, w01Var120, w01Var121, w01Var122, w01Var4, w01Var8, w01Var9, w01Var10, w01Var11, w01Var12, w01Var13, w01Var14, w01Var15, w01Var16, w01Var17, w01Var18, w01Var19, w01Var20, w01Var21, w01Var124, w01Var125, w01Var126, w01Var127, w01Var128, w01Var129, w01Var130, w01Var131, w01Var132, w01Var133, w01Var134, w01Var135, w01Var22, w01Var136, w01Var137, w01Var138, w01Var139, w01Var140, w01Var141, w01Var142, w01Var43, w01Var144, w01Var145, w01Var146};
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
        if (!this.f42891w) {
            l();
        }
        if (arrayList.size() > 20) {
            android.support.v4.media.a.u(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof w01) {
                ((w01) obj2).f42245g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f42887f;
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
        this.f42893y = str;
        if (this.f42892x != null) {
            Utilities.searchQueue.cancelRunnable(this.f42892x);
            this.f42892x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f42891w = false;
            this.f42889r.clear();
            this.f42890s.clear();
            this.f42888n.clear();
            org.telegram.ui.ActionBar.p2 p2Var = this.f42886e;
            if (p2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) p2Var).M.f34031b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.f42886e).M.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        pr0 pr0Var = new pr0(27, this, str);
        this.f42892x = pr0Var;
        dispatchQueue.postRunnable(pr0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        w01 w01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            w01[] w01VarArr = this.f42885c;
            if (i10 >= w01VarArr.length) {
                break;
            }
            w01 w01Var2 = w01VarArr[i10];
            if (w01Var2 != null) {
                hashMap.put(Integer.valueOf(w01Var2.f42244f), this.f42885c[i10]);
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
                    } else if (readInt322 == 1 && (w01Var = (w01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        w01Var.f42245g = readInt32;
                        arrayList.add(w01Var);
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
        if (this.f42891w) {
            int size2 = this.f42889r.size();
            if (!this.f42890s.isEmpty()) {
                i10 = this.f42890s.size() + 1;
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
        if (this.f42891w) {
            if (i10 < this.f42889r.size() || i10 != this.f42889r.size()) {
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
        w01 w01Var;
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
        if (this.f42891w) {
            if (i10 < this.f42889r.size()) {
                w01 w01Var2 = (w01) this.f42889r.get(i10);
                if (i10 > 0) {
                    w01Var = (w01) this.f42889r.get(i10 - 1);
                } else {
                    w01Var = null;
                }
                if (w01Var != null && w01Var.f42243e == w01Var2.f42243e) {
                    i11 = 0;
                } else {
                    i11 = w01Var2.f42243e;
                }
                CharSequence charSequence = (CharSequence) this.f42888n.get(i10);
                String[] strArr = w01Var2.d;
                if (i10 >= this.f42889r.size() - 1) {
                    z4 = false;
                }
                w6Var.b(charSequence, strArr, i11, z4);
                return;
            }
            int e6 = yh.e(1, i10, this.f42889r);
            CharSequence charSequence2 = (CharSequence) this.f42888n.get(this.f42889r.size() + e6);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f42890s.get(e6)).path;
            if (e6 < this.f42889r.size() - 1) {
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
            if (obj instanceof w01) {
                w01 w01Var3 = (w01) obj;
                String str = w01Var3.f42240a;
                String[] strArr3 = w01Var3.d;
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
