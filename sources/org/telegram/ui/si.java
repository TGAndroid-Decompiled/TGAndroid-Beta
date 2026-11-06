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
    public final Context f49757a;
    public final an f49758b;

    public si(an anVar, Context context) {
        this.f49758b = anVar;
        this.f49757a = context;
    }

    @Override
    public final void b(int i7) {
        boolean z9;
        boolean z10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        boolean z11;
        boolean z12;
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        boolean z13;
        long j3;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        boolean z14;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.n01 n01Var;
        an anVar = this.f49758b;
        SparseArray[] sparseArrayArr = anVar.f43877o6;
        SparseArray[] sparseArrayArr2 = anVar.f43865n6;
        SparseArray[] sparseArrayArr3 = anVar.f43854m6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (n01Var = anVar.m0) != null && n01Var.f36200y > 0.0f) {
            n01Var.c();
        }
        boolean z15 = true;
        if (i7 == -1) {
            if (!anVar.f43705ad.f55371f) {
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                if (kVar.v()) {
                    anVar.N7(false);
                } else if (anVar.f43766f4 == 5 && (anVar.K6.isEmpty() || anVar.f43915r4 == 0)) {
                    anVar.tc();
                } else if (anVar.f43766f4 == 6 && anVar.Z.t()) {
                    anVar.Zb(new Runnable(this) {
                        public final si f48842b;

                        {
                            this.f48842b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f48842b.f49758b.finishFragment();
                                    return;
                                default:
                                    si siVar = this.f48842b;
                                    siVar.getClass();
                                    an anVar2 = siVar.f49758b;
                                    Intent intent = new Intent(anVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", anVar2.f43738d4.link);
                                    anVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!anVar.l7(true, true)) {
                    anVar.finishFragment();
                }
            } else {
                anVar.Sa();
            }
        } else if (i7 == 59) {
            if (anVar.getUserConfig().e() == anVar.f43818j6) {
                anVar.getMessagesController().N4(true);
                anVar.f43873o1.e(false, true);
                return;
            }
            org.telegram.messenger.k00 k00Var = anVar.getMessagesController().f24862q7;
            k00Var.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = k00Var.getMessagesController().h1(-anVar.f43818j6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            k00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(k00Var, 7));
            v91.M0(anVar);
        } else {
            String str = null;
            org.telegram.messenger.ij ijVar = null;
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
                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) sparseArrayArr2[i17].get(((Integer) arrayList.get(i19)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = anVar.f43761f) == null || !user2.self)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        spannableStringBuilder.append((CharSequence) an.X8(j11, ijVar2, z14));
                        j11 = ijVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    anVar.f8();
                    anVar.M3.j(58, 0L, null);
                }
                anVar.N7(false);
            } else if (i7 == 12) {
                if (anVar.getParentActivity() != null) {
                    anVar.U7(null, null, false);
                }
            } else if (i7 == 11) {
                anVar.Ba(true);
            } else if (i7 == 69) {
                an.I1(anVar);
            } else if (i7 == 70) {
                TLRPC.Chat chat = anVar.f43747e;
                if (chat != null) {
                    anVar.presentFragment(an.ra(-chat.linked_monoforum_id));
                }
            } else if (i7 == 72) {
                long j12 = anVar.f43818j6;
                if (org.telegram.messenger.t3.p0(anVar.f43747e)) {
                    i16 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i16, anVar.f43747e, 24)) {
                        j12 = anVar.f43915r4;
                        j10 = anVar.f43818j6;
                        long j13 = j12;
                        i15 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                        bi.ea.y(i15, false).g0(j13, j10, false, false);
                    }
                }
                j10 = 0;
                long j132 = j12;
                i15 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                bi.ea.y(i15, false).g0(j132, j10, false, false);
            } else if (i7 == 71) {
                long j14 = anVar.f43818j6;
                if (org.telegram.messenger.t3.p0(anVar.f43747e)) {
                    i14 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i14, anVar.f43747e, 24)) {
                        j14 = anVar.f43915r4;
                        j3 = anVar.f43818j6;
                        long j15 = j14;
                        i13 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                        bi.ea.y(i13, false).C(j15, j3, new bi.o5(this, j15, j3, 2));
                    }
                }
                j3 = 0;
                long j152 = j14;
                i13 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                bi.ea.y(i13, false).C(j152, j3, new bi.o5(this, j152, j3, 2));
            } else if (i7 == 28) {
                if (anVar.f43999xb == null) {
                    an.N1(anVar);
                } else {
                    anVar.H9();
                }
            } else if (i7 == 25) {
                ArrayList arrayList2 = new ArrayList();
                for (int i20 = 1; i20 >= 0; i20--) {
                    for (int i21 = 0; i21 < sparseArrayArr3[i20].size(); i21++) {
                        arrayList2.add((org.telegram.messenger.ij) sparseArrayArr3[i20].valueAt(i21));
                    }
                    sparseArrayArr3[i20].clear();
                    sparseArrayArr2[i20].clear();
                    sparseArrayArr[i20].clear();
                }
                if (anVar.f43967v6 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                anVar.z9();
                anVar.cd(0, true);
                anVar.Cd(false);
                MediaController.g0(anVar.getParentActivity(), anVar.getAccountInstance(), arrayList2, new qi(0, this, z13));
            } else if (i7 == 13) {
                if (anVar.getParentActivity() != null) {
                    anVar.showDialog(org.telegram.ui.Components.v4.S(anVar.getParentActivity(), anVar.h, anVar.f43998xa).f27292a);
                }
            } else if (i7 != 15 && i7 != 16 && i7 != 26) {
                if (i7 == 17) {
                    if (anVar.f43761f != null && anVar.getParentActivity() != null) {
                        TextView textView = anVar.Z1;
                        if (textView != null && textView.getTag() != null) {
                            anVar.Ub(((Integer) anVar.Z1.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", anVar.f43761f.f27101id);
                        bundle.putBoolean("addContact", true);
                        anVar.presentFragment(new nr(bundle));
                    }
                } else if (i7 == 18) {
                    anVar.Ec(false);
                } else if (i7 == 24) {
                    try {
                        org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
                        long j16 = anVar.f43761f.f27101id;
                        Pattern pattern = org.telegram.messenger.ui.R1;
                        mediaDataController.y0(j16, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 == 29) {
                    if (org.telegram.messenger.t3.N(anVar.f43747e)) {
                        t5 t5Var = new t5(anVar.f43818j6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = anVar.R1;
                        t5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new l5(t5Var, 0));
                        }
                        anVar.presentFragment(t5Var);
                        return;
                    }
                    anVar.getNotificationCenter().k(org.telegram.messenger.qs.f25026n3, Long.valueOf(anVar.f43818j6));
                } else if (i7 == 21) {
                    int i22 = oy0.f48572s1;
                    int currentAccount = anVar.getCurrentAccount();
                    Activity parentActivity = anVar.getParentActivity();
                    long a10 = anVar.a();
                    if (parentActivity != null) {
                        oy0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i7 == 22) {
                    for (int i23 = 0; i23 < 2; i23++) {
                        for (int i24 = 0; i24 < sparseArrayArr[i23].size(); i24++) {
                            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) sparseArrayArr[i23].valueAt(i24);
                            anVar.getMediaDataController().d(2, ijVar3, ijVar3.F0(), (int) (System.currentTimeMillis() / 1000), !anVar.f43890p6);
                        }
                    }
                    anVar.N7(false);
                } else if (i7 == 23) {
                    for (int i25 = 1; i25 >= 0; i25--) {
                        if (ijVar == null && sparseArrayArr3[i25].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i26 = 0; i26 < sparseArrayArr3[i25].size(); i26++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i25].keyAt(i26)));
                            }
                            ijVar = (org.telegram.messenger.ij) anVar.E6[i25].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i25].clear();
                        sparseArrayArr2[i25].clear();
                        sparseArrayArr[i25].clear();
                    }
                    if (ijVar != null && ijVar.E4()) {
                        anVar.f43941t5 = ijVar;
                        anVar.ab(109);
                    } else {
                        anVar.Ac(ijVar, false);
                    }
                    anVar.z9();
                    anVar.cd(0, true);
                    anVar.Cd(false);
                } else if (i7 == 64) {
                    i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    kg.s1 c10 = kg.t1.f(i11).c(anVar.b9());
                    Activity parentActivity2 = anVar.getParentActivity();
                    i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                    kg.q1.i0(parentActivity2, i12, anVar.f43752e4, c10, anVar.getResourceProvider(), new org.telegram.messenger.voip.k(16, this, c10));
                } else if (i7 == 14) {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f49757a, anVar.getResourceProvider(), true, true);
                    z0Var.j(org.telegram.messenger.hd.M0(2131753953, null), 2131231495, null);
                    z0Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.r0 r0Var = anVar.f43801i0;
                    org.telegram.ui.ActionBar.x xVar = anVar.f43762f0;
                    xVar.a();
                    r0Var.U(z0Var, xVar.f28729m);
                } else if (i7 == 30) {
                    anVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/help", anVar.f43818j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 31) {
                    anVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/settings", anVar.f43818j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 40) {
                    if (anVar.ca()) {
                        str = "";
                    }
                    anVar.La(str);
                } else if (i7 == 62) {
                    anVar.getMessagesController().f24881s7.J(anVar.a(), false, true);
                    if (!anVar.getMessagesController().f24881s7.K(anVar.a(), true)) {
                        anVar.vd(true);
                    }
                } else if (i7 != 32 && i7 != 33) {
                    if (i7 == 27) {
                        anVar.ac();
                    } else if (i7 == 60) {
                        if (anVar.f43901q4 != null) {
                            org.telegram.messenger.k00 k00Var2 = anVar.getMessagesController().f24862q7;
                            long j17 = anVar.f43747e.f26952id;
                            TLRPC.TL_forumTopic tL_forumTopic = anVar.f43901q4;
                            int i27 = tL_forumTopic.f27004id;
                            tL_forumTopic.closed = true;
                            k00Var2.z(i27, j17, true);
                            anVar.wd();
                            anVar.Lc(false);
                            anVar.vd(true);
                        }
                    } else if (i7 == 61) {
                        v91.M0(anVar);
                    } else if (i7 == 65) {
                        org.telegram.messenger.g0.g(anVar.f43738d4.link);
                        org.telegram.ui.Components.hc.a0(LaunchActivity.Q()).k(false).j();
                    } else if (i7 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final si f48842b;

                            {
                                this.f48842b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f48842b.f49758b.finishFragment();
                                        return;
                                    default:
                                        si siVar = this.f48842b;
                                        siVar.getClass();
                                        an anVar2 = siVar.f49758b;
                                        Intent intent = new Intent(anVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", anVar2.f43738d4.link);
                                        anVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (anVar.Z.t()) {
                            anVar.Zb(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i7 == 67) {
                        Activity parentActivity3 = anVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = anVar.f43738d4;
                        f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                        kg.v.g0(parentActivity3, i10, tL_businessChatLink, f6Var);
                    } else if (i7 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.getResourceProvider());
                        String M0 = org.telegram.messenger.hd.M0(2131752707, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.hd.M0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746320, null), new w0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        anVar.showDialog(u1Var);
                        TextView textView2 = (TextView) u1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28089q7, anVar.getResourceProvider());
                        }
                    } else if (i7 == 75) {
                        if (anVar.ea() && anVar.y8() != null) {
                            org.telegram.messenger.g0.v1(anVar.l1);
                            anVar.m0.requestLayout();
                            org.telegram.ui.Components.n01 n01Var2 = anVar.m0;
                            n01Var2.g();
                            n01Var2.a(1.0f, 0.0f);
                        }
                    } else if (i7 == 73) {
                        u81 f02 = u81.f0(-anVar.f43818j6, 0L);
                        f02.D = anVar;
                        anVar.presentFragment(f02);
                    } else if (i7 == 888) {
                        anVar.dumpCanvas();
                    } else if (i7 == 889) {
                        HashSet hashSet = g4.f45773c1;
                        org.telegram.ui.Components.hc.a0(anVar).t("No rich message copied", null).j();
                    }
                } else if (anVar.f43761f != null && anVar.getParentActivity() != null) {
                    TLRPC.User user3 = anVar.f43761f;
                    if (i7 == 33) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.UserFull userFull = anVar.f43905q8;
                    if (userFull != null && userFull.video_calls_available) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    org.telegram.ui.Components.voip.y1.m(user3, z11, z12, anVar.getParentActivity(), anVar.getMessagesController().b2(anVar.f43761f.f27101id), anVar.getAccountInstance());
                }
            } else if (anVar.getParentActivity() != null) {
                if (i7 == 15 && org.telegram.messenger.t3.p0(anVar.f43747e)) {
                    if (anVar.f43915r4 != 0 && (a22 = anVar.getMessagesController().a2(Long.valueOf(anVar.f43915r4))) != null) {
                        org.telegram.ui.Components.v4.q(anVar, -1, a22, anVar.f43747e, true, new ni.c(14, this, a22), anVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = anVar.f43892p8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i7 != 26) {
                    int i28 = 15;
                    if (i7 == 15) {
                        if (anVar.h != null || (((user = anVar.f43761f) == null || org.telegram.messenger.t10.B(user) || org.telegram.messenger.t10.x(anVar.f43761f)) && ((chatFull = anVar.f43892p8) == null || !chatFull.can_delete_channel))) {
                            i28 = 15;
                        }
                    }
                    if (i7 == i28) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = anVar.f43747e;
                    boolean z16 = z10;
                    TLRPC.User user4 = anVar.f43761f;
                    if (anVar.h == null) {
                        z15 = false;
                    }
                    org.telegram.ui.Components.v4.r(anVar, z16, chat2, user4, z15, true, false, z9, new l2.q(this, i7, z9));
                    return;
                }
                boolean z17 = z9;
                org.telegram.ui.Components.v4.q(anVar, -1, anVar.f43761f, anVar.f43747e, z17, new ri(this, z17), anVar.getResourceProvider());
            }
        }
    }
}
