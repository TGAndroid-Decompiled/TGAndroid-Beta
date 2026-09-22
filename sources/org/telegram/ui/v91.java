package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class v91 implements Runnable {
    public final int f38482a;
    public final bb1 f38483b;
    public final ArrayList f38484c;

    public v91(bb1 bb1Var, ArrayList arrayList, int i10) {
        this.f38482a = i10;
        this.f38483b = bb1Var;
        this.f38484c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38482a) {
            case 0:
                bb1 bb1Var = this.f38483b;
                ArrayList arrayList = bb1Var.f32355s0;
                ArrayList arrayList2 = bb1Var.f32353r0;
                int i10 = 0;
                bb1Var.f32360w0 = false;
                ArrayList arrayList3 = this.f38484c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = bb1Var.f32350p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ya1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ya1) arrayList2.get(i12)).f39896b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ya1 ya1Var = (ya1) arrayList2.get(i10);
                            if (ya1Var.f39896b == null) {
                                bb1Var.f32349o0 = ya1Var.b();
                            } else {
                                arrayList.add(ya1Var);
                                i10++;
                            }
                        }
                    }
                    bb1Var.o0();
                    bb1Var.S.setItemAnimator(null);
                    bb1Var.f32364y0.f();
                    return;
                }
                return;
            default:
                bb1 bb1Var2 = this.f38483b;
                ai.d9 d9Var = bb1Var2.f32365z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.f38484c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!d9Var.f719j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList4, z10)) {
                    bb1Var2.j0();
                    bb1Var2.o0();
                    return;
                }
                return;
        }
    }
}
