package y2;

import java.util.ArrayList;
import java.util.Collections;
public final class q {
    public static final x2.e f54195g = new x2.e(7);
    public static final x2.e h = new x2.e(8);
    public int d;
    public int e;
    public int f54199f;
    public final p[] f54197b = new p[5];
    public final ArrayList f54196a = new ArrayList();
    public int f54198c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f54198c;
        ArrayList arrayList = this.f54196a;
        if (i11 != 1) {
            Collections.sort(arrayList, f54195g);
            this.f54198c = 1;
        }
        int i12 = this.f54199f;
        p[] pVarArr = this.f54197b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f54199f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f54192a = i14;
        pVar.f54193b = i10;
        pVar.f54194c = f7;
        arrayList.add(pVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f54193b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f54199f;
                    if (i18 < 5) {
                        this.f54199f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f54193b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f54198c;
        ArrayList arrayList = this.f54196a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f54198c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f54193b;
            if (i11 >= f7) {
                return pVar.f54194c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) i0.a.g(1, arrayList)).f54194c;
    }
}
