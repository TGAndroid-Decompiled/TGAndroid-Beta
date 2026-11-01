package vh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.qp;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.q51;
public final class b5 implements k20 {
    public final int f51009a;
    public final f5 f51010b;

    public b5(f5 f5Var, int i10) {
        this.f51009a = i10;
        this.f51010b = f5Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        switch (this.f51009a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                q51 q51Var = (q51) obj2;
                f5 f5Var = this.f51010b;
                qp qpVar = f5Var.W1;
                q51Var.F = 1;
                int L = org.telegram.messenger.i0.L(64.0f);
                arrayList.add(b51.D(org.telegram.messenger.i0.L(64.0f)));
                if (f5Var.R1 || f5Var.Z1) {
                    L += f5Var.d1(true, arrayList, dd.L0(2131753905, null), f5Var.T1, false, false, -1);
                }
                if (!f5Var.R1) {
                    if (TextUtils.isEmpty(f5Var.f51161j2) && !f5Var.Z1) {
                        q51Var.V();
                        b51 c10 = b51.c(1, 2131232026, dd.L0(2131744628, null));
                        c10.f24648q = true;
                        arrayList.add(c10);
                        q51Var.U();
                        L += org.telegram.messenger.i0.L(50.0f);
                    }
                    if (!f5Var.Z1 && qpVar != null) {
                        L += f5Var.d1(true, arrayList, dd.L0(2131753904, null), qpVar.f17804c, qpVar.f17805f, !qpVar.e, 2);
                    }
                    String L0 = dd.L0(2131753907, null);
                    ArrayList arrayList2 = f5Var.U1;
                    if (!f5Var.f51165n2 && !f5Var.f51164m2) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int d12 = L + f5Var.d1(false, arrayList, L0, arrayList2, z10, f5Var.f51163l2, 3);
                    String L02 = dd.L0(2131753906, null);
                    ArrayList arrayList3 = f5Var.V1;
                    if (!f5Var.f51172u2 && !f5Var.f51171t2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    L = d12 + f5Var.d1(false, arrayList, L02, arrayList3, z11, f5Var.f51170s2, 4);
                }
                int size = arrayList.size();
                if (!f5Var.R1 && TextUtils.isEmpty(f5Var.f51161j2) && !f5Var.Z1) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(f5Var.f51161j2)) {
                        String L03 = dd.L0(2131748260, null);
                        String L04 = dd.L0(2131748261, null);
                        int i12 = ki.f27856b;
                        b51 K = b51.K(ki.class);
                        K.f24643l = L03;
                        K.f24644m = L04;
                        arrayList.add(K);
                    } else {
                        String L05 = dd.L0(2131748260, null);
                        if (f5Var.f51161j2.length() >= 3) {
                            i11 = 2131748258;
                        } else {
                            i11 = 2131748259;
                        }
                        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.a0(null, null, i11, f5Var.f51161j2));
                        int i13 = ki.f27856b;
                        b51 K2 = b51.K(ki.class);
                        K2.f24643l = L05;
                        K2.f24644m = W2;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(b51.C(null));
                arrayList.add(b51.D(Math.max(0, org.telegram.messenger.i0.L(24.0f) + (((org.telegram.messenger.i0.f16172q.y - (org.telegram.messenger.i0.L(12.0f) + L)) - org.telegram.messenger.i0.f16166m) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f5 f5Var2 = this.f51010b;
                ArrayList arrayList4 = f5Var2.V1;
                f5Var2.f51171t2 = false;
                f5Var2.f51172u2 = false;
                if (messages_botresults != null) {
                    wp.r1(f5Var2.f21584a).V3(messages_botresults.users, false);
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
                                tL_message.f19815id = i15;
                                tL_message.peer_id = new TLRPC.TL_peerUser();
                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                tL_message.from_id = tL_peerUser;
                                TLRPC.Peer peer = tL_message.peer_id;
                                long e = e20.i(f5Var2.f21584a).e();
                                tL_peerUser.user_id = e;
                                peer.user_id = e;
                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                tL_message.message = "";
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument;
                                tL_messageMediaDocument.flags |= 3;
                                tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                                tL_message.flags |= 768;
                                arrayList4.add(new kj(f5Var2.f21584a, tL_message, false, true));
                            }
                        }
                    }
                    f5Var2.f51169r2 = messages_botresults.next_offset;
                    if (!arrayList4.isEmpty() && !TextUtils.isEmpty(f5Var2.f51169r2)) {
                        z12 = true;
                    }
                    f5Var2.f51170s2 = z12;
                    f5Var2.f51159h2.O(true);
                    return;
                }
                f5Var2.f51159h2.O(true);
                return;
        }
    }
}
