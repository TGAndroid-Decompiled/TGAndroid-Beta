package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.mb1;
public final class q {
    public static final mb1 f51751g = new mb1(20);
    public static final mb1 h = new mb1(21);
    public int d;
    public int f51755e;
    public int f51756f;
    public final p[] f51753b = new p[5];
    public final ArrayList f51752a = new ArrayList();
    public int f51754c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f51754c;
        ArrayList arrayList = this.f51752a;
        if (i11 != 1) {
            Collections.sort(arrayList, f51751g);
            this.f51754c = 1;
        }
        int i12 = this.f51756f;
        p[] pVarArr = this.f51753b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f51756f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f51748a = i14;
        pVar.f51749b = i10;
        pVar.f51750c = f7;
        arrayList.add(pVar);
        this.f51755e += i10;
        while (true) {
            int i15 = this.f51755e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f51749b;
                if (i17 <= i16) {
                    this.f51755e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f51756f;
                    if (i18 < 5) {
                        this.f51756f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f51749b = i17 - i16;
                    this.f51755e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f51754c;
        ArrayList arrayList = this.f51752a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f51754c = 0;
        }
        float f7 = 0.5f * this.f51755e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f51749b;
            if (i11 >= f7) {
                return pVar.f51750c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) hg.c.g(1, arrayList)).f51750c;
    }
}
