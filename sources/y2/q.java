package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ob1;
public final class q {
    public static final ob1 f51931g = new ob1(20);
    public static final ob1 h = new ob1(21);
    public int d;
    public int f51935e;
    public int f51936f;
    public final p[] f51933b = new p[5];
    public final ArrayList f51932a = new ArrayList();
    public int f51934c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f51934c;
        ArrayList arrayList = this.f51932a;
        if (i11 != 1) {
            Collections.sort(arrayList, f51931g);
            this.f51934c = 1;
        }
        int i12 = this.f51936f;
        p[] pVarArr = this.f51933b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f51936f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f51928a = i14;
        pVar.f51929b = i10;
        pVar.f51930c = f7;
        arrayList.add(pVar);
        this.f51935e += i10;
        while (true) {
            int i15 = this.f51935e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f51929b;
                if (i17 <= i16) {
                    this.f51935e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f51936f;
                    if (i18 < 5) {
                        this.f51936f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f51929b = i17 - i16;
                    this.f51935e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f51934c;
        ArrayList arrayList = this.f51932a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f51934c = 0;
        }
        float f7 = 0.5f * this.f51935e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f51929b;
            if (i11 >= f7) {
                return pVar.f51930c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) hg.c.h(1, arrayList)).f51930c;
    }
}
