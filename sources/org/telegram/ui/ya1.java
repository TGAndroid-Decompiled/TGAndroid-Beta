package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ya1 implements org.telegram.messenger.q20 {
    public final int f43772a = 1;
    public final int f43773b;
    public final long f43774c;
    public final Object d;
    public final Object e;
    public final Object f43775f;
    public final Object f43776g;

    public ya1(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f43773b = i10;
        this.d = connectedbotstarref;
        this.e = z2Var;
        this.f43775f = context;
        this.f43774c = j10;
        this.f43776g = p6Var;
    }

    @Override
    public final void a(Object obj) {
        int i10;
        SpannableStringBuilder W2;
        int i11 = this.f43772a;
        Object obj2 = this.f43776g;
        Object obj3 = this.f43775f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                pb1 pb1Var = ((bb1) obj5).f36164b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f43773b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f43774c;
                    if (isEmpty) {
                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(pb1Var);
                        TLRPC.Chat L0 = pb1Var.getMessagesController().L0(Long.valueOf(j10));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            W2 = null;
                        } else if (arrayList.size() == 1) {
                            if (org.telegram.messenger.w3.V(L0)) {
                                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("HasBeenAddedToChannel", null, 2131749373, "**" + org.telegram.messenger.h20.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            } else {
                                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("HasBeenAddedToGroup", null, 2131749372, "**" + org.telegram.messenger.h20.j((TLRPC.User) arrayList.get(0), true) + "**"));
                            }
                        } else if (org.telegram.messenger.w3.V(L0)) {
                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "AddedMembersToChannel", new Object[0]));
                        } else {
                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(arrayList.size(), "AddedSubscribersToChannel", new Object[0]));
                        }
                        a02.V(arrayList, W2, null, null).j();
                        return;
                    }
                    TLRPC.Chat L02 = pb1Var.getMessagesController().L0(Long.valueOf(j10));
                    i10 = ((org.telegram.ui.ActionBar.k2) pb1Var).currentAccount;
                    org.telegram.ui.Components.s4.f(i10, L02, tL_messages_invitedUsers);
                    return;
                }
                return;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i13 = this.f43773b;
                long j11 = this.f43774c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(i13).Z1(Long.valueOf(connectedbotstarref.bot_id));
                    if (Z1 != null) {
                        org.telegram.messenger.vp.r1(i13).U2(Z1, 0, true, new xh.q2(z2Var, context, i13, j11, p6Var, 1));
                        return;
                    }
                    return;
                }
                z2Var.dismiss();
                xh.z2.J0(context, i13, connectedbotstarref2, j11, p6Var);
                return;
        }
    }

    public ya1(bb1 bb1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j10) {
        this.d = bb1Var;
        this.e = tL_messages_invitedUsers;
        this.f43775f = iArr;
        this.f43773b = i10;
        this.f43776g = arrayList;
        this.f43774c = j10;
    }
}
