package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.kb1;
public final class r {
    public static final kb1 f46301g = new kb1(18);
    public static final kb1 h = new kb1(19);
    public int d;
    public int e;
    public int f46305f;
    public final q[] f46303b = new q[5];
    public final ArrayList f46302a = new ArrayList();
    public int f46304c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.f46304c;
        ArrayList arrayList = this.f46302a;
        if (i11 != 1) {
            Collections.sort(arrayList, f46301g);
            this.f46304c = 1;
        }
        int i12 = this.f46305f;
        q[] qVarArr = this.f46303b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f46305f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.f46298a = i14;
        qVar.f46299b = i10;
        qVar.f46300c = f7;
        arrayList.add(qVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                q qVar2 = (q) arrayList.get(0);
                int i17 = qVar2.f46299b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f46305f;
                    if (i18 < 5) {
                        this.f46305f = i18 + 1;
                        qVarArr[i18] = qVar2;
                    }
                } else {
                    qVar2.f46299b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f46304c;
        ArrayList arrayList = this.f46302a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f46304c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f46299b;
            if (i11 >= f7) {
                return qVar.f46300c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) hg.c.h(1, arrayList)).f46300c;
    }
}
