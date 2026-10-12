package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class x91 implements Runnable {
    public final int f43864a;
    public final db1 f43865b;
    public final ArrayList f43866c;

    public x91(db1 db1Var, ArrayList arrayList, int i10) {
        this.f43864a = i10;
        this.f43865b = db1Var;
        this.f43866c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f43864a) {
            case 0:
                db1 db1Var = this.f43865b;
                ArrayList arrayList = db1Var.f36747s0;
                ArrayList arrayList2 = db1Var.f36745r0;
                int i10 = 0;
                db1Var.f36752w0 = false;
                ArrayList arrayList3 = this.f43866c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = db1Var.f36742p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ab1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ab1) arrayList2.get(i12)).f35753b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ab1 ab1Var = (ab1) arrayList2.get(i10);
                            if (ab1Var.f35753b == null) {
                                db1Var.f36741o0 = ab1Var.b();
                            } else {
                                arrayList.add(ab1Var);
                                i10++;
                            }
                        }
                    }
                    db1Var.o0();
                    db1Var.S.setItemAnimator(null);
                    db1Var.f36756y0.f();
                    return;
                }
                return;
            default:
                db1 db1Var2 = this.f43865b;
                ai.e9 e9Var = db1Var2.f36757z0;
                e9Var.getClass();
                ArrayList arrayList4 = this.f43866c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!e9Var.f898j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!e9Var.q(0, arrayList4, z10)) {
                    db1Var2.j0();
                    db1Var2.o0();
                    return;
                }
                return;
        }
    }
}
