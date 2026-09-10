package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zo implements RequestDelegate {
    public final int f39419a;
    public final mp f39420b;

    public zo(mp mpVar, int i10) {
        this.f39419a = i10;
        this.f39420b = mpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39419a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new bp(this.f39420b, 3));
                    return;
                }
                return;
            case 1:
                final mp mpVar = this.f39420b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                mp mpVar2 = mpVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < mpVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = mpVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                mpVar2.f35040t0 = false;
                                AndroidUtilities.runOnUIThread(new bp(mpVar2, 4));
                                return;
                            default:
                                mp mpVar3 = mpVar;
                                ArrayList arrayList = mpVar3.f35024f0;
                                mpVar3.f35021d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && mpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        mpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mpVar3.getParentActivity(), new dp(mpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        mpVar3.f35042x.addView(nVar, w7.a6.n(-1, 72));
                                    }
                                    mpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final mp mpVar2 = this.f39420b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                mp mpVar22 = mpVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < mpVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = mpVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                mpVar22.f35040t0 = false;
                                AndroidUtilities.runOnUIThread(new bp(mpVar22, 4));
                                return;
                            default:
                                mp mpVar3 = mpVar2;
                                ArrayList arrayList = mpVar3.f35024f0;
                                mpVar3.f35021d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && mpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        mpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mpVar3.getParentActivity(), new dp(mpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        mpVar3.f35042x.addView(nVar, w7.a6.n(-1, 72));
                                    }
                                    mpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new qh(13, this.f39420b, tL_error));
                return;
        }
    }
}
