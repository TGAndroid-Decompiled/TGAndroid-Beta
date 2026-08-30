package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qo implements RequestDelegate {
    public final int f37800a;
    public final dp f37801b;

    public qo(dp dpVar, int i10) {
        this.f37800a = i10;
        this.f37801b = dpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37800a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new so(this.f37801b, 3));
                    return;
                }
                return;
            case 1:
                final dp dpVar = this.f37801b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                dp dpVar2 = dpVar;
                                if (z4) {
                                    for (int i10 = 0; i10 < dpVar2.U.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = dpVar2.U.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                dpVar2.f33766q0 = false;
                                AndroidUtilities.runOnUIThread(new so(dpVar2, 4));
                                return;
                            default:
                                dp dpVar3 = dpVar;
                                ArrayList arrayList = dpVar3.f33751c0;
                                dpVar3.f33747a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && dpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        dpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(dpVar3.getParentActivity(), new uo(dpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        dpVar3.f33770x.addView(nVar, k7.b6.n(-1, 72));
                                    }
                                    dpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final dp dpVar2 = this.f37801b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                                dp dpVar22 = dpVar2;
                                if (z4) {
                                    for (int i10 = 0; i10 < dpVar22.U.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = dpVar22.U.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                dpVar22.f33766q0 = false;
                                AndroidUtilities.runOnUIThread(new so(dpVar22, 4));
                                return;
                            default:
                                dp dpVar3 = dpVar2;
                                ArrayList arrayList = dpVar3.f33751c0;
                                dpVar3.f33747a0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && dpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        dpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(dpVar3.getParentActivity(), new uo(dpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z10 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z10 = false;
                                        }
                                        nVar.a(chat, z10);
                                        arrayList.add(nVar);
                                        dpVar3.f33770x.addView(nVar, k7.b6.n(-1, 72));
                                    }
                                    dpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new yb(28, this.f37801b, tL_error));
                return;
        }
    }
}
