package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yo implements RequestDelegate {
    public final int f43199a;
    public final lp f43200b;

    public yo(lp lpVar, int i10) {
        this.f43199a = i10;
        this.f43200b = lpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43199a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ap(this.f43200b, 3));
                    return;
                }
                return;
            case 1:
                final lp lpVar = this.f43200b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                lp lpVar2 = lpVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < lpVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = lpVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                lpVar2.f38476t0 = false;
                                AndroidUtilities.runOnUIThread(new ap(lpVar2, 4));
                                return;
                            default:
                                lp lpVar3 = lpVar;
                                ArrayList arrayList = lpVar3.f38460f0;
                                lpVar3.f38456d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && lpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        lpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(lpVar3.getParentActivity(), new cp(lpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        lpVar3.f38478x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    lpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final lp lpVar2 = this.f43200b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                lp lpVar22 = lpVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < lpVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = lpVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                lpVar22.f38476t0 = false;
                                AndroidUtilities.runOnUIThread(new ap(lpVar22, 4));
                                return;
                            default:
                                lp lpVar3 = lpVar2;
                                ArrayList arrayList = lpVar3.f38460f0;
                                lpVar3.f38456d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && lpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        lpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(lpVar3.getParentActivity(), new cp(lpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        lpVar3.f38478x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    lpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new fh(16, this.f43200b, tL_error));
                return;
        }
    }
}
