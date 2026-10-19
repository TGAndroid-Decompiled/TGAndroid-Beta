package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ig0;
public final class q {
    public static final ig0 f49934g = new ig0(27);
    public static final ig0 h = new ig0(28);
    public int d;
    public int e;
    public int f49938f;
    public final p[] f49936b = new p[5];
    public final ArrayList f49935a = new ArrayList();
    public int f49937c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f49937c;
        ArrayList arrayList = this.f49935a;
        if (i11 != 1) {
            Collections.sort(arrayList, f49934g);
            this.f49937c = 1;
        }
        int i12 = this.f49938f;
        p[] pVarArr = this.f49936b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f49938f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f49931a = i14;
        pVar.f49932b = i10;
        pVar.f49933c = f7;
        arrayList.add(pVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f49932b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f49938f;
                    if (i18 < 5) {
                        this.f49938f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f49932b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f49937c;
        ArrayList arrayList = this.f49935a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f49937c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f49932b;
            if (i11 >= f7) {
                return pVar.f49933c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) i2.e.h(1, arrayList)).f49933c;
    }
}
