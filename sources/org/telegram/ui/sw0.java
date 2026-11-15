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
public class sw0 extends org.telegram.ui.Components.tj0 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public rw0[] f51286c;
    public final org.telegram.ui.ActionBar.e2 f51287e;
    public final int f51288f;
    public final Context h;
    public boolean f51293x;
    public mp0 f51294y;
    public final ArrayList d = new ArrayList();
    public ArrayList f51289n = new ArrayList();
    public ArrayList f51290r = new ArrayList();
    public ArrayList f51291s = new ArrayList();
    public final ArrayList f51292w = new ArrayList();

    public sw0(Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f51287e = e2Var;
        this.f51288f = e2Var.getCurrentAccount();
        this.h = context;
        this.f51286c = H(e2Var);
        J();
    }

    public static boolean F(int i7, int i10) {
        if (org.telegram.messenger.np.s1(i7).D3() && !org.telegram.messenger.m10.i(i7).q()) {
            return false;
        }
        if (i10 != -1 && org.telegram.messenger.np.s1(i7).O0.get(i10, -1) == -1) {
            return false;
        }
        return true;
    }

    public static rw0[] H(final org.telegram.ui.ActionBar.e2 e2Var) {
        rw0 rw0Var;
        rw0 rw0Var2;
        rw0 rw0Var3;
        rw0 rw0Var4;
        rw0 rw0Var5;
        rw0 rw0Var6;
        rw0 rw0Var7;
        rw0 rw0Var8;
        rw0 rw0Var9;
        rw0 rw0Var10;
        rw0 rw0Var11;
        rw0 rw0Var12;
        rw0 rw0Var13;
        rw0 rw0Var14;
        rw0 rw0Var15;
        rw0 rw0Var16;
        rw0 rw0Var17;
        rw0 rw0Var18;
        rw0 rw0Var19;
        rw0 rw0Var20;
        rw0 rw0Var21;
        rw0 rw0Var22;
        rw0 rw0Var23;
        final int currentAccount = e2Var.getCurrentAccount();
        rw0 rw0Var24 = new rw0(500, org.telegram.messenger.hd.L0(2131751264), 0, new mp0(23, e2Var, e2Var.getResourceProvider()));
        rw0 rw0Var25 = new rw0(501, org.telegram.messenger.hd.L0(2131752537), 0, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var25.a("tg://settings/edit/change-number");
        rw0 rw0Var26 = new rw0(502, org.telegram.messenger.hd.L0(2131754468), 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var26.a("tg://settings/edit/add-account");
        rw0 rw0Var27 = new rw0(1, org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var27.a("tg://settings/notifications");
        rw0 rw0Var28 = new rw0(2, org.telegram.messenger.hd.L0(2131747878), org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var28.a("tg://settings/notifications/private-chats");
        rw0 rw0Var29 = new rw0(3, org.telegram.messenger.hd.L0(2131747907), org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0Var29.a("tg://settings/notifications/groups");
        rw0 rw0Var30 = new rw0(4, org.telegram.messenger.hd.L0(2131747921), org.telegram.messenger.hd.L0(2131747922), 2131232263, new tf0(7, e2Var));
        rw0Var30.a("tg://settings/notifications/channels");
        rw0 rw0Var31 = new rw0(5, org.telegram.messenger.hd.L0(2131743279), "callsSectionRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new tf0(19, e2Var));
        rw0 rw0Var32 = new rw0(6, org.telegram.messenger.hd.L0(2131753733), "badgeNumberSection", org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var33 = new rw0(7, org.telegram.messenger.hd.L0(2131749219), "inappSectionRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var34 = new rw0(8, org.telegram.messenger.hd.L0(2131751790), "contactJoinedRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new tf0(23, e2Var));
        rw0Var34.a("tg://settings/notifications/new-contacts");
        rw0 rw0Var35 = new rw0(9, org.telegram.messenger.hd.L0(2131747228), "pinnedMessageRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var35.a("tg://settings/notifications/pinned-messages");
        rw0 rw0Var36 = new rw0(10, org.telegram.messenger.hd.L0(2131746112), "resetNotificationsRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var36.a("tg://settings/notifications/reset");
        rw0 rw0Var37 = new rw0(11, org.telegram.messenger.hd.L0(2131747876), "notificationsServiceRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0 rw0Var38 = new rw0(12, org.telegram.messenger.hd.L0(2131747875), "notificationsServiceConnectionRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0 rw0Var39 = new rw0(13, org.telegram.messenger.hd.L0(2131746275), "repeatRow", org.telegram.messenger.hd.L0(2131747922), 2131232263, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0 rw0Var40 = new rw0(100, org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var40.a("tg://settings/privacy");
        rw0 rw0Var41 = new rw0(109, org.telegram.messenger.hd.L0(2131743938), org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var41.a("tg://settings/privacy/2sv");
        rw0 rw0Var42 = new rw0(124, org.telegram.messenger.hd.L0(2131753850), org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.m10.i(i10).f24957q0 >= 0) {
                            e2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.m10.i(i10).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(e2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(a02.W(), null);
                            fbVar.d(2131624347, new String[0]);
                            String M0 = org.telegram.messenger.hd.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.ha(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            fbVar.f34552b.setText(spannableStringBuilder);
                            fbVar.f34552b.setSingleLine(false);
                            fbVar.f34552b.setMaxLines(2);
                            a02.b(fbVar, 2750).j();
                            return;
                        }
                        e2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        rw0Var42.a("tg://settings/privacy/auto-delete");
        rw0 rw0Var43 = new rw0(108, org.telegram.messenger.hd.L0(2131747657), org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var43.a("tg://settings/privacy/passcode");
        rw0 rw0Var44 = null;
        if (org.telegram.messenger.gz.f23963m1) {
            rw0Var = rw0Var41;
            rw0Var2 = new rw0(125, org.telegram.messenger.hd.L0(2131751202), "emailLoginRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i7) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            return;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            return;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            return;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            return;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            return;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            return;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            return;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.f53132s;
                                if (i10 < arrayList.size()) {
                                    if (((s90) arrayList.get(i10)).f51163f == 1) {
                                        x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            return;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            return;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            return;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            return;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            rw0Var2.a("tg://settings/privacy/login-email");
        } else {
            rw0Var = rw0Var41;
            rw0Var2 = null;
        }
        rw0 rw0Var45 = new rw0(101, org.telegram.messenger.hd.L0(2131753681), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var45.a("tg://settings/privacy/blocked");
        rw0 rw0Var46 = new rw0(110, org.telegram.messenger.hd.L0(2131745551), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var46.a("tg://settings/devices");
        rw0 rw0Var47 = new rw0(105, org.telegram.messenger.hd.L0(2131746790), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var47.a("tg://settings/privacy/phone-number/");
        rw0 rw0Var48 = new rw0(102, org.telegram.messenger.hd.L0(2131746815), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var48.a("tg://settings/privacy/last-seen");
        rw0 rw0Var49 = new rw0(103, org.telegram.messenger.hd.L0(2131746777), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var49.a("tg://settings/privacy/profile-photos");
        rw0 rw0Var50 = new rw0(104, org.telegram.messenger.hd.L0(2131746837), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var50.a("tg://settings/privacy/forwards");
        rw0 rw0Var51 = new rw0(122, org.telegram.messenger.hd.L0(2131746800), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var51.a("tg://settings/privacy/calls/p2p");
        rw0 rw0Var52 = new rw0(106, org.telegram.messenger.hd.L0(2131752596), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var52.a("tg://settings/privacy/calls");
        rw0 rw0Var53 = new rw0(107, org.telegram.messenger.hd.L0(2131746817), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var53.a("tg://settings/privacy/invites");
        rw0 rw0Var54 = new rw0(123, org.telegram.messenger.hd.L0(2131746758), org.telegram.messenger.hd.L0(2131746771), 2131232356, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.m10.i(i10).f24957q0 >= 0) {
                            e2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.m10.i(i10).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(e2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(a02.W(), null);
                            fbVar.d(2131624347, new String[0]);
                            String M0 = org.telegram.messenger.hd.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.ha(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            fbVar.f34552b.setText(spannableStringBuilder);
                            fbVar.f34552b.setSingleLine(false);
                            fbVar.f34552b.setMaxLines(2);
                            a02.b(fbVar, 2750).j();
                            return;
                        }
                        e2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        rw0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.np.s1(currentAccount).Z3) {
            rw0Var3 = rw0Var54;
            rw0Var4 = new rw0(121, org.telegram.messenger.hd.L0(2131754171), "newChatsRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.m10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                e2Var.presentFragment(new ce0(i7));
                                return;
                            }
                            return;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            e2Var.presentFragment(new y6());
                            return;
                        case 24:
                            e2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            e2Var.presentFragment(new y6());
                            return;
                        case 27:
                            e2Var.presentFragment(new y6());
                            return;
                        case 28:
                            e2Var.presentFragment(new nt());
                            return;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            rw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            rw0Var3 = rw0Var54;
            rw0Var4 = null;
        }
        rw0 rw0Var55 = new rw0(112, org.telegram.messenger.hd.L0(2131751596), "deleteAccountRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var55.a("tg://settings/privacy/self-destruct");
        rw0 rw0Var56 = new rw0(113, org.telegram.messenger.hd.L0(2131746797), "paymentsClearRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        rw0 rw0Var57 = new rw0(114, org.telegram.messenger.hd.L0(2131742911), org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var57.a("tg://settings/privacy/active-websites");
        rw0 rw0Var58 = new rw0(115, org.telegram.messenger.hd.L0(2131744296), "contactsDeleteRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        rw0 rw0Var59 = new rw0(116, org.telegram.messenger.hd.L0(2131744298), "contactsSyncRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        rw0 rw0Var60 = new rw0(117, org.telegram.messenger.hd.L0(2131744412), "contactsSuggestRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        rw0 rw0Var61 = new rw0(118, org.telegram.messenger.hd.L0(2131748689), "secretMapRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var61.a("tg://settings/privacy/data-settings/map-provider");
        rw0 rw0Var62 = new rw0(119, org.telegram.messenger.hd.L0(2131745684), "secretWebpageRow", org.telegram.messenger.hd.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var62.a("tg://settings/privacy/data-settings/link-previews");
        rw0 rw0Var63 = new rw0(120, org.telegram.messenger.hd.L0(2131751455), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var63.a("tg://settings/devices");
        rw0 rw0Var64 = new rw0(121, org.telegram.messenger.hd.L0(2131744208), "terminateAllSessionsRow", org.telegram.messenger.hd.L0(2131751455), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var64.a("tg://settings/devices/terminate-sessions");
        rw0 rw0Var65 = new rw0(122, org.telegram.messenger.hd.L0(2131748917), org.telegram.messenger.hd.L0(2131751455), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var65.a("tg://settings/devices/link-desktop");
        rw0 rw0Var66 = new rw0(200, org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var66.a("tg://settings/privacy/data-settings");
        rw0 rw0Var67 = new rw0(201, org.telegram.messenger.hd.L0(2131751676), "usageSectionRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0 rw0Var68 = new rw0(202, org.telegram.messenger.hd.L0(2131744816), org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var68.a("tg://settings/data/storage");
        rw0 rw0Var69 = new rw0(203, org.telegram.messenger.hd.L0(2131749060), "keepMediaRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131744816), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0 rw0Var70 = new rw0(204, org.telegram.messenger.hd.L0(2131752075), "cacheRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131744816), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0 rw0Var71 = new rw0(205, org.telegram.messenger.hd.L0(2131748774), "databaseRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131744816), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0 rw0Var72 = new rw0(206, org.telegram.messenger.hd.L0(2131748298), org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.m10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            e2Var.presentFragment(new ce0(i7));
                            return;
                        }
                        return;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        e2Var.presentFragment(new y6());
                        return;
                    case 24:
                        e2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 26:
                        e2Var.presentFragment(new y6());
                        return;
                    case 27:
                        e2Var.presentFragment(new y6());
                        return;
                    case 28:
                        e2Var.presentFragment(new nt());
                        return;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        rw0Var72.a("tg://settings/data/usage");
        rw0 rw0Var73 = new rw0(207, org.telegram.messenger.hd.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var74 = new rw0(208, org.telegram.messenger.hd.L0(2131742884), org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var75 = new rw0(209, org.telegram.messenger.hd.L0(2131742886), org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var76 = new rw0(210, org.telegram.messenger.hd.L0(2131742885), org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var77 = new rw0(211, org.telegram.messenger.hd.L0(2131746111), "resetDownloadRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0Var77.a("tg://settings/data/auto-download/reset");
        rw0 rw0Var78 = new rw0(215, org.telegram.messenger.hd.L0(2131744438), "streamSectionRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var79 = new rw0(216, org.telegram.messenger.hd.L0(2131751144), "enableStreamRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var80 = new rw0(217, org.telegram.messenger.hd.L0(2131752596), "callsSectionRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var81 = new rw0(218, org.telegram.messenger.hd.L0(2131743229), "useLessDataForCallsRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0Var81.a("tg://settings/data/use-less-data");
        rw0 rw0Var82 = new rw0(219, org.telegram.messenger.hd.L0(2131743258), "quickRepliesRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var83 = new rw0(220, org.telegram.messenger.hd.L0(2131746601), org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0Var83.a("tg://settings/data/proxy");
        rw0 rw0Var84 = new rw0(111, org.telegram.messenger.hd.L0(2131746841), "clearDraftsRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        rw0 rw0Var85 = new rw0(222, org.telegram.messenger.hd.L0(2131745929), "saveToGallerySectionRow", org.telegram.messenger.hd.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0 rw0Var86 = new rw0(223, org.telegram.messenger.hd.L0(2131745919), "saveToGalleryPeerRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131745929), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0Var86.a("tg://settings/data/save-to-photos/chats");
        rw0 rw0Var87 = new rw0(224, org.telegram.messenger.hd.L0(2131745926), "saveToGalleryGroupsRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131745929), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                }
            }
        });
        rw0Var87.a("tg://settings/data/save-to-photos/groups");
        rw0 rw0Var88 = new rw0(225, org.telegram.messenger.hd.L0(2131745928), "saveToGalleryChannelsRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131745929), 2131232023, new tf0(2, e2Var));
        rw0Var88.a("tg://settings/data/save-to-photos/channels");
        rw0 rw0Var89 = new rw0(300, org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(3, e2Var));
        rw0Var89.a("tg://settings/appearance/themes");
        rw0 rw0Var90 = new rw0(301, org.telegram.messenger.hd.L0(2131744191), "textSizeHeaderRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(4, e2Var));
        rw0Var90.a("tg://settings/appearance/text-size");
        rw0 rw0Var91 = new rw0(302, org.telegram.messenger.hd.L0(2131752550), org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(5, e2Var));
        rw0Var91.a("tg://settings/appearance/wallpapers");
        rw0 rw0Var92 = new rw0(303, org.telegram.messenger.hd.L0(2131745538), null, org.telegram.messenger.hd.L0(2131752210), org.telegram.messenger.hd.L0(2131752244), 2131232025, new tf0(6, e2Var));
        rw0 rw0Var93 = new rw0(304, org.telegram.messenger.hd.L0(2131746108), "resetRow", org.telegram.messenger.hd.L0(2131752210), org.telegram.messenger.hd.L0(2131752244), 2131232025, new tf0(8, e2Var));
        rw0 rw0Var94 = new rw0(306, org.telegram.messenger.hd.L0(2131752011), "themeHeaderRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(9, e2Var));
        rw0 rw0Var95 = new rw0(319, org.telegram.messenger.hd.L0(2131752878), null, org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(10, e2Var));
        rw0 rw0Var96 = new rw0(320, org.telegram.messenger.hd.L0(2131751712), "createNewThemeRow", org.telegram.messenger.hd.L0(2131752210), org.telegram.messenger.hd.L0(2131752878), 2131232025, new tf0(11, e2Var));
        rw0Var96.a("tg://settings/appearance/themes/create");
        rw0 rw0Var97 = new rw0(321, org.telegram.messenger.hd.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(13, e2Var));
        rw0Var97.a("tg://settings/appearance/message-corners");
        rw0 rw0Var98 = new rw0(322, org.telegram.messenger.hd.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(14, e2Var));
        rw0 rw0Var99 = new rw0(323, org.telegram.messenger.hd.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(15, e2Var));
        rw0 rw0Var100 = new rw0(324, org.telegram.messenger.hd.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(16, e2Var));
        rw0Var100.a("tg://settings/appearance/app-icon");
        rw0 rw0Var101 = new rw0(305, org.telegram.messenger.hd.L0(2131753784), org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(17, e2Var));
        rw0 rw0Var102 = new rw0(328, org.telegram.messenger.hd.L0(2131748249), "nextMediaTapRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(18, e2Var));
        rw0Var102.a("tg://settings/appearance/tap-for-next-media");
        rw0 rw0Var103 = new rw0(327, org.telegram.messenger.hd.L0(2131746427), "raiseToListenRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(20, e2Var));
        rw0Var103.a("tg://settings/data/raise-to-listen");
        rw0 rw0Var104 = new rw0(310, org.telegram.messenger.hd.L0(2131746425), "raiseToSpeakRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(21, e2Var));
        rw0Var104.a("tg://settings/data/raise-to-speak");
        rw0 rw0Var105 = new rw0(326, org.telegram.messenger.hd.L0(2131747432), "pauseOnMediaRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(22, e2Var));
        rw0Var105.a("tg://settings/data/pause-music");
        rw0 rw0Var106 = new rw0(325, org.telegram.messenger.hd.L0(2131748439), "bluetoothScoRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(24, e2Var));
        rw0 rw0Var107 = new rw0(308, org.telegram.messenger.hd.L0(2131751438), "directShareRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(25, e2Var));
        rw0 rw0Var108 = new rw0(311, org.telegram.messenger.hd.L0(2131745632), "sendByEnterRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(26, e2Var));
        rw0 rw0Var109 = new rw0(318, org.telegram.messenger.hd.L0(2131751367), "distanceRow", org.telegram.messenger.hd.L0(2131752210), 2131232025, new tf0(27, e2Var));
        rw0 rw0Var110 = new rw0(600, org.telegram.messenger.hd.L0(2131744857), 2131232039, new tf0(28, e2Var));
        rw0Var110.a("tg://settings/appearance/stickers-and-emoji");
        rw0 rw0Var111 = new rw0(601, org.telegram.messenger.hd.L0(2131744402), "suggestRow", org.telegram.messenger.hd.L0(2131744857), 2131232039, new tf0(29, e2Var));
        rw0 rw0Var112 = new rw0(602, org.telegram.messenger.hd.L0(2131750833), "featuredStickersHeaderRow", org.telegram.messenger.hd.L0(2131744857), 2131232039, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var113 = new rw0(603, org.telegram.messenger.hd.L0(2131748679), null, org.telegram.messenger.hd.L0(2131744857), 2131232039, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var114 = new rw0(604, org.telegram.messenger.hd.L0(2131754128), null, org.telegram.messenger.hd.L0(2131744857), 2131232039, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        rw0 rw0Var115 = new rw0(605, org.telegram.messenger.hd.L0(2131754133), null, org.telegram.messenger.hd.L0(2131744857), 2131232039, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var116 = new rw0(606, org.telegram.messenger.hd.L0(2131749034), "largeEmojiRow", org.telegram.messenger.hd.L0(2131744857), 2131232039, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        rw0 rw0Var117 = new rw0(607, org.telegram.messenger.hd.L0(2131748722), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748850), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var118 = new rw0(608, org.telegram.messenger.hd.L0(2131751196), null, org.telegram.messenger.hd.L0(2131744857), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        rw0 rw0Var119 = new rw0(609, org.telegram.messenger.hd.L0(2131744416), "suggestAnimatedEmojiRow", org.telegram.messenger.hd.L0(2131744857), org.telegram.messenger.hd.L0(2131751196), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        rw0 rw0Var120 = new rw0(610, org.telegram.messenger.hd.L0(2131750835), "featuredStickersHeaderRow", org.telegram.messenger.hd.L0(2131744857), org.telegram.messenger.hd.L0(2131751196), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var121 = new rw0(611, org.telegram.messenger.hd.L0(2131751350), null, org.telegram.messenger.hd.L0(2131744857), 2131232039, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        rw0 rw0Var122 = new rw0(700, org.telegram.messenger.hd.L0(2131750696), null, 2131232027, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var122.a("tg://settings/folders");
        rw0 rw0Var123 = new rw0(701, org.telegram.messenger.hd.L0(2131751716), "createFilterRow", org.telegram.messenger.hd.L0(2131750696), 2131232027, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            rw0Var5 = rw0Var123;
            rw0Var6 = rw0Var114;
            rw0Var7 = rw0Var116;
            rw0Var8 = rw0Var118;
            rw0Var9 = new rw0(800, org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i7) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            return;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            return;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            return;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            return;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            return;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            return;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            return;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.f53132s;
                                if (i10 < arrayList.size()) {
                                    if (((s90) arrayList.get(i10)).f51163f == 1) {
                                        x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            return;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            return;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            return;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            return;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            rw0Var5 = rw0Var123;
            rw0Var6 = rw0Var114;
            rw0Var7 = rw0Var116;
            rw0Var8 = rw0Var118;
            rw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            rw0Var10 = new rw0(801, org.telegram.messenger.hd.L0(2131746998), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i7) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            return;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            return;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            return;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            return;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            return;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            return;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            return;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.f53132s;
                                if (i10 < arrayList.size()) {
                                    if (((s90) arrayList.get(i10)).f51163f == 1) {
                                        x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            return;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            return;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            return;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            return;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            rw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            rw0Var11 = new rw0(802, org.telegram.messenger.hd.L0(2131747007), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i7) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            return;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            return;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            return;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            return;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            return;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            return;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            return;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.f53132s;
                                if (i10 < arrayList.size()) {
                                    if (((s90) arrayList.get(i10)).f51163f == 1) {
                                        x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            return;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            return;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            return;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            return;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            rw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            rw0Var12 = new rw0(803, org.telegram.messenger.hd.L0(2131746964), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.m10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                e2Var.presentFragment(new ce0(i7));
                                return;
                            }
                            return;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            e2Var.presentFragment(new y6());
                            return;
                        case 24:
                            e2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            e2Var.presentFragment(new y6());
                            return;
                        case 27:
                            e2Var.presentFragment(new y6());
                            return;
                        case 28:
                            e2Var.presentFragment(new nt());
                            return;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            rw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            rw0Var13 = new rw0(804, org.telegram.messenger.hd.L0(2131747012), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.m10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                e2Var.presentFragment(new ce0(i7));
                                return;
                            }
                            return;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            e2Var.presentFragment(new y6());
                            return;
                        case 24:
                            e2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            e2Var.presentFragment(new y6());
                            return;
                        case 27:
                            e2Var.presentFragment(new y6());
                            return;
                        case 28:
                            e2Var.presentFragment(new nt());
                            return;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            rw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            rw0Var14 = new rw0(805, org.telegram.messenger.hd.L0(2131746962), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.m10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                e2Var.presentFragment(new ce0(i7));
                                return;
                            }
                            return;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            e2Var.presentFragment(new y6());
                            return;
                        case 24:
                            e2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 26:
                            e2Var.presentFragment(new y6());
                            return;
                        case 27:
                            e2Var.presentFragment(new y6());
                            return;
                        case 28:
                            e2Var.presentFragment(new nt());
                            return;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            rw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            rw0Var15 = new rw0(806, org.telegram.messenger.hd.L0(2131746992), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            e2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            e2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            e2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 7:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            e2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                    }
                }
            });
        } else {
            rw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            rw0Var16 = new rw0(807, org.telegram.messenger.hd.L0(2131746983), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            e2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            e2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            e2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 7:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            e2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            e2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                    }
                }
            });
        } else {
            rw0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            rw0Var17 = new rw0(808, org.telegram.messenger.hd.L0(2131746976), org.telegram.messenger.hd.L0(2131744231), 2131232363, new tf0(12, e2Var));
        } else {
            rw0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            rw0Var18 = new rw0(809, org.telegram.messenger.hd.L0(2131747025), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            return;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            return;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            e2Var.presentFragment(new x90());
                            return;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            return;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            return;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            return;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            return;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            return;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            return;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            return;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            return;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            rw0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            rw0Var19 = new rw0(810, org.telegram.messenger.hd.L0(2131746987), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            return;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            return;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            e2Var.presentFragment(new x90());
                            return;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            return;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            return;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            return;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            return;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            return;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            return;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            return;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            return;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            rw0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            rw0Var20 = new rw0(811, org.telegram.messenger.hd.L0(2131747022), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            return;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            return;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            e2Var.presentFragment(new x90());
                            return;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            return;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            return;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            return;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            return;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            return;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            return;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            return;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            return;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            rw0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            rw0Var21 = new rw0(812, org.telegram.messenger.hd.L0(2131747020), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            return;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            return;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            e2Var.presentFragment(new x90());
                            return;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            return;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            return;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            return;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            return;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            return;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            return;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            return;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            return;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            rw0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            rw0Var22 = new rw0(813, org.telegram.messenger.hd.L0(2131747004), org.telegram.messenger.hd.L0(2131744231), 2131232363, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            return;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            return;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            return;
                        case 18:
                            e2Var.presentFragment(new x90());
                            return;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            return;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            return;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            return;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            return;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            return;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            return;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            return;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            return;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            rw0Var22 = null;
        }
        rw0 rw0Var124 = new rw0(900, org.telegram.messenger.hd.L0(2131747066), null, 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var124.a("tg://settings/power-saving");
        rw0 rw0Var125 = new rw0(901, org.telegram.messenger.hd.L0(2131748850), org.telegram.messenger.hd.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var125.a("tg://settings/power-saving/stickers");
        rw0 rw0Var126 = new rw0(902, org.telegram.messenger.hd.L0(2131748862), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748850), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var127 = new rw0(903, org.telegram.messenger.hd.L0(2131748864), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748850), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var128 = new rw0(904, org.telegram.messenger.hd.L0(2131748855), org.telegram.messenger.hd.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var128.a("tg://settings/power-saving/emoji");
        rw0 rw0Var129 = new rw0(905, org.telegram.messenger.hd.L0(2131748862), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748855), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var130 = new rw0(906, org.telegram.messenger.hd.L0(2131748861), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748855), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var131 = new rw0(907, org.telegram.messenger.hd.L0(2131748864), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748855), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0 rw0Var132 = new rw0(908, org.telegram.messenger.hd.L0(2131748856), org.telegram.messenger.hd.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var132.a("tg://settings/power-saving/effects");
        rw0 rw0Var133 = new rw0(909, org.telegram.messenger.hd.L0(2131748859), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        return;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        return;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        return;
                    case 18:
                        e2Var.presentFragment(new x90());
                        return;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        return;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        return;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        return;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        return;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        return;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        return;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        return;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        return;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        return;
                }
            }
        });
        rw0Var133.a("tg://settings/power-saving/background");
        rw0 rw0Var134 = new rw0(910, org.telegram.messenger.hd.L0(2131748847), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0 rw0Var135 = new rw0(911, org.telegram.messenger.hd.L0(2131748851), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (org.telegram.messenger.gz.o() >= 1) {
            rw0Var23 = new rw0(326, org.telegram.messenger.hd.L0(2131748858), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), 2131232019, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i7) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            return;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            return;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            return;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            return;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            return;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            return;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            return;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.f53132s;
                                if (i10 < arrayList.size()) {
                                    if (((s90) arrayList.get(i10)).f51163f == 1) {
                                        x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            return;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            return;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            return;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            return;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            rw0Var23 = null;
        }
        rw0 rw0Var136 = new rw0(912, org.telegram.messenger.hd.L0(2131748852), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0 rw0Var137 = new rw0(913, org.telegram.messenger.hd.L0(2131748857), org.telegram.messenger.hd.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var137.a("tg://settings/power-saving/call-animations");
        rw0 rw0Var138 = new rw0(214, org.telegram.messenger.hd.L0(2131748860), org.telegram.messenger.hd.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var138.a("tg://settings/power-saving/videos");
        rw0 rw0Var139 = new rw0(213, org.telegram.messenger.hd.L0(2131748863), org.telegram.messenger.hd.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var139.a("tg://settings/power-saving/gifs");
        rw0 rw0Var140 = new rw0(914, org.telegram.messenger.hd.L0(2131748846), org.telegram.messenger.hd.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var140.a("tg://settings/power-saving/transitions");
        rw0 rw0Var141 = new rw0(400, org.telegram.messenger.hd.L0(2131749054), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var141.a("tg://settings/language");
        rw0 rw0Var142 = new rw0(405, org.telegram.messenger.hd.L0(2131745327), org.telegram.messenger.hd.L0(2131749054), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.np.s1(currentAccount).T1().s()) {
            rw0 rw0Var143 = new rw0(406, org.telegram.messenger.hd.L0(2131751358), org.telegram.messenger.hd.L0(2131749054), 2131232030, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i7) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            return;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            return;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            return;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            return;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            return;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            return;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            return;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.f53132s;
                                if (i10 < arrayList.size()) {
                                    if (((s90) arrayList.get(i10)).f51163f == 1) {
                                        x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            return;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            return;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            return;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            return;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            return;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            rw0Var143.a("tg://settings/language/do-not-translate");
            rw0Var44 = rw0Var143;
        }
        rw0 rw0Var144 = new rw0(402, org.telegram.messenger.hd.L0(2131753986), org.telegram.messenger.hd.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var144.a("tg://settings/ask-question");
        rw0 rw0Var145 = new rw0(403, org.telegram.messenger.hd.L0(2131744242), org.telegram.messenger.hd.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var145.a("tg://settings/faq");
        rw0 rw0Var146 = new rw0(404, org.telegram.messenger.hd.L0(2131746783), org.telegram.messenger.hd.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i7) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        return;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        return;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        return;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        return;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        return;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        return;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        return;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.f53132s;
                            if (i10 < arrayList.size()) {
                                if (((s90) arrayList.get(i10)).f51163f == 1) {
                                    x90Var8.f53126b.e1(new ai.r1(x90Var8, i10, 15), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        return;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        return;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        return;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        return;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        return;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        rw0Var146.a("tg://settings/privacy-policy");
        return new rw0[]{rw0Var24, rw0Var25, rw0Var26, rw0Var27, rw0Var28, rw0Var29, rw0Var30, rw0Var31, rw0Var32, rw0Var33, rw0Var34, rw0Var35, rw0Var36, rw0Var37, rw0Var38, rw0Var39, rw0Var40, rw0Var, rw0Var42, rw0Var43, rw0Var2, rw0Var45, rw0Var46, rw0Var47, rw0Var48, rw0Var49, rw0Var50, rw0Var51, rw0Var52, rw0Var53, rw0Var3, rw0Var4, rw0Var55, rw0Var56, rw0Var57, rw0Var58, rw0Var59, rw0Var60, rw0Var61, rw0Var62, rw0Var63, rw0Var64, rw0Var65, rw0Var66, rw0Var67, rw0Var68, rw0Var69, rw0Var70, rw0Var71, rw0Var72, rw0Var73, rw0Var74, rw0Var75, rw0Var76, rw0Var77, rw0Var78, rw0Var79, rw0Var80, rw0Var81, rw0Var82, rw0Var83, rw0Var84, rw0Var85, rw0Var86, rw0Var87, rw0Var88, rw0Var89, rw0Var90, rw0Var91, rw0Var92, rw0Var93, rw0Var94, rw0Var95, rw0Var96, rw0Var97, rw0Var98, rw0Var99, rw0Var100, rw0Var101, rw0Var102, rw0Var103, rw0Var104, rw0Var105, rw0Var106, rw0Var107, rw0Var108, rw0Var109, rw0Var110, rw0Var111, rw0Var112, rw0Var113, rw0Var6, rw0Var115, rw0Var7, rw0Var117, rw0Var8, rw0Var119, rw0Var120, rw0Var121, rw0Var122, rw0Var5, rw0Var9, rw0Var10, rw0Var11, rw0Var12, rw0Var13, rw0Var14, rw0Var15, rw0Var16, rw0Var17, rw0Var18, rw0Var19, rw0Var20, rw0Var21, rw0Var22, rw0Var124, rw0Var125, rw0Var126, rw0Var127, rw0Var128, rw0Var129, rw0Var130, rw0Var131, rw0Var132, rw0Var133, rw0Var134, rw0Var135, rw0Var23, rw0Var136, rw0Var137, rw0Var138, rw0Var139, rw0Var140, rw0Var141, rw0Var142, rw0Var44, rw0Var144, rw0Var145, rw0Var146};
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f51292w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f51293x) {
            f();
        }
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof rw0) {
                ((rw0) obj2).f51048g = i7;
            } else if (obj2 instanceof org.telegram.messenger.zo) {
                ((org.telegram.messenger.zo) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.np.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f51288f;
        TLRPC.WebPage webPage = org.telegram.messenger.np.s1(i7).f25378r2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.np.s1(i7).f25368q2);
        }
        if (this.F == null && !this.G) {
            this.G = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.hd.M0(2131744240, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWebPage, new l(this, 20));
        }
    }

    public final void I(String str) {
        this.E = str;
        if (this.f51294y != null) {
            Utilities.f22418g.a(this.f51294y);
            this.f51294y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f51293x = false;
            this.f51290r.clear();
            this.f51291s.clear();
            this.f51289n.clear();
            org.telegram.ui.ActionBar.e2 e2Var = this.f51287e;
            if (e2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) e2Var).P.f33705b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.f51287e).P.d.setText(org.telegram.messenger.hd.M0(2131745477, null));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f22418g;
        mp0 mp0Var = new mp0(24, this, str);
        this.f51294y = mp0Var;
        p5Var.d(mp0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        rw0 rw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            rw0[] rw0VarArr = this.f51286c;
            if (i7 >= rw0VarArr.length) {
                break;
            }
            rw0 rw0Var2 = rw0VarArr[i7];
            if (rw0Var2 != null) {
                hashMap.put(Integer.valueOf(rw0Var2.f51047f), this.f51286c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.np.e1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f51292w;
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
                    } else if (readInt322 == 1 && (rw0Var = (rw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        rw0Var.f51048g = readInt32;
                        arrayList.add(rw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new qv0(this));
    }

    @Override
    public final int b() {
        int size;
        int i7 = 0;
        if (this.f51293x) {
            int size2 = this.f51290r.size();
            if (!this.f51291s.isEmpty()) {
                i7 = this.f51291s.size() + 1;
            }
            return size2 + i7;
        }
        ArrayList arrayList = this.f51292w;
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
        if (this.f51293x) {
            if (i7 < this.f51290r.size() || i7 != this.f51290r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f51292w;
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
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11 = e1Var.f58539f;
        View view = e1Var.f58535a;
        rw0 rw0Var = null;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131745469, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131745482, null));
            return;
        }
        org.telegram.ui.Cells.u6 u6Var = (org.telegram.ui.Cells.u6) view;
        boolean z11 = false;
        if (this.f51293x) {
            if (i7 < this.f51290r.size()) {
                rw0 rw0Var2 = (rw0) this.f51290r.get(i7);
                if (i7 > 0) {
                    rw0Var = (rw0) this.f51290r.get(i7 - 1);
                }
                if (rw0Var != null && rw0Var.f51046e == rw0Var2.f51046e) {
                    i10 = 0;
                } else {
                    i10 = rw0Var2.f51046e;
                }
                CharSequence charSequence = (CharSequence) this.f51289n.get(i7);
                String[] strArr = rw0Var2.d;
                if (i7 >= this.f51290r.size() - 1) {
                    z10 = false;
                }
                u6Var.b(charSequence, strArr, i10, z10);
                return;
            }
            int f10 = i5.c.f(1, i7, this.f51290r);
            CharSequence charSequence2 = (CharSequence) this.f51289n.get(this.f51290r.size() + f10);
            String[] strArr2 = ((org.telegram.messenger.zo) this.f51291s.get(f10)).f27981b;
            if (f10 < this.f51290r.size() - 1) {
                z11 = true;
            }
            u6Var.a(charSequence2, strArr2, true, z11);
            return;
        }
        ArrayList arrayList = this.f51292w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 < arrayList.size()) {
            Object obj = arrayList.get(i7);
            if (obj instanceof rw0) {
                rw0 rw0Var3 = (rw0) obj;
                String str = rw0Var3.f51043a;
                String[] strArr3 = rw0Var3.d;
                if (i7 >= arrayList.size() - 1) {
                    z10 = false;
                }
                u6Var.a(str, strArr3, false, z10);
                return;
            } else if (obj instanceof org.telegram.messenger.zo) {
                org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) obj;
                String str2 = zoVar.f27980a;
                String[] strArr4 = zoVar.f27981b;
                if (i7 < arrayList.size() - 1) {
                    z11 = true;
                }
                u6Var.a(str2, strArr4, true, z11);
                return;
            } else {
                return;
            }
        }
        int f11 = i5.c.f(1, i7, arrayList);
        org.telegram.messenger.zo zoVar2 = (org.telegram.messenger.zo) this.d.get(f11);
        String str3 = zoVar2.f27980a;
        String[] strArr5 = zoVar2.f27981b;
        if (f11 < arrayList.size() - 1) {
            z11 = true;
        }
        u6Var.a(str3, strArr5, true, z11);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View u6Var;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                u6Var = new org.telegram.ui.Cells.n4(context, 16);
            } else {
                u6Var = new org.telegram.ui.Cells.x3(context, null);
            }
        } else {
            u6Var = new org.telegram.ui.Cells.u6(context);
        }
        u6Var.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(u6Var);
    }
}
