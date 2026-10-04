package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uo implements RequestDelegate {
    public final int f41263a;
    public final hp f41264b;

    public uo(hp hpVar, int i10) {
        this.f41263a = i10;
        this.f41264b = hpVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41263a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new wo(this.f41264b, 3));
                    return;
                }
                return;
            case 1:
                final hp hpVar = this.f41264b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                hp hpVar2 = hpVar;
                                if (z10) {
                                    for (int i10 = 0; i10 < hpVar2.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = hpVar2.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hpVar2.f37150t0 = false;
                                AndroidUtilities.runOnUIThread(new wo(hpVar2, 4));
                                return;
                            default:
                                hp hpVar3 = hpVar;
                                ArrayList arrayList = hpVar3.f37134f0;
                                hpVar3.f37130d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        hpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hpVar3.getParentActivity(), new yo(hpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        hpVar3.f37152x.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    hpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 2:
                final hp hpVar2 = this.f41264b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                hp hpVar22 = hpVar2;
                                if (z10) {
                                    for (int i10 = 0; i10 < hpVar22.X.usernames.size(); i10++) {
                                        TLRPC.TL_username tL_username = hpVar22.X.usernames.get(i10);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                hpVar22.f37150t0 = false;
                                AndroidUtilities.runOnUIThread(new wo(hpVar22, 4));
                                return;
                            default:
                                hp hpVar3 = hpVar2;
                                ArrayList arrayList = hpVar3.f37134f0;
                                hpVar3.f37130d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && hpVar3.getParentActivity() != null) {
                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                        hpVar3.h.removeView((View) arrayList.get(i11));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i12 = 0; i12 < tL_messages_chats.chats.size(); i12++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hpVar3.getParentActivity(), new yo(hpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i12);
                                        boolean z11 = true;
                                        if (i12 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        hpVar3.f37152x.addView(nVar, w7.z5.n(-1, 72));
                                    }
                                    hpVar3.b0();
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                AndroidUtilities.runOnUIThread(new oh(14, this.f41264b, tL_error));
                return;
        }
    }
}
