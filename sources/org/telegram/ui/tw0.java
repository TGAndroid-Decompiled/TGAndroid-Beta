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
public class tw0 extends org.telegram.ui.Components.oj0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public sw0[] f50158c;
    public final org.telegram.ui.ActionBar.f2 f50159e;
    public final int f50160f;
    public final Context h;
    public boolean f50165x;
    public qn0 f50166y;
    public final ArrayList d = new ArrayList();
    public ArrayList f50161n = new ArrayList();
    public ArrayList f50162r = new ArrayList();
    public ArrayList f50163s = new ArrayList();
    public final ArrayList f50164w = new ArrayList();

    public tw0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f50159e = f2Var;
        this.f50160f = f2Var.getCurrentAccount();
        this.h = context;
        this.f50158c = H(f2Var);
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

    public static sw0[] H(final org.telegram.ui.ActionBar.f2 f2Var) {
        sw0 sw0Var;
        sw0 sw0Var2;
        sw0 sw0Var3;
        sw0 sw0Var4;
        sw0 sw0Var5;
        sw0 sw0Var6;
        sw0 sw0Var7;
        sw0 sw0Var8;
        sw0 sw0Var9;
        sw0 sw0Var10;
        sw0 sw0Var11;
        sw0 sw0Var12;
        sw0 sw0Var13;
        sw0 sw0Var14;
        sw0 sw0Var15;
        sw0 sw0Var16;
        sw0 sw0Var17;
        sw0 sw0Var18;
        sw0 sw0Var19;
        sw0 sw0Var20;
        sw0 sw0Var21;
        sw0 sw0Var22;
        sw0 sw0Var23;
        final int currentAccount = f2Var.getCurrentAccount();
        sw0 sw0Var24 = new sw0(500, org.telegram.messenger.id.L0(2131751265), 0, new qn0(26, f2Var, f2Var.getResourceProvider()));
        sw0 sw0Var25 = new sw0(501, org.telegram.messenger.id.L0(2131752537), 0, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var25.a("tg://settings/edit/change-number");
        sw0 sw0Var26 = new sw0(502, org.telegram.messenger.id.L0(2131754468), 0, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var26.a("tg://settings/edit/add-account");
        sw0 sw0Var27 = new sw0(1, org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var27.a("tg://settings/notifications");
        sw0 sw0Var28 = new sw0(2, org.telegram.messenger.id.L0(2131747879), org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var28.a("tg://settings/notifications/private-chats");
        sw0 sw0Var29 = new sw0(3, org.telegram.messenger.id.L0(2131747908), org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
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
        sw0Var29.a("tg://settings/notifications/groups");
        sw0 sw0Var30 = new sw0(4, org.telegram.messenger.id.L0(2131747922), org.telegram.messenger.id.L0(2131747923), 2131232262, new tf0(7, f2Var));
        sw0Var30.a("tg://settings/notifications/channels");
        sw0 sw0Var31 = new sw0(5, org.telegram.messenger.id.L0(2131743282), "callsSectionRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new tf0(19, f2Var));
        sw0 sw0Var32 = new sw0(6, org.telegram.messenger.id.L0(2131753733), "badgeNumberSection", org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var33 = new sw0(7, org.telegram.messenger.id.L0(2131749220), "inappSectionRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var34 = new sw0(8, org.telegram.messenger.id.L0(2131751790), "contactJoinedRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new tf0(23, f2Var));
        sw0Var34.a("tg://settings/notifications/new-contacts");
        sw0 sw0Var35 = new sw0(9, org.telegram.messenger.id.L0(2131747229), "pinnedMessageRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var35.a("tg://settings/notifications/pinned-messages");
        sw0 sw0Var36 = new sw0(10, org.telegram.messenger.id.L0(2131746115), "resetNotificationsRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var36.a("tg://settings/notifications/reset");
        sw0 sw0Var37 = new sw0(11, org.telegram.messenger.id.L0(2131747877), "notificationsServiceRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var38 = new sw0(12, org.telegram.messenger.id.L0(2131747876), "notificationsServiceConnectionRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var39 = new sw0(13, org.telegram.messenger.id.L0(2131746276), "repeatRow", org.telegram.messenger.id.L0(2131747923), 2131232262, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var40 = new sw0(100, org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var40.a("tg://settings/privacy");
        sw0 sw0Var41 = new sw0(109, org.telegram.messenger.id.L0(2131743941), org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var41.a("tg://settings/privacy/2sv");
        sw0 sw0Var42 = new sw0(124, org.telegram.messenger.id.L0(2131753850), org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            String M0 = org.telegram.messenger.id.M0(2131746756, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            kbVar.f35269b.setText(spannableStringBuilder);
                            kbVar.f35269b.setSingleLine(false);
                            kbVar.f35269b.setMaxLines(2);
                            a02.b(kbVar, 2750).j();
                            return;
                        }
                        f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        sw0Var42.a("tg://settings/privacy/auto-delete");
        sw0 sw0Var43 = new sw0(108, org.telegram.messenger.id.L0(2131747658), org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var43.a("tg://settings/privacy/passcode");
        sw0 sw0Var44 = null;
        if (org.telegram.messenger.iz.f23419m1) {
            sw0Var = sw0Var41;
            sw0Var2 = new sw0(125, org.telegram.messenger.id.L0(2131751203), "emailLoginRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            return;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            return;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            return;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            return;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            return;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.f50990s;
                                if (i10 < arrayList.size()) {
                                    if (((r90) arrayList.get(i10)).f49420f == 1) {
                                        w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var2.a("tg://settings/privacy/login-email");
        } else {
            sw0Var = sw0Var41;
            sw0Var2 = null;
        }
        sw0 sw0Var45 = new sw0(101, org.telegram.messenger.id.L0(2131753681), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var45.a("tg://settings/privacy/blocked");
        sw0 sw0Var46 = new sw0(110, org.telegram.messenger.id.L0(2131745554), 2131232036, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var46.a("tg://settings/devices");
        sw0 sw0Var47 = new sw0(105, org.telegram.messenger.id.L0(2131746791), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var47.a("tg://settings/privacy/phone-number/");
        sw0 sw0Var48 = new sw0(102, org.telegram.messenger.id.L0(2131746816), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var48.a("tg://settings/privacy/last-seen");
        sw0 sw0Var49 = new sw0(103, org.telegram.messenger.id.L0(2131746778), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var49.a("tg://settings/privacy/profile-photos");
        sw0 sw0Var50 = new sw0(104, org.telegram.messenger.id.L0(2131746838), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var50.a("tg://settings/privacy/forwards");
        sw0 sw0Var51 = new sw0(122, org.telegram.messenger.id.L0(2131746801), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var51.a("tg://settings/privacy/calls/p2p");
        sw0 sw0Var52 = new sw0(106, org.telegram.messenger.id.L0(2131752596), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var52.a("tg://settings/privacy/calls");
        sw0 sw0Var53 = new sw0(107, org.telegram.messenger.id.L0(2131746818), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var53.a("tg://settings/privacy/invites");
        sw0 sw0Var54 = new sw0(123, org.telegram.messenger.id.L0(2131746759), org.telegram.messenger.id.L0(2131746772), 2131232355, new Runnable() {
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
                            String M0 = org.telegram.messenger.id.M0(2131746756, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            kbVar.f35269b.setText(spannableStringBuilder);
                            kbVar.f35269b.setSingleLine(false);
                            kbVar.f35269b.setMaxLines(2);
                            a02.b(kbVar, 2750).j();
                            return;
                        }
                        f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                        return;
                }
            }
        });
        sw0Var54.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.qp.s1(currentAccount).Y3) {
            sw0Var3 = sw0Var54;
            sw0Var4 = new sw0(121, org.telegram.messenger.id.L0(2131754171), "newChatsRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                                f2Var.presentFragment(new ce0(i7));
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
                            f2Var.presentFragment(new kt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
            sw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            sw0Var3 = sw0Var54;
            sw0Var4 = null;
        }
        sw0 sw0Var55 = new sw0(112, org.telegram.messenger.id.L0(2131751597), "deleteAccountRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var55.a("tg://settings/privacy/self-destruct");
        sw0 sw0Var56 = new sw0(113, org.telegram.messenger.id.L0(2131746798), "paymentsClearRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var56.a("tg://settings/privacy/data-settings/clear-payment-info");
        sw0 sw0Var57 = new sw0(114, org.telegram.messenger.id.L0(2131742914), org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var57.a("tg://settings/privacy/active-websites");
        sw0 sw0Var58 = new sw0(115, org.telegram.messenger.id.L0(2131744299), "contactsDeleteRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var58.a("tg://settings/privacy/data-settings/delete-synced");
        sw0 sw0Var59 = new sw0(116, org.telegram.messenger.id.L0(2131744301), "contactsSyncRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var59.a("tg://settings/privacy/data-settings/sync-contacts");
        sw0 sw0Var60 = new sw0(117, org.telegram.messenger.id.L0(2131744415), "contactsSuggestRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var60.a("tg://settings/privacy/data-settings/suggest-contacts");
        sw0 sw0Var61 = new sw0(118, org.telegram.messenger.id.L0(2131748690), "secretMapRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var61.a("tg://settings/privacy/data-settings/map-provider");
        sw0 sw0Var62 = new sw0(119, org.telegram.messenger.id.L0(2131745687), "secretWebpageRow", org.telegram.messenger.id.L0(2131746772), 2131232036, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var62.a("tg://settings/privacy/data-settings/link-previews");
        sw0 sw0Var63 = new sw0(120, org.telegram.messenger.id.L0(2131751456), 2131232024, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var63.a("tg://settings/devices");
        sw0 sw0Var64 = new sw0(121, org.telegram.messenger.id.L0(2131744211), "terminateAllSessionsRow", org.telegram.messenger.id.L0(2131751456), 2131232024, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var64.a("tg://settings/devices/terminate-sessions");
        sw0 sw0Var65 = new sw0(122, org.telegram.messenger.id.L0(2131748918), org.telegram.messenger.id.L0(2131751456), 2131232024, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var65.a("tg://settings/devices/link-desktop");
        sw0 sw0Var66 = new sw0(200, org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var66.a("tg://settings/privacy/data-settings");
        sw0 sw0Var67 = new sw0(201, org.telegram.messenger.id.L0(2131751677), "usageSectionRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0 sw0Var68 = new sw0(202, org.telegram.messenger.id.L0(2131744819), org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var68.a("tg://settings/data/storage");
        sw0 sw0Var69 = new sw0(203, org.telegram.messenger.id.L0(2131749061), "keepMediaRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131744819), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0 sw0Var70 = new sw0(204, org.telegram.messenger.id.L0(2131752075), "cacheRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131744819), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0 sw0Var71 = new sw0(205, org.telegram.messenger.id.L0(2131748775), "databaseRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131744819), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0 sw0Var72 = new sw0(206, org.telegram.messenger.id.L0(2131748299), org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
                            f2Var.presentFragment(new ce0(i7));
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
                        f2Var.presentFragment(new kt());
                        return;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        return;
                }
            }
        });
        sw0Var72.a("tg://settings/data/usage");
        sw0 sw0Var73 = new sw0(207, org.telegram.messenger.id.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var74 = new sw0(208, org.telegram.messenger.id.L0(2131742887), org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var75 = new sw0(209, org.telegram.messenger.id.L0(2131742889), org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var76 = new sw0(210, org.telegram.messenger.id.L0(2131742888), org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var77 = new sw0(211, org.telegram.messenger.id.L0(2131746114), "resetDownloadRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0Var77.a("tg://settings/data/auto-download/reset");
        sw0 sw0Var78 = new sw0(215, org.telegram.messenger.id.L0(2131744441), "streamSectionRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var79 = new sw0(216, org.telegram.messenger.id.L0(2131751145), "enableStreamRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var80 = new sw0(217, org.telegram.messenger.id.L0(2131752596), "callsSectionRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var81 = new sw0(218, org.telegram.messenger.id.L0(2131743232), "useLessDataForCallsRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0Var81.a("tg://settings/data/use-less-data");
        sw0 sw0Var82 = new sw0(219, org.telegram.messenger.id.L0(2131743261), "quickRepliesRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var83 = new sw0(220, org.telegram.messenger.id.L0(2131746602), org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0Var83.a("tg://settings/data/proxy");
        sw0 sw0Var84 = new sw0(111, org.telegram.messenger.id.L0(2131746842), "clearDraftsRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0Var84.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        sw0 sw0Var85 = new sw0(222, org.telegram.messenger.id.L0(2131745932), "saveToGallerySectionRow", org.telegram.messenger.id.L0(2131751678), 2131232023, new Runnable() {
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
        sw0 sw0Var86 = new sw0(223, org.telegram.messenger.id.L0(2131745922), "saveToGalleryPeerRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131745932), 2131232023, new Runnable() {
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
        sw0Var86.a("tg://settings/data/save-to-photos/chats");
        sw0 sw0Var87 = new sw0(224, org.telegram.messenger.id.L0(2131745929), "saveToGalleryGroupsRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131745932), 2131232023, new Runnable() {
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
        sw0Var87.a("tg://settings/data/save-to-photos/groups");
        sw0 sw0Var88 = new sw0(225, org.telegram.messenger.id.L0(2131745931), "saveToGalleryChannelsRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131745932), 2131232023, new tf0(2, f2Var));
        sw0Var88.a("tg://settings/data/save-to-photos/channels");
        sw0 sw0Var89 = new sw0(300, org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(3, f2Var));
        sw0Var89.a("tg://settings/appearance/themes");
        sw0 sw0Var90 = new sw0(301, org.telegram.messenger.id.L0(2131744194), "textSizeHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(4, f2Var));
        sw0Var90.a("tg://settings/appearance/text-size");
        sw0 sw0Var91 = new sw0(302, org.telegram.messenger.id.L0(2131752550), org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(5, f2Var));
        sw0Var91.a("tg://settings/appearance/wallpapers");
        sw0 sw0Var92 = new sw0(303, org.telegram.messenger.id.L0(2131745541), null, org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), 2131232025, new tf0(6, f2Var));
        sw0 sw0Var93 = new sw0(304, org.telegram.messenger.id.L0(2131746111), "resetRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), 2131232025, new tf0(8, f2Var));
        sw0 sw0Var94 = new sw0(306, org.telegram.messenger.id.L0(2131752011), "themeHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(9, f2Var));
        sw0 sw0Var95 = new sw0(319, org.telegram.messenger.id.L0(2131752878), null, org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(10, f2Var));
        sw0 sw0Var96 = new sw0(320, org.telegram.messenger.id.L0(2131751713), "createNewThemeRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752878), 2131232025, new tf0(11, f2Var));
        sw0Var96.a("tg://settings/appearance/themes/create");
        sw0 sw0Var97 = new sw0(321, org.telegram.messenger.id.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(13, f2Var));
        sw0Var97.a("tg://settings/appearance/message-corners");
        sw0 sw0Var98 = new sw0(322, org.telegram.messenger.id.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(14, f2Var));
        sw0 sw0Var99 = new sw0(323, org.telegram.messenger.id.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(15, f2Var));
        sw0 sw0Var100 = new sw0(324, org.telegram.messenger.id.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(16, f2Var));
        sw0Var100.a("tg://settings/appearance/app-icon");
        sw0 sw0Var101 = new sw0(305, org.telegram.messenger.id.L0(2131753784), org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(17, f2Var));
        sw0 sw0Var102 = new sw0(328, org.telegram.messenger.id.L0(2131748250), "nextMediaTapRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(18, f2Var));
        sw0Var102.a("tg://settings/appearance/tap-for-next-media");
        sw0 sw0Var103 = new sw0(327, org.telegram.messenger.id.L0(2131746428), "raiseToListenRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(20, f2Var));
        sw0Var103.a("tg://settings/data/raise-to-listen");
        sw0 sw0Var104 = new sw0(310, org.telegram.messenger.id.L0(2131746426), "raiseToSpeakRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(21, f2Var));
        sw0Var104.a("tg://settings/data/raise-to-speak");
        sw0 sw0Var105 = new sw0(326, org.telegram.messenger.id.L0(2131747433), "pauseOnMediaRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(22, f2Var));
        sw0Var105.a("tg://settings/data/pause-music");
        sw0 sw0Var106 = new sw0(325, org.telegram.messenger.id.L0(2131748440), "bluetoothScoRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(24, f2Var));
        sw0 sw0Var107 = new sw0(308, org.telegram.messenger.id.L0(2131751439), "directShareRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(25, f2Var));
        sw0 sw0Var108 = new sw0(311, org.telegram.messenger.id.L0(2131745635), "sendByEnterRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(26, f2Var));
        sw0 sw0Var109 = new sw0(318, org.telegram.messenger.id.L0(2131751368), "distanceRow", org.telegram.messenger.id.L0(2131752210), 2131232025, new tf0(27, f2Var));
        sw0 sw0Var110 = new sw0(600, org.telegram.messenger.id.L0(2131744860), 2131232038, new tf0(28, f2Var));
        sw0Var110.a("tg://settings/appearance/stickers-and-emoji");
        sw0 sw0Var111 = new sw0(601, org.telegram.messenger.id.L0(2131744405), "suggestRow", org.telegram.messenger.id.L0(2131744860), 2131232038, new tf0(29, f2Var));
        sw0 sw0Var112 = new sw0(602, org.telegram.messenger.id.L0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744860), 2131232038, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var113 = new sw0(603, org.telegram.messenger.id.L0(2131748680), null, org.telegram.messenger.id.L0(2131744860), 2131232038, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var114 = new sw0(604, org.telegram.messenger.id.L0(2131754128), null, org.telegram.messenger.id.L0(2131744860), 2131232038, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var114.a("tg://settings/appearance/stickers-and-emoji/archived");
        sw0 sw0Var115 = new sw0(605, org.telegram.messenger.id.L0(2131754133), null, org.telegram.messenger.id.L0(2131744860), 2131232038, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var116 = new sw0(606, org.telegram.messenger.id.L0(2131749035), "largeEmojiRow", org.telegram.messenger.id.L0(2131744860), 2131232038, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var116.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        sw0 sw0Var117 = new sw0(607, org.telegram.messenger.id.L0(2131748723), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748851), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var118 = new sw0(608, org.telegram.messenger.id.L0(2131751197), null, org.telegram.messenger.id.L0(2131744860), 2131231512, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji");
        sw0 sw0Var119 = new sw0(609, org.telegram.messenger.id.L0(2131744419), "suggestAnimatedEmojiRow", org.telegram.messenger.id.L0(2131744860), org.telegram.messenger.id.L0(2131751197), 2131231512, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var119.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        sw0 sw0Var120 = new sw0(610, org.telegram.messenger.id.L0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744860), org.telegram.messenger.id.L0(2131751197), 2131231512, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var121 = new sw0(611, org.telegram.messenger.id.L0(2131751351), null, org.telegram.messenger.id.L0(2131744860), 2131232038, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var121.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        sw0 sw0Var122 = new sw0(700, org.telegram.messenger.id.L0(2131750697), null, 2131232027, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var122.a("tg://settings/folders");
        sw0 sw0Var123 = new sw0(701, org.telegram.messenger.id.L0(2131751717), "createFilterRow", org.telegram.messenger.id.L0(2131750697), 2131232027, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var123.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            sw0Var5 = sw0Var123;
            sw0Var6 = sw0Var114;
            sw0Var7 = sw0Var116;
            sw0Var8 = sw0Var118;
            sw0Var9 = new sw0(800, org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            return;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            return;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            return;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            return;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            return;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.f50990s;
                                if (i10 < arrayList.size()) {
                                    if (((r90) arrayList.get(i10)).f49420f == 1) {
                                        w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var5 = sw0Var123;
            sw0Var6 = sw0Var114;
            sw0Var7 = sw0Var116;
            sw0Var8 = sw0Var118;
            sw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            sw0Var10 = new sw0(801, org.telegram.messenger.id.L0(2131746999), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            return;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            return;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            return;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            return;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            return;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.f50990s;
                                if (i10 < arrayList.size()) {
                                    if (((r90) arrayList.get(i10)).f49420f == 1) {
                                        w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            sw0Var11 = new sw0(802, org.telegram.messenger.id.L0(2131747008), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            return;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            return;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            return;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            return;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            return;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.f50990s;
                                if (i10 < arrayList.size()) {
                                    if (((r90) arrayList.get(i10)).f49420f == 1) {
                                        w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            sw0Var12 = new sw0(803, org.telegram.messenger.id.L0(2131746965), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                                f2Var.presentFragment(new ce0(i7));
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
                            f2Var.presentFragment(new kt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            sw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            sw0Var13 = new sw0(804, org.telegram.messenger.id.L0(2131747013), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                                f2Var.presentFragment(new ce0(i7));
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
                            f2Var.presentFragment(new kt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            sw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            sw0Var14 = new sw0(805, org.telegram.messenger.id.L0(2131746963), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                                f2Var.presentFragment(new ce0(i7));
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
                            f2Var.presentFragment(new kt());
                            return;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            return;
                    }
                }
            });
        } else {
            sw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            sw0Var15 = new sw0(806, org.telegram.messenger.id.L0(2131746993), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
            sw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            sw0Var16 = new sw0(807, org.telegram.messenger.id.L0(2131746984), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
            sw0Var16 = null;
        }
        if (F(currentAccount, 5)) {
            sw0Var17 = new sw0(808, org.telegram.messenger.id.L0(2131746977), org.telegram.messenger.id.L0(2131744234), 2131232362, new tf0(12, f2Var));
        } else {
            sw0Var17 = null;
        }
        if (F(currentAccount, 9)) {
            sw0Var18 = new sw0(809, org.telegram.messenger.id.L0(2131747026), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            return;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            return;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            return;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            return;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            return;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            return;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            return;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            sw0Var18 = null;
        }
        if (F(currentAccount, 6)) {
            sw0Var19 = new sw0(810, org.telegram.messenger.id.L0(2131746988), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            return;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            return;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            return;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            return;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            return;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            return;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            return;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            sw0Var19 = null;
        }
        if (F(currentAccount, 7)) {
            sw0Var20 = new sw0(811, org.telegram.messenger.id.L0(2131747023), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            return;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            return;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            return;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            return;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            return;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            return;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            return;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            sw0Var20 = null;
        }
        if (F(currentAccount, 10)) {
            sw0Var21 = new sw0(812, org.telegram.messenger.id.L0(2131747021), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            return;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            return;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            return;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            return;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            return;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            return;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            return;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            sw0Var21 = null;
        }
        if (F(currentAccount, 12)) {
            sw0Var22 = new sw0(813, org.telegram.messenger.id.L0(2131747005), org.telegram.messenger.id.L0(2131744234), 2131232362, new Runnable() {
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            return;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            return;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            return;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            return;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            return;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            return;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            return;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            return;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            return;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            return;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            return;
                    }
                }
            });
        } else {
            sw0Var22 = null;
        }
        sw0 sw0Var124 = new sw0(900, org.telegram.messenger.id.L0(2131747067), null, 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var124.a("tg://settings/power-saving");
        sw0 sw0Var125 = new sw0(901, org.telegram.messenger.id.L0(2131748851), org.telegram.messenger.id.L0(2131747067), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var125.a("tg://settings/power-saving/stickers");
        sw0 sw0Var126 = new sw0(902, org.telegram.messenger.id.L0(2131748863), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748851), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var127 = new sw0(903, org.telegram.messenger.id.L0(2131748865), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748851), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var128 = new sw0(904, org.telegram.messenger.id.L0(2131748856), org.telegram.messenger.id.L0(2131747067), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var128.a("tg://settings/power-saving/emoji");
        sw0 sw0Var129 = new sw0(905, org.telegram.messenger.id.L0(2131748863), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var130 = new sw0(906, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var131 = new sw0(907, org.telegram.messenger.id.L0(2131748865), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748856), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0 sw0Var132 = new sw0(908, org.telegram.messenger.id.L0(2131748857), org.telegram.messenger.id.L0(2131747067), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var132.a("tg://settings/power-saving/effects");
        sw0 sw0Var133 = new sw0(909, org.telegram.messenger.id.L0(2131748860), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), 2131232019, new Runnable() {
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        return;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        return;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        return;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        return;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        return;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        return;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        return;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        return;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        return;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        return;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        return;
                }
            }
        });
        sw0Var133.a("tg://settings/power-saving/background");
        sw0 sw0Var134 = new sw0(910, org.telegram.messenger.id.L0(2131748848), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var135 = new sw0(911, org.telegram.messenger.id.L0(2131748852), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
            sw0Var23 = new sw0(326, org.telegram.messenger.id.L0(2131748859), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), 2131232019, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            return;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            return;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            return;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            return;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            return;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.f50990s;
                                if (i10 < arrayList.size()) {
                                    if (((r90) arrayList.get(i10)).f49420f == 1) {
                                        w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var23 = null;
        }
        sw0 sw0Var136 = new sw0(912, org.telegram.messenger.id.L0(2131748853), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var137 = new sw0(913, org.telegram.messenger.id.L0(2131748858), org.telegram.messenger.id.L0(2131747067), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var137.a("tg://settings/power-saving/call-animations");
        sw0 sw0Var138 = new sw0(214, org.telegram.messenger.id.L0(2131748861), org.telegram.messenger.id.L0(2131747067), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var138.a("tg://settings/power-saving/videos");
        sw0 sw0Var139 = new sw0(213, org.telegram.messenger.id.L0(2131748864), org.telegram.messenger.id.L0(2131747067), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var139.a("tg://settings/power-saving/gifs");
        sw0 sw0Var140 = new sw0(914, org.telegram.messenger.id.L0(2131748847), org.telegram.messenger.id.L0(2131747067), 2131232019, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var140.a("tg://settings/power-saving/transitions");
        sw0 sw0Var141 = new sw0(400, org.telegram.messenger.id.L0(2131749055), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var141.a("tg://settings/language");
        sw0 sw0Var142 = new sw0(405, org.telegram.messenger.id.L0(2131745330), org.telegram.messenger.id.L0(2131749055), 2131232030, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.qp.s1(currentAccount).T1().s()) {
            sw0 sw0Var143 = new sw0(406, org.telegram.messenger.id.L0(2131751359), org.telegram.messenger.id.L0(2131749055), 2131232030, new Runnable() {
                @Override
                public final void run() {
                    int i7 = r1;
                    int i10 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i7) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            return;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            return;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            return;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            return;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            return;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            return;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            return;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            return;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.f50990s;
                                if (i10 < arrayList.size()) {
                                    if (((r90) arrayList.get(i10)).f49420f == 1) {
                                        w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            return;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var143.a("tg://settings/language/do-not-translate");
            sw0Var44 = sw0Var143;
        }
        sw0 sw0Var144 = new sw0(402, org.telegram.messenger.id.L0(2131753986), org.telegram.messenger.id.L0(2131745482), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var144.a("tg://settings/ask-question");
        sw0 sw0Var145 = new sw0(403, org.telegram.messenger.id.L0(2131744245), org.telegram.messenger.id.L0(2131745482), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var145.a("tg://settings/faq");
        sw0 sw0Var146 = new sw0(404, org.telegram.messenger.id.L0(2131746784), org.telegram.messenger.id.L0(2131745482), 2131232029, new Runnable() {
            @Override
            public final void run() {
                int i7 = r1;
                int i10 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i7) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        return;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        return;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        return;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        return;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        return;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        return;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        return;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        return;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.f50990s;
                            if (i10 < arrayList.size()) {
                                if (((r90) arrayList.get(i10)).f49420f == 1) {
                                    w90Var8.f50984b.e1(new l2.q(w90Var8, i10, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        return;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var146.a("tg://settings/privacy-policy");
        return new sw0[]{sw0Var24, sw0Var25, sw0Var26, sw0Var27, sw0Var28, sw0Var29, sw0Var30, sw0Var31, sw0Var32, sw0Var33, sw0Var34, sw0Var35, sw0Var36, sw0Var37, sw0Var38, sw0Var39, sw0Var40, sw0Var, sw0Var42, sw0Var43, sw0Var2, sw0Var45, sw0Var46, sw0Var47, sw0Var48, sw0Var49, sw0Var50, sw0Var51, sw0Var52, sw0Var53, sw0Var3, sw0Var4, sw0Var55, sw0Var56, sw0Var57, sw0Var58, sw0Var59, sw0Var60, sw0Var61, sw0Var62, sw0Var63, sw0Var64, sw0Var65, sw0Var66, sw0Var67, sw0Var68, sw0Var69, sw0Var70, sw0Var71, sw0Var72, sw0Var73, sw0Var74, sw0Var75, sw0Var76, sw0Var77, sw0Var78, sw0Var79, sw0Var80, sw0Var81, sw0Var82, sw0Var83, sw0Var84, sw0Var85, sw0Var86, sw0Var87, sw0Var88, sw0Var89, sw0Var90, sw0Var91, sw0Var92, sw0Var93, sw0Var94, sw0Var95, sw0Var96, sw0Var97, sw0Var98, sw0Var99, sw0Var100, sw0Var101, sw0Var102, sw0Var103, sw0Var104, sw0Var105, sw0Var106, sw0Var107, sw0Var108, sw0Var109, sw0Var110, sw0Var111, sw0Var112, sw0Var113, sw0Var6, sw0Var115, sw0Var7, sw0Var117, sw0Var8, sw0Var119, sw0Var120, sw0Var121, sw0Var122, sw0Var5, sw0Var9, sw0Var10, sw0Var11, sw0Var12, sw0Var13, sw0Var14, sw0Var15, sw0Var16, sw0Var17, sw0Var18, sw0Var19, sw0Var20, sw0Var21, sw0Var22, sw0Var124, sw0Var125, sw0Var126, sw0Var127, sw0Var128, sw0Var129, sw0Var130, sw0Var131, sw0Var132, sw0Var133, sw0Var134, sw0Var135, sw0Var23, sw0Var136, sw0Var137, sw0Var138, sw0Var139, sw0Var140, sw0Var141, sw0Var142, sw0Var44, sw0Var144, sw0Var145, sw0Var146};
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57047f == 0) {
            return true;
        }
        return false;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.f50164w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.f50165x) {
            f();
        }
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof sw0) {
                ((sw0) obj2).f49852g = i7;
            } else if (obj2 instanceof org.telegram.messenger.cp) {
                ((org.telegram.messenger.cp) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.qp.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f50160f;
        TLRPC.WebPage webPage = org.telegram.messenger.qp.s1(i7).f24872q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.qp.s1(i7).f24863p2);
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = org.telegram.messenger.id.M0(2131744243, null);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWebPage, new l(this, 20));
        }
    }

    public final void I(String str) {
        this.D = str;
        if (this.f50166y != null) {
            Utilities.f21338g.a(this.f50166y);
            this.f50166y = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50165x = false;
            this.f50162r.clear();
            this.f50163s.clear();
            this.f50161n.clear();
            org.telegram.ui.ActionBar.f2 f2Var = this.f50159e;
            if (f2Var instanceof ProfileActivity) {
                try {
                    ((ProfileActivity) f2Var).O.f31925b.getImageReceiver().P0(false);
                    ((ProfileActivity) this.f50159e).O.d.setText(org.telegram.messenger.id.M0(2131745480, null));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21338g;
        qn0 qn0Var = new qn0(27, this, str);
        this.f50166y = qn0Var;
        p5Var.d(qn0Var, 300L);
    }

    public final void J() {
        String[] strArr;
        sw0 sw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            sw0[] sw0VarArr = this.f50158c;
            if (i7 >= sw0VarArr.length) {
                break;
            }
            sw0 sw0Var2 = sw0VarArr[i7];
            if (sw0Var2 != null) {
                hashMap.put(Integer.valueOf(sw0Var2.f49851f), this.f50158c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.qp.e1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.f50164w;
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
                    } else if (readInt322 == 1 && (sw0Var = (sw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        sw0Var.f49852g = readInt32;
                        arrayList.add(sw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new un0(this));
    }

    @Override
    public final int b() {
        int size;
        int i7 = 0;
        if (this.f50165x) {
            int size2 = this.f50162r.size();
            if (!this.f50163s.isEmpty()) {
                i7 = this.f50163s.size() + 1;
            }
            return size2 + i7;
        }
        ArrayList arrayList = this.f50164w;
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
        if (this.f50165x) {
            if (i7 < this.f50162r.size() || i7 != this.f50162r.size()) {
                return 0;
            }
        } else {
            ArrayList arrayList = this.f50164w;
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
        int i11 = d1Var.f57047f;
        View view = d1Var.f57043a;
        sw0 sw0Var = null;
        boolean z9 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131745472, null));
                    return;
                }
                return;
            }
            ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.M0(2131745485, null));
            return;
        }
        org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) view;
        boolean z10 = false;
        if (this.f50165x) {
            if (i7 < this.f50162r.size()) {
                sw0 sw0Var2 = (sw0) this.f50162r.get(i7);
                if (i7 > 0) {
                    sw0Var = (sw0) this.f50162r.get(i7 - 1);
                }
                if (sw0Var != null && sw0Var.f49850e == sw0Var2.f49850e) {
                    i10 = 0;
                } else {
                    i10 = sw0Var2.f49850e;
                }
                CharSequence charSequence = (CharSequence) this.f50161n.get(i7);
                String[] strArr = sw0Var2.d;
                if (i7 >= this.f50162r.size() - 1) {
                    z9 = false;
                }
                v6Var.b(charSequence, strArr, i10, z9);
                return;
            }
            int g10 = jg.g.g(1, i7, this.f50162r);
            CharSequence charSequence2 = (CharSequence) this.f50161n.get(this.f50162r.size() + g10);
            String[] strArr2 = ((org.telegram.messenger.cp) this.f50163s.get(g10)).f21913b;
            if (g10 < this.f50162r.size() - 1) {
                z10 = true;
            }
            v6Var.a(charSequence2, strArr2, true, z10);
            return;
        }
        ArrayList arrayList = this.f50164w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 < arrayList.size()) {
            Object obj = arrayList.get(i7);
            if (obj instanceof sw0) {
                sw0 sw0Var3 = (sw0) obj;
                String str = sw0Var3.f49847a;
                String[] strArr3 = sw0Var3.d;
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
