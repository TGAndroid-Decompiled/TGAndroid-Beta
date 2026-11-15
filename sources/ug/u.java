package ug;

import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sp0;
public final class u implements RequestDelegate {
    public final int f58341a;
    public final j0 f58342b;

    public u(j0 j0Var, int i7) {
        this.f58341a = i7;
        this.f58342b = j0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String G;
        int i7 = this.f58341a;
        j0 j0Var = this.f58342b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.e1(27, j0Var, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(j0Var.D2);
                    return;
                } else {
                    j0Var.getClass();
                    return;
                }
            default:
                if (tL_error == null) {
                    TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
                    ArrayList arrayList = new ArrayList();
                    int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
                    int i10 = 0;
                    while (true) {
                        j0 j0Var2 = this.f58342b;
                        if (i10 < min) {
                            TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                            int currentTime = (ConnectionsManager.getInstance(j0Var2.f29679a).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                            if (currentTime < 30) {
                                G = hd.G(currentTime, "Days", new Object[0]);
                            } else if (currentTime < 365) {
                                G = hd.G(currentTime / 30, "Months", new Object[0]);
                            } else {
                                G = hd.G(currentTime / 365, "Years", new Object[0]);
                            }
                            if (t3.n0(chat)) {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749211, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            } else if (t3.T(chat)) {
                                arrayList.add(hd.a0("InactiveChannelSignature", null, 2131749212, G));
                            } else {
                                arrayList.add(hd.a0("InactiveChatSignature", null, 2131749211, hd.G(chat.participants_count, "Members", new Object[0]), G));
                            }
                            i10++;
                        } else {
                            org.telegram.messenger.g0.h3(new sp0(j0Var2, arrayList, min, tL_messages_inactiveChats, 25));
                            return;
                        }
                    }
                } else {
                    return;
                }
        }
    }
}
