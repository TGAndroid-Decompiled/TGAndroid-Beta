package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class to implements RequestDelegate {
    public final int f37724a;
    public final gp f37725b;

    public to(gp gpVar, int i10) {
        this.f37724a = i10;
        this.f37725b = gpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37724a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new vo(this.f37725b, 3));
                    return;
                }
                return;
            case 1:
                final gp gpVar = this.f37725b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                gp gpVar2 = gpVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < gpVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = gpVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                gpVar2.f33628t0 = false;
                                AndroidUtilities.runOnUIThread(new vo(gpVar2, 4));
                                return;
                            default:
                                gp gpVar3 = gpVar;
                                ArrayList arrayList = gpVar3.f33612f0;
                                gpVar3.f33609d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && gpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        gpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(gpVar3.getParentActivity(), new xo(gpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        gpVar3.f33630x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    gpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final gp gpVar2 = this.f37725b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                gp gpVar22 = gpVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < gpVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = gpVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                gpVar22.f33628t0 = false;
                                AndroidUtilities.runOnUIThread(new vo(gpVar22, 4));
                                return;
                            default:
                                gp gpVar3 = gpVar2;
                                ArrayList arrayList = gpVar3.f33612f0;
                                gpVar3.f33609d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && gpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        gpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(gpVar3.getParentActivity(), new xo(gpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        gpVar3.f33630x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    gpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new rh(10, this.f37725b, tL_error));
                return;
        }
    }
}
