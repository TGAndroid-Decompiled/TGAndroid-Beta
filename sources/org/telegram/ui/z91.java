package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class z91 implements Runnable {
    public final int f39241a;
    public final fb1 f39242b;
    public final ArrayList f39243c;

    public z91(fb1 fb1Var, ArrayList arrayList, int i10) {
        this.f39241a = i10;
        this.f39242b = fb1Var;
        this.f39243c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39241a) {
            case 0:
                fb1 fb1Var = this.f39242b;
                ArrayList arrayList = fb1Var.f32764s0;
                ArrayList arrayList2 = fb1Var.f32762r0;
                int i10 = 0;
                fb1Var.f32769w0 = false;
                ArrayList arrayList3 = this.f39243c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = fb1Var.f32759p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((cb1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((cb1) arrayList2.get(i12)).f31603b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            cb1 cb1Var = (cb1) arrayList2.get(i10);
                            if (cb1Var.f31603b == null) {
                                fb1Var.f32758o0 = cb1Var.b();
                            } else {
                                arrayList.add(cb1Var);
                                i10++;
                            }
                        }
                    }
                    fb1Var.o0();
                    fb1Var.S.setItemAnimator(null);
                    fb1Var.f32773y0.f();
                    return;
                }
                return;
            default:
                fb1 fb1Var2 = this.f39242b;
                zh.a5 a5Var = fb1Var2.f32774z0;
                a5Var.getClass();
                ArrayList arrayList4 = this.f39243c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!a5Var.f48241j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!a5Var.q(0, arrayList4, z10)) {
                    fb1Var2.j0();
                    fb1Var2.o0();
                    return;
                }
                return;
        }
    }
}
