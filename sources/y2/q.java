package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.kg0;
public final class q {
    public static final kg0 f49935g = new kg0(27);
    public static final kg0 h = new kg0(28);
    public int d;
    public int e;
    public int f49939f;
    public final p[] f49937b = new p[5];
    public final ArrayList f49936a = new ArrayList();
    public int f49938c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f49938c;
        ArrayList arrayList = this.f49936a;
        if (i11 != 1) {
            Collections.sort(arrayList, f49935g);
            this.f49938c = 1;
        }
        int i12 = this.f49939f;
        p[] pVarArr = this.f49937b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f49939f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f49932a = i14;
        pVar.f49933b = i10;
        pVar.f49934c = f7;
        arrayList.add(pVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f49933b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f49939f;
                    if (i18 < 5) {
                        this.f49939f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f49933b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f49938c;
        ArrayList arrayList = this.f49936a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f49938c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f49933b;
            if (i11 >= f7) {
                return pVar.f49934c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) i2.d.h(1, arrayList)).f49934c;
    }
}
