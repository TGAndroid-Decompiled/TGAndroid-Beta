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
    public final int f58916a;
    public final l0 f58917b;

    public u(l0 l0Var, int i7) {
        this.f58916a = i7;
        this.f58917b = l0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        int i7 = this.f58916a;
        l0 l0Var = this.f58917b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new p4.o0(19, l0Var, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.g3(l0Var.D2);
                    return;
                } else {
                    l0Var.getClass();
                    return;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i10 = 0;
                    while (true) {
                        l0 l0Var2 = this.f58917b;
                        if (i10 < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(l0Var2.f30187a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = gd.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = gd.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = gd.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (v3.n0(chat)) {
                                arrayList.add(gd.a0("InactiveChatSignature", null, 2131749019, gd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (v3.T(chat)) {
                                arrayList.add(gd.a0("InactiveChannelSignature", null, 2131749020, G));
                            } else {
                                arrayList.add(gd.a0("InactiveChatSignature", null, 2131749019, gd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        } else {
                            org.telegram.messenger.g0.g3(new kp0(l0Var2, arrayList, min, tL_messages_inactiveChats, 26));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
