package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xo implements RequestDelegate {
    public final int f39679a;
    public final kp f39680b;

    public xo(kp kpVar, int i10) {
        this.f39679a = i10;
        this.f39680b = kpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39679a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new zo(this.f39680b, 3));
                    return;
                }
                return;
            case 1:
                final kp kpVar = this.f39680b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                kp kpVar2 = kpVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < kpVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = kpVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                kpVar2.f35347t0 = false;
                                AndroidUtilities.runOnUIThread(new zo(kpVar2, 4));
                                return;
                            default:
                                kp kpVar3 = kpVar;
                                ArrayList arrayList = kpVar3.f35331f0;
                                kpVar3.f35328d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && kpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        kpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(kpVar3.getParentActivity(), new bp(kpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        kpVar3.f35349x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    kpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final kp kpVar2 = this.f39680b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                kp kpVar22 = kpVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < kpVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = kpVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                kpVar22.f35347t0 = false;
                                AndroidUtilities.runOnUIThread(new zo(kpVar22, 4));
                                return;
                            default:
                                kp kpVar3 = kpVar2;
                                ArrayList arrayList = kpVar3.f35331f0;
                                kpVar3.f35328d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && kpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        kpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(kpVar3.getParentActivity(), new bp(kpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        kpVar3.f35349x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    kpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new wh(10, this.f39680b, tL_error));
                return;
        }
    }
}
