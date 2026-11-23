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
public final class ti extends org.telegram.ui.ActionBar.j {
    public final Context f52337a;
    public final bn f52338b;

    public ti(bn bnVar, Context context) {
        this.f52338b = bnVar;
        this.f52337a = context;
    }

    @Override
    public final void b(int i7) {
        boolean z10;
        boolean z11;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User c22;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.ActionBar.h6 h6Var;
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
        org.telegram.ui.Components.g11 g11Var;
        bn bnVar = this.f52338b;
        SparseArray[] sparseArrayArr = bnVar.f46165q6;
        SparseArray[] sparseArrayArr2 = bnVar.f46152p6;
        SparseArray[] sparseArrayArr3 = bnVar.f46139o6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (g11Var = bnVar.f46122n0) != null && g11Var.f35391y > 0.0f) {
            g11Var.e();
        }
        boolean z16 = true;
        if (i7 == -1) {
            if (!bnVar.f46018ed.f57701f) {
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                if (kVar.x()) {
                    bnVar.O7(false);
                } else if (bnVar.f46036g4 == 5 && (bnVar.M6.isEmpty() || bnVar.f46191s4 == 0)) {
                    bnVar.xc();
                } else if (bnVar.f46036g4 == 6 && bnVar.f45950a0.B()) {
                    bnVar.dc(new Runnable(this) {
                        public final ti f51290b;

                        {
                            this.f51290b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f51290b.f52338b.finishFragment();
                                    return;
                                default:
                                    ti tiVar = this.f51290b;
                                    tiVar.getClass();
                                    bn bnVar2 = tiVar.f52338b;
                                    Intent intent = new Intent(bnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", bnVar2.f46010e4.link);
                                    bnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!bnVar.m7(true, true)) {
                    bnVar.finishFragment();
                }
            } else {
                bnVar.Va();
            }
        } else if (i7 == 59) {
            if (bnVar.getUserConfig().e() == bnVar.f46103l6) {
                bnVar.getMessagesController().Z4(true);
                bnVar.f46147p1.e(false, true);
                return;
            }
            org.telegram.messenger.f00 f00Var = bnVar.getMessagesController().f25968t7;
            f00Var.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = f00Var.getMessagesController().j1(-bnVar.f46103l6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            f00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(f00Var, 7));
            y91.M0(bnVar);
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
                    if (bnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) sparseArrayArr2[i17].get(((Integer) arrayList.get(i19)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = bnVar.f46019f) == null || !user2.self)) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        spannableStringBuilder.append((CharSequence) bn.Z8(j11, gjVar2, z15));
                        j11 = gjVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    bnVar.h8();
                    bnVar.N3.j(58, 0L, null);
                }
                bnVar.O7(false);
            } else if (i7 == 12) {
                if (bnVar.getParentActivity() != null) {
                    bnVar.V7(null, null, false);
                }
            } else if (i7 == 11) {
                bnVar.Ea(true);
            } else if (i7 == 69) {
                bn.J1(bnVar);
            } else if (i7 == 70) {
                TLRPC.Chat chat = bnVar.f46005e;
                if (chat != null) {
                    bnVar.presentFragment(bn.ua(-chat.linked_monoforum_id));
                }
            } else if (i7 == 72) {
                long j12 = bnVar.f46103l6;
                if (org.telegram.messenger.v3.p0(bnVar.f46005e)) {
                    i16 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    if (org.telegram.messenger.v3.A(i16, bnVar.f46005e, 24)) {
                        j12 = bnVar.f46191s4;
                        j10 = bnVar.f46103l6;
                        long j13 = j12;
                        i15 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        di.y8.y(i15, false).g0(j13, j10, false, false);
                    }
                }
                j10 = 0;
                long j132 = j12;
                i15 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                di.y8.y(i15, false).g0(j132, j10, false, false);
            } else if (i7 == 71) {
                long j14 = bnVar.f46103l6;
                if (org.telegram.messenger.v3.p0(bnVar.f46005e)) {
                    i14 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    if (org.telegram.messenger.v3.A(i14, bnVar.f46005e, 24)) {
                        j14 = bnVar.f46191s4;
                        j3 = bnVar.f46103l6;
                        long j15 = j14;
                        i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        di.y8.y(i13, false).C(j15, j3, new di.p4(this, j15, j3, 2));
                    }
                }
                j3 = 0;
                long j152 = j14;
                i13 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                di.y8.y(i13, false).C(j152, j3, new di.p4(this, j152, j3, 2));
            } else if (i7 == 28) {
                if (bnVar.Bb == null) {
                    bn.O1(bnVar);
                } else {
                    bnVar.J9();
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
                if (bnVar.f46256x6 > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                bnVar.B9();
                bnVar.gd(0, true);
                bnVar.Gd(false);
                MediaController.g0(bnVar.getParentActivity(), bnVar.getAccountInstance(), arrayList2, new ri(0, this, z14));
            } else if (i7 == 13) {
                if (bnVar.getParentActivity() != null) {
                    bnVar.showDialog(org.telegram.ui.Components.c5.S(bnVar.getParentActivity(), bnVar.h, bnVar.Ba).f28777a);
                }
            } else if (i7 != 15 && i7 != 16 && i7 != 26) {
                if (i7 == 17) {
                    if (bnVar.f46019f != null && bnVar.getParentActivity() != null) {
                        TextView textView = bnVar.f45952a2;
                        if (textView != null && textView.getTag() != null) {
                            bnVar.Yb(((Integer) bnVar.f45952a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", bnVar.f46019f.f28583id);
                        bundle.putBoolean("addContact", true);
                        bnVar.presentFragment(new qr(bundle));
                    }
                } else if (i7 == 18) {
                    bnVar.Ic(false);
                } else if (i7 == 24) {
                    try {
                        org.telegram.messenger.si mediaDataController = bnVar.getMediaDataController();
                        long j16 = bnVar.f46019f.f28583id;
                        Pattern pattern = org.telegram.messenger.si.U1;
                        mediaDataController.A0(j16, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 == 29) {
                    if (org.telegram.messenger.v3.N(bnVar.f46005e)) {
                        t5 t5Var = new t5(bnVar.f46103l6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bnVar.S1;
                        t5Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                        }
                        bnVar.presentFragment(t5Var);
                        return;
                    }
                    bnVar.getNotificationCenter().k(org.telegram.messenger.ls.f25362p3, Long.valueOf(bnVar.f46103l6));
                } else if (i7 == 21) {
                    int i22 = qy0.f51394w1;
                    int currentAccount = bnVar.getCurrentAccount();
                    Activity parentActivity = bnVar.getParentActivity();
                    long a10 = bnVar.a();
                    if (parentActivity != null) {
                        qy0.K0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i7 == 22) {
                    for (int i23 = 0; i23 < 2; i23++) {
                        for (int i24 = 0; i24 < sparseArrayArr[i23].size(); i24++) {
                            org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) sparseArrayArr[i23].valueAt(i24);
                            bnVar.getMediaDataController().d(2, gjVar3, gjVar3.F0(), (int) (System.currentTimeMillis() / 1000), !bnVar.f46179r6);
                        }
                    }
                    bnVar.O7(false);
                } else if (i7 == 23) {
                    for (int i25 = 1; i25 >= 0; i25--) {
                        if (gjVar == null && sparseArrayArr3[i25].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i26 = 0; i26 < sparseArrayArr3[i25].size(); i26++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i25].keyAt(i26)));
                            }
                            gjVar = (org.telegram.messenger.gj) bnVar.G6[i25].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i25].clear();
                        sparseArrayArr2[i25].clear();
                        sparseArrayArr[i25].clear();
                    }
                    if (gjVar != null && gjVar.D4()) {
                        bnVar.f46228v5 = gjVar;
                        bnVar.db(109);
                    } else {
                        bnVar.Ec(gjVar, false);
                    }
                    bnVar.B9();
                    bnVar.gd(0, true);
                    bnVar.Gd(false);
                } else if (i7 == 64) {
                    i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    kg.u1 c10 = kg.v1.f(i11).c(bnVar.d9());
                    Activity parentActivity2 = bnVar.getParentActivity();
                    i12 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                    kg.s1.i0(parentActivity2, i12, bnVar.f46024f4, c10, bnVar.getResourceProvider(), new li.d(20, this, c10));
                } else if (i7 == 14) {
                    org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(0, this.f52337a, bnVar.getResourceProvider(), true, true);
                    y0Var.j(org.telegram.messenger.hd.N0(2131753950, null), 2131231495, null);
                    y0Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.q0 q0Var = bnVar.f46072j0;
                    org.telegram.ui.ActionBar.x xVar = bnVar.f46032g0;
                    xVar.a();
                    q0Var.V(y0Var, xVar.f30241m);
                } else if (i7 == 30) {
                    bnVar.getSendMessagesHelper().r0(org.telegram.messenger.yy.b("/help", bnVar.f46103l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 31) {
                    bnVar.getSendMessagesHelper().r0(org.telegram.messenger.yy.b("/settings", bnVar.f46103l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 40) {
                    if (bnVar.ea()) {
                        str = "";
                    }
                    bnVar.Oa(str);
                } else if (i7 == 62) {
                    bnVar.getMessagesController().f25986v7.J(bnVar.a(), false, true);
                    if (!bnVar.getMessagesController().f25986v7.K(bnVar.a(), true)) {
                        bnVar.zd(true);
                    }
                } else if (i7 != 32 && i7 != 33) {
                    if (i7 == 27) {
                        bnVar.ec();
                    } else if (i7 == 60) {
                        if (bnVar.f46177r4 != null) {
                            org.telegram.messenger.f00 f00Var2 = bnVar.getMessagesController().f25968t7;
                            long j17 = bnVar.f46005e.f28434id;
                            TLRPC.TL_forumTopic tL_forumTopic = bnVar.f46177r4;
                            int i27 = tL_forumTopic.f28486id;
                            tL_forumTopic.closed = true;
                            f00Var2.z(i27, j17, true);
                            bnVar.Ad();
                            bnVar.Pc(false);
                            bnVar.zd(true);
                        }
                    } else if (i7 == 61) {
                        y91.M0(bnVar);
                    } else if (i7 == 65) {
                        org.telegram.messenger.g0.g(bnVar.f46010e4.link);
                        org.telegram.ui.Components.lc.b0(LaunchActivity.Q()).k(false).j();
                    } else if (i7 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final ti f51290b;

                            {
                                this.f51290b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f51290b.f52338b.finishFragment();
                                        return;
                                    default:
                                        ti tiVar = this.f51290b;
                                        tiVar.getClass();
                                        bn bnVar2 = tiVar.f52338b;
                                        Intent intent = new Intent(bnVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", bnVar2.f46010e4.link);
                                        bnVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (bnVar.f45950a0.B()) {
                            bnVar.dc(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i7 == 67) {
                        Activity parentActivity3 = bnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = bnVar.f46010e4;
                        h6Var = ((org.telegram.ui.ActionBar.g2) bnVar).resourceProvider;
                        kg.v.g0(parentActivity3, i10, tL_businessChatLink, h6Var);
                    } else if (i7 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.getResourceProvider());
                        String N0 = org.telegram.messenger.hd.N0(2131752695, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131752696, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131746125, null), new w0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        bnVar.showDialog(t1Var);
                        TextView textView2 = (TextView) t1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29622q7, bnVar.getResourceProvider());
                        }
                    } else if (i7 == 75) {
                        if (bnVar.ga() && bnVar.A8() != null) {
                            org.telegram.messenger.g0.v1(bnVar.f46111m1);
                            bnVar.f46122n0.requestLayout();
                            org.telegram.ui.Components.g11 g11Var2 = bnVar.f46122n0;
                            g11Var2.n();
                            g11Var2.b(1.0f, 0.0f);
                        }
                    } else if (i7 == 73) {
                        w81 f02 = w81.f0(-bnVar.f46103l6, 0L);
                        f02.E = bnVar;
                        bnVar.presentFragment(f02);
                    } else if (i7 == 888) {
                        bnVar.dumpCanvas();
                    } else if (i7 == 889) {
                        HashSet hashSet = g4.f47929d1;
                        org.telegram.ui.Components.lc.b0(bnVar).t("No rich message copied", null).j();
                    }
                } else if (bnVar.f46019f != null && bnVar.getParentActivity() != null) {
                    TLRPC.User user3 = bnVar.f46019f;
                    if (i7 == 33) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TLRPC.UserFull userFull = bnVar.f46194s8;
                    if (userFull != null && userFull.video_calls_available) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    org.telegram.ui.Components.voip.b2.m(user3, z12, z13, bnVar.getParentActivity(), bnVar.getMessagesController().d2(bnVar.f46019f.f28583id), bnVar.getAccountInstance());
                }
            } else if (bnVar.getParentActivity() != null) {
                if (i7 == 15 && org.telegram.messenger.v3.p0(bnVar.f46005e)) {
                    if (bnVar.f46191s4 != 0 && (c22 = bnVar.getMessagesController().c2(Long.valueOf(bnVar.f46191s4))) != null) {
                        org.telegram.ui.Components.c5.q(bnVar, -1, c22, bnVar.f46005e, true, new oi.f0(16, this, c22), bnVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = bnVar.f46181r8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i7 == 26 || (i7 == 15 && bnVar.h == null && (((user = bnVar.f46019f) != null && !org.telegram.messenger.p10.C(user) && !org.telegram.messenger.p10.y(bnVar.f46019f)) || ((chatFull = bnVar.f46181r8) != null && chatFull.can_delete_channel)))) {
                    boolean z17 = z10;
                    org.telegram.ui.Components.c5.q(bnVar, -1, bnVar.f46019f, bnVar.f46005e, z17, new si(this, z17), bnVar.getResourceProvider());
                    return;
                }
                if (i7 == 15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.Chat chat2 = bnVar.f46005e;
                boolean z18 = z11;
                TLRPC.User user4 = bnVar.f46019f;
                if (bnVar.h == null) {
                    z16 = false;
                }
                org.telegram.ui.Components.c5.r(bnVar, z18, chat2, user4, z16, true, false, z10, new ai.v1(this, i7, z10));
            }
        }
    }
}
