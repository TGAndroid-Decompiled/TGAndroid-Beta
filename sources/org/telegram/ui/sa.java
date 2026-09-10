package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class sa implements RequestDelegate {
    public final int f36611a;
    public final wb f36612b;

    public sa(wb wbVar, int i10) {
        this.f36611a = i10;
        this.f36612b = wbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36611a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(this.f36612b, tL_error, tLObject, 9));
                return;
            case 1:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final wb wbVar = this.f36612b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    wb.U(wbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    wb.Y(wbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 2:
                wb wbVar2 = this.f36612b;
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
            case 3:
                AndroidUtilities.runOnUIThread(new n(14, this.f36612b, tLObject));
                return;
            default:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final wb wbVar3 = this.f36612b;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    wb.U(wbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    wb.Y(wbVar3, tL_channels_adminLogResults2);
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
