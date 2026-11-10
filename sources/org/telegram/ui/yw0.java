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
public class yw0 extends org.telegram.ui.Components.oj0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public xw0[] f52136c;
    public final org.telegram.ui.ActionBar.f2 f52137e;
    public final int f52138f;
    public final Context h;
    public boolean f52143x;
    public tn0 f52144y;
    public final ArrayList d = new ArrayList();
    public ArrayList f52139n = new ArrayList();
    public ArrayList f52140r = new ArrayList();
    public ArrayList f52141s = new ArrayList();
    public final ArrayList f52142w = new ArrayList();

    public yw0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f52137e = f2Var;
        this.f52138f = f2Var.getCurrentAccount();
        this.h = context;
        this.f52136c = H(f2Var);
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

    public static xw0[] H(final org.telegram.ui.ActionBar.f2 f2Var) {
        xw0 xw0Var;
        xw0 xw0Var2;
        xw0 xw0Var3;
        xw0 xw0Var4;
        xw0 xw0Var5;
        xw0 xw0Var6;
        xw0 xw0Var7;
        xw0 xw0Var8;
        xw0 xw0Var9;
        xw0 xw0Var10;
        xw0 xw0Var11;
        xw0 xw0Var12;
        xw0 xw0Var13;
        xw0 xw0Var14;
        xw0 xw0Var15;
        xw0 xw0Var16;
        xw0 xw0Var17;
        xw0 xw0Var18;
        xw0 xw0Var19;
        xw0 xw0Var20;
        xw0 xw0Var21;
        xw0 xw0Var22;
        xw0 xw0Var23;
        final int currentAccount = f2Var.getCurrentAccount();
        xw0 xw0Var24 = new xw0(500, org.telegram.messenger.id.L0(2131751264), 0, new tn0(28, f2Var, f2Var.getResourceProvider()));
        xw0 xw0Var25 = new xw0(501, org.telegram.messenger.id.L0(2131752537), 0, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var25.a("tg://settings/edit/change-number");
        xw0 xw0Var26 = new xw0(502, org.telegram.messenger.id.L0(2131754468), 0, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var26.a("tg://settings/edit/add-account");
        xw0 xw0Var27 = new xw0(1, org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var27.a("tg://settings/notifications");
        xw0 xw0Var28 = new xw0(2, org.telegram.messenger.id.L0(2131747878), org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var28.a("tg://settings/notifications/private-chats");
        xw0 xw0Var29 = new xw0(3, org.telegram.messenger.id.L0(2131747907), org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
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
        xw0Var29.a("tg://settings/notifications/groups");
        xw0 xw0Var30 = new xw0(4, org.telegram.messenger.id.L0(2131747921), org.telegram.messenger.id.L0(2131747922), 2131232262, new wf0(7, f2Var));
        xw0Var30.a("tg://settings/notifications/channels");
        xw0 xw0Var31 = new xw0(5, org.telegram.messenger.id.L0(2131743279), "callsSectionRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new wf0(19, f2Var));
        xw0 xw0Var32 = new xw0(6, org.telegram.messenger.id.L0(2131753733), "badgeNumberSection", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var33 = new xw0(7, org.telegram.messenger.id.L0(2131749219), "inappSectionRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var34 = new xw0(8, org.telegram.messenger.id.L0(2131751790), "contactJoinedRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new wf0(23, f2Var));
        xw0Var34.a("tg://settings/notifications/new-contacts");
        xw0 xw0Var35 = new xw0(9, org.telegram.messenger.id.L0(2131747228), "pinnedMessageRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var35.a("tg://settings/notifications/pinned-messages");
        xw0 xw0Var36 = new xw0(10, org.telegram.messenger.id.L0(2131746112), "resetNotificationsRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var36.a("tg://settings/notifications/reset");
        xw0 xw0Var37 = new xw0(11, org.telegram.messenger.id.L0(2131747876), "notificationsServiceRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var38 = new xw0(12, org.telegram.messenger.id.L0(2131747875), "notificationsServiceConnectionRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var39 = new xw0(13, org.telegram.messenger.id.L0(2131746275), "repeatRow", org.telegram.messenger.id.L0(2131747922), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var40 = new xw0(100, org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var40.a("tg://settings/privacy");
        xw0 xw0Var41 = new xw0(109, org.telegram.messenger.id.L0(2131743938), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var41.a("tg://settings/privacy/2sv");
        xw0 xw0Var42 = new xw0(124, org.telegram.messenger.id.L0(2131753850), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.p10.i(i10).f24496p0 >= 0) {
                            f2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.p10.i(i10).q()) {
                            org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(a02.W(), null);
                            jbVar.d(2131624346, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            jbVar.f34883b.setText(spannableStringBuilder);
                            jbVar.f34883b.setSingleLine(false);
                            jbVar.f34883b.setMaxLines(2);
                            a02.b(jbVar, 2750).j();
                            return;
                        }
                        f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        xw0Var42.a("tg://settings/privacy/auto-delete");
        xw0 xw0Var43 = new xw0(108, org.telegram.messenger.id.L0(2131747657), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var43.a("tg://settings/privacy/passcode");
        xw0 xw0Var44 = null;
        if (org.telegram.messenger.iz.f23423m1) {
            xw0Var = xw0Var41;
            xw0Var2 = new xw0(125, org.telegram.messenger.id.L0(2131751202), "emailLoginRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f52341s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f50439f == 1) {
                                        z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var2.a("tg://settings/privacy/login-email");
        } else {
            xw0Var = xw0Var41;
            xw0Var2 = null;
        }
        xw0 xw0Var45 = new xw0(101, org.telegram.messenger.id.L0(2131753681), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var45.a("tg://settings/privacy/blocked");
        xw0 xw0Var46 = new xw0(110, org.telegram.messenger.id.L0(2131745551), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var46.a("tg://settings/devices");
        xw0 xw0Var47 = new xw0(105, org.telegram.messenger.id.L0(2131746790), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var47.a("tg://settings/privacy/phone-number/");
        xw0 xw0Var48 = new xw0(102, org.telegram.messenger.id.L0(2131746815), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var48.a("tg://settings/privacy/last-seen");
        xw0 xw0Var49 = new xw0(103, org.telegram.messenger.id.L0(2131746777), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var49.a("tg://settings/privacy/profile-photos");
        xw0 xw0Var50 = new xw0(104, org.telegram.messenger.id.L0(2131746837), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var50.a("tg://settings/privacy/forwards");
        xw0 xw0Var51 = new xw0(122, org.telegram.messenger.id.L0(2131746800), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var51.a("tg://settings/privacy/calls/p2p");
        xw0 xw0Var52 = new xw0(106, org.telegram.messenger.id.L0(2131752596), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var52.a("tg://settings/privacy/calls");
        xw0 xw0Var53 = new xw0(107, org.telegram.messenger.id.L0(2131746817), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var53.a("tg://settings/privacy/invites");
        xw0 xw0Var54 = new xw0(123, org.telegram.messenger.id.L0(2131746758), org.telegram.messenger.id.L0(2131746771), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r2;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                int i10 = currentAccount;
                switch (i7) {
                    case 0:
                        if (org.telegram.messenger.p10.i(i10).f24496p0 >= 0) {
                            f2Var2.presentFragment(new p4());
                            return;
                        }
                        return;
                    default:
                        if (!org.telegram.messenger.p10.i(i10).q()) {
                            org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(a02.W(), null);
                            jbVar.d(2131624346, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            jbVar.f34883b.setText(spannableStringBuilder);
                            jbVar.f34883b.setSingleLine(false);
                            jbVar.f34883b.setMaxLines(2);
                            a02.b(jbVar, 2750).j();
                            return;
                        }
                        f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        xw0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.qp.s1(currentAccount).Y3) {
            xw0Var3 = xw0Var54;
            xw0Var4 = new xw0(121, org.telegram.messenger.id.L0(2131754171), "newChatsRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                                f2Var.presentFragment(new fe0(i7));
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
                            f2Var.presentFragment(new nt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            xw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            xw0Var3 = xw0Var54;
            xw0Var4 = null;
        }
        xw0 xw0Var55 = new xw0(112, org.telegram.messenger.id.L0(2131751596), "deleteAccountRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var55.a("tg://settings/privacy/self-destruct");
        xw0 xw0Var56 = new xw0(113, org.telegram.messenger.id.L0(2131746797), "paymentsClearRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        xw0 xw0Var57 = new xw0(114, org.telegram.messenger.id.L0(2131742911), org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var57.a("tg://settings/privacy/active-websites");
        xw0 xw0Var58 = new xw0(115, org.telegram.messenger.id.L0(2131744296), "contactsDeleteRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        xw0 xw0Var59 = new xw0(116, org.telegram.messenger.id.L0(2131744298), "contactsSyncRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        xw0 xw0Var60 = new xw0(117, org.telegram.messenger.id.L0(2131744412), "contactsSuggestRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        xw0 xw0Var61 = new xw0(118, org.telegram.messenger.id.L0(2131748689), "secretMapRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var61.a("tg://settings/privacy/data-settings/map-provider");
        xw0 xw0Var62 = new xw0(119, org.telegram.messenger.id.L0(2131745684), "secretWebpageRow", org.telegram.messenger.id.L0(2131746771), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var62.a("tg://settings/privacy/data-settings/link-previews");
        xw0 xw0Var63 = new xw0(120, org.telegram.messenger.id.L0(2131751455), 2131232024, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var63.a("tg://settings/devices");
        xw0 xw0Var64 = new xw0(121, org.telegram.messenger.id.L0(2131744208), "terminateAllSessionsRow", org.telegram.messenger.id.L0(2131751455), 2131232024, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var64.a("tg://settings/devices/terminate-sessions");
        xw0 xw0Var65 = new xw0(122, org.telegram.messenger.id.L0(2131748917), org.telegram.messenger.id.L0(2131751455), 2131232024, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var65.a("tg://settings/devices/link-desktop");
        xw0 xw0Var66 = new xw0(200, org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var66.a("tg://settings/privacy/data-settings");
        xw0 xw0Var67 = new xw0(201, org.telegram.messenger.id.L0(2131751676), "usageSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0 xw0Var68 = new xw0(202, org.telegram.messenger.id.L0(2131744816), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var68.a("tg://settings/data/storage");
        xw0 xw0Var69 = new xw0(203, org.telegram.messenger.id.L0(2131749060), "keepMediaRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0 xw0Var70 = new xw0(204, org.telegram.messenger.id.L0(2131752075), "cacheRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0 xw0Var71 = new xw0(205, org.telegram.messenger.id.L0(2131748774), "databaseRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0 xw0Var72 = new xw0(206, org.telegram.messenger.id.L0(2131748298), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new fe0(i7));
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
                        f2Var.presentFragment(new nt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        xw0Var72.a("tg://settings/data/usage");
        xw0 xw0Var73 = new xw0(207, org.telegram.messenger.id.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var74 = new xw0(208, org.telegram.messenger.id.L0(2131742884), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var75 = new xw0(209, org.telegram.messenger.id.L0(2131742886), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var76 = new xw0(210, org.telegram.messenger.id.L0(2131742885), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var77 = new xw0(211, org.telegram.messenger.id.L0(2131746111), "resetDownloadRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0Var77.a("tg://settings/data/auto-download/reset");
        xw0 xw0Var78 = new xw0(215, org.telegram.messenger.id.L0(2131744438), "streamSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var79 = new xw0(216, org.telegram.messenger.id.L0(2131751144), "enableStreamRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var80 = new xw0(217, org.telegram.messenger.id.L0(2131752596), "callsSectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var81 = new xw0(218, org.telegram.messenger.id.L0(2131743229), "useLessDataForCallsRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0Var81.a("tg://settings/data/use-less-data");
        xw0 xw0Var82 = new xw0(219, org.telegram.messenger.id.L0(2131743258), "quickRepliesRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var83 = new xw0(220, org.telegram.messenger.id.L0(2131746601), org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0Var83.a("tg://settings/data/proxy");
        xw0 xw0Var84 = new xw0(111, org.telegram.messenger.id.L0(2131746841), "clearDraftsRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        xw0 xw0Var85 = new xw0(222, org.telegram.messenger.id.L0(2131745929), "saveToGallerySectionRow", org.telegram.messenger.id.L0(2131751677), 2131232023, new Runnable() {
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
        xw0 xw0Var86 = new xw0(223, org.telegram.messenger.id.L0(2131745919), "saveToGalleryPeerRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), 2131232023, new Runnable() {
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
        xw0Var86.a("tg://settings/data/save-to-photos/chats");
        xw0 xw0Var87 = new xw0(224, org.telegram.messenger.id.L0(2131745926), "saveToGalleryGroupsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), 2131232023, new Runnable() {
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
        xw0Var87.a("tg://settings/data/save-to-photos/groups");
        xw0 xw0Var88 = new xw0(225, org.telegram.messenger.id.L0(2131745928), "saveToGalleryChannelsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), 2131232023, new wf0(2, f2Var));
        xw0Var88.a("tg://settings/data/save-to-photos/channels");
        xw0 xw0Var89 = new xw0(300, org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(3, f2Var));
        xw0Var89.a("tg://settings/appearance/themes");
        xw0 xw0Var90 = new xw0(301, org.telegram.messenger.id.L0(2131744191), "textSizeHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(4, f2Var));
        xw0Var90.a("tg://settings/appearance/text-size");
        xw0 xw0Var91 = new xw0(302, org.telegram.messenger.id.L0(2131752550), org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(5, f2Var));
        xw0Var91.a("tg://settings/appearance/wallpapers");
        xw0 xw0Var92 = new xw0(303, org.telegram.messenger.id.L0(2131745538), null, org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), 2131232025, new wf0(6, f2Var));
        xw0 xw0Var93 = new xw0(304, org.telegram.messenger.id.L0(2131746108), "resetRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), 2131232025, new wf0(8, f2Var));
        xw0 xw0Var94 = new xw0(306, org.telegram.messenger.id.L0(2131752011), "themeHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(9, f2Var));
        xw0 xw0Var95 = new xw0(319, org.telegram.messenger.id.L0(2131752878), null, org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(10, f2Var));
        xw0 xw0Var96 = new xw0(320, org.telegram.messenger.id.L0(2131751712), "createNewThemeRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752878), 2131232025, new wf0(11, f2Var));
        xw0Var96.a("tg://settings/appearance/themes/create");
        xw0 xw0Var97 = new xw0(321, org.telegram.messenger.id.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(13, f2Var));
        xw0Var97.a("tg://settings/appearance/message-corners");
        xw0 xw0Var98 = new xw0(322, org.telegram.messenger.id.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(14, f2Var));
        xw0 xw0Var99 = new xw0(323, org.telegram.messenger.id.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(15, f2Var));
        xw0 xw0Var100 = new xw0(324, org.telegram.messenger.id.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(16, f2Var));
        xw0Var100.a("tg://settings/appearance/app-icon");
        xw0 xw0Var101 = new xw0(305, org.telegram.messenger.id.L0(2131753784), org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(17, f2Var));
        xw0 xw0Var102 = new xw0(328, org.telegram.messenger.id.L0(2131748249), "nextMediaTapRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(18, f2Var));
        xw0Var102.a("tg://settings/appearance/tap-for-next-media");
        xw0 xw0Var103 = new xw0(327, org.telegram.messenger.id.L0(2131746427), "raiseToListenRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(20, f2Var));
        xw0Var103.a("tg://settings/data/raise-to-listen");
        xw0 xw0Var104 = new xw0(310, org.telegram.messenger.id.L0(2131746425), "raiseToSpeakRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(21, f2Var));
        xw0Var104.a("tg://settings/data/raise-to-speak");
        xw0 xw0Var105 = new xw0(326, org.telegram.messenger.id.L0(2131747432), "pauseOnMediaRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(22, f2Var));
        xw0Var105.a("tg://settings/data/pause-music");
        xw0 xw0Var106 = new xw0(325, org.telegram.messenger.id.L0(2131748439), "bluetoothScoRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(24, f2Var));
        xw0 xw0Var107 = new xw0(308, org.telegram.messenger.id.L0(2131751438), "directShareRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(25, f2Var));
        xw0 xw0Var108 = new xw0(311, org.telegram.messenger.id.L0(2131745632), "sendByEnterRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(26, f2Var));
        xw0 xw0Var109 = new xw0(318, org.telegram.messenger.id.L0(2131751367), "distanceRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new wf0(27, f2Var));
        xw0 xw0Var110 = new xw0(600, org.telegram.messenger.id.L0(2131744857), 2131232038, new wf0(28, f2Var));
        xw0Var110.a("tg://settings/appearance/stickers-and-emoji");
        xw0 xw0Var111 = new xw0(601, org.telegram.messenger.id.L0(2131744402), "suggestRow", org.telegram.messenger.id.L0(2131744857), 2131232038, new wf0(29, f2Var));
        xw0 xw0Var112 = new xw0(602, org.telegram.messenger.id.L0(2131750833), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var113 = new xw0(603, org.telegram.messenger.id.L0(2131748679), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var114 = new xw0(604, org.telegram.messenger.id.L0(2131754128), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        xw0 xw0Var115 = new xw0(605, org.telegram.messenger.id.L0(2131754133), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var116 = new xw0(606, org.telegram.messenger.id.L0(2131749034), "largeEmojiRow", org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        xw0 xw0Var117 = new xw0(607, org.telegram.messenger.id.L0(2131748722), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var118 = new xw0(608, org.telegram.messenger.id.L0(2131751196), null, org.telegram.messenger.id.L0(2131744857), 2131231512, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        xw0 xw0Var119 = new xw0(609, org.telegram.messenger.id.L0(2131744416), "suggestAnimatedEmojiRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), 2131231512, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        xw0 xw0Var120 = new xw0(610, org.telegram.messenger.id.L0(2131750835), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), 2131231512, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var121 = new xw0(611, org.telegram.messenger.id.L0(2131751350), null, org.telegram.messenger.id.L0(2131744857), 2131232038, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        xw0 xw0Var122 = new xw0(700, org.telegram.messenger.id.L0(2131750696), null, 2131232027, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var122.a("tg://settings/folders");
        xw0 xw0Var123 = new xw0(701, org.telegram.messenger.id.L0(2131751716), "createFilterRow", org.telegram.messenger.id.L0(2131750696), 2131232027, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            xw0Var5 = xw0Var123;
            xw0Var6 = xw0Var114;
            xw0Var7 = xw0Var116;
            xw0Var8 = xw0Var118;
            xw0Var9 = new xw0(800, org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f52341s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f50439f == 1) {
                                        z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var5 = xw0Var123;
            xw0Var6 = xw0Var114;
            xw0Var7 = xw0Var116;
            xw0Var8 = xw0Var118;
            xw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            xw0Var10 = new xw0(801, org.telegram.messenger.id.L0(2131746998), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f52341s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f50439f == 1) {
                                        z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            xw0Var11 = new xw0(802, org.telegram.messenger.id.L0(2131747007), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f52341s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f50439f == 1) {
                                        z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            xw0Var12 = new xw0(803, org.telegram.messenger.id.L0(2131746964), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                                f2Var.presentFragment(new fe0(i7));
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
                            f2Var.presentFragment(new nt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            xw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            xw0Var13 = new xw0(804, org.telegram.messenger.id.L0(2131747012), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                                f2Var.presentFragment(new fe0(i7));
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
                            f2Var.presentFragment(new nt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            xw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            xw0Var14 = new xw0(805, org.telegram.messenger.id.L0(2131746962), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                                f2Var.presentFragment(new fe0(i7));
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
                            f2Var.presentFragment(new nt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            xw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            xw0Var15 = new xw0(806, org.telegram.messenger.id.L0(2131746992), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
            xw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            xw0Var16 = new xw0(807, org.telegram.messenger.id.L0(2131746983), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
            xw0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            xw0Var17 = new xw0(808, org.telegram.messenger.id.L0(2131746976), org.telegram.messenger.id.L0(2131744231), 2131232362, new wf0(12, f2Var));
        } else {
            xw0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            xw0Var18 = new xw0(809, org.telegram.messenger.id.L0(2131747025), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            xw0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            xw0Var19 = new xw0(810, org.telegram.messenger.id.L0(2131746987), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            xw0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            xw0Var20 = new xw0(811, org.telegram.messenger.id.L0(2131747022), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            xw0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            xw0Var21 = new xw0(812, org.telegram.messenger.id.L0(2131747020), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            xw0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            xw0Var22 = new xw0(813, org.telegram.messenger.id.L0(2131747004), org.telegram.messenger.id.L0(2131744231), 2131232362, new Runnable() {
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            return;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            return;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            return;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            return;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            return;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            return;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            return;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            xw0Var22 = null;
        }
        xw0 xw0Var124 = new xw0(900, org.telegram.messenger.id.L0(2131747066), null, 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var124.a("tg://settings/power-saving");
        xw0 xw0Var125 = new xw0(901, org.telegram.messenger.id.L0(2131748850), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var125.a("tg://settings/power-saving/stickers");
        xw0 xw0Var126 = new xw0(902, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var127 = new xw0(903, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var128 = new xw0(904, org.telegram.messenger.id.L0(2131748855), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var128.a("tg://settings/power-saving/emoji");
        xw0 xw0Var129 = new xw0(905, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var130 = new xw0(906, org.telegram.messenger.id.L0(2131748861), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var131 = new xw0(907, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0 xw0Var132 = new xw0(908, org.telegram.messenger.id.L0(2131748856), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var132.a("tg://settings/power-saving/effects");
        xw0 xw0Var133 = new xw0(909, org.telegram.messenger.id.L0(2131748859), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        return;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        return;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        return;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        return;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        return;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        return;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        return;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        return;
                }
            }
        });
        xw0Var133.a("tg://settings/power-saving/background");
        xw0 xw0Var134 = new xw0(910, org.telegram.messenger.id.L0(2131748847), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var135 = new xw0(911, org.telegram.messenger.id.L0(2131748851), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
            xw0Var23 = new xw0(326, org.telegram.messenger.id.L0(2131748858), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f52341s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f50439f == 1) {
                                        z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var23 = null;
        }
        xw0 xw0Var136 = new xw0(912, org.telegram.messenger.id.L0(2131748852), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var137 = new xw0(913, org.telegram.messenger.id.L0(2131748857), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var137.a("tg://settings/power-saving/call-animations");
        xw0 xw0Var138 = new xw0(214, org.telegram.messenger.id.L0(2131748860), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var138.a("tg://settings/power-saving/videos");
        xw0 xw0Var139 = new xw0(213, org.telegram.messenger.id.L0(2131748863), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var139.a("tg://settings/power-saving/gifs");
        xw0 xw0Var140 = new xw0(914, org.telegram.messenger.id.L0(2131748846), org.telegram.messenger.id.L0(2131747066), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var140.a("tg://settings/power-saving/transitions");
        xw0 xw0Var141 = new xw0(400, org.telegram.messenger.id.L0(2131749054), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var141.a("tg://settings/language");
        xw0 xw0Var142 = new xw0(405, org.telegram.messenger.id.L0(2131745327), org.telegram.messenger.id.L0(2131749054), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.qp.s1(currentAccount).T1().s()) {
            xw0 xw0Var143 = new xw0(406, org.telegram.messenger.id.L0(2131751358), org.telegram.messenger.id.L0(2131749054), 2131232030, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            return;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            return;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            return;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            return;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            return;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.f52341s;
                                if (i10 < arrayList.size()) {
                                    if (((u90) arrayList.get(i10)).f50439f == 1) {
                                        z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var143.a("tg://settings/language/do-not-translate");
            xw0Var44 = xw0Var143;
        }
        xw0 xw0Var144 = new xw0(402, org.telegram.messenger.id.L0(2131753986), org.telegram.messenger.id.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var144.a("tg://settings/ask-question");
        xw0 xw0Var145 = new xw0(403, org.telegram.messenger.id.L0(2131744242), org.telegram.messenger.id.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var145.a("tg://settings/faq");
        xw0 xw0Var146 = new xw0(404, org.telegram.messenger.id.L0(2131746783), org.telegram.messenger.id.L0(2131745479), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        return;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        return;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        return;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        return;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        return;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.f52341s;
                            if (i10 < arrayList.size()) {
                                if (((u90) arrayList.get(i10)).f50439f == 1) {
                                    z90Var8.f52335b.e1(new l2.q(z90Var8, i10, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var146.a("tg://settings/privacy-policy");
        return new xw0[]{xw0Var24, xw0Var25, xw0Var26, xw0Var27, xw0Var28, xw0Var29, xw0Var30, xw0Var31, xw0Var32, xw0Var33, xw0Var34, xw0Var35, xw0Var36, xw0Var37, xw0Var38, xw0Var39, xw0Var40, xw0Var, xw0Var42, xw0Var43, xw0Var2, xw0Var45, xw0Var46, xw0Var47, xw0Var48, xw0Var49, xw0Var50, xw0Var51, xw0Var52, xw0Var53, xw0Var3, xw0Var4, xw0Var55, xw0Var56, xw0Var57, xw0Var58, xw0Var59, xw0Var60, xw0Var61, xw0Var62, xw0Var63, xw0Var64, xw0Var65, xw0Var66, xw0Var67, xw0Var68, xw0Var69, xw0Var70, xw0Var71, xw0Var72, xw0Var73, xw0Var74, xw0Var75, xw0Var76, xw0Var77, xw0Var78, xw0Var79, xw0Var80, xw0Var81, xw0Var82, xw0Var83, xw0Var84, xw0Var85, xw0Var86, xw0Var87, xw0Var88, xw0Var89, xw0Var90, xw0Var91, xw0Var92, xw0Var93, xw0Var94, xw0Var95, xw0Var96, xw0Var97, xw0Var98, xw0Var99, xw0Var100, xw0Var101, xw0Var102, xw0Var103, xw0Var104, xw0Var105, xw0Var106, xw0Var107, xw0Var108, xw0Var109, xw0Var110, xw0Var111, xw0Var112, xw0Var113, xw0Var6, xw0Var115, xw0Var7, xw0Var117, xw0Var8, xw0Var119, xw0Var120, xw0Var121, xw0Var122, xw0Var5, xw0Var9, xw0Var10, xw0Var11, xw0Var12, xw0Var13, xw0Var14, xw0Var15, xw0Var16, xw0Var17, xw0Var18, xw0Var19, xw0Var20, xw0Var21, xw0Var22, xw0Var124, xw0Var125, xw0Var126, xw0Var127, xw0Var128, xw0Var129, xw0Var130, xw0Var131, xw0Var132, xw0Var133, xw0Var134, xw0Var135, xw0Var23, xw0Var136, xw0Var137, xw0Var138, xw0Var139, xw0Var140, xw0Var141, xw0Var142, xw0Var44, xw0Var144, xw0Var145, xw0Var146};
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f52142w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f52143x) {
            f();
        }
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof xw0) {
                ((xw0) obj2).f51836g = i7;
            } else if (obj2 instanceof org.telegram.messenger.cp) {
                ((org.telegram.messenger.cp) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.qp.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f52138f;
        TLRPC.WebPage webPage = org.telegram.messenger.qp.s1(i7).f24876q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.qp.s1(i7).f24867p2);
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
        if (this.f52144y != null) {
            Utilities.f21343g.a(this.f52144y);
            this.f52144y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f52143x = false;
            this.f52140r.clear();
            this.f52141s.clear();
            this.f52139n.clear();
            org.telegram.ui.ActionBar.f2 f2Var = this.f52137e;
            if (f2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) f2Var).O.f32366b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.f52137e).O.d.setText(org.telegram.messenger.id.M0(2131745477, null));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21343g;
        tn0 tn0Var = new tn0(29, this, str);
        this.f52144y = tn0Var;
        p5Var.d(tn0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        xw0 xw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            xw0[] xw0VarArr = this.f52136c;
            if (i7 >= xw0VarArr.length) {
                break;
            }
            xw0 xw0Var2 = xw0VarArr[i7];
            if (xw0Var2 != null) {
                hashMap.put(Integer.valueOf(xw0Var2.f51835f), this.f52136c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.qp.e1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f52142w;
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
                    } else if (readInt322 == 1 && (xw0Var = (xw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        xw0Var.f51836g = readInt32;
                        arrayList.add(xw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new xn0(this));
    }

    @Override
    public final int b() {
        int size;
        int i7 = 0;
        if (this.f52143x) {
            int size2 = this.f52140r.size();
            if (!this.f52141s.isEmpty()) {
                i7 = this.f52141s.size() + 1;
            }
            return size2 + i7;
        }
        ArrayList arrayList = this.f52142w;
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
        if (this.f52143x) {
            if (i7 < this.f52140r.size() || i7 != this.f52140r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f52142w;
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
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        xw0 xw0Var = null;
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
        if (this.f52143x) {
            if (i7 < this.f52140r.size()) {
                xw0 xw0Var2 = (xw0) this.f52140r.get(i7);
                if (i7 > 0) {
                    xw0Var = (xw0) this.f52140r.get(i7 - 1);
                }
                if (xw0Var != null && xw0Var.f51834e == xw0Var2.f51834e) {
                    i10 = 0;
                } else {
                    i10 = xw0Var2.f51834e;
                }
                CharSequence charSequence = (CharSequence) this.f52139n.get(i7);
                String[] strArr = xw0Var2.d;
                if (i7 >= this.f52140r.size() - 1) {
                    z9 = false;
                }
                v6Var.b(charSequence, strArr, i10, z9);
                return;
            }
            int g10 = jg.g.g(1, i7, this.f52140r);
            CharSequence charSequence2 = (CharSequence) this.f52139n.get(this.f52140r.size() + g10);
            String[] strArr2 = ((org.telegram.messenger.cp) this.f52141s.get(g10)).f21917b;
            if (g10 < this.f52140r.size() - 1) {
                z10 = true;
            }
            v6Var.a(charSequence2, strArr2, true, z10);
            return;
        }
        ArrayList arrayList = this.f52142w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 < arrayList.size()) {
            Object obj = arrayList.get(i7);
            if (obj instanceof xw0) {
                xw0 xw0Var3 = (xw0) obj;
                String str = xw0Var3.f51831a;
                String[] strArr3 = xw0Var3.d;
                if (i7 >= arrayList.size() - 1) {
                    z9 = false;
                }
                v6Var.a(str, strArr3, false, z9);
                return;
            } else if (obj instanceof org.telegram.messenger.cp) {
                org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) obj;
                String str2 = cpVar.f21916a;
                String[] strArr4 = cpVar.f21917b;
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
        String str3 = cpVar2.f21916a;
        String[] strArr5 = cpVar2.f21917b;
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
