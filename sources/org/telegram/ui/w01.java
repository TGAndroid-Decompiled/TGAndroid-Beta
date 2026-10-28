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
import org.telegram.messenger.DispatchQueue2;
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
public class w01 extends org.telegram.ui.Components.mm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public v01[] f44472c;
    public final org.telegram.ui.ActionBar.r2 e;
    public final int f44473f;
    public final Context h;
    public boolean f44477w;
    public by0 f44478x;
    public String f44479y;
    public final ArrayList d = new ArrayList();
    public ArrayList f44474n = new ArrayList();
    public ArrayList f44475r = new ArrayList();
    public ArrayList f44476s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public w01(Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        this.e = r2Var;
        this.f44473f = r2Var.getCurrentAccount();
        this.h = context;
        this.f44472c = H(r2Var);
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

    public static v01[] H(final org.telegram.ui.ActionBar.r2 r2Var) {
        v01 v01Var;
        v01 v01Var2;
        v01 v01Var3;
        v01 v01Var4;
        v01 v01Var5;
        v01 v01Var6;
        v01 v01Var7;
        v01 v01Var8;
        v01 v01Var9;
        v01 v01Var10;
        v01 v01Var11;
        v01 v01Var12;
        v01 v01Var13;
        v01 v01Var14;
        v01 v01Var15;
        v01 v01Var16;
        v01 v01Var17;
        v01 v01Var18;
        v01 v01Var19;
        v01 v01Var20;
        v01 v01Var21;
        v01 v01Var22;
        v01 v01Var23;
        final int currentAccount = r2Var.getCurrentAccount();
        v01 v01Var24 = new v01(LocaleController.getString(R.string.EditName), 500, 0, new by0(9, r2Var, r2Var.getResourceProvider()));
        v01 v01Var25 = new v01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var25.a("tg://settings/edit/change-number");
        v01 v01Var26 = new v01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var26.a("tg://settings/edit/add-account");
        v01 v01Var27 = new v01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var27.a("tg://settings/notifications");
        v01 v01Var28 = new v01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var28.a("tg://settings/notifications/private-chats");
        v01 v01Var29 = new v01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01Var29.a("tg://settings/notifications/groups");
        v01 v01Var30 = new v01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ei0(7, r2Var));
        v01Var30.a("tg://settings/notifications/channels");
        v01 v01Var31 = new v01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ei0(19, r2Var));
        v01 v01Var32 = new v01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var33 = new v01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var34 = new v01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ei0(23, r2Var));
        v01Var34.a("tg://settings/notifications/new-contacts");
        v01 v01Var35 = new v01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var35.a("tg://settings/notifications/pinned-messages");
        v01 v01Var36 = new v01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var36.a("tg://settings/notifications/reset");
        v01 v01Var37 = new v01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01 v01Var38 = new v01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01 v01Var39 = new v01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01 v01Var40 = new v01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var40.a("tg://settings/privacy");
        v01 v01Var41 = new v01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var41.a("tg://settings/privacy/2sv");
        v01 v01Var42 = new v01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            r2Var.presentFragment(new t4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(r2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.hb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f35028b.setText(spannableStringBuilder);
                            ybVar.f35028b.setSingleLine(false);
                            ybVar.f35028b.setMaxLines(2);
                            b02.b(ybVar, 2750).j();
                            return;
                        }
                        r2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        v01Var42.a("tg://settings/privacy/auto-delete");
        v01 v01Var43 = new v01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var43.a("tg://settings/privacy/passcode");
        v01 v01Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            v01Var = v01Var41;
            v01Var2 = new v01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.X(360928);
                            wb0Var.W(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(360928);
                            wb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(360928);
                            wb0Var3.W(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.X(360928);
                            wb0Var4.W(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.W(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.W(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f44627s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                        wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            return;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ux0 ux0Var = new ux0();
                            ux0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(ux0Var);
                            return;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            v01Var2.a("tg://settings/privacy/login-email");
        } else {
            v01Var = v01Var41;
            v01Var2 = null;
        }
        v01 v01Var45 = new v01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var45.a("tg://settings/privacy/blocked");
        v01 v01Var46 = new v01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var46.a("tg://settings/devices");
        v01 v01Var47 = new v01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var47.a("tg://settings/privacy/phone-number/");
        v01 v01Var48 = new v01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var48.a("tg://settings/privacy/last-seen");
        v01 v01Var49 = new v01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var49.a("tg://settings/privacy/profile-photos");
        v01 v01Var50 = new v01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var50.a("tg://settings/privacy/forwards");
        v01 v01Var51 = new v01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var51.a("tg://settings/privacy/calls/p2p");
        v01 v01Var52 = new v01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var52.a("tg://settings/privacy/calls");
        v01 v01Var53 = new v01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var53.a("tg://settings/privacy/invites");
        v01 v01Var54 = new v01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            r2Var.presentFragment(new t4());
                            return;
                        }
                        return;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(r2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.hb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.f35028b.setText(spannableStringBuilder);
                            ybVar.f35028b.setSingleLine(false);
                            ybVar.f35028b.setMaxLines(2);
                            b02.b(ybVar, 2750).j();
                            return;
                        }
                        r2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        v01Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            v01Var3 = v01Var54;
            v01Var4 = new v01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
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
                                r2Var.presentFragment(new ig0(i10));
                                return;
                            }
                            return;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            r2Var.presentFragment(new c7());
                            return;
                        case 24:
                            r2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            r2Var.presentFragment(new c7());
                            return;
                        case 27:
                            r2Var.presentFragment(new c7());
                            return;
                        case 28:
                            r2Var.presentFragment(new nu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            v01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            v01Var3 = v01Var54;
            v01Var4 = null;
        }
        v01 v01Var55 = new v01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var55.a("tg://settings/privacy/self-destruct");
        v01 v01Var56 = new v01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        v01 v01Var57 = new v01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var57.a("tg://settings/privacy/active-websites");
        v01 v01Var58 = new v01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var58.a("tg://settings/privacy/data-settings/delete-synced");
        v01 v01Var59 = new v01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        v01 v01Var60 = new v01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        v01 v01Var61 = new v01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var61.a("tg://settings/privacy/data-settings/map-provider");
        v01 v01Var62 = new v01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var62.a("tg://settings/privacy/data-settings/link-previews");
        v01 v01Var63 = new v01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var63.a("tg://settings/devices");
        v01 v01Var64 = new v01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var64.a("tg://settings/devices/terminate-sessions");
        v01 v01Var65 = new v01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var65.a("tg://settings/devices/link-desktop");
        v01 v01Var66 = new v01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var66.a("tg://settings/privacy/data-settings");
        v01 v01Var67 = new v01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01 v01Var68 = new v01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var68.a("tg://settings/data/storage");
        v01 v01Var69 = new v01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01 v01Var70 = new v01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01 v01Var71 = new v01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01 v01Var72 = new v01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
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
                            r2Var.presentFragment(new ig0(i10));
                            return;
                        }
                        return;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        r2Var.presentFragment(new c7());
                        return;
                    case 24:
                        r2Var.presentFragment(new c7());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 26:
                        r2Var.presentFragment(new c7());
                        return;
                    case 27:
                        r2Var.presentFragment(new c7());
                        return;
                    case 28:
                        r2Var.presentFragment(new nu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        v01Var72.a("tg://settings/data/usage");
        v01 v01Var73 = new v01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var74 = new v01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var75 = new v01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var76 = new v01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var77 = new v01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01Var77.a("tg://settings/data/auto-download/reset");
        v01 v01Var78 = new v01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var79 = new v01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var80 = new v01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var81 = new v01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01Var81.a("tg://settings/data/use-less-data");
        v01 v01Var82 = new v01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var83 = new v01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01Var83.a("tg://settings/data/proxy");
        v01 v01Var84 = new v01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        v01 v01Var85 = new v01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01 v01Var86 = new v01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01Var86.a("tg://settings/data/save-to-photos/chats");
        v01 v01Var87 = new v01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                }
            }
        });
        v01Var87.a("tg://settings/data/save-to-photos/groups");
        v01 v01Var88 = new v01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ei0(2, r2Var));
        v01Var88.a("tg://settings/data/save-to-photos/channels");
        v01 v01Var89 = new v01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ei0(3, r2Var));
        v01Var89.a("tg://settings/appearance/themes");
        v01 v01Var90 = new v01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(4, r2Var));
        v01Var90.a("tg://settings/appearance/text-size");
        v01 v01Var91 = new v01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(5, r2Var));
        v01Var91.a("tg://settings/appearance/wallpapers");
        v01 v01Var92 = new v01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ei0(6, r2Var));
        v01 v01Var93 = new v01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ei0(8, r2Var));
        v01 v01Var94 = new v01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(9, r2Var));
        v01 v01Var95 = new v01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(10, r2Var));
        v01 v01Var96 = new v01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ei0(11, r2Var));
        v01Var96.a("tg://settings/appearance/themes/create");
        v01 v01Var97 = new v01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(13, r2Var));
        v01Var97.a("tg://settings/appearance/message-corners");
        v01 v01Var98 = new v01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(14, r2Var));
        v01 v01Var99 = new v01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(15, r2Var));
        v01 v01Var100 = new v01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(16, r2Var));
        v01Var100.a("tg://settings/appearance/app-icon");
        v01 v01Var101 = new v01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(17, r2Var));
        v01 v01Var102 = new v01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(18, r2Var));
        v01Var102.a("tg://settings/appearance/tap-for-next-media");
        v01 v01Var103 = new v01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(20, r2Var));
        v01Var103.a("tg://settings/data/raise-to-listen");
        v01 v01Var104 = new v01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(21, r2Var));
        v01Var104.a("tg://settings/data/raise-to-speak");
        v01 v01Var105 = new v01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(22, r2Var));
        v01Var105.a("tg://settings/data/pause-music");
        v01 v01Var106 = new v01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(24, r2Var));
        v01 v01Var107 = new v01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(25, r2Var));
        v01 v01Var108 = new v01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(26, r2Var));
        v01 v01Var109 = new v01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ei0(27, r2Var));
        v01 v01Var110 = new v01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ei0(28, r2Var));
        v01Var110.a("tg://settings/appearance/stickers-and-emoji");
        v01 v01Var111 = new v01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ei0(29, r2Var));
        v01 v01Var112 = new v01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var113 = new v01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var114 = new v01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        v01 v01Var115 = new v01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var116 = new v01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        v01 v01Var117 = new v01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var118 = new v01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        v01 v01Var119 = new v01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        v01 v01Var120 = new v01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var121 = new v01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        v01 v01Var122 = new v01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var122.a("tg://settings/folders");
        v01 v01Var123 = new v01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            v01Var5 = v01Var123;
            v01Var6 = v01Var114;
            v01Var7 = v01Var116;
            v01Var8 = v01Var118;
            v01Var9 = new v01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.X(360928);
                            wb0Var.W(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(360928);
                            wb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(360928);
                            wb0Var3.W(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.X(360928);
                            wb0Var4.W(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.W(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.W(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f44627s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                        wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            return;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ux0 ux0Var = new ux0();
                            ux0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(ux0Var);
                            return;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            v01Var5 = v01Var123;
            v01Var6 = v01Var114;
            v01Var7 = v01Var116;
            v01Var8 = v01Var118;
            v01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            v01Var10 = new v01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.X(360928);
                            wb0Var.W(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(360928);
                            wb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(360928);
                            wb0Var3.W(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.X(360928);
                            wb0Var4.W(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.W(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.W(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f44627s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                        wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            return;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ux0 ux0Var = new ux0();
                            ux0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(ux0Var);
                            return;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            v01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            v01Var11 = new v01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.X(360928);
                            wb0Var.W(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(360928);
                            wb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(360928);
                            wb0Var3.W(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.X(360928);
                            wb0Var4.W(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.W(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.W(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f44627s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                        wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            return;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ux0 ux0Var = new ux0();
                            ux0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(ux0Var);
                            return;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            v01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            v01Var12 = new v01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
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
                                r2Var.presentFragment(new ig0(i10));
                                return;
                            }
                            return;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            r2Var.presentFragment(new c7());
                            return;
                        case 24:
                            r2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            r2Var.presentFragment(new c7());
                            return;
                        case 27:
                            r2Var.presentFragment(new c7());
                            return;
                        case 28:
                            r2Var.presentFragment(new nu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            v01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            v01Var13 = new v01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
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
                                r2Var.presentFragment(new ig0(i10));
                                return;
                            }
                            return;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            r2Var.presentFragment(new c7());
                            return;
                        case 24:
                            r2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            r2Var.presentFragment(new c7());
                            return;
                        case 27:
                            r2Var.presentFragment(new c7());
                            return;
                        case 28:
                            r2Var.presentFragment(new nu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            v01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            v01Var14 = new v01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
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
                                r2Var.presentFragment(new ig0(i10));
                                return;
                            }
                            return;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            r2Var.presentFragment(new c7());
                            return;
                        case 24:
                            r2Var.presentFragment(new c7());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 26:
                            r2Var.presentFragment(new c7());
                            return;
                        case 27:
                            r2Var.presentFragment(new c7());
                            return;
                        case 28:
                            r2Var.presentFragment(new nu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            v01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            v01Var15 = new v01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            r2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            r2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            r2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            r2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            v01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            v01Var16 = new v01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            r2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            r2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            r2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 7:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            r2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            r2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                    }
                }
            });
        } else {
            v01Var16 = null;
        }
        if (F(currentAccount, 5)) {
            v01Var17 = new v01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ei0(12, r2Var));
        } else {
            v01Var17 = null;
        }
        if (F(currentAccount, 9)) {
            v01Var18 = new v01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            r2Var.presentFragment(new i21());
                            return;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            r2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.W(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(3);
                            wb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(3);
                            wb0Var3.W(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.X(28700);
                            wb0Var5.W(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.X(28700);
                            wb0Var6.W(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.X(28700);
                            wb0Var7.W(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            wb0Var8.W(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            r2Var.presentFragment(wb0Var9);
                            wb0Var9.X(360928);
                            wb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            v01Var18 = null;
        }
        if (F(currentAccount, 6)) {
            v01Var19 = new v01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            r2Var.presentFragment(new i21());
                            return;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            r2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.W(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(3);
                            wb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(3);
                            wb0Var3.W(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.X(28700);
                            wb0Var5.W(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.X(28700);
                            wb0Var6.W(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.X(28700);
                            wb0Var7.W(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            wb0Var8.W(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            r2Var.presentFragment(wb0Var9);
                            wb0Var9.X(360928);
                            wb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            v01Var19 = null;
        }
        if (F(currentAccount, 7)) {
            v01Var20 = new v01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            r2Var.presentFragment(new i21());
                            return;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            r2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.W(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(3);
                            wb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(3);
                            wb0Var3.W(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.X(28700);
                            wb0Var5.W(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.X(28700);
                            wb0Var6.W(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.X(28700);
                            wb0Var7.W(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            wb0Var8.W(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            r2Var.presentFragment(wb0Var9);
                            wb0Var9.X(360928);
                            wb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            v01Var20 = null;
        }
        if (F(currentAccount, 10)) {
            v01Var21 = new v01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            r2Var.presentFragment(new i21());
                            return;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            r2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.W(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(3);
                            wb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(3);
                            wb0Var3.W(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.X(28700);
                            wb0Var5.W(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.X(28700);
                            wb0Var6.W(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.X(28700);
                            wb0Var7.W(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            wb0Var8.W(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            r2Var.presentFragment(wb0Var9);
                            wb0Var9.X(360928);
                            wb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            v01Var21 = null;
        }
        if (F(currentAccount, 12)) {
            v01Var22 = new v01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            r2Var.presentFragment(new i21());
                            return;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            return;
                        case 18:
                            r2Var.presentFragment(new wb0());
                            return;
                        case 19:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.W(3);
                            return;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(3);
                            wb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(3);
                            wb0Var3.W(2);
                            return;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.X(28700);
                            wb0Var5.W(16388);
                            return;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.X(28700);
                            wb0Var6.W(8200);
                            return;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.X(28700);
                            wb0Var7.W(4112);
                            return;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            wb0Var8.W(360928);
                            return;
                        default:
                            wb0 wb0Var9 = new wb0();
                            r2Var.presentFragment(wb0Var9);
                            wb0Var9.X(360928);
                            wb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            v01Var22 = null;
        }
        v01 v01Var124 = new v01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var124.a("tg://settings/power-saving");
        v01 v01Var125 = new v01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var125.a("tg://settings/power-saving/stickers");
        v01 v01Var126 = new v01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var127 = new v01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var128 = new v01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var128.a("tg://settings/power-saving/emoji");
        v01 v01Var129 = new v01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var130 = new v01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var131 = new v01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01 v01Var132 = new v01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var132.a("tg://settings/power-saving/effects");
        v01 v01Var133 = new v01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        r2Var.presentFragment(new i21());
                        return;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        return;
                    case 18:
                        r2Var.presentFragment(new wb0());
                        return;
                    case 19:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.W(3);
                        return;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(3);
                        wb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(3);
                        wb0Var3.W(2);
                        return;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.X(28700);
                        wb0Var5.W(16388);
                        return;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.X(28700);
                        wb0Var6.W(8200);
                        return;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.X(28700);
                        wb0Var7.W(4112);
                        return;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        wb0Var8.W(360928);
                        return;
                    default:
                        wb0 wb0Var9 = new wb0();
                        r2Var.presentFragment(wb0Var9);
                        wb0Var9.X(360928);
                        wb0Var9.W(32);
                        return;
                }
            }
        });
        v01Var133.a("tg://settings/power-saving/background");
        v01 v01Var134 = new v01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01 v01Var135 = new v01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            v01Var23 = new v01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.X(360928);
                            wb0Var.W(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(360928);
                            wb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(360928);
                            wb0Var3.W(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.X(360928);
                            wb0Var4.W(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.W(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.W(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f44627s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                        wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            return;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ux0 ux0Var = new ux0();
                            ux0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(ux0Var);
                            return;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            v01Var23 = null;
        }
        v01 v01Var136 = new v01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01 v01Var137 = new v01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var137.a("tg://settings/power-saving/call-animations");
        v01 v01Var138 = new v01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var138.a("tg://settings/power-saving/videos");
        v01 v01Var139 = new v01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var139.a("tg://settings/power-saving/gifs");
        v01 v01Var140 = new v01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var140.a("tg://settings/power-saving/transitions");
        v01 v01Var141 = new v01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var141.a("tg://settings/language");
        v01 v01Var142 = new v01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            v01 v01Var143 = new v01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            r2Var.presentFragment(wb0Var);
                            wb0Var.X(360928);
                            wb0Var.W(64);
                            return;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            r2Var.presentFragment(wb0Var2);
                            wb0Var2.X(360928);
                            wb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            r2Var.presentFragment(wb0Var3);
                            wb0Var3.X(360928);
                            wb0Var3.W(256);
                            return;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            r2Var.presentFragment(wb0Var4);
                            wb0Var4.X(360928);
                            wb0Var4.W(32768);
                            return;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            r2Var.presentFragment(wb0Var5);
                            wb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            r2Var.presentFragment(wb0Var6);
                            wb0Var6.W(1024);
                            return;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            r2Var.presentFragment(wb0Var7);
                            wb0Var7.W(2048);
                            return;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            r2Var.presentFragment(wb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.f44627s;
                                if (i10 < arrayList.size()) {
                                    if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                        wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            return;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            return;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            return;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            return;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            return;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            return;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ux0 ux0Var = new ux0();
                            ux0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(ux0Var);
                            return;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            v01Var143.a("tg://settings/language/do-not-translate");
            v01Var44 = v01Var143;
        }
        v01 v01Var144 = new v01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var144.a("tg://settings/ask-question");
        v01 v01Var145 = new v01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var145.a("tg://settings/faq");
        v01 v01Var146 = new v01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        r2Var.presentFragment(wb0Var);
                        wb0Var.X(360928);
                        wb0Var.W(64);
                        return;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        r2Var.presentFragment(wb0Var2);
                        wb0Var2.X(360928);
                        wb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        r2Var.presentFragment(wb0Var3);
                        wb0Var3.X(360928);
                        wb0Var3.W(256);
                        return;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        r2Var.presentFragment(wb0Var4);
                        wb0Var4.X(360928);
                        wb0Var4.W(32768);
                        return;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        r2Var.presentFragment(wb0Var5);
                        wb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        r2Var.presentFragment(wb0Var6);
                        wb0Var6.W(1024);
                        return;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        r2Var.presentFragment(wb0Var7);
                        wb0Var7.W(2048);
                        return;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        r2Var.presentFragment(wb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.f44627s;
                            if (i10 < arrayList.size()) {
                                if (((qb0) arrayList.get(i10)).f42663f == 1) {
                                    wb0Var8.f44622b.e1(new i2.r(wb0Var8, i10, 13), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        return;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        return;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        return;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        return;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        return;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        return;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ux0 ux0Var = new ux0();
                        ux0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(ux0Var);
                        return;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        v01Var146.a("tg://settings/privacy-policy");
        return new v01[]{v01Var24, v01Var25, v01Var26, v01Var27, v01Var28, v01Var29, v01Var30, v01Var31, v01Var32, v01Var33, v01Var34, v01Var35, v01Var36, v01Var37, v01Var38, v01Var39, v01Var40, v01Var, v01Var42, v01Var43, v01Var2, v01Var45, v01Var46, v01Var47, v01Var48, v01Var49, v01Var50, v01Var51, v01Var52, v01Var53, v01Var3, v01Var4, v01Var55, v01Var56, v01Var57, v01Var58, v01Var59, v01Var60, v01Var61, v01Var62, v01Var63, v01Var64, v01Var65, v01Var66, v01Var67, v01Var68, v01Var69, v01Var70, v01Var71, v01Var72, v01Var73, v01Var74, v01Var75, v01Var76, v01Var77, v01Var78, v01Var79, v01Var80, v01Var81, v01Var82, v01Var83, v01Var84, v01Var85, v01Var86, v01Var87, v01Var88, v01Var89, v01Var90, v01Var91, v01Var92, v01Var93, v01Var94, v01Var95, v01Var96, v01Var97, v01Var98, v01Var99, v01Var100, v01Var101, v01Var102, v01Var103, v01Var104, v01Var105, v01Var106, v01Var107, v01Var108, v01Var109, v01Var110, v01Var111, v01Var112, v01Var113, v01Var6, v01Var115, v01Var7, v01Var117, v01Var8, v01Var119, v01Var120, v01Var121, v01Var122, v01Var5, v01Var9, v01Var10, v01Var11, v01Var12, v01Var13, v01Var14, v01Var15, v01Var16, v01Var17, v01Var18, v01Var19, v01Var20, v01Var21, v01Var22, v01Var124, v01Var125, v01Var126, v01Var127, v01Var128, v01Var129, v01Var130, v01Var131, v01Var132, v01Var133, v01Var134, v01Var135, v01Var23, v01Var136, v01Var137, v01Var138, v01Var139, v01Var140, v01Var141, v01Var142, v01Var44, v01Var144, v01Var145, v01Var146};
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
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
        if (!this.f44477w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.A(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof v01) {
                ((v01) obj2).f44156g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f44473f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i10).faqWebPage;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new l(this, 21));
        }
    }

    public final void I(String str) {
        this.f44479y = str;
        if (this.f44478x != null) {
            Utilities.searchQueue.cancelRunnable(this.f44478x);
            this.f44478x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f44477w = false;
            this.f44475r.clear();
            this.f44476s.clear();
            this.f44474n.clear();
            org.telegram.ui.ActionBar.r2 r2Var = this.e;
            if (r2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) r2Var).O.f28313b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).O.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        by0 by0Var = new by0(10, this, str);
        this.f44478x = by0Var;
        dispatchQueue2.postRunnable(by0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        v01 v01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            v01[] v01VarArr = this.f44472c;
            if (i10 >= v01VarArr.length) {
                break;
            }
            v01 v01Var2 = v01VarArr[i10];
            if (v01Var2 != null) {
                hashMap.put(Integer.valueOf(v01Var2.f44155f), this.f44472c[i10]);
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
                    } else if (readInt322 == 1 && (v01Var = (v01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        v01Var.f44156g = readInt32;
                        arrayList.add(v01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new dv(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f44477w) {
            int size2 = this.f44475r.size();
            if (!this.f44476s.isEmpty()) {
                i10 = this.f44476s.size() + 1;
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
        if (this.f44477w) {
            if (i10 < this.f44475r.size() || i10 != this.f44475r.size()) {
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
    public final void v(s4.e1 e1Var, int i10) {
        v01 v01Var;
        int i11;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
            return;
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
        boolean z11 = false;
        if (this.f44477w) {
            if (i10 < this.f44475r.size()) {
                v01 v01Var2 = (v01) this.f44475r.get(i10);
                if (i10 > 0) {
                    v01Var = (v01) this.f44475r.get(i10 - 1);
                } else {
                    v01Var = null;
                }
                if (v01Var != null && v01Var.e == v01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = v01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f44474n.get(i10);
                String[] strArr = v01Var2.d;
                if (i10 >= this.f44475r.size() - 1) {
                    z10 = false;
                }
                c7Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int f7 = ic.a.f(1, i10, this.f44475r);
            CharSequence charSequence2 = (CharSequence) this.f44474n.get(this.f44475r.size() + f7);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f44476s.get(f7)).path;
            if (f7 < this.f44475r.size() - 1) {
                z11 = true;
            }
            c7Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 < arrayList.size()) {
            Object obj = arrayList.get(i10);
            if (obj instanceof v01) {
                v01 v01Var3 = (v01) obj;
                String str = v01Var3.f44152a;
                String[] strArr3 = v01Var3.d;
                if (i10 >= arrayList.size() - 1) {
                    z10 = false;
                }
                c7Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                String str2 = faqSearchResult.title;
                String[] strArr4 = faqSearchResult.path;
                if (i10 < arrayList.size() - 1) {
                    z11 = true;
                }
                c7Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int f10 = ic.a.f(1, i10, arrayList);
        MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.d.get(f10);
        String str3 = faqSearchResult2.title;
        String[] strArr5 = faqSearchResult2.path;
        if (f10 < arrayList.size() - 1) {
            z11 = true;
        }
        c7Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View c7Var;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                c7Var = new org.telegram.ui.Cells.q4(context, 16);
            } else {
                c7Var = new org.telegram.ui.Cells.z3(context, null);
            }
        } else {
            c7Var = new org.telegram.ui.Cells.c7(context);
        }
        c7Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(c7Var);
    }
}
