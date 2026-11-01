package rh;

import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class l implements RequestDelegate {
    public final int f47181a;
    public final r f47182b;

    public l(r rVar, int i10) {
        this.f47181a = i10;
        this.f47182b = rVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47181a) {
            case 0:
                final r rVar = this.f47182b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar2 = rVar;
                                rVar2.getClass();
                                rVar2.f47402j = new ArrayList();
                                rVar2.f47401i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        rVar2.f47402j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    wp.r1(rVar2.f47396a).V3(rVar2.f47402j, false);
                                    return;
                                }
                                return;
                            default:
                                r rVar3 = rVar;
                                int i11 = rVar3.f47396a;
                                rVar3.f47404l = new ArrayList();
                                rVar3.f47403k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    wp.r1(i11).P3(messages_chats.chats, false);
                                    rVar3.f47404l.addAll(messages_chats.chats);
                                }
                                at.f(i11).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final r rVar2 = this.f47182b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar22 = rVar2;
                                rVar22.getClass();
                                rVar22.f47402j = new ArrayList();
                                rVar22.f47401i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        rVar22.f47402j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    wp.r1(rVar22.f47396a).V3(rVar22.f47402j, false);
                                    return;
                                }
                                return;
                            default:
                                r rVar3 = rVar2;
                                int i11 = rVar3.f47396a;
                                rVar3.f47404l = new ArrayList();
                                rVar3.f47403k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    wp.r1(i11).P3(messages_chats.chats, false);
                                    rVar3.f47404l.addAll(messages_chats.chats);
                                }
                                at.f(i11).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
