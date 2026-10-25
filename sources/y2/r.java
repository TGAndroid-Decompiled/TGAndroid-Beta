package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.bv;
public final class r {
    public static final bv f51972g = new bv(29);
    public static final p h = new p(0);
    public int d;
    public int e;
    public int f51976f;
    public final q[] f51974b = new q[5];
    public final ArrayList f51973a = new ArrayList();
    public int f51975c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.f51975c;
        ArrayList arrayList = this.f51973a;
        if (i11 != 1) {
            Collections.sort(arrayList, f51972g);
            this.f51975c = 1;
        }
        int i12 = this.f51976f;
        q[] qVarArr = this.f51974b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f51976f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.f51969a = i14;
        qVar.f51970b = i10;
        qVar.f51971c = f7;
        arrayList.add(qVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                q qVar2 = (q) arrayList.get(0);
                int i17 = qVar2.f51970b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f51976f;
                    if (i18 < 5) {
                        this.f51976f = i18 + 1;
                        qVarArr[i18] = qVar2;
                    }
                } else {
                    qVar2.f51970b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f51975c;
        ArrayList arrayList = this.f51973a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f51975c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f51970b;
            if (i11 >= f7) {
                return qVar.f51971c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) ic.a.g(1, arrayList)).f51971c;
    }
}
