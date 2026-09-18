package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class t91 implements Runnable {
    public final int f37643a;
    public final za1 f37644b;
    public final ArrayList f37645c;

    public t91(za1 za1Var, ArrayList arrayList, int i10) {
        this.f37643a = i10;
        this.f37644b = za1Var;
        this.f37645c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f37643a) {
            case 0:
                za1 za1Var = this.f37644b;
                ArrayList arrayList = za1Var.f40056s0;
                ArrayList arrayList2 = za1Var.f40054r0;
                int i10 = 0;
                za1Var.f40061w0 = false;
                ArrayList arrayList3 = this.f37645c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = za1Var.f40051p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((wa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((wa1) arrayList2.get(i12)).f38786b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            wa1 wa1Var = (wa1) arrayList2.get(i10);
                            if (wa1Var.f38786b == null) {
                                za1Var.f40050o0 = wa1Var.b();
                            } else {
                                arrayList.add(wa1Var);
                                i10++;
                            }
                        }
                    }
                    za1Var.o0();
                    za1Var.S.setItemAnimator(null);
                    za1Var.f40065y0.f();
                    return;
                }
                return;
            default:
                za1 za1Var2 = this.f37644b;
                ai.d9 d9Var = za1Var2.f40066z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.f37645c;
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
                    za1Var2.j0();
                    za1Var2.o0();
                    return;
                }
                return;
        }
    }
}
