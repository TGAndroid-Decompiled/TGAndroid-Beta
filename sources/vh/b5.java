package vh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.pp;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p51;
public final class b5 implements j20 {
    public final int f51002a;
    public final f5 f51003b;

    public b5(f5 f5Var, int i10) {
        this.f51002a = i10;
        this.f51003b = f5Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        switch (this.f51002a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                p51 p51Var = (p51) obj2;
                f5 f5Var = this.f51003b;
                pp ppVar = f5Var.W1;
                p51Var.F = 1;
                int L = org.telegram.messenger.i0.L(64.0f);
                arrayList.add(a51.D(org.telegram.messenger.i0.L(64.0f)));
                if (f5Var.R1 || f5Var.Z1) {
                    L += f5Var.d1(true, arrayList, cd.L0(2131753905, null), f5Var.T1, false, false, -1);
                }
                if (!f5Var.R1) {
                    if (TextUtils.isEmpty(f5Var.f51146j2) && !f5Var.Z1) {
                        p51Var.V();
                        a51 c10 = a51.c(1, 2131232026, cd.L0(2131744628, null));
                        c10.f24297q = true;
                        arrayList.add(c10);
                        p51Var.U();
                        L += org.telegram.messenger.i0.L(50.0f);
                    }
                    if (!f5Var.Z1 && ppVar != null) {
                        L += f5Var.d1(true, arrayList, cd.L0(2131753904, null), ppVar.f17469c, ppVar.f17470f, !ppVar.e, 2);
                    }
                    String L0 = cd.L0(2131753907, null);
                    ArrayList arrayList2 = f5Var.U1;
                    if (!f5Var.f51150n2 && !f5Var.f51149m2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int d12 = L + f5Var.d1(false, arrayList, L0, arrayList2, z10, f5Var.f51148l2, 3);
                    String L02 = cd.L0(2131753906, null);
                    ArrayList arrayList3 = f5Var.V1;
                    if (!f5Var.f51157u2 && !f5Var.f51156t2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    L = d12 + f5Var.d1(false, arrayList, L02, arrayList3, z11, f5Var.f51155s2, 4);
                }
                int size = arrayList.size();
                if (!f5Var.R1 && TextUtils.isEmpty(f5Var.f51146j2) && !f5Var.Z1) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(f5Var.f51146j2)) {
                        String L03 = cd.L0(2131748260, null);
                        String L04 = cd.L0(2131748261, null);
                        int i12 = ki.f27767b;
                        a51 K = a51.K(ki.class);
                        K.f24292l = L03;
                        K.f24293m = L04;
                        arrayList.add(K);
                    } else {
                        String L05 = cd.L0(2131748260, null);
                        if (f5Var.f51146j2.length() >= 3) {
                            i11 = 2131748258;
                        } else {
                            i11 = 2131748259;
                        }
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.a0(null, null, i11, f5Var.f51146j2));
                        int i13 = ki.f27767b;
                        a51 K2 = a51.K(ki.class);
                        K2.f24292l = L05;
                        K2.f24293m = W2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(a51.C(null));
                arrayList.add(a51.D(Math.max(0, org.telegram.messenger.i0.L(24.0f) + (((org.telegram.messenger.i0.f16026q.y - (org.telegram.messenger.i0.L(12.0f) + L)) - org.telegram.messenger.i0.f16020m) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f5 f5Var2 = this.f51003b;
                ArrayList arrayList4 = f5Var2.V1;
                f5Var2.f51156t2 = false;
                f5Var2.f51157u2 = false;
                if (messages_botresults != null) {
                    vp.r1(f5Var2.f21583a).V3(messages_botresults.users, false);
                    ArrayList<TLRPC.BotInlineResult> arrayList5 = messages_botresults.results;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        TLRPC.BotInlineResult botInlineResult = arrayList5.get(i14);
                        i14++;
                        TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                        if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                            TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                            if (tL_botInlineMediaResult.document != null) {
                                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                tL_message.out = true;
                                int i15 = f5Var2.A2;
                                f5Var2.A2 = i15 - 1;
                                tL_message.f19814id = i15;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = d20.i(f5Var2.f21583a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new jj(f5Var2.f21583a, tL_message, false, true));
                            }
                        }
                    }
                    f5Var2.f51154r2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(f5Var2.f51154r2)) {
                        z12 = true;
                    }
                    f5Var2.f51155s2 = z12;
                    f5Var2.f51144h2.O(true);
                    return;
                }
                f5Var2.f51144h2.O(true);
                return;
        }
    }
}
