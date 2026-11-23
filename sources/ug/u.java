package ug;

import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kp0;
public final class u implements RequestDelegate {
    public final int f59044a;
    public final k0 f59045b;

    public u(k0 k0Var, int i7) {
        this.f59044a = i7;
        this.f59045b = k0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        int i7 = this.f59044a;
        k0 k0Var = this.f59045b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.t1(25, k0Var, tLObject));
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
                        k0 k0Var2 = this.f59045b;
                        if (i10 < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(k0Var2.f30223a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = gd.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = gd.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = gd.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (v3.n0(chat)) {
                                arrayList.add(gd.a0("InactiveChatSignature", null, 2131749018, gd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (v3.T(chat)) {
                                arrayList.add(gd.a0("InactiveChannelSignature", null, 2131749019, G));
                            } else {
                                arrayList.add(gd.a0("InactiveChatSignature", null, 2131749018, gd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        } else {
                            org.telegram.messenger.g0.g3(new kp0(k0Var2, arrayList, min, tL_messages_inactiveChats, 27));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
