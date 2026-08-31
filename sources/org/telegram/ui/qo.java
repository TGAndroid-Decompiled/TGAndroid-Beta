package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qo implements RequestDelegate {
    public final int f40576a;
    public final ep f40577b;

    public qo(ep epVar, int i10) {
        this.f40576a = i10;
        this.f40577b = epVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40576a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new so(this.f40577b, 3));
                    return;
                }
                return;
            case 1:
                final ep epVar = this.f40577b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                ep epVar2 = epVar;
                                if (z4) {
                                    for (int i10 = 0; i10 < epVar2.U.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = epVar2.U.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                epVar2.f36650q0 = false;
                                AndroidUtilities.runOnUIThread(new so(epVar2, 4));
                                return;
                            default:
                                ep epVar3 = epVar;
                                ArrayList arrayList = epVar3.f36634c0;
                                epVar3.f36630a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && epVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        epVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(epVar3.getParentActivity(), new uo(epVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        epVar3.f36654x.addView(nVar, k7.c6.n(-1, 72));
                                    }
                                    epVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final ep epVar2 = this.f40577b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                ep epVar22 = epVar2;
                                if (z4) {
                                    for (int i10 = 0; i10 < epVar22.U.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = epVar22.U.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                epVar22.f36650q0 = false;
                                AndroidUtilities.runOnUIThread(new so(epVar22, 4));
                                return;
                            default:
                                ep epVar3 = epVar2;
                                ArrayList arrayList = epVar3.f36634c0;
                                epVar3.f36630a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && epVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        epVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(epVar3.getParentActivity(), new uo(epVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        epVar3.f36654x.addView(nVar, k7.c6.n(-1, 72));
                                    }
                                    epVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new fc(27, this.f40577b, tL_error));
                return;
        }
    }
}
