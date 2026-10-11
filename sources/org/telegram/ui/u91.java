package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class u91 implements Runnable {
    public final int f42459a;
    public final ab1 f42460b;
    public final ArrayList f42461c;

    public u91(ab1 ab1Var, ArrayList arrayList, int i10) {
        this.f42459a = i10;
        this.f42460b = ab1Var;
        this.f42461c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42459a) {
            case 0:
                ab1 ab1Var = this.f42460b;
                ArrayList arrayList = ab1Var.f35986s0;
                ArrayList arrayList2 = ab1Var.f35984r0;
                int i10 = 0;
                ab1Var.f35991w0 = false;
                ArrayList arrayList3 = this.f42461c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ab1Var.f35981p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((xa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((xa1) arrayList2.get(i12)).f44032b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            xa1 xa1Var = (xa1) arrayList2.get(i10);
                            if (xa1Var.f44032b == null) {
                                ab1Var.f35980o0 = xa1Var.b();
                            } else {
                                arrayList.add(xa1Var);
                                i10++;
                            }
                        }
                    }
                    ab1Var.o0();
                    ab1Var.S.setItemAnimator(null);
                    ab1Var.f35995y0.f();
                    return;
                }
                return;
            default:
                ab1 ab1Var2 = this.f42460b;
                ai.e9 e9Var = ab1Var2.f35996z0;
                e9Var.getClass();
                ArrayList arrayList4 = this.f42461c;
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
                    ab1Var2.j0();
                    ab1Var2.o0();
                    return;
                }
                return;
        }
    }
}
