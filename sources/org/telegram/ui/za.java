package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class za implements RequestDelegate {
    public final int f43696a;
    public final xb f43697b;

    public za(xb xbVar, int i10) {
        this.f43696a = i10;
        this.f43697b = xbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43696a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final xb xbVar = this.f43697b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    xb.U(xbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    xb.Y(xbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                xb xbVar2 = this.f43697b;
                xbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    xbVar2.getMessagesController().putUsers(arrayList2, false);
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new i0(13, this.f43697b, tLObject));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final xb xbVar3 = this.f43697b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    xb.U(xbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    xb.Y(xbVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f43697b, tL_error, tLObject, 9));
                return;
        }
    }
}
