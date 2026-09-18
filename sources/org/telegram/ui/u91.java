package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class u91 implements Runnable {
    public final int f38000a;
    public final ab1 f38001b;
    public final ArrayList f38002c;

    public u91(ab1 ab1Var, ArrayList arrayList, int i10) {
        this.f38000a = i10;
        this.f38001b = ab1Var;
        this.f38002c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38000a) {
            case 0:
                ab1 ab1Var = this.f38001b;
                ArrayList arrayList = ab1Var.f31810s0;
                ArrayList arrayList2 = ab1Var.f31808r0;
                int i10 = 0;
                ab1Var.f31815w0 = false;
                ArrayList arrayList3 = this.f38002c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ab1Var.f31805p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((xa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((xa1) arrayList2.get(i12)).f39511b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            xa1 xa1Var = (xa1) arrayList2.get(i10);
                            if (xa1Var.f39511b == null) {
                                ab1Var.f31804o0 = xa1Var.b();
                            } else {
                                arrayList.add(xa1Var);
                                i10++;
                            }
                        }
                    }
                    ab1Var.o0();
                    ab1Var.S.setItemAnimator(null);
                    ab1Var.f31819y0.f();
                    return;
                }
                return;
            default:
                ab1 ab1Var2 = this.f38001b;
                ai.d9 d9Var = ab1Var2.f31820z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.f38002c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!d9Var.f722j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList4, z10)) {
                    ab1Var2.j0();
                    ab1Var2.o0();
                    return;
                }
                return;
        }
    }
}
