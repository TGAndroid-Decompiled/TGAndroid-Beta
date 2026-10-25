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
public class u01 extends org.telegram.ui.Components.lm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public t01[] f43960c;
    public final org.telegram.ui.ActionBar.r2 e;
    public final int f43961f;
    public final Context h;
    public boolean f43965w;
    public fy0 f43966x;
    public String f43967y;
    public final ArrayList d = new ArrayList();
    public ArrayList f43962n = new ArrayList();
    public ArrayList f43963r = new ArrayList();
    public ArrayList f43964s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public u01(Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        this.e = r2Var;
        this.f43961f = r2Var.getCurrentAccount();
        this.h = context;
        this.f43960c = H(r2Var);
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

    public static t01[] H(final org.telegram.ui.ActionBar.r2 r2Var) {
        t01 t01Var;
        t01 t01Var2;
        t01 t01Var3;
        t01 t01Var4;
        t01 t01Var5;
        t01 t01Var6;
        t01 t01Var7;
        t01 t01Var8;
        t01 t01Var9;
        t01 t01Var10;
        t01 t01Var11;
        t01 t01Var12;
        t01 t01Var13;
        t01 t01Var14;
        t01 t01Var15;
        t01 t01Var16;
        t01 t01Var17;
        t01 t01Var18;
        t01 t01Var19;
        t01 t01Var20;
        t01 t01Var21;
        t01 t01Var22;
        t01 t01Var23;
        final int currentAccount = r2Var.getCurrentAccount();
        t01 t01Var24 = new t01(LocaleController.getString(R.string.EditName), 500, 0, new fy0(8, r2Var, r2Var.getResourceProvider()));
        t01 t01Var25 = new t01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var25.a("tg://settings/edit/change-number");
        t01 t01Var26 = new t01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var26.a("tg://settings/edit/add-account");
        t01 t01Var27 = new t01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var27.a("tg://settings/notifications");
        t01 t01Var28 = new t01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var28.a("tg://settings/notifications/private-chats");
        t01 t01Var29 = new t01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
        t01Var29.a("tg://settings/notifications/groups");
        t01 t01Var30 = new t01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(7, r2Var));
        t01Var30.a("tg://settings/notifications/channels");
        t01 t01Var31 = new t01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(19, r2Var));
        t01 t01Var32 = new t01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var33 = new t01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var34 = new t01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(23, r2Var));
        t01Var34.a("tg://settings/notifications/new-contacts");
        t01 t01Var35 = new t01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var35.a("tg://settings/notifications/pinned-messages");
        t01 t01Var36 = new t01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var36.a("tg://settings/notifications/reset");
        t01 t01Var37 = new t01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01 t01Var38 = new t01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01 t01Var39 = new t01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01 t01Var40 = new t01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var40.a("tg://settings/privacy");
        t01 t01Var41 = new t01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var41.a("tg://settings/privacy/2sv");
        t01 t01Var42 = new t01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            ybVar.f34998b.setText(spannableStringBuilder);
                            ybVar.f34998b.setSingleLine(false);
                            ybVar.f34998b.setMaxLines(2);
                            b02.b(ybVar, 2750).j();
                            return;
                        }
                        r2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        t01Var42.a("tg://settings/privacy/auto-delete");
        t01 t01Var43 = new t01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var43.a("tg://settings/privacy/passcode");
        t01 t01Var44 = null;
        if (SharedConfig.hasEmailLogin) {
            t01Var = t01Var41;
            t01Var2 = new t01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(360928);
                            tb0Var.W(64);
                            return;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(360928);
                            tb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(360928);
                            tb0Var3.W(256);
                            return;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(360928);
                            tb0Var4.W(32768);
                            return;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            return;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            return;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.f43726s;
                                if (i10 < arrayList.size()) {
                                    if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                        tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
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
            t01Var2.a("tg://settings/privacy/login-email");
        } else {
            t01Var = t01Var41;
            t01Var2 = null;
        }
        t01 t01Var45 = new t01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var45.a("tg://settings/privacy/blocked");
        t01 t01Var46 = new t01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var46.a("tg://settings/devices");
        t01 t01Var47 = new t01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var47.a("tg://settings/privacy/phone-number/");
        t01 t01Var48 = new t01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var48.a("tg://settings/privacy/last-seen");
        t01 t01Var49 = new t01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var49.a("tg://settings/privacy/profile-photos");
        t01 t01Var50 = new t01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var50.a("tg://settings/privacy/forwards");
        t01 t01Var51 = new t01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var51.a("tg://settings/privacy/calls/p2p");
        t01 t01Var52 = new t01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var52.a("tg://settings/privacy/calls");
        t01 t01Var53 = new t01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var53.a("tg://settings/privacy/invites");
        t01 t01Var54 = new t01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() {
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
                            ybVar.f34998b.setText(spannableStringBuilder);
                            ybVar.f34998b.setSingleLine(false);
                            ybVar.f34998b.setMaxLines(2);
                            b02.b(ybVar, 2750).j();
                            return;
                        }
                        r2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        t01Var54.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            t01Var3 = t01Var54;
            t01Var4 = new t01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                                r2Var.presentFragment(new gg0(i10));
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
                            r2Var.presentFragment(new lu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            t01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            t01Var3 = t01Var54;
            t01Var4 = null;
        }
        t01 t01Var55 = new t01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var55.a("tg://settings/privacy/self-destruct");
        t01 t01Var56 = new t01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        t01 t01Var57 = new t01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var57.a("tg://settings/privacy/active-websites");
        t01 t01Var58 = new t01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var58.a("tg://settings/privacy/data-settings/delete-synced");
        t01 t01Var59 = new t01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        t01 t01Var60 = new t01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        t01 t01Var61 = new t01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var61.a("tg://settings/privacy/data-settings/map-provider");
        t01 t01Var62 = new t01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var62.a("tg://settings/privacy/data-settings/link-previews");
        t01 t01Var63 = new t01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var63.a("tg://settings/devices");
        t01 t01Var64 = new t01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var64.a("tg://settings/devices/terminate-sessions");
        t01 t01Var65 = new t01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var65.a("tg://settings/devices/link-desktop");
        t01 t01Var66 = new t01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var66.a("tg://settings/privacy/data-settings");
        t01 t01Var67 = new t01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01 t01Var68 = new t01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var68.a("tg://settings/data/storage");
        t01 t01Var69 = new t01(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01 t01Var70 = new t01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01 t01Var71 = new t01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01 t01Var72 = new t01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
                            r2Var.presentFragment(new gg0(i10));
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
                        r2Var.presentFragment(new lu());
                        return;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        t01Var72.a("tg://settings/data/usage");
        t01 t01Var73 = new t01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var74 = new t01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var75 = new t01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var76 = new t01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var77 = new t01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01Var77.a("tg://settings/data/auto-download/reset");
        t01 t01Var78 = new t01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var79 = new t01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var80 = new t01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var81 = new t01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01Var81.a("tg://settings/data/use-less-data");
        t01 t01Var82 = new t01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var83 = new t01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01Var83.a("tg://settings/data/proxy");
        t01 t01Var84 = new t01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        t01 t01Var85 = new t01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() {
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
        t01 t01Var86 = new t01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
        t01Var86.a("tg://settings/data/save-to-photos/chats");
        t01 t01Var87 = new t01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() {
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
        t01Var87.a("tg://settings/data/save-to-photos/groups");
        t01 t01Var88 = new t01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ci0(2, r2Var));
        t01Var88.a("tg://settings/data/save-to-photos/channels");
        t01 t01Var89 = new t01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ci0(3, r2Var));
        t01Var89.a("tg://settings/appearance/themes");
        t01 t01Var90 = new t01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(4, r2Var));
        t01Var90.a("tg://settings/appearance/text-size");
        t01 t01Var91 = new t01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(5, r2Var));
        t01Var91.a("tg://settings/appearance/wallpapers");
        t01 t01Var92 = new t01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(6, r2Var));
        t01 t01Var93 = new t01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(8, r2Var));
        t01 t01Var94 = new t01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(9, r2Var));
        t01 t01Var95 = new t01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(10, r2Var));
        t01 t01Var96 = new t01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ci0(11, r2Var));
        t01Var96.a("tg://settings/appearance/themes/create");
        t01 t01Var97 = new t01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(13, r2Var));
        t01Var97.a("tg://settings/appearance/message-corners");
        t01 t01Var98 = new t01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(14, r2Var));
        t01 t01Var99 = new t01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(15, r2Var));
        t01 t01Var100 = new t01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(16, r2Var));
        t01Var100.a("tg://settings/appearance/app-icon");
        t01 t01Var101 = new t01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(17, r2Var));
        t01 t01Var102 = new t01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(18, r2Var));
        t01Var102.a("tg://settings/appearance/tap-for-next-media");
        t01 t01Var103 = new t01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(20, r2Var));
        t01Var103.a("tg://settings/data/raise-to-listen");
        t01 t01Var104 = new t01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(21, r2Var));
        t01Var104.a("tg://settings/data/raise-to-speak");
        t01 t01Var105 = new t01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(22, r2Var));
        t01Var105.a("tg://settings/data/pause-music");
        t01 t01Var106 = new t01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(24, r2Var));
        t01 t01Var107 = new t01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(25, r2Var));
        t01 t01Var108 = new t01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(26, r2Var));
        t01 t01Var109 = new t01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(27, r2Var));
        t01 t01Var110 = new t01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ci0(28, r2Var));
        t01Var110.a("tg://settings/appearance/stickers-and-emoji");
        t01 t01Var111 = new t01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ci0(29, r2Var));
        t01 t01Var112 = new t01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var113 = new t01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var114 = new t01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        t01 t01Var115 = new t01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var116 = new t01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        t01 t01Var117 = new t01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var118 = new t01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        t01 t01Var119 = new t01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        t01 t01Var120 = new t01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var121 = new t01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        t01 t01Var122 = new t01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var122.a("tg://settings/folders");
        t01 t01Var123 = new t01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            t01Var5 = t01Var123;
            t01Var6 = t01Var114;
            t01Var7 = t01Var116;
            t01Var8 = t01Var118;
            t01Var9 = new t01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(360928);
                            tb0Var.W(64);
                            return;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(360928);
                            tb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(360928);
                            tb0Var3.W(256);
                            return;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(360928);
                            tb0Var4.W(32768);
                            return;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            return;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            return;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.f43726s;
                                if (i10 < arrayList.size()) {
                                    if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                        tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
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
            t01Var5 = t01Var123;
            t01Var6 = t01Var114;
            t01Var7 = t01Var116;
            t01Var8 = t01Var118;
            t01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            t01Var10 = new t01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(360928);
                            tb0Var.W(64);
                            return;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(360928);
                            tb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(360928);
                            tb0Var3.W(256);
                            return;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(360928);
                            tb0Var4.W(32768);
                            return;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            return;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            return;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.f43726s;
                                if (i10 < arrayList.size()) {
                                    if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                        tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
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
            t01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            t01Var11 = new t01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(360928);
                            tb0Var.W(64);
                            return;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(360928);
                            tb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(360928);
                            tb0Var3.W(256);
                            return;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(360928);
                            tb0Var4.W(32768);
                            return;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            return;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            return;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.f43726s;
                                if (i10 < arrayList.size()) {
                                    if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                        tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
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
            t01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            t01Var12 = new t01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                r2Var.presentFragment(new gg0(i10));
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
                            r2Var.presentFragment(new lu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            t01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            t01Var13 = new t01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                r2Var.presentFragment(new gg0(i10));
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
                            r2Var.presentFragment(new lu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            t01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            t01Var14 = new t01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                                r2Var.presentFragment(new gg0(i10));
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
                            r2Var.presentFragment(new lu());
                            return;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            t01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            t01Var15 = new t01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            t01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            t01Var16 = new t01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
            t01Var16 = null;
        }
        if (F(currentAccount, 5)) {
            t01Var17 = new t01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ci0(12, r2Var));
        } else {
            t01Var17 = null;
        }
        if (F(currentAccount, 9)) {
            t01Var18 = new t01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            r2Var.presentFragment(new g21());
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
                            r2Var.presentFragment(new tb0());
                            return;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            return;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            return;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(28700);
                            tb0Var5.W(16388);
                            return;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(28700);
                            tb0Var6.W(8200);
                            return;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(28700);
                            tb0Var7.W(4112);
                            return;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(360928);
                            return;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(360928);
                            tb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            t01Var18 = null;
        }
        if (F(currentAccount, 6)) {
            t01Var19 = new t01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            r2Var.presentFragment(new g21());
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
                            r2Var.presentFragment(new tb0());
                            return;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            return;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            return;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(28700);
                            tb0Var5.W(16388);
                            return;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(28700);
                            tb0Var6.W(8200);
                            return;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(28700);
                            tb0Var7.W(4112);
                            return;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(360928);
                            return;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(360928);
                            tb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            t01Var19 = null;
        }
        if (F(currentAccount, 7)) {
            t01Var20 = new t01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            r2Var.presentFragment(new g21());
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
                            r2Var.presentFragment(new tb0());
                            return;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            return;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            return;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(28700);
                            tb0Var5.W(16388);
                            return;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(28700);
                            tb0Var6.W(8200);
                            return;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(28700);
                            tb0Var7.W(4112);
                            return;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(360928);
                            return;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(360928);
                            tb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            t01Var20 = null;
        }
        if (F(currentAccount, 10)) {
            t01Var21 = new t01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            r2Var.presentFragment(new g21());
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
                            r2Var.presentFragment(new tb0());
                            return;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            return;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            return;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(28700);
                            tb0Var5.W(16388);
                            return;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(28700);
                            tb0Var6.W(8200);
                            return;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(28700);
                            tb0Var7.W(4112);
                            return;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(360928);
                            return;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(360928);
                            tb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            t01Var21 = null;
        }
        if (F(currentAccount, 12)) {
            t01Var22 = new t01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
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
                            r2Var.presentFragment(new g21());
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
                            r2Var.presentFragment(new tb0());
                            return;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            return;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            return;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            return;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(28700);
                            return;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(28700);
                            tb0Var5.W(16388);
                            return;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(28700);
                            tb0Var6.W(8200);
                            return;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(28700);
                            tb0Var7.W(4112);
                            return;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(360928);
                            return;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(360928);
                            tb0Var9.W(32);
                            return;
                    }
                }
            });
        } else {
            t01Var22 = null;
        }
        t01 t01Var124 = new t01(900, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var124.a("tg://settings/power-saving");
        t01 t01Var125 = new t01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var125.a("tg://settings/power-saving/stickers");
        t01 t01Var126 = new t01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var127 = new t01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var128 = new t01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var128.a("tg://settings/power-saving/emoji");
        t01 t01Var129 = new t01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var130 = new t01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var131 = new t01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01 t01Var132 = new t01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var132.a("tg://settings/power-saving/effects");
        t01 t01Var133 = new t01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
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
                        r2Var.presentFragment(new g21());
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
                        r2Var.presentFragment(new tb0());
                        return;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        return;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        return;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        return;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(28700);
                        return;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(28700);
                        tb0Var5.W(16388);
                        return;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(28700);
                        tb0Var6.W(8200);
                        return;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(28700);
                        tb0Var7.W(4112);
                        return;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(360928);
                        return;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(360928);
                        tb0Var9.W(32);
                        return;
                }
            }
        });
        t01Var133.a("tg://settings/power-saving/background");
        t01 t01Var134 = new t01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01 t01Var135 = new t01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
            t01Var23 = new t01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(360928);
                            tb0Var.W(64);
                            return;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(360928);
                            tb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(360928);
                            tb0Var3.W(256);
                            return;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(360928);
                            tb0Var4.W(32768);
                            return;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            return;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            return;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.f43726s;
                                if (i10 < arrayList.size()) {
                                    if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                        tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
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
            t01Var23 = null;
        }
        t01 t01Var136 = new t01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01 t01Var137 = new t01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var137.a("tg://settings/power-saving/call-animations");
        t01 t01Var138 = new t01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var138.a("tg://settings/power-saving/videos");
        t01 t01Var139 = new t01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var139.a("tg://settings/power-saving/gifs");
        t01 t01Var140 = new t01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var140.a("tg://settings/power-saving/transitions");
        t01 t01Var141 = new t01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var141.a("tg://settings/language");
        t01 t01Var142 = new t01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            t01 t01Var143 = new t01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(360928);
                            tb0Var.W(64);
                            return;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(360928);
                            tb0Var2.W(128);
                            return;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(360928);
                            tb0Var3.W(256);
                            return;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(360928);
                            tb0Var4.W(32768);
                            return;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            return;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            return;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            return;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i10 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.f43726s;
                                if (i10 < arrayList.size()) {
                                    if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                        tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
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
            t01Var143.a("tg://settings/language/do-not-translate");
            t01Var44 = t01Var143;
        }
        t01 t01Var144 = new t01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var144.a("tg://settings/ask-question");
        t01 t01Var145 = new t01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var145.a("tg://settings/faq");
        t01 t01Var146 = new t01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(360928);
                        tb0Var.W(64);
                        return;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(360928);
                        tb0Var2.W(128);
                        return;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(360928);
                        tb0Var3.W(256);
                        return;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(360928);
                        tb0Var4.W(32768);
                        return;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        return;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        return;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        return;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i10 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.f43726s;
                            if (i10 < arrayList.size()) {
                                if (((nb0) arrayList.get(i10)).f41830f == 1) {
                                    tb0Var8.f43721b.e1(new i2.r(tb0Var8, i10, 13), 700, true);
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
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
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
        t01Var146.a("tg://settings/privacy-policy");
        return new t01[]{t01Var24, t01Var25, t01Var26, t01Var27, t01Var28, t01Var29, t01Var30, t01Var31, t01Var32, t01Var33, t01Var34, t01Var35, t01Var36, t01Var37, t01Var38, t01Var39, t01Var40, t01Var, t01Var42, t01Var43, t01Var2, t01Var45, t01Var46, t01Var47, t01Var48, t01Var49, t01Var50, t01Var51, t01Var52, t01Var53, t01Var3, t01Var4, t01Var55, t01Var56, t01Var57, t01Var58, t01Var59, t01Var60, t01Var61, t01Var62, t01Var63, t01Var64, t01Var65, t01Var66, t01Var67, t01Var68, t01Var69, t01Var70, t01Var71, t01Var72, t01Var73, t01Var74, t01Var75, t01Var76, t01Var77, t01Var78, t01Var79, t01Var80, t01Var81, t01Var82, t01Var83, t01Var84, t01Var85, t01Var86, t01Var87, t01Var88, t01Var89, t01Var90, t01Var91, t01Var92, t01Var93, t01Var94, t01Var95, t01Var96, t01Var97, t01Var98, t01Var99, t01Var100, t01Var101, t01Var102, t01Var103, t01Var104, t01Var105, t01Var106, t01Var107, t01Var108, t01Var109, t01Var110, t01Var111, t01Var112, t01Var113, t01Var6, t01Var115, t01Var7, t01Var117, t01Var8, t01Var119, t01Var120, t01Var121, t01Var122, t01Var5, t01Var9, t01Var10, t01Var11, t01Var12, t01Var13, t01Var14, t01Var15, t01Var16, t01Var17, t01Var18, t01Var19, t01Var20, t01Var21, t01Var22, t01Var124, t01Var125, t01Var126, t01Var127, t01Var128, t01Var129, t01Var130, t01Var131, t01Var132, t01Var133, t01Var134, t01Var135, t01Var23, t01Var136, t01Var137, t01Var138, t01Var139, t01Var140, t01Var141, t01Var142, t01Var44, t01Var144, t01Var145, t01Var146};
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 0) {
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
        if (!this.f43965w) {
            l();
        }
        if (arrayList.size() > 20) {
            a1.g.A(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof t01) {
                ((t01) obj2).f43641g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f43961f;
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
        this.f43967y = str;
        if (this.f43966x != null) {
            Utilities.searchQueue.cancelRunnable(this.f43966x);
            this.f43966x = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f43965w = false;
            this.f43963r.clear();
            this.f43964s.clear();
            this.f43962n.clear();
            org.telegram.ui.ActionBar.r2 r2Var = this.e;
            if (r2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) r2Var).O.f28013b.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.e).O.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        fy0 fy0Var = new fy0(9, this, str);
        this.f43966x = fy0Var;
        dispatchQueue2.postRunnable(fy0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        t01 t01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            t01[] t01VarArr = this.f43960c;
            if (i10 >= t01VarArr.length) {
                break;
            }
            t01 t01Var2 = t01VarArr[i10];
            if (t01Var2 != null) {
                hashMap.put(Integer.valueOf(t01Var2.f43640f), this.f43960c[i10]);
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
                    } else if (readInt322 == 1 && (t01Var = (t01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        t01Var.f43641g = readInt32;
                        arrayList.add(t01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new bv(this));
    }

    @Override
    public final int h() {
        int size;
        int i10 = 0;
        if (this.f43965w) {
            int size2 = this.f43963r.size();
            if (!this.f43964s.isEmpty()) {
                i10 = this.f43964s.size() + 1;
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
        if (this.f43965w) {
            if (i10 < this.f43963r.size() || i10 != this.f43963r.size()) {
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
        t01 t01Var;
        int i11;
        int i12 = e1Var.f47738f;
        View view = e1Var.f47735a;
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
        if (this.f43965w) {
            if (i10 < this.f43963r.size()) {
                t01 t01Var2 = (t01) this.f43963r.get(i10);
                if (i10 > 0) {
                    t01Var = (t01) this.f43963r.get(i10 - 1);
                } else {
                    t01Var = null;
                }
                if (t01Var != null && t01Var.e == t01Var2.e) {
                    i11 = 0;
                } else {
                    i11 = t01Var2.e;
                }
                CharSequence charSequence = (CharSequence) this.f43962n.get(i10);
                String[] strArr = t01Var2.d;
                if (i10 >= this.f43963r.size() - 1) {
                    z10 = false;
                }
                c7Var.b(charSequence, strArr, i11, z10);
                return;
            }
            int f7 = ic.a.f(1, i10, this.f43963r);
            CharSequence charSequence2 = (CharSequence) this.f43962n.get(this.f43963r.size() + f7);
            String[] strArr2 = ((MessagesController.FaqSearchResult) this.f43964s.get(f7)).path;
            if (f7 < this.f43963r.size() - 1) {
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
            if (obj instanceof t01) {
                t01 t01Var3 = (t01) obj;
                String str = t01Var3.f43637a;
                String[] strArr3 = t01Var3.d;
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
