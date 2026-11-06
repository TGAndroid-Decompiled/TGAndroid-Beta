package ug;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pp0;
public final class u implements RequestDelegate {
    public final int f56735a;
    public final i0 f56736b;

    public u(i0 i0Var, int i7) {
        this.f56735a = i7;
        this.f56736b = i0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        int i7 = this.f56735a;
        i0 i0Var = this.f56736b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new ti.p(7, i0Var, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(i0Var.f56535z2);
                    return;
                } else {
                    i0Var.getClass();
                    return;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i10 = 0;
                    while (true) {
                        i0 i0Var2 = this.f56736b;
                        if (i10 < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(i0Var2.f28613a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = hd.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = hd.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = hd.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (t3.n0(chat)) {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749210, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (t3.T(chat)) {
                                arrayList.add(hd.a0("InactiveChannelSignature", null, 2131749211, G));
                            } else {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749210, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        } else {
                            org.telegram.messenger.g0.h3(new pp0(i0Var2, arrayList, min, tL_messages_inactiveChats, 25));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
