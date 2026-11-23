package ug;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lp0;
public final class u implements RequestDelegate {
    public final int f58929a;
    public final k0 f58930b;

    public u(k0 k0Var, int i7) {
        this.f58929a = i7;
        this.f58930b = k0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        int i7 = this.f58929a;
        k0 k0Var = this.f58930b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new p4.o0(19, k0Var, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.g3(k0Var.D2);
                    return;
                } else {
                    k0Var.getClass();
                    return;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i10 = 0;
                    while (true) {
                        k0 k0Var2 = this.f58930b;
                        if (i10 < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(k0Var2.f30139a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = hd.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = hd.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = hd.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (v3.n0(chat)) {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749018, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (v3.T(chat)) {
                                arrayList.add(hd.a0("InactiveChannelSignature", null, 2131749019, G));
                            } else {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749018, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        } else {
                            org.telegram.messenger.g0.g3(new lp0(k0Var2, arrayList, min, tL_messages_inactiveChats, 27));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
