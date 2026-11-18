package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sn implements RequestDelegate {
    public final int f52033a;
    public final jo f52034b;

    public sn(jo joVar, int i7) {
        this.f52033a = i7;
        this.f52034b = joVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52033a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.g3(new tn(this.f52034b, 3));
                    return;
                }
                return;
            case 1:
                final jo joVar = this.f52034b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                jo joVar2 = joVar;
                                ArrayList arrayList = joVar2.f49029g0;
                                joVar2.f49026e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && joVar2.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        joVar2.f49035n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(joVar2.getParentActivity(), new xn(joVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z10 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        joVar2.f49047y.addView(nVar, c8.ma.o(-1, 72));
                                    }
                                    joVar2.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                jo joVar3 = joVar;
                                if (z11) {
                                    for (int i11 = 0; i11 < joVar3.Y.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = joVar3.Y.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                joVar3.f49044t0 = false;
                                org.telegram.messenger.g0.g3(new tn(joVar3, 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final jo joVar2 = this.f52034b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                jo joVar22 = joVar2;
                                ArrayList arrayList = joVar22.f49029g0;
                                joVar22.f49026e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && joVar22.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        joVar22.f49035n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(joVar22.getParentActivity(), new xn(joVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z10 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        joVar22.f49047y.addView(nVar, c8.ma.o(-1, 72));
                                    }
                                    joVar22.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                jo joVar3 = joVar2;
                                if (z11) {
                                    for (int i11 = 0; i11 < joVar3.Y.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = joVar3.Y.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                joVar3.f49044t0 = false;
                                org.telegram.messenger.g0.g3(new tn(joVar3, 4));
                                return;
                        }
                    }
                });
                return;
            default:
                org.telegram.messenger.g0.g3(new ci(6, this.f52034b, tL_error));
                return;
        }
    }
}
