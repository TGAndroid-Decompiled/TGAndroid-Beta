package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.lb1;
public final class q {
    public static final lb1 f51828g = new lb1(20);
    public static final lb1 h = new lb1(21);
    public int d;
    public int f51832e;
    public int f51833f;
    public final p[] f51830b = new p[5];
    public final ArrayList f51829a = new ArrayList();
    public int f51831c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f51831c;
        ArrayList arrayList = this.f51829a;
        if (i11 != 1) {
            Collections.sort(arrayList, f51828g);
            this.f51831c = 1;
        }
        int i12 = this.f51833f;
        p[] pVarArr = this.f51830b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f51833f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f51825a = i14;
        pVar.f51826b = i10;
        pVar.f51827c = f7;
        arrayList.add(pVar);
        this.f51832e += i10;
        while (true) {
            int i15 = this.f51832e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f51826b;
                if (i17 <= i16) {
                    this.f51832e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f51833f;
                    if (i18 < 5) {
                        this.f51833f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f51826b = i17 - i16;
                    this.f51832e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f51831c;
        ArrayList arrayList = this.f51829a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f51831c = 0;
        }
        float f7 = 0.5f * this.f51832e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f51826b;
            if (i11 >= f7) {
                return pVar.f51827c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) hg.c.g(1, arrayList)).f51827c;
    }
}
