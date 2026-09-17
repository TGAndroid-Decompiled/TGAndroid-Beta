package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class v91 implements Runnable {
    public final int f41491a;
    public final bb1 f41492b;
    public final ArrayList f41493c;

    public v91(bb1 bb1Var, ArrayList arrayList, int i10) {
        this.f41491a = i10;
        this.f41492b = bb1Var;
        this.f41493c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f41491a) {
            case 0:
                bb1 bb1Var = this.f41492b;
                ArrayList arrayList = bb1Var.f34743s0;
                ArrayList arrayList2 = bb1Var.f34741r0;
                int i10 = 0;
                bb1Var.f34748w0 = false;
                ArrayList arrayList3 = this.f41493c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = bb1Var.f34738p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ya1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ya1) arrayList2.get(i12)).f43095b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ya1 ya1Var = (ya1) arrayList2.get(i10);
                            if (ya1Var.f43095b == null) {
                                bb1Var.f34737o0 = ya1Var.b();
                            } else {
                                arrayList.add(ya1Var);
                                i10++;
                            }
                        }
                    }
                    bb1Var.o0();
                    bb1Var.S.setItemAnimator(null);
                    bb1Var.f34752y0.f();
                    return;
                }
                return;
            default:
                bb1 bb1Var2 = this.f41492b;
                bi.l8 l8Var = bb1Var2.f34753z0;
                l8Var.getClass();
                ArrayList arrayList4 = this.f41493c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!l8Var.f3303j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!l8Var.q(0, arrayList4, z10)) {
                    bb1Var2.j0();
                    bb1Var2.o0();
                    return;
                }
                return;
        }
    }
}
