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
public class ww0 extends org.telegram.ui.Components.pj0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public vw0[] f51490c;
    public final org.telegram.ui.ActionBar.f2 f51491e;
    public final int f51492f;
    public final Context h;
    public boolean f51497x;
    public sn0 f51498y;
    public final ArrayList d = new ArrayList();
    public ArrayList f51493n = new ArrayList();
    public ArrayList f51494r = new ArrayList();
    public ArrayList f51495s = new ArrayList();
    public final ArrayList f51496w = new ArrayList();

    public ww0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f51491e = f2Var;
        this.f51492f = f2Var.getCurrentAccount();
        this.h = context;
        this.f51490c = H(f2Var);
        J();
    }

    public static boolean F(int i7, int i10) {
        if (org.telegram.messenger.qp.s1(i7).D3() && !org.telegram.messenger.p10.i(i7).q()) {
            return false;
        }
        if (i10 != -1 && org.telegram.messenger.qp.s1(i7).N0.get(i10, -1) == -1) {
            return false;
        }
        return true;
    }

    public static vw0[] H(final org.telegram.ui.ActionBar.f2 f2Var) {
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
        final int currentAccount = f2Var.getCurrentAccount();
        vw0 vw0Var24 = new vw0(500, org.telegram.messenger.id.L0(2131751264), 0, new sn0(27, f2Var, f2Var.getResourceProvider()));
        vw0 vw0Var25 = new vw0(501, org.telegram.messenger.id.L0(2131752537), 0, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var25.a("tg://settings/edit/change-number");
        vw0 vw0Var26 = new vw0(502, org.telegram.messenger.id.L0(2131754468), 0, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var26.a("tg://settings/edit/add-account");
        vw0 vw0Var27 = new vw0(1, org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var27.a("tg://settings/notifications");
        vw0 vw0Var28 = new vw0(2, org.telegram.messenger.id.L0(2131747878), org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var28.a("tg://settings/notifications/private-chats");
        vw0 vw0Var29 = new vw0(3, org.telegram.messenger.id.L0(2131747907), org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0Var29.a("tg://settings/notifications/groups");
        vw0 vw0Var30 = new vw0(4, org.telegram.messenger.id.L0(2131747921), org.telegram.messenger.id.L0(2131747922), 2131232262, new vf0(7, f2Var));
        vw0Var30.a("tg://settings/notifications/channels");
        vw0 vw0Var31 = new vw0(5, org.telegram.messenger.id.L0(2131743279), "callsSectionRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new vf0(19, f2Var));
        vw0 vw0Var32 = new vw0(6, org.telegram.messenger.id.L0(2131753733), "badgeNumberSection", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var33 = new vw0(7, org.telegram.messenger.id.L0(2131749219), "inappSectionRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var34 = new vw0(8, org.telegram.messenger.id.L0(2131751790), "contactJoinedRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new vf0(23, f2Var));
        vw0Var34.a("tg://settings/notifications/new-contacts");
        vw0 vw0Var35 = new vw0(9, org.telegram.messenger.id.L0(2131747228), "pinnedMessageRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var35.a("tg://settings/notifications/pinned-messages");
        vw0 vw0Var36 = new vw0(10, org.telegram.messenger.id.L0(2131746112), "resetNotificationsRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var36.a("tg://settings/notifications/reset");
        vw0 vw0Var37 = new vw0(11, org.telegram.messenger.id.L0(2131747876), "notificationsServiceRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var38 = new vw0(12, org.telegram.messenger.id.L0(2131747875), "notificationsServiceConnectionRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var39 = new vw0(13, org.telegram.messenger.id.L0(2131746275), "repeatRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var40 = new vw0(100, org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var40.a("tg://settings/privacy");
        vw0 vw0Var41 = new vw0(109, org.telegram.messenger.id.L0(2131743938), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var41.a("tg://settings/privacy/2sv");
        vw0 vw0Var42 = new vw0(124, org.telegram.messenger.id.L0(2131753850), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.p10.i(i10).f24492p0 >= 0) {
                            f2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.p10.i(i10).q()) {
                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(a02.W(), null);
                            kbVar.d(2131624346, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            kbVar.f35292b.setText(spannableStringBuilder);
                            kbVar.f35292b.setSingleLine(false);
                            kbVar.f35292b.setMaxLines(2);
                            a02.b(kbVar, 2750).j();
                            return;
                        }
                        f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        vw0Var42.a("tg://settings/privacy/auto-delete");
        vw0 vw0Var43 = new vw0(108, org.telegram.messenger.id.L0(2131747657), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var43.a("tg://settings/privacy/passcode");
        vw0 vw0Var44 = null;
        if (org.telegram.messenger.iz.f23419m1) {
            vw0Var = vw0Var41;
            vw0Var2 = new vw0(125, org.telegram.messenger.id.L0(2131751202), "emailLoginRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f52011s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f50131f == 1) {
                                        y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            return;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            return;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            return;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            return;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            vw0Var2.a("tg://settings/privacy/login-email");
        } else {
            vw0Var = vw0Var41;
            vw0Var2 = null;
        }
        vw0 vw0Var45 = new vw0(101, org.telegram.messenger.id.L0(2131753681), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var45.a("tg://settings/privacy/blocked");
        vw0 vw0Var46 = new vw0(110, org.telegram.messenger.id.L0(2131745551), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var46.a("tg://settings/devices");
        vw0 vw0Var47 = new vw0(105, org.telegram.messenger.id.L0(2131746790), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var47.a("tg://settings/privacy/phone-number/");
        vw0 vw0Var48 = new vw0(102, org.telegram.messenger.id.L0(2131746815), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var48.a("tg://settings/privacy/last-seen");
        vw0 vw0Var49 = new vw0(103, org.telegram.messenger.id.L0(2131746777), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var49.a("tg://settings/privacy/profile-photos");
        vw0 vw0Var50 = new vw0(104, org.telegram.messenger.id.L0(2131746837), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var50.a("tg://settings/privacy/forwards");
        vw0 vw0Var51 = new vw0(122, org.telegram.messenger.id.L0(2131746800), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var51.a("tg://settings/privacy/calls/p2p");
        vw0 vw0Var52 = new vw0(106, org.telegram.messenger.id.L0(2131752596), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var52.a("tg://settings/privacy/calls");
        vw0 vw0Var53 = new vw0(107, org.telegram.messenger.id.L0(2131746817), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var53.a("tg://settings/privacy/invites");
        vw0 vw0Var54 = new vw0(123, org.telegram.messenger.id.L0(2131746758), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.p10.i(i10).f24492p0 >= 0) {
                            f2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.p10.i(i10).q()) {
                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(a02.W(), null);
                            kbVar.d(2131624346, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            kbVar.f35292b.setText(spannableStringBuilder);
                            kbVar.f35292b.setSingleLine(false);
                            kbVar.f35292b.setMaxLines(2);
                            a02.b(kbVar, 2750).j();
                            return;
                        }
                        f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        vw0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.qp.s1(currentAccount).Y3) {
            vw0Var3 = vw0Var54;
            vw0Var4 = new vw0(121, org.telegram.messenger.id.L0(2131754171), "newChatsRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.p10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                f2Var.presentFragment(new ee0(i7));
                                return;
                            }
                            return;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            f2Var.presentFragment(new y6());
                            return;
                        case 24:
                            f2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 26:
                            f2Var.presentFragment(new y6());
                            return;
                        case 27:
                            f2Var.presentFragment(new y6());
                            return;
                        case 28:
                            f2Var.presentFragment(new mt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            vw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            vw0Var3 = vw0Var54;
            vw0Var4 = null;
        }
        vw0 vw0Var55 = new vw0(112, org.telegram.messenger.id.L0(2131751596), "deleteAccountRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var55.a("tg://settings/privacy/self-destruct");
        vw0 vw0Var56 = new vw0(113, org.telegram.messenger.id.L0(2131746797), "paymentsClearRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        vw0 vw0Var57 = new vw0(114, org.telegram.messenger.id.L0(2131742911), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var57.a("tg://settings/privacy/active-websites");
        vw0 vw0Var58 = new vw0(115, org.telegram.messenger.id.L0(2131744296), "contactsDeleteRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        vw0 vw0Var59 = new vw0(116, org.telegram.messenger.id.L0(2131744298), "contactsSyncRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        vw0 vw0Var60 = new vw0(117, org.telegram.messenger.id.L0(2131744412), "contactsSuggestRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        vw0 vw0Var61 = new vw0(118, org.telegram.messenger.id.L0(2131748689), "secretMapRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var61.a("tg://settings/privacy/data-settings/map-provider");
        vw0 vw0Var62 = new vw0(119, org.telegram.messenger.id.L0(2131745684), "secretWebpageRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var62.a("tg://settings/privacy/data-settings/link-previews");
        vw0 vw0Var63 = new vw0(120, org.telegram.messenger.id.L0(2131751455), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var63.a("tg://settings/devices");
        vw0 vw0Var64 = new vw0(121, org.telegram.messenger.id.L0(2131744208), "terminateAllSessionsRow", org.telegram.messenger.id.L0(2131751455), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var64.a("tg://settings/devices/terminate-sessions");
        vw0 vw0Var65 = new vw0(122, org.telegram.messenger.id.L0(2131748917), org.telegram.messenger.id.L0(2131751455), 2131232024, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var65.a("tg://settings/devices/link-desktop");
        vw0 vw0Var66 = new vw0(200, org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var66.a("tg://settings/privacy/data-settings");
        vw0 vw0Var67 = new vw0(201, org.telegram.messenger.id.L0(2131751676), "usageSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var68 = new vw0(202, org.telegram.messenger.id.L0(2131744816), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var68.a("tg://settings/data/storage");
        vw0 vw0Var69 = new vw0(203, org.telegram.messenger.id.L0(2131749060), "keepMediaRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var70 = new vw0(204, org.telegram.messenger.id.L0(2131752075), "cacheRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var71 = new vw0(205, org.telegram.messenger.id.L0(2131748774), "databaseRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0 vw0Var72 = new vw0(206, org.telegram.messenger.id.L0(2131748298), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 6:
                        int i7 = 0;
                        while (true) {
                            if (i7 < 4) {
                                if (org.telegram.messenger.p10.i(i7).p()) {
                                    i7++;
                                }
                            } else {
                                i7 = -1;
                            }
                        }
                        if (i7 >= 0) {
                            f2Var.presentFragment(new ee0(i7));
                            return;
                        }
                        return;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        return;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        return;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        return;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 23:
                        f2Var.presentFragment(new y6());
                        return;
                    case 24:
                        f2Var.presentFragment(new y6());
                        return;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 26:
                        f2Var.presentFragment(new y6());
                        return;
                    case 27:
                        f2Var.presentFragment(new y6());
                        return;
                    case 28:
                        f2Var.presentFragment(new mt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        vw0Var72.a("tg://settings/data/usage");
        vw0 vw0Var73 = new vw0(207, org.telegram.messenger.id.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var74 = new vw0(208, org.telegram.messenger.id.L0(2131742884), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var75 = new vw0(209, org.telegram.messenger.id.L0(2131742886), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var76 = new vw0(210, org.telegram.messenger.id.L0(2131742885), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var77 = new vw0(211, org.telegram.messenger.id.L0(2131746111), "resetDownloadRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0Var77.a("tg://settings/data/auto-download/reset");
        vw0 vw0Var78 = new vw0(215, org.telegram.messenger.id.L0(2131744438), "streamSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var79 = new vw0(216, org.telegram.messenger.id.L0(2131751144), "enableStreamRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var80 = new vw0(217, org.telegram.messenger.id.L0(2131752596), "callsSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var81 = new vw0(218, org.telegram.messenger.id.L0(2131743229), "useLessDataForCallsRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0Var81.a("tg://settings/data/use-less-data");
        vw0 vw0Var82 = new vw0(219, org.telegram.messenger.id.L0(2131743258), "quickRepliesRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var83 = new vw0(220, org.telegram.messenger.id.L0(2131746601), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0Var83.a("tg://settings/data/proxy");
        vw0 vw0Var84 = new vw0(111, org.telegram.messenger.id.L0(2131746841), "clearDraftsRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        vw0 vw0Var85 = new vw0(222, org.telegram.messenger.id.L0(2131745929), "saveToGallerySectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0 vw0Var86 = new vw0(223, org.telegram.messenger.id.L0(2131745919), "saveToGalleryPeerRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0Var86.a("tg://settings/data/save-to-photos/chats");
        vw0 vw0Var87 = new vw0(224, org.telegram.messenger.id.L0(2131745926), "saveToGalleryGroupsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), 2131232023, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        return;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        return;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        return;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        return;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        return;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                }
            }
        });
        vw0Var87.a("tg://settings/data/save-to-photos/groups");
        vw0 vw0Var88 = new vw0(225, org.telegram.messenger.id.L0(2131745928), "saveToGalleryChannelsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), 2131232023, new vf0(2, f2Var));
        vw0Var88.a("tg://settings/data/save-to-photos/channels");
        vw0 vw0Var89 = new vw0(300, org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(3, f2Var));
        vw0Var89.a("tg://settings/appearance/themes");
        vw0 vw0Var90 = new vw0(301, org.telegram.messenger.id.L0(2131744191), "textSizeHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(4, f2Var));
        vw0Var90.a("tg://settings/appearance/text-size");
        vw0 vw0Var91 = new vw0(302, org.telegram.messenger.id.L0(2131752550), org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(5, f2Var));
        vw0Var91.a("tg://settings/appearance/wallpapers");
        vw0 vw0Var92 = new vw0(303, org.telegram.messenger.id.L0(2131745538), null, org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), 2131232025, new vf0(6, f2Var));
        vw0 vw0Var93 = new vw0(304, org.telegram.messenger.id.L0(2131746108), "resetRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), 2131232025, new vf0(8, f2Var));
        vw0 vw0Var94 = new vw0(306, org.telegram.messenger.id.L0(2131752011), "themeHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(9, f2Var));
        vw0 vw0Var95 = new vw0(319, org.telegram.messenger.id.L0(2131752878), null, org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(10, f2Var));
        vw0 vw0Var96 = new vw0(320, org.telegram.messenger.id.L0(2131751712), "createNewThemeRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752878), 2131232025, new vf0(11, f2Var));
        vw0Var96.a("tg://settings/appearance/themes/create");
        vw0 vw0Var97 = new vw0(321, org.telegram.messenger.id.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(13, f2Var));
        vw0Var97.a("tg://settings/appearance/message-corners");
        vw0 vw0Var98 = new vw0(322, org.telegram.messenger.id.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(14, f2Var));
        vw0 vw0Var99 = new vw0(323, org.telegram.messenger.id.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(15, f2Var));
        vw0 vw0Var100 = new vw0(324, org.telegram.messenger.id.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(16, f2Var));
        vw0Var100.a("tg://settings/appearance/app-icon");
        vw0 vw0Var101 = new vw0(305, org.telegram.messenger.id.L0(2131753784), org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(17, f2Var));
        vw0 vw0Var102 = new vw0(328, org.telegram.messenger.id.L0(2131748249), "nextMediaTapRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(18, f2Var));
        vw0Var102.a("tg://settings/appearance/tap-for-next-media");
        vw0 vw0Var103 = new vw0(327, org.telegram.messenger.id.L0(2131746427), "raiseToListenRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(20, f2Var));
        vw0Var103.a("tg://settings/data/raise-to-listen");
        vw0 vw0Var104 = new vw0(310, org.telegram.messenger.id.L0(2131746425), "raiseToSpeakRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(21, f2Var));
        vw0Var104.a("tg://settings/data/raise-to-speak");
        vw0 vw0Var105 = new vw0(326, org.telegram.messenger.id.L0(2131747432), "pauseOnMediaRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(22, f2Var));
        vw0Var105.a("tg://settings/data/pause-music");
        vw0 vw0Var106 = new vw0(325, org.telegram.messenger.id.L0(2131748439), "bluetoothScoRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(24, f2Var));
        vw0 vw0Var107 = new vw0(308, org.telegram.messenger.id.L0(2131751438), "directShareRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(25, f2Var));
        vw0 vw0Var108 = new vw0(311, org.telegram.messenger.id.L0(2131745632), "sendByEnterRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(26, f2Var));
        vw0 vw0Var109 = new vw0(318, org.telegram.messenger.id.L0(2131751367), "distanceRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new vf0(27, f2Var));
        vw0 vw0Var110 = new vw0(600, org.telegram.messenger.id.L0(2131744857), 2131232038, new vf0(28, f2Var));
        vw0Var110.a("tg://settings/appearance/stickers-and-emoji");
        vw0 vw0Var111 = new vw0(601, org.telegram.messenger.id.L0(2131744402), "suggestRow", org.telegram.messenger.id.L0(2131744857), 2131232038, new vf0(29, f2Var));
        vw0 vw0Var112 = new vw0(602, org.telegram.messenger.id.L0(2131750833), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var113 = new vw0(603, org.telegram.messenger.id.L0(2131748679), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var114 = new vw0(604, org.telegram.messenger.id.L0(2131754128), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        vw0 vw0Var115 = new vw0(605, org.telegram.messenger.id.L0(2131754133), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var116 = new vw0(606, org.telegram.messenger.id.L0(2131749034), "largeEmojiRow", org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        vw0 vw0Var117 = new vw0(607, org.telegram.messenger.id.L0(2131748722), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var118 = new vw0(608, org.telegram.messenger.id.L0(2131751196), null, org.telegram.messenger.id.L0(2131744857), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        vw0 vw0Var119 = new vw0(609, org.telegram.messenger.id.L0(2131744416), "suggestAnimatedEmojiRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        vw0 vw0Var120 = new vw0(610, org.telegram.messenger.id.L0(2131750835), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), 2131231512, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var121 = new vw0(611, org.telegram.messenger.id.L0(2131751350), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        vw0 vw0Var122 = new vw0(700, org.telegram.messenger.id.L0(2131750696), null, 2131232027, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var122.a("tg://settings/folders");
        vw0 vw0Var123 = new vw0(701, org.telegram.messenger.id.L0(2131751716), "createFilterRow", org.telegram.messenger.id.L0(2131750696), 2131232027, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
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
            vw0Var9 = new vw0(800, org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f52011s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f50131f == 1) {
                                        y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            return;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            return;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            return;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            return;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
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
            vw0Var10 = new vw0(801, org.telegram.messenger.id.L0(2131746998), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f52011s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f50131f == 1) {
                                        y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            return;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            return;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            return;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            return;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            vw0Var11 = new vw0(802, org.telegram.messenger.id.L0(2131747007), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f52011s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f50131f == 1) {
                                        y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            return;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            return;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            return;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            return;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            vw0Var12 = new vw0(803, org.telegram.messenger.id.L0(2131746964), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.p10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                f2Var.presentFragment(new ee0(i7));
                                return;
                            }
                            return;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            f2Var.presentFragment(new y6());
                            return;
                        case 24:
                            f2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 26:
                            f2Var.presentFragment(new y6());
                            return;
                        case 27:
                            f2Var.presentFragment(new y6());
                            return;
                        case 28:
                            f2Var.presentFragment(new mt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            vw0Var13 = new vw0(804, org.telegram.messenger.id.L0(2131747012), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.p10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                f2Var.presentFragment(new ee0(i7));
                                return;
                            }
                            return;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            f2Var.presentFragment(new y6());
                            return;
                        case 24:
                            f2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 26:
                            f2Var.presentFragment(new y6());
                            return;
                        case 27:
                            f2Var.presentFragment(new y6());
                            return;
                        case 28:
                            f2Var.presentFragment(new mt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            vw0Var14 = new vw0(805, org.telegram.messenger.id.L0(2131746962), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 6:
                            int i7 = 0;
                            while (true) {
                                if (i7 < 4) {
                                    if (org.telegram.messenger.p10.i(i7).p()) {
                                        i7++;
                                    }
                                } else {
                                    i7 = -1;
                                }
                            }
                            if (i7 >= 0) {
                                f2Var.presentFragment(new ee0(i7));
                                return;
                            }
                            return;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            return;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            return;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            return;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 23:
                            f2Var.presentFragment(new y6());
                            return;
                        case 24:
                            f2Var.presentFragment(new y6());
                            return;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 26:
                            f2Var.presentFragment(new y6());
                            return;
                        case 27:
                            f2Var.presentFragment(new y6());
                            return;
                        case 28:
                            f2Var.presentFragment(new mt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            vw0Var15 = new vw0(806, org.telegram.messenger.id.L0(2131746992), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            f2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            f2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            f2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 7:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            f2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                    }
                }
            });
        } else {
            vw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            vw0Var16 = new vw0(807, org.telegram.messenger.id.L0(2131746983), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 1:
                            f2Var.presentFragment(new DataAutoDownloadActivity(0));
                            return;
                        case 2:
                            f2Var.presentFragment(new DataAutoDownloadActivity(1));
                            return;
                        case 3:
                            f2Var.presentFragment(new DataAutoDownloadActivity(2));
                            return;
                        case 4:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 5:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 6:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 7:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 8:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 9:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 10:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 11:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            return;
                        case 12:
                            f2Var.presentFragment(new ProxyListActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 14:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 15:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        case 16:
                            f2Var.presentFragment(new DataSettingsActivity());
                            return;
                        default:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                    }
                }
            });
        } else {
            vw0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            vw0Var17 = new vw0(808, org.telegram.messenger.id.L0(2131746976), org.telegram.messenger.id.L0(2131744231), 2131232362, new vf0(12, f2Var));
        } else {
            vw0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            vw0Var18 = new vw0(809, org.telegram.messenger.id.L0(2131747025), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            return;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            return;
                        case 18:
                            f2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            vw0Var19 = new vw0(810, org.telegram.messenger.id.L0(2131746987), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            return;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            return;
                        case 18:
                            f2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            vw0Var20 = new vw0(811, org.telegram.messenger.id.L0(2131747022), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            return;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            return;
                        case 18:
                            f2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            vw0Var21 = new vw0(812, org.telegram.messenger.id.L0(2131747020), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            return;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            return;
                        case 18:
                            f2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            vw0Var22 = new vw0(813, org.telegram.messenger.id.L0(2131747004), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    switch (r1) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            return;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            return;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            return;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            return;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            return;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            return;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            return;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            return;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            return;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            return;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            return;
                        case 18:
                            f2Var.presentFragment(new y90());
                            return;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            return;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            return;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            return;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            return;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            return;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            return;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            vw0Var22 = null;
        }
        vw0 vw0Var124 = new vw0(900, org.telegram.messenger.id.L0(2131747066), null, 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var124.a("tg://settings/power-saving");
        vw0 vw0Var125 = new vw0(901, org.telegram.messenger.id.L0(2131748850), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var125.a("tg://settings/power-saving/stickers");
        vw0 vw0Var126 = new vw0(902, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var127 = new vw0(903, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var128 = new vw0(904, org.telegram.messenger.id.L0(2131748855), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var128.a("tg://settings/power-saving/emoji");
        vw0 vw0Var129 = new vw0(905, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var130 = new vw0(906, org.telegram.messenger.id.L0(2131748861), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var131 = new vw0(907, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0 vw0Var132 = new vw0(908, org.telegram.messenger.id.L0(2131748856), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var132.a("tg://settings/power-saving/effects");
        vw0 vw0Var133 = new vw0(909, org.telegram.messenger.id.L0(2131748859), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        return;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        return;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        return;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        return;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        return;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        return;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        return;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        return;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        return;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        return;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        return;
                    case 18:
                        f2Var.presentFragment(new y90());
                        return;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        return;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        return;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        return;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        return;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        return;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        return;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        return;
                }
            }
        });
        vw0Var133.a("tg://settings/power-saving/background");
        vw0 vw0Var134 = new vw0(910, org.telegram.messenger.id.L0(2131748847), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var135 = new vw0(911, org.telegram.messenger.id.L0(2131748851), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        if (org.telegram.messenger.iz.o() >= 1) {
            vw0Var23 = new vw0(326, org.telegram.messenger.id.L0(2131748858), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f52011s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f50131f == 1) {
                                        y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            return;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            return;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            return;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            return;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
        } else {
            vw0Var23 = null;
        }
        vw0 vw0Var136 = new vw0(912, org.telegram.messenger.id.L0(2131748852), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0 vw0Var137 = new vw0(913, org.telegram.messenger.id.L0(2131748857), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var137.a("tg://settings/power-saving/call-animations");
        vw0 vw0Var138 = new vw0(214, org.telegram.messenger.id.L0(2131748860), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var138.a("tg://settings/power-saving/videos");
        vw0 vw0Var139 = new vw0(213, org.telegram.messenger.id.L0(2131748863), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var139.a("tg://settings/power-saving/gifs");
        vw0 vw0Var140 = new vw0(914, org.telegram.messenger.id.L0(2131748846), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var140.a("tg://settings/power-saving/transitions");
        vw0 vw0Var141 = new vw0(400, org.telegram.messenger.id.L0(2131749054), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var141.a("tg://settings/language");
        vw0 vw0Var142 = new vw0(405, org.telegram.messenger.id.L0(2131745327), org.telegram.messenger.id.L0(2131749054), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.qp.s1(currentAccount).T1().s()) {
            vw0 vw0Var143 = new vw0(406, org.telegram.messenger.id.L0(2131751358), org.telegram.messenger.id.L0(2131749054), 2131232030, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            return;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            return;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            return;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            return;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            return;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.f52011s;
                                if (i10 < arrayList.size()) {
                                    if (((t90) arrayList.get(i10)).f50131f == 1) {
                                        y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                        return;
                                    }
                                    i10++;
                                } else {
                                    return;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            return;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            return;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            return;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            return;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            return;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            return;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            return;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            return;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            return;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            return;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                    }
                }
            });
            vw0Var143.a("tg://settings/language/do-not-translate");
            vw0Var44 = vw0Var143;
        }
        vw0 vw0Var144 = new vw0(402, org.telegram.messenger.id.L0(2131753986), org.telegram.messenger.id.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var144.a("tg://settings/ask-question");
        vw0 vw0Var145 = new vw0(403, org.telegram.messenger.id.L0(2131744242), org.telegram.messenger.id.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var145.a("tg://settings/faq");
        vw0 vw0Var146 = new vw0(404, org.telegram.messenger.id.L0(2131746783), org.telegram.messenger.id.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        return;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        return;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        return;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        return;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        return;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.f52011s;
                            if (i10 < arrayList.size()) {
                                if (((t90) arrayList.get(i10)).f50131f == 1) {
                                    y90Var8.f52005b.e1(new l2.q(y90Var8, i10, 12), 700, true);
                                    return;
                                }
                                i10++;
                            } else {
                                return;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        return;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        return;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        return;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        return;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        return;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        return;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        return;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        return;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        return;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        return;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                }
            }
        });
        vw0Var146.a("tg://settings/privacy-policy");
        return new vw0[]{vw0Var24, vw0Var25, vw0Var26, vw0Var27, vw0Var28, vw0Var29, vw0Var30, vw0Var31, vw0Var32, vw0Var33, vw0Var34, vw0Var35, vw0Var36, vw0Var37, vw0Var38, vw0Var39, vw0Var40, vw0Var, vw0Var42, vw0Var43, vw0Var2, vw0Var45, vw0Var46, vw0Var47, vw0Var48, vw0Var49, vw0Var50, vw0Var51, vw0Var52, vw0Var53, vw0Var3, vw0Var4, vw0Var55, vw0Var56, vw0Var57, vw0Var58, vw0Var59, vw0Var60, vw0Var61, vw0Var62, vw0Var63, vw0Var64, vw0Var65, vw0Var66, vw0Var67, vw0Var68, vw0Var69, vw0Var70, vw0Var71, vw0Var72, vw0Var73, vw0Var74, vw0Var75, vw0Var76, vw0Var77, vw0Var78, vw0Var79, vw0Var80, vw0Var81, vw0Var82, vw0Var83, vw0Var84, vw0Var85, vw0Var86, vw0Var87, vw0Var88, vw0Var89, vw0Var90, vw0Var91, vw0Var92, vw0Var93, vw0Var94, vw0Var95, vw0Var96, vw0Var97, vw0Var98, vw0Var99, vw0Var100, vw0Var101, vw0Var102, vw0Var103, vw0Var104, vw0Var105, vw0Var106, vw0Var107, vw0Var108, vw0Var109, vw0Var110, vw0Var111, vw0Var112, vw0Var113, vw0Var6, vw0Var115, vw0Var7, vw0Var117, vw0Var8, vw0Var119, vw0Var120, vw0Var121, vw0Var122, vw0Var5, vw0Var9, vw0Var10, vw0Var11, vw0Var12, vw0Var13, vw0Var14, vw0Var15, vw0Var16, vw0Var17, vw0Var18, vw0Var19, vw0Var20, vw0Var21, vw0Var22, vw0Var124, vw0Var125, vw0Var126, vw0Var127, vw0Var128, vw0Var129, vw0Var130, vw0Var131, vw0Var132, vw0Var133, vw0Var134, vw0Var135, vw0Var23, vw0Var136, vw0Var137, vw0Var138, vw0Var139, vw0Var140, vw0Var141, vw0Var142, vw0Var44, vw0Var144, vw0Var145, vw0Var146};
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57060f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f51496w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f51497x) {
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
                ((vw0) obj2).f50796g = i7;
            } else if (obj2 instanceof org.telegram.messenger.cp) {
                ((org.telegram.messenger.cp) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.qp.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f51492f;
        TLRPC.WebPage webPage = org.telegram.messenger.qp.s1(i7).f24872q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.qp.s1(i7).f24863p2);
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.id.M0(2131744240, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWebPage, new l(this, 20));
        }
    }

    public final void I(String str) {
        this.D = str;
        if (this.f51498y != null) {
            Utilities.f21338g.a(this.f51498y);
            this.f51498y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f51497x = false;
            this.f51494r.clear();
            this.f51495s.clear();
            this.f51493n.clear();
            org.telegram.ui.ActionBar.f2 f2Var = this.f51491e;
            if (f2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) f2Var).O.f32766b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.f51491e).O.d.setText(org.telegram.messenger.id.M0(2131745477, null));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21338g;
        sn0 sn0Var = new sn0(28, this, str);
        this.f51498y = sn0Var;
        p5Var.d(sn0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        vw0 vw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            vw0[] vw0VarArr = this.f51490c;
            if (i7 >= vw0VarArr.length) {
                break;
            }
            vw0 vw0Var2 = vw0VarArr[i7];
            if (vw0Var2 != null) {
                hashMap.put(Integer.valueOf(vw0Var2.f50795f), this.f51490c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.qp.e1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f51496w;
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
                        org.telegram.messenger.cp cpVar = new org.telegram.messenger.cp(readString, strArr, serializedData.readString(false));
                        cpVar.d = readInt32;
                        arrayList.add(cpVar);
                    } else if (readInt322 == 1 && (vw0Var = (vw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        vw0Var.f50796g = readInt32;
                        arrayList.add(vw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new wn0(this));
    }

    @Override
    public final int b() {
        int size;
        int i7 = 0;
        if (this.f51497x) {
            int size2 = this.f51494r.size();
            if (!this.f51495s.isEmpty()) {
                i7 = this.f51495s.size() + 1;
            }
            return size2 + i7;
        }
        ArrayList arrayList = this.f51496w;
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
        if (this.f51497x) {
            if (i7 < this.f51494r.size() || i7 != this.f51494r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f51496w;
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
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        vw0 vw0Var = null;
        boolean z9 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131745469, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.M0(2131745482, null));
            return;
        }
        org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) view;
        boolean z10 = false;
        if (this.f51497x) {
            if (i7 < this.f51494r.size()) {
                vw0 vw0Var2 = (vw0) this.f51494r.get(i7);
                if (i7 > 0) {
                    vw0Var = (vw0) this.f51494r.get(i7 - 1);
                }
                if (vw0Var != null && vw0Var.f50794e == vw0Var2.f50794e) {
                    i10 = 0;
                } else {
                    i10 = vw0Var2.f50794e;
                }
                CharSequence charSequence = (CharSequence) this.f51493n.get(i7);
                String[] strArr = vw0Var2.d;
                if (i7 >= this.f51494r.size() - 1) {
                    z9 = false;
                }
                v6Var.b(charSequence, strArr, i10, z9);
                return;
            }
            int g10 = jg.g.g(1, i7, this.f51494r);
            CharSequence charSequence2 = (CharSequence) this.f51493n.get(this.f51494r.size() + g10);
            String[] strArr2 = ((org.telegram.messenger.cp) this.f51495s.get(g10)).f21913b;
            if (g10 < this.f51494r.size() - 1) {
                z10 = true;
            }
            v6Var.a(charSequence2, strArr2, true, z10);
            return;
        }
        ArrayList arrayList = this.f51496w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 < arrayList.size()) {
            Object obj = arrayList.get(i7);
            if (obj instanceof vw0) {
                vw0 vw0Var3 = (vw0) obj;
                String str = vw0Var3.f50791a;
                String[] strArr3 = vw0Var3.d;
                if (i7 >= arrayList.size() - 1) {
                    z9 = false;
                }
                v6Var.a(str, strArr3, false, z9);
                return;
            } else if (obj instanceof org.telegram.messenger.cp) {
                org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) obj;
                String str2 = cpVar.f21912a;
                String[] strArr4 = cpVar.f21913b;
                if (i7 < arrayList.size() - 1) {
                    z10 = true;
                }
                v6Var.a(str2, strArr4, true, z10);
                return;
            } else {
                return;
            }
        }
        int g11 = jg.g.g(1, i7, arrayList);
        org.telegram.messenger.cp cpVar2 = (org.telegram.messenger.cp) this.d.get(g11);
        String str3 = cpVar2.f21912a;
        String[] strArr5 = cpVar2.f21913b;
        if (g11 < arrayList.size() - 1) {
            z10 = true;
        }
        v6Var.a(str3, strArr5, true, z10);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View v6Var;
        Context context = this.h;
        if (i7 != 0) {
            if (i7 != 1) {
                v6Var = new org.telegram.ui.Cells.n4(context, 16);
            } else {
                v6Var = new org.telegram.ui.Cells.x3(context, null);
            }
        } else {
            v6Var = new org.telegram.ui.Cells.v6(context);
        }
        v6Var.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(v6Var);
    }
}
