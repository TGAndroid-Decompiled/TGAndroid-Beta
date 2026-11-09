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
public final class ui extends org.telegram.ui.ActionBar.j {
    public final Context f50412a;
    public final cn f50413b;

    public ui(cn cnVar, Context context) {
        this.f50413b = cnVar;
        this.f50412a = context;
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
        org.telegram.ui.ActionBar.g6 g6Var;
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
        org.telegram.ui.Components.t01 t01Var;
        cn cnVar = this.f50413b;
        SparseArray[] sparseArrayArr = cnVar.f44564o6;
        SparseArray[] sparseArrayArr2 = cnVar.f44552n6;
        SparseArray[] sparseArrayArr3 = cnVar.f44541m6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (t01Var = cnVar.m0) != null && t01Var.f38229y > 0.0f) {
            t01Var.d();
        }
        boolean z15 = true;
        if (i7 == -1) {
            if (!cnVar.f44419cd.f55500f) {
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                if (kVar.w()) {
                    cnVar.O7(false);
                } else if (cnVar.f44451f4 == 5 && (cnVar.K6.isEmpty() || cnVar.f44602r4 == 0)) {
                    cnVar.wc();
                } else if (cnVar.f44451f4 == 6 && cnVar.Z.t()) {
                    cnVar.cc(new Runnable(this) {
                        public final ui f49489b;

                        {
                            this.f49489b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    this.f49489b.f50413b.finishFragment();
                                    return;
                                default:
                                    ui uiVar = this.f49489b;
                                    uiVar.getClass();
                                    cn cnVar2 = uiVar.f50413b;
                                    Intent intent = new Intent(cnVar2.getParentActivity(), LaunchActivity.class);
                                    intent.setAction("android.intent.action.SEND");
                                    intent.setType("text/plain");
                                    intent.putExtra("android.intent.extra.TEXT", cnVar2.f44423d4.link);
                                    cnVar2.startActivityForResult(intent, 500);
                                    return;
                            }
                        }
                    });
                } else if (!cnVar.m7(true, true)) {
                    cnVar.finishFragment();
                }
            } else {
                cnVar.Ua();
            }
        } else if (i7 == 59) {
            if (cnVar.getUserConfig().e() == cnVar.f44504j6) {
                cnVar.getMessagesController().N4(true);
                cnVar.f44560o1.e(false, true);
                return;
            }
            org.telegram.messenger.k00 k00Var = cnVar.getMessagesController().f24877q7;
            k00Var.getClass();
            TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
            tL_channels_toggleViewForumAsMessages.channel_id = k00Var.getMessagesController().h1(-cnVar.f44504j6);
            tL_channels_toggleViewForumAsMessages.enabled = false;
            k00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(k00Var, 7));
            y91.M0(cnVar);
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
                    if (cnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) sparseArrayArr2[i17].get(((Integer) arrayList.get(i19)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        if (arrayList.size() != 1 && ((user2 = cnVar.f44446f) == null || !user2.self)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        spannableStringBuilder.append((CharSequence) cn.Y8(j11, ijVar2, z14));
                        j11 = ijVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    cnVar.g8();
                    cnVar.M3.j(58, 0L, null);
                }
                cnVar.O7(false);
            } else if (i7 == 12) {
                if (cnVar.getParentActivity() != null) {
                    cnVar.V7(null, null, false);
                }
            } else if (i7 == 11) {
                cnVar.Da(true);
            } else if (i7 == 69) {
                cn.J1(cnVar);
            } else if (i7 == 70) {
                TLRPC.Chat chat = cnVar.f44432e;
                if (chat != null) {
                    cnVar.presentFragment(cn.ta(-chat.linked_monoforum_id));
                }
            } else if (i7 == 72) {
                long j12 = cnVar.f44504j6;
                if (org.telegram.messenger.t3.p0(cnVar.f44432e)) {
                    i16 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i16, cnVar.f44432e, 24)) {
                        j12 = cnVar.f44602r4;
                        j10 = cnVar.f44504j6;
                        long j13 = j12;
                        i15 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        bi.ea.y(i15, false).g0(j13, j10, false, false);
                    }
                }
                j10 = 0;
                long j132 = j12;
                i15 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                bi.ea.y(i15, false).g0(j132, j10, false, false);
            } else if (i7 == 71) {
                long j14 = cnVar.f44504j6;
                if (org.telegram.messenger.t3.p0(cnVar.f44432e)) {
                    i14 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    if (org.telegram.messenger.t3.A(i14, cnVar.f44432e, 24)) {
                        j14 = cnVar.f44602r4;
                        j3 = cnVar.f44504j6;
                        long j15 = j14;
                        i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        bi.ea.y(i13, false).C(j15, j3, new bi.o5(this, j15, j3, 2));
                    }
                }
                j3 = 0;
                long j152 = j14;
                i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                bi.ea.y(i13, false).C(j152, j3, new bi.o5(this, j152, j3, 2));
            } else if (i7 == 28) {
                if (cnVar.f44710zb == null) {
                    cn.O1(cnVar);
                } else {
                    cnVar.I9();
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
                if (cnVar.f44654v6 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                cnVar.A9();
                cnVar.fd(0, true);
                cnVar.Fd(false);
                MediaController.g0(cnVar.getParentActivity(), cnVar.getAccountInstance(), arrayList2, new si(0, this, z13));
            } else if (i7 == 13) {
                if (cnVar.getParentActivity() != null) {
                    cnVar.showDialog(org.telegram.ui.Components.v4.S(cnVar.getParentActivity(), cnVar.h, cnVar.f44709za).f27296a);
                }
            } else if (i7 != 15 && i7 != 16 && i7 != 26) {
                if (i7 == 17) {
                    if (cnVar.f44446f != null && cnVar.getParentActivity() != null) {
                        TextView textView = cnVar.Z1;
                        if (textView != null && textView.getTag() != null) {
                            cnVar.Xb(((Integer) cnVar.Z1.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", cnVar.f44446f.f27105id);
                        bundle.putBoolean("addContact", true);
                        cnVar.presentFragment(new pr(bundle));
                    }
                } else if (i7 == 18) {
                    cnVar.Hc(false);
                } else if (i7 == 24) {
                    try {
                        org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
                        long j16 = cnVar.f44446f.f27105id;
                        Pattern pattern = org.telegram.messenger.ui.R1;
                        mediaDataController.y0(j16, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 == 29) {
                    if (org.telegram.messenger.t3.N(cnVar.f44432e)) {
                        t5 t5Var = new t5(cnVar.f44504j6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = cnVar.R1;
                        t5Var.T = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new l5(t5Var, 0));
                        }
                        cnVar.presentFragment(t5Var);
                        return;
                    }
                    cnVar.getNotificationCenter().k(org.telegram.messenger.qs.f25043n3, Long.valueOf(cnVar.f44504j6));
                } else if (i7 == 21) {
                    int i22 = ry0.f49634s1;
                    int currentAccount = cnVar.getCurrentAccount();
                    Activity parentActivity = cnVar.getParentActivity();
                    long a10 = cnVar.a();
                    if (parentActivity != null) {
                        ry0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                    }
                } else if (i7 == 22) {
                    for (int i23 = 0; i23 < 2; i23++) {
                        for (int i24 = 0; i24 < sparseArrayArr[i23].size(); i24++) {
                            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) sparseArrayArr[i23].valueAt(i24);
                            cnVar.getMediaDataController().d(2, ijVar3, ijVar3.F0(), (int) (System.currentTimeMillis() / 1000), !cnVar.f44577p6);
                        }
                    }
                    cnVar.O7(false);
                } else if (i7 == 23) {
                    for (int i25 = 1; i25 >= 0; i25--) {
                        if (ijVar == null && sparseArrayArr3[i25].size() == 1) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i26 = 0; i26 < sparseArrayArr3[i25].size(); i26++) {
                                arrayList3.add(Integer.valueOf(sparseArrayArr3[i25].keyAt(i26)));
                            }
                            ijVar = (org.telegram.messenger.ij) cnVar.E6[i25].get(((Integer) arrayList3.get(0)).intValue());
                        }
                        sparseArrayArr3[i25].clear();
                        sparseArrayArr2[i25].clear();
                        sparseArrayArr[i25].clear();
                    }
                    if (ijVar != null && ijVar.D4()) {
                        cnVar.f44628t5 = ijVar;
                        cnVar.cb(109);
                    } else {
                        cnVar.Dc(ijVar, false);
                    }
                    cnVar.A9();
                    cnVar.fd(0, true);
                    cnVar.Fd(false);
                } else if (i7 == 64) {
                    i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    kg.s1 c10 = kg.t1.f(i11).c(cnVar.c9());
                    Activity parentActivity2 = cnVar.getParentActivity();
                    i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    kg.q1.i0(parentActivity2, i12, cnVar.f44437e4, c10, cnVar.getResourceProvider(), new org.telegram.messenger.voip.k(16, this, c10));
                } else if (i7 == 14) {
                    org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.f50412a, cnVar.getResourceProvider(), true, true);
                    z0Var.j(org.telegram.messenger.id.M0(2131753953, null), 2131231495, null);
                    z0Var.setOnClickListener(new a(this, 12));
                    org.telegram.ui.ActionBar.r0 r0Var = cnVar.f44486i0;
                    org.telegram.ui.ActionBar.x xVar = cnVar.f44447f0;
                    xVar.a();
                    r0Var.U(z0Var, xVar.f28733m);
                } else if (i7 == 30) {
                    cnVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/help", cnVar.f44504j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 31) {
                    cnVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/settings", cnVar.f44504j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                } else if (i7 == 40) {
                    if (cnVar.da()) {
                        str = "";
                    }
                    cnVar.Na(str);
                } else if (i7 == 62) {
                    cnVar.getMessagesController().f24896s7.J(cnVar.a(), false, true);
                    if (!cnVar.getMessagesController().f24896s7.K(cnVar.a(), true)) {
                        cnVar.yd(true);
                    }
                } else if (i7 != 32 && i7 != 33) {
                    if (i7 == 27) {
                        cnVar.dc();
                    } else if (i7 == 60) {
                        if (cnVar.f44588q4 != null) {
                            org.telegram.messenger.k00 k00Var2 = cnVar.getMessagesController().f24877q7;
                            long j17 = cnVar.f44432e.f26956id;
                            TLRPC.TL_forumTopic tL_forumTopic = cnVar.f44588q4;
                            int i27 = tL_forumTopic.f27008id;
                            tL_forumTopic.closed = true;
                            k00Var2.z(i27, j17, true);
                            cnVar.zd();
                            cnVar.Oc(false);
                            cnVar.yd(true);
                        }
                    } else if (i7 == 61) {
                        y91.M0(cnVar);
                    } else if (i7 == 65) {
                        org.telegram.messenger.g0.g(cnVar.f44423d4.link);
                        org.telegram.ui.Components.hc.a0(LaunchActivity.Q()).k(false).j();
                    } else if (i7 == 66) {
                        Runnable runnable = new Runnable(this) {
                            public final ui f49489b;

                            {
                                this.f49489b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.f49489b.f50413b.finishFragment();
                                        return;
                                    default:
                                        ui uiVar = this.f49489b;
                                        uiVar.getClass();
                                        cn cnVar2 = uiVar.f50413b;
                                        Intent intent = new Intent(cnVar2.getParentActivity(), LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", cnVar2.f44423d4.link);
                                        cnVar2.startActivityForResult(intent, 500);
                                        return;
                                }
                            }
                        };
                        if (cnVar.Z.t()) {
                            cnVar.cc(runnable);
                        } else {
                            runnable.run();
                        }
                    } else if (i7 == 67) {
                        Activity parentActivity3 = cnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = cnVar.f44423d4;
                        g6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                        kg.v.g0(parentActivity3, i10, tL_businessChatLink, g6Var);
                    } else if (i7 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.getResourceProvider());
                        String M0 = org.telegram.messenger.id.M0(2131752707, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new w0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        cnVar.showDialog(u1Var);
                        TextView textView2 = (TextView) u1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28106q7, cnVar.getResourceProvider());
                        }
                    } else if (i7 == 75) {
                        if (cnVar.fa() && cnVar.z8() != null) {
                            org.telegram.messenger.g0.v1(cnVar.l1);
                            cnVar.m0.requestLayout();
                            org.telegram.ui.Components.t01 t01Var2 = cnVar.m0;
                            t01Var2.h();
                            t01Var2.a(1.0f, 0.0f);
                        }
                    } else if (i7 == 73) {
                        w81 f02 = w81.f0(-cnVar.f44504j6, 0L);
                        f02.D = cnVar;
                        cnVar.presentFragment(f02);
                    } else if (i7 == 888) {
                        cnVar.dumpCanvas();
                    } else if (i7 == 889) {
                        HashSet hashSet = g4.f45859c1;
                        org.telegram.ui.Components.hc.a0(cnVar).t("No rich message copied", null).j();
                    }
                } else if (cnVar.f44446f != null && cnVar.getParentActivity() != null) {
                    TLRPC.User user3 = cnVar.f44446f;
                    if (i7 == 33) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TLRPC.UserFull userFull = cnVar.f44592q8;
                    if (userFull != null && userFull.video_calls_available) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    org.telegram.ui.Components.voip.y1.m(user3, z11, z12, cnVar.getParentActivity(), cnVar.getMessagesController().b2(cnVar.f44446f.f27105id), cnVar.getAccountInstance());
                }
            } else if (cnVar.getParentActivity() != null) {
                if (i7 == 15 && org.telegram.messenger.t3.p0(cnVar.f44432e)) {
                    if (cnVar.f44602r4 != 0 && (a22 = cnVar.getMessagesController().a2(Long.valueOf(cnVar.f44602r4))) != null) {
                        org.telegram.ui.Components.v4.q(cnVar, -1, a22, cnVar.f44432e, true, new ni.c(14, this, a22), cnVar.getResourceProvider());
                        return;
                    }
                    return;
                }
                TLRPC.ChatFull chatFull2 = cnVar.f44579p8;
                if (chatFull2 != null && chatFull2.can_delete_channel) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i7 != 26) {
                    int i28 = 15;
                    if (i7 == 15) {
                        if (cnVar.h != null || (((user = cnVar.f44446f) == null || org.telegram.messenger.t10.B(user) || org.telegram.messenger.t10.x(cnVar.f44446f)) && ((chatFull = cnVar.f44579p8) == null || !chatFull.can_delete_channel))) {
                            i28 = 15;
                        }
                    }
                    if (i7 == i28) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = cnVar.f44432e;
                    boolean z16 = z10;
                    TLRPC.User user4 = cnVar.f44446f;
                    if (cnVar.h == null) {
                        z15 = false;
                    }
                    org.telegram.ui.Components.v4.r(cnVar, z16, chat2, user4, z15, true, false, z9, new l2.q(this, i7, z9));
                    return;
                }
                boolean z17 = z9;
                org.telegram.ui.Components.v4.q(cnVar, -1, cnVar.f44446f, cnVar.f44432e, z17, new ti(this, z17), cnVar.getResourceProvider());
            }
        }
    }
}
