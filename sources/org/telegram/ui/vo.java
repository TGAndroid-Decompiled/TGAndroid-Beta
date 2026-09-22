package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vo implements RequestDelegate {
    public final int f38601a;
    public final ip f38602b;

    public vo(ip ipVar, int i10) {
        this.f38601a = i10;
        this.f38602b = ipVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38601a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new xo(this.f38602b, 3));
                    return;
                }
                return;
            case 1:
                final ip ipVar = this.f38602b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                ip ipVar2 = ipVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < ipVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = ipVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ipVar2.f34679t0 = false;
                                AndroidUtilities.runOnUIThread(new xo(ipVar2, 4));
                                return;
                            default:
                                ip ipVar3 = ipVar;
                                ArrayList arrayList = ipVar3.f34663f0;
                                ipVar3.f34660d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ipVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        ipVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ipVar3.getParentActivity(), new zo(ipVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        ipVar3.f34681x.addView(nVar, w7.y5.n(-1, 72));
                                    }
                                    ipVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final ip ipVar2 = this.f38602b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                ip ipVar22 = ipVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < ipVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = ipVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                ipVar22.f34679t0 = false;
                                AndroidUtilities.runOnUIThread(new xo(ipVar22, 4));
                                return;
                            default:
                                ip ipVar3 = ipVar2;
                                ArrayList arrayList = ipVar3.f34663f0;
                                ipVar3.f34660d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && ipVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        ipVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ipVar3.getParentActivity(), new zo(ipVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        ipVar3.f34681x.addView(nVar, w7.y5.n(-1, 72));
                                    }
                                    ipVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new gh(16, this.f38602b, tL_error));
                return;
        }
    }
}
