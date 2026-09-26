package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class so implements RequestDelegate {
    public final int f37830a;
    public final fp f37831b;

    public so(fp fpVar, int i10) {
        this.f37830a = i10;
        this.f37831b = fpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37830a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new uo(this.f37831b, 3));
                    return;
                }
                return;
            case 1:
                final fp fpVar = this.f37831b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                fp fpVar2 = fpVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < fpVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = fpVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                fpVar2.f33733t0 = false;
                                AndroidUtilities.runOnUIThread(new uo(fpVar2, 4));
                                return;
                            default:
                                fp fpVar3 = fpVar;
                                ArrayList arrayList = fpVar3.f33717f0;
                                fpVar3.f33714d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && fpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        fpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(fpVar3.getParentActivity(), new wo(fpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        fpVar3.f33735x.addView(nVar, w7.y5.n(-1, 72));
                                    }
                                    fpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final fp fpVar2 = this.f37831b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                fp fpVar22 = fpVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < fpVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = fpVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                fpVar22.f33733t0 = false;
                                AndroidUtilities.runOnUIThread(new uo(fpVar22, 4));
                                return;
                            default:
                                fp fpVar3 = fpVar2;
                                ArrayList arrayList = fpVar3.f33717f0;
                                fpVar3.f33714d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && fpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        fpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(fpVar3.getParentActivity(), new wo(fpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        fpVar3.f33735x.addView(nVar, w7.y5.n(-1, 72));
                                    }
                                    fpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new fh(15, this.f37831b, tL_error));
                return;
        }
    }
}
