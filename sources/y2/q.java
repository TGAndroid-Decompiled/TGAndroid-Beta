package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.db1;
public final class q {
    public static final db1 f46585g = new db1(18);
    public static final db1 h = new db1(19);
    public int d;
    public int e;
    public int f46589f;
    public final p[] f46587b = new p[5];
    public final ArrayList f46586a = new ArrayList();
    public int f46588c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f46588c;
        ArrayList arrayList = this.f46586a;
        if (i11 != 1) {
            Collections.sort(arrayList, f46585g);
            this.f46588c = 1;
        }
        int i12 = this.f46589f;
        p[] pVarArr = this.f46587b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f46589f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f46582a = i14;
        pVar.f46583b = i10;
        pVar.f46584c = f7;
        arrayList.add(pVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f46583b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f46589f;
                    if (i18 < 5) {
                        this.f46589f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f46583b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f46588c;
        ArrayList arrayList = this.f46586a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f46588c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f46583b;
            if (i11 >= f7) {
                return pVar.f46584c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) hg.c.g(1, arrayList)).f46584c;
    }
}
