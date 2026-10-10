package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class v91 implements Runnable {
    public final int f42803a;
    public final bb1 f42804b;
    public final ArrayList f42805c;

    public v91(bb1 bb1Var, ArrayList arrayList, int i10) {
        this.f42803a = i10;
        this.f42804b = bb1Var;
        this.f42805c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42803a) {
            case 0:
                bb1 bb1Var = this.f42804b;
                ArrayList arrayList = bb1Var.f36273s0;
                ArrayList arrayList2 = bb1Var.f36271r0;
                int i10 = 0;
                bb1Var.f36278w0 = false;
                ArrayList arrayList3 = this.f42805c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = bb1Var.f36268p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ya1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ya1) arrayList2.get(i12)).f44350b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ya1 ya1Var = (ya1) arrayList2.get(i10);
                            if (ya1Var.f44350b == null) {
                                bb1Var.f36267o0 = ya1Var.b();
                            } else {
                                arrayList.add(ya1Var);
                                i10++;
                            }
                        }
                    }
                    bb1Var.o0();
                    bb1Var.S.setItemAnimator(null);
                    bb1Var.f36282y0.f();
                    return;
                }
                return;
            default:
                bb1 bb1Var2 = this.f42804b;
                ai.e9 e9Var = bb1Var2.f36283z0;
                e9Var.getClass();
                ArrayList arrayList4 = this.f42805c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!e9Var.f900j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!e9Var.q(0, arrayList4, z10)) {
                    bb1Var2.j0();
                    bb1Var2.o0();
                    return;
                }
                return;
        }
    }
}
