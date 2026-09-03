package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class sa implements RequestDelegate {
    public final int f38136a;
    public final ub f38137b;

    public sa(ub ubVar, int i10) {
        this.f38136a = i10;
        this.f38137b = ubVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38136a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1(this.f38137b, tL_error, tLObject, 9));
                return;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final ub ubVar = this.f38137b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ub.U(ubVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    ub.Y(ubVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 2:
                ub ubVar2 = this.f38137b;
                ubVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    ubVar2.getMessagesController().putUsers(arrayList2, false);
                    return;
                }
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(28, this.f38137b, tLObject));
                return;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final ub ubVar3 = this.f38137b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ub.U(ubVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    ub.Y(ubVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
        }
    }
}
