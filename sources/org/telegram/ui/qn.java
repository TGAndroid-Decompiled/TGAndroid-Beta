package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn implements RequestDelegate {
    public final int f49280a;
    public final go f49281b;

    public qn(go goVar, int i7) {
        this.f49280a = i7;
        this.f49281b = goVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49280a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new rn(this.f49281b, 3));
                    return;
                }
                return;
            case 1:
                final go goVar = this.f49281b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                go goVar2 = goVar;
                                ArrayList arrayList = goVar2.f46057f0;
                                goVar2.f46053d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && goVar2.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        goVar2.f46064n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(goVar2.getParentActivity(), new un(goVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z9 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        goVar2.f46075y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    goVar2.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                go goVar3 = goVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < goVar3.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = goVar3.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                goVar3.f46072s0 = false;
                                org.telegram.messenger.g0.h3(new rn(goVar3, 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                final go goVar2 = this.f49281b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                go goVar22 = goVar2;
                                ArrayList arrayList = goVar22.f46057f0;
                                goVar22.f46053d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && goVar22.getParentActivity() != null) {
                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                        goVar22.f46064n.removeView((View) arrayList.get(i7));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i10 = 0; i10 < tL_messages_chats.chats.size(); i10++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(goVar22.getParentActivity(), new un(goVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i10);
                                        boolean z9 = true;
                                        if (i10 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        goVar22.f46075y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    goVar22.h0();
                                    return;
                                }
                                return;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                go goVar3 = goVar2;
                                if (z10) {
                                    for (int i11 = 0; i11 < goVar3.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = goVar3.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                goVar3.f46072s0 = false;
                                org.telegram.messenger.g0.h3(new rn(goVar3, 4));
                                return;
                        }
                    }
                });
                return;
            default:
                org.telegram.messenger.g0.h3(new qf(21, this.f49281b, tL_error));
                return;
        }
    }
}
