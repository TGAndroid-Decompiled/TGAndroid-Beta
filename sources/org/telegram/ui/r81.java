package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class r81 implements Runnable {
    public final int f42889a;
    public final y91 f42890b;
    public final ArrayList f42891c;

    public r81(y91 y91Var, ArrayList arrayList, int i10) {
        this.f42889a = i10;
        this.f42890b = y91Var;
        this.f42891c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42889a) {
            case 0:
                y91 y91Var = this.f42890b;
                di.z6 z6Var = y91Var.C0;
                z6Var.getClass();
                ArrayList arrayList = this.f42891c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!z6Var.f9493j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z6Var.q(0, arrayList, z10)) {
                    y91Var.i0();
                    y91Var.n0();
                    return;
                }
                return;
            default:
                y91 y91Var2 = this.f42890b;
                ArrayList arrayList2 = y91Var2.f45935v0;
                ArrayList arrayList3 = y91Var2.f45934u0;
                int i11 = 0;
                y91Var2.f45942z0 = false;
                ArrayList arrayList4 = this.f42891c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = y91Var2.f45932s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((v91) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((v91) arrayList3.get(i13)).f44217b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            v91 v91Var = (v91) arrayList3.get(i11);
                            if (v91Var.f44217b == null) {
                                y91Var2.f45930r0 = v91Var.b();
                            } else {
                                arrayList2.add(v91Var);
                                i11++;
                            }
                        }
                    }
                    y91Var2.n0();
                    y91Var2.S.setItemAnimator(null);
                    y91Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
