package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sn implements RequestDelegate {
    public final int f49897a;
    public final io f49898b;

    public sn(io ioVar, int i7) {
        this.f49897a = i7;
        this.f49898b = ioVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49897a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new tn(this.f49898b, 3));
                    return;
                }
                return;
            case 1:
                final io ioVar = this.f49898b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                io ioVar2 = ioVar;
                                ArrayList arrayList = ioVar2.f46691f0;
                                ioVar2.f46687d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ioVar2.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        ioVar2.f46698n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ioVar2.getParentActivity(), new wn(ioVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z9 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        ioVar2.f46709y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    ioVar2.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                io ioVar3 = ioVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < ioVar3.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = ioVar3.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ioVar3.f46706s0 = false;
                                org.telegram.messenger.g0.h3(new tn(ioVar3, 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final io ioVar2 = this.f49898b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                io ioVar22 = ioVar2;
                                ArrayList arrayList = ioVar22.f46691f0;
                                ioVar22.f46687d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ioVar22.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        ioVar22.f46698n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ioVar22.getParentActivity(), new wn(ioVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z9 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        ioVar22.f46709y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    ioVar22.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                io ioVar3 = ioVar2;
                                if (z10) {
                                    for (int i11 = 0; i11 < ioVar3.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = ioVar3.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ioVar3.f46706s0 = false;
                                org.telegram.messenger.g0.h3(new tn(ioVar3, 4));
                                return;
                        }
                    }
                });
                return;
            default:
                org.telegram.messenger.g0.h3(new oe(22, this.f49898b, tL_error));
                return;
        }
    }
}
