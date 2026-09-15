package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class s91 implements Runnable {
    public final int f37307a;
    public final ya1 f37308b;
    public final ArrayList f37309c;

    public s91(ya1 ya1Var, ArrayList arrayList, int i10) {
        this.f37307a = i10;
        this.f37308b = ya1Var;
        this.f37309c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37307a) {
            case 0:
                ya1 ya1Var = this.f37308b;
                ArrayList arrayList = ya1Var.f39819s0;
                ArrayList arrayList2 = ya1Var.f39817r0;
                int i10 = 0;
                ya1Var.f39824w0 = false;
                ArrayList arrayList3 = this.f37309c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ya1Var.f39814p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((va1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((va1) arrayList2.get(i12)).f38488b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            va1 va1Var = (va1) arrayList2.get(i10);
                            if (va1Var.f38488b == null) {
                                ya1Var.f39813o0 = va1Var.b();
                            } else {
                                arrayList.add(va1Var);
                                i10++;
                            }
                        }
                    }
                    ya1Var.o0();
                    ya1Var.S.setItemAnimator(null);
                    ya1Var.f39828y0.f();
                    return;
                }
                return;
            default:
                ya1 ya1Var2 = this.f37308b;
                ai.d9 d9Var = ya1Var2.f39829z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.f37309c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!d9Var.f717j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList4, z10)) {
                    ya1Var2.j0();
                    ya1Var2.o0();
                    return;
                }
                return;
        }
    }
}
