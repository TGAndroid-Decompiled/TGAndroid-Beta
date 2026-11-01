package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class ta implements RequestDelegate {
    public final int f41594a;
    public final sb f41595b;

    public ta(sb sbVar, int i10) {
        this.f41594a = i10;
        this.f41595b = sbVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41594a) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final sb sbVar = this.f41595b;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    sb.Z(sbVar, tL_channels_adminLogResults);
                                    return;
                                default:
                                    sb.d0(sbVar, tL_channels_adminLogResults);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 1:
                sb sbVar2 = this.f41595b;
                sbVar2.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i10));
                        }
                    }
                    sbVar2.getMessagesController().V3(arrayList2, false);
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.i0.g3(new h0(14, this.f41595b, tLObject));
                return;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final sb sbVar3 = this.f41595b;
                    org.telegram.messenger.i0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    sb.Z(sbVar3, tL_channels_adminLogResults2);
                                    return;
                                default:
                                    sb.d0(sbVar3, tL_channels_adminLogResults2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.g3(new p1(this.f41595b, tL_error, tLObject, 9));
                return;
        }
    }
}
