package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class si extends org.telegram.ui.ActionBar.j {
    public final Context f51227a;
    public final an f51228b;

    public si(an anVar, Context context) {
        this.f51228b = anVar;
        this.f51227a = context;
    }

    @Override
    public final void b(int i7) {
        boolean z10;
        boolean z11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i11;
        int i12;
        boolean z14;
        long j3;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        boolean z15;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.v01 v01Var;
        an anVar = this.f51228b;
        SparseArray[] sparseArrayArr = anVar.f45319p6;
        SparseArray[] sparseArrayArr2 = anVar.f45306o6;
        SparseArray[] sparseArrayArr3 = anVar.f45294n6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (v01Var = anVar.f45289n0) != null && v01Var.f40230y > 0.0f) {
            v01Var.d();
        }
        boolean z16 = true;
        if (i7 == -1) {
            if (!anVar.f45172dd.f57082f) {
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                if (kVar.x()) {
                    anVar.O7(false);
                } else if (anVar.f45204g4 == 5 && (anVar.L6.isEmpty() || anVar.f45358s4 == 0)) {
                    anVar.xc();
                } else if (anVar.f45204g4 == 6 && anVar.f45118a0.z()) {
                    anVar.dc(new Runnable(this) {
                        public final si f50291b;

                        {
                            this.f50291b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f50291b.f51228b.finishFragment();
                                    return;
                                default:
                                    si siVar = this.f50291b;
                                    siVar.getClass();
                                    an anVar2 = siVar.f51228b;
                                    Intent intent = new Intent(anVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", anVar2.f45178e4.link);
                                    anVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!anVar.m7(true, true)) {
                    anVar.finishFragment();
                }
            } else {
                anVar.Va();
            }
        } else if (i7 == 59) {
            if (anVar.getUserConfig().e() == anVar.f45259k6) {
                anVar.getMessagesController().O4(true);
                anVar.f45314p1.e(false, true);
                return;
            }
            org.telegram.messenger.h00 h00Var = anVar.getMessagesController().f25383r7;
            h00Var.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = h00Var.getMessagesController().h1(-anVar.f45259k6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            h00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(h00Var, 7));
            u91.M0(anVar);
        } else {
            String str = null;
            org.telegram.messenger.gj gjVar = null;
            if (i7 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j11 = 0;
                for (int i17 = 1; i17 >= 0; i17--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i18 = 0; i18 < sparseArrayArr2[i17].size(); i18++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i17].keyAt(i18)));
                    }
                    if (anVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) sparseArrayArr2[i17].get(((Integer) arrayList.get(i19)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = anVar.f45187f) == null || !user2.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) an.Z8(j11, gjVar2, z15));
                        j11 = gjVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    anVar.h8();
                    anVar.N3.j(58, 0L, null);
                }
                anVar.O7(false);
            } else if (i7 == 12) {
                if (anVar.getParentActivity() != null) {
                    anVar.V7(null, null, false);
                }
            } else if (i7 == 11) {
                anVar.Ea(true);
            } else if (i7 == 69) {
                an.J1(anVar);
            } else if (i7 == 70) {
                TLRPC.Chat chat = anVar.f45173e;
                if (chat != null) {
                    anVar.presentFragment(an.ua(-chat.linked_monoforum_id));
                }
            } else if (i7 == 72) {
                long j12 = anVar.f45259k6;
                if (org.telegram.messenger.t3.p0(anVar.f45173e)) {
                    i16 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i16, anVar.f45173e, 24)) {
                        j12 = anVar.f45358s4;
                        j10 = anVar.f45259k6;
                        long j13 = j12;
                        i15 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        di.v8.y(i15, false).g0(j13, j10, false, false);
                    }
                }
                j10 = 0;
                long j132 = j12;
                i15 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                di.v8.y(i15, false).g0(j132, j10, false, false);
            } else if (i7 == 71) {
                long j14 = anVar.f45259k6;
                if (org.telegram.messenger.t3.p0(anVar.f45173e)) {
                    i14 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i14, anVar.f45173e, 24)) {
                        j14 = anVar.f45358s4;
                        j3 = anVar.f45259k6;
                        long j15 = j14;
                        i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        di.v8.y(i13, false).C(j15, j3, new di.m4(this, j15, j3, 2));
                    }
                }
                j3 = 0;
                long j152 = j14;
                i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                di.v8.y(i13, false).C(j152, j3, new di.m4(this, j152, j3, 2));
            } else if (i7 == 28) {
                if (anVar.Ab == null) {
                    an.O1(anVar);
                } else {
                    anVar.J9();
                }
            } else if (i7 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i20 = 1; i20 >= 0; i20--) {
                    for (int i21 = 0; i21 < sparseArrayArr3[i20].size(); i21++) {
                        arrayList2.add((org.telegram.messenger.gj) sparseArrayArr3[i20].valueAt(i21));
                    }
                    sparseArrayArr3[i20].clear();
                    sparseArrayArr2[i20].clear();
                    sparseArrayArr[i20].clear();
                }
                if (anVar.f45410w6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                anVar.B9();
                anVar.gd(0, true);
                anVar.Gd(false);
                MediaController.g0(anVar.getParentActivity(), anVar.getAccountInstance(), arrayList2, new qi(0, this, z14));
            } else if (i7 == 13) {
                if (anVar.getParentActivity() != null) {
                    anVar.showDialog(org.telegram.ui.Components.t4.S(anVar.getParentActivity(), anVar.h, anVar.Aa).f28392a);
                }
            } else if (i7 != 15 && i7 != 16 && i7 != 26) {
                if (i7 == 17) {
                    if (anVar.f45187f != null && anVar.getParentActivity() != null) {
                        TextView textView = anVar.f45120a2;
                        if (textView != null && textView.getTag() != null) {
                            anVar.Yb(((Integer) anVar.f45120a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", anVar.f45187f.f28200id);
                        bundle.putBoolean("addContact", true);
                        anVar.presentFragment(new pr(bundle));
                    }
                } else if (i7 == 18) {
                    anVar.Ic(false);
                } else if (i7 == 24) {
                    try {
                        org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
                        long j16 = anVar.f45187f.f28200id;
                        Pattern pattern = org.telegram.messenger.si.S1;
                        mediaDataController.y0(j16, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 == 29) {
                    if (org.telegram.messenger.t3.N(anVar.f45173e)) {
                        t5 t5Var = new t5(anVar.f45259k6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = anVar.S1;
                        t5Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().G0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                        }
                        anVar.presentFragment(t5Var);
                        return;
                    }
                    anVar.getNotificationCenter().k(org.telegram.messenger.ns.f25539n3, Long.valueOf(anVar.f45259k6));
                } else if (i7 == 21) {
                    int i22 = my0.f49340w1;
                    int currentAccount = anVar.getCurrentAccount();
                    Activity parentActivity = anVar.getParentActivity();
                    long a10 = anVar.a();
                    if (parentActivity != null) {
                        my0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i7 == 22) {
                    for (int i23 = 0; i23 < 2; i23++) {
                        for (int i24 = 0; i24 < sparseArrayArr[i23].size(); i24++) {
                            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) sparseArrayArr[i23].valueAt(i24);
                            anVar.getMediaDataController().d(2, gjVar3, gjVar3.F0(), (int) (System.currentTimeMillis() / 1000), !anVar.f45332q6);
                        }
                    }
                    anVar.O7(false);
                } else if (i7 == 23) {
                    for (int i25 = 1; i25 >= 0; i25--) {
                        if (gjVar == null && sparseArrayArr3[i25].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i26 = 0; i26 < sparseArrayArr3[i25].size(); i26++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i25].keyAt(i26)));
                            }
                            gjVar = (org.telegram.messenger.gj) anVar.F6[i25].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i25].clear();
                        sparseArrayArr2[i25].clear();
                        sparseArrayArr[i25].clear();
                    }
                    if (gjVar != null && gjVar.D4()) {
                        anVar.f45382u5 = gjVar;
                        anVar.db(109);
                    } else {
                        anVar.Ec(gjVar, false);
                    }
                    anVar.B9();
                    anVar.gd(0, true);
                    anVar.Gd(false);
                } else if (i7 == 64) {
                    i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    kg.u1 c10 = kg.v1.f(i11).c(anVar.d9());
                    Activity parentActivity2 = anVar.getParentActivity();
                    i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                    kg.r1.i0(parentActivity2, i12, anVar.f45192f4, c10, anVar.getResourceProvider(), new li.v(21, this, c10));
                } else if (i7 == 14) {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f51227a, anVar.getResourceProvider(), true, true);
                    z0Var.j(org.telegram.messenger.hd.M0(2131753953, null), 2131231495, null);
                    z0Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.q0 q0Var = anVar.f45240j0;
                    org.telegram.ui.ActionBar.x xVar = anVar.f45200g0;
                    xVar.a();
                    q0Var.V(z0Var, xVar.f29851m);
                } else if (i7 == 30) {
                    anVar.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/help", anVar.f45259k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 31) {
                    anVar.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/settings", anVar.f45259k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 40) {
                    if (anVar.ea()) {
                        str = "";
                    }
                    anVar.Oa(str);
                } else if (i7 == 62) {
                    anVar.getMessagesController().f25400t7.J(anVar.a(), false, true);
                    if (!anVar.getMessagesController().f25400t7.K(anVar.a(), true)) {
                        anVar.zd(true);
                    }
                } else if (i7 != 32 && i7 != 33) {
                    if (i7 == 27) {
                        anVar.ec();
                    } else if (i7 == 60) {
                        if (anVar.f45344r4 != null) {
                            org.telegram.messenger.h00 h00Var2 = anVar.getMessagesController().f25383r7;
                            long j17 = anVar.f45173e.f28051id;
                            TLRPC.TL_forumTopic tL_forumTopic = anVar.f45344r4;
                            int i27 = tL_forumTopic.f28103id;
                            tL_forumTopic.closed = true;
                            h00Var2.z(i27, j17, true);
                            anVar.Ad();
                            anVar.Pc(false);
                            anVar.zd(true);
                        }
                    } else if (i7 == 61) {
                        u91.M0(anVar);
                    } else if (i7 == 65) {
                        org.telegram.messenger.g0.g(anVar.f45178e4.link);
                        org.telegram.ui.Components.cc.a0(LaunchActivity.Q()).k(false).j();
                    } else if (i7 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final si f50291b;

                            {
                                this.f50291b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f50291b.f51228b.finishFragment();
                                        return;
                                    default:
                                        si siVar = this.f50291b;
                                        siVar.getClass();
                                        an anVar2 = siVar.f51228b;
                                        Intent intent = new Intent(anVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", anVar2.f45178e4.link);
                                        anVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (anVar.f45118a0.z()) {
                            anVar.dc(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i7 == 67) {
                        Activity parentActivity3 = anVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = anVar.f45178e4;
                        e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                        kg.v.g0(parentActivity3, i10, tL_businessChatLink, e6Var);
                    } else if (i7 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.getResourceProvider());
                        String M0 = org.telegram.messenger.hd.M0(2131752707, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new w0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        anVar.showDialog(t1Var);
                        TextView textView2 = (TextView) t1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29090q7, anVar.getResourceProvider());
                        }
                    } else if (i7 == 75) {
                        if (anVar.ga() && anVar.A8() != null) {
                            org.telegram.messenger.g0.v1(anVar.f45278m1);
                            anVar.f45289n0.requestLayout();
                            org.telegram.ui.Components.v01 v01Var2 = anVar.f45289n0;
                            v01Var2.h();
                            v01Var2.a(1.0f, 0.0f);
                        }
                    } else if (i7 == 73) {
                        s81 f02 = s81.f0(-anVar.f45259k6, 0L);
                        f02.E = anVar;
                        anVar.presentFragment(f02);
                    } else if (i7 == 888) {
                        anVar.dumpCanvas();
                    } else if (i7 == 889) {
                        HashSet hashSet = g4.f47292d1;
                        org.telegram.ui.Components.cc.a0(anVar).t("No rich message copied", null).j();
                    }
                } else if (anVar.f45187f != null && anVar.getParentActivity() != null) {
                    TLRPC.User user3 = anVar.f45187f;
                    if (i7 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = anVar.f45348r8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.c2.m(user3, z12, z13, anVar.getParentActivity(), anVar.getMessagesController().b2(anVar.f45187f.f28200id), anVar.getAccountInstance());
                }
            } else if (anVar.getParentActivity() != null) {
                if (i7 == 15 && org.telegram.messenger.t3.p0(anVar.f45173e)) {
                    if (anVar.f45358s4 != 0 && (a22 = anVar.getMessagesController().a2(Long.valueOf(anVar.f45358s4))) != null) {
                        org.telegram.ui.Components.t4.q(anVar, -1, a22, anVar.f45173e, true, new m2.d(18, this, a22), anVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = anVar.f45334q8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i7 != 26) {
                    int i28 = 15;
                    if (i7 == 15) {
                        if (anVar.h != null || (((user = anVar.f45187f) == null || org.telegram.messenger.q10.B(user) || org.telegram.messenger.q10.x(anVar.f45187f)) && ((chatFull = anVar.f45334q8) == null || !chatFull.can_delete_channel))) {
                            i28 = 15;
                        }
                    }
                    if (i7 == i28) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.Chat chat2 = anVar.f45173e;
                    boolean z17 = z11;
                    TLRPC.User user4 = anVar.f45187f;
                    if (anVar.h == null) {
                        z16 = false;
                    }
                    org.telegram.ui.Components.t4.r(anVar, z17, chat2, user4, z16, true, false, z10, new ai.r1(this, i7, z10));
                    return;
                }
                boolean z18 = z10;
                org.telegram.ui.Components.t4.q(anVar, -1, anVar.f45187f, anVar.f45173e, z18, new ri(this, z18), anVar.getResourceProvider());
            }
        }
    }
}
