package rh;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class l implements RequestDelegate {
    public final int f47167a;
    public final r f47168b;

    public l(r rVar, int i10) {
        this.f47167a = i10;
        this.f47168b = rVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47167a) {
            case 0:
                final r rVar = this.f47168b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar2 = rVar;
                                rVar2.getClass();
                                rVar2.f47389j = new ArrayList();
                                rVar2.f47388i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        rVar2.f47389j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    vp.r1(rVar2.f47383a).V3(rVar2.f47389j, false);
                                    return;
                                }
                                return;
                            default:
                                r rVar3 = rVar;
                                int i11 = rVar3.f47383a;
                                rVar3.f47391l = new ArrayList();
                                rVar3.f47390k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    vp.r1(i11).P3(messages_chats.chats, false);
                                    rVar3.f47391l.addAll(messages_chats.chats);
                                }
                                zs.f(i11).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final r rVar2 = this.f47168b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r rVar22 = rVar2;
                                rVar22.getClass();
                                rVar22.f47389j = new ArrayList();
                                rVar22.f47388i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                                        rVar22.f47389j.add((TLRPC.User) vector.objects.get(i10));
                                    }
                                    vp.r1(rVar22.f47383a).V3(rVar22.f47389j, false);
                                    return;
                                }
                                return;
                            default:
                                r rVar3 = rVar2;
                                int i11 = rVar3.f47383a;
                                rVar3.f47391l = new ArrayList();
                                rVar3.f47390k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    vp.r1(i11).P3(messages_chats.chats, false);
                                    rVar3.f47391l.addAll(messages_chats.chats);
                                }
                                zs.f(i11).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
