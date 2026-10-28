package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class ya implements RequestDelegate {
    public final int f45943a;
    public final wb f45944b;

    public ya(wb wbVar, int i10) {
        this.f45943a = i10;
        this.f45944b = wbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45943a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final wb wbVar = this.f45944b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    wb.V(wbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    wb.Z(wbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                wb wbVar2 = this.f45944b;
                wbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    wbVar2.getMessagesController().putUsers(arrayList2, false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(24, this.f45944b, tLObject));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final wb wbVar3 = this.f45944b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    wb.V(wbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    wb.Z(wbVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new q1(this.f45944b, tL_error, tLObject, 9));
                return;
        }
    }
}
