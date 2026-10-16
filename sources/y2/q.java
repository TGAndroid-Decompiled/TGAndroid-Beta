package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ds0;
public final class q {
    public static final ds0 f48552g = new ds0(24);
    public static final ds0 h = new ds0(25);
    public int d;
    public int e;
    public int f48556f;
    public final p[] f48554b = new p[5];
    public final ArrayList f48553a = new ArrayList();
    public int f48555c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f48555c;
        ArrayList arrayList = this.f48553a;
        if (i11 != 1) {
            Collections.sort(arrayList, f48552g);
            this.f48555c = 1;
        }
        int i12 = this.f48556f;
        p[] pVarArr = this.f48554b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f48556f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f48549a = i14;
        pVar.f48550b = i10;
        pVar.f48551c = f7;
        arrayList.add(pVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f48550b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f48556f;
                    if (i18 < 5) {
                        this.f48556f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f48550b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f48555c;
        ArrayList arrayList = this.f48553a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f48555c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f48550b;
            if (i11 >= f7) {
                return pVar.f48551c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) i2.d.h(1, arrayList)).f48551c;
    }
}
