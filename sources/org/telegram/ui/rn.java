package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rn implements RequestDelegate {
    public final int f50980a;
    public final ho f50981b;

    public rn(ho hoVar, int i7) {
        this.f50980a = i7;
        this.f50981b = hoVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50980a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new sn(this.f50981b, 3));
                    return;
                }
                return;
            case 1:
                final ho hoVar = this.f50981b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ho hoVar2 = hoVar;
                                ArrayList arrayList = hoVar2.f47769g0;
                                hoVar2.f47766e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hoVar2.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        hoVar2.f47775n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hoVar2.getParentActivity(), new vn(hoVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z10 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        hoVar2.f47787y.addView(nVar, c8.ja.o(-1, 72));
                                    }
                                    hoVar2.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ho hoVar3 = hoVar;
                                if (z11) {
                                    for (int i11 = 0; i11 < hoVar3.Y.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = hoVar3.Y.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hoVar3.f47784t0 = false;
                                org.telegram.messenger.g0.h3(new sn(hoVar3, 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final ho hoVar2 = this.f50981b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ho hoVar22 = hoVar2;
                                ArrayList arrayList = hoVar22.f47769g0;
                                hoVar22.f47766e0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hoVar22.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        hoVar22.f47775n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hoVar22.getParentActivity(), new vn(hoVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z10 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        hoVar22.f47787y.addView(nVar, c8.ja.o(-1, 72));
                                    }
                                    hoVar22.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                                ho hoVar3 = hoVar2;
                                if (z11) {
                                    for (int i11 = 0; i11 < hoVar3.Y.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = hoVar3.Y.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hoVar3.f47784t0 = false;
                                org.telegram.messenger.g0.h3(new sn(hoVar3, 4));
                                return;
                        }
                    }
                });
                return;
            default:
                org.telegram.messenger.g0.h3(new zg(10, this.f50981b, tL_error));
                return;
        }
    }
}
