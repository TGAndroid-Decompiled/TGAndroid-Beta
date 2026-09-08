package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class v91 implements Runnable {
    public final int f41490a;
    public final bb1 f41491b;
    public final ArrayList f41492c;

    public v91(bb1 bb1Var, ArrayList arrayList, int i10) {
        this.f41490a = i10;
        this.f41491b = bb1Var;
        this.f41492c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f41490a) {
            case 0:
                bb1 bb1Var = this.f41491b;
                ArrayList arrayList = bb1Var.f34742s0;
                ArrayList arrayList2 = bb1Var.f34740r0;
                int i10 = 0;
                bb1Var.f34747w0 = false;
                ArrayList arrayList3 = this.f41492c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = bb1Var.f34737p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ya1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ya1) arrayList2.get(i12)).f43094b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ya1 ya1Var = (ya1) arrayList2.get(i10);
                            if (ya1Var.f43094b == null) {
                                bb1Var.f34736o0 = ya1Var.b();
                            } else {
                                arrayList.add(ya1Var);
                                i10++;
                            }
                        }
                    }
                    bb1Var.o0();
                    bb1Var.S.setItemAnimator(null);
                    bb1Var.f34751y0.f();
                    return;
                }
                return;
            default:
                bb1 bb1Var2 = this.f41491b;
                bi.l8 l8Var = bb1Var2.f34752z0;
                l8Var.getClass();
                ArrayList arrayList4 = this.f41492c;
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
