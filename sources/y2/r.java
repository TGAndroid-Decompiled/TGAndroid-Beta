package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.f11;
public final class r {
    public static final f11 f49529g = new f11(20);
    public static final f11 h = new f11(21);
    public int d;
    public int f49533e;
    public int f49534f;
    public final q[] f49531b = new q[5];
    public final ArrayList f49530a = new ArrayList();
    public int f49532c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.f49532c;
        ArrayList arrayList = this.f49530a;
        if (i11 != 1) {
            Collections.sort(arrayList, f49529g);
            this.f49532c = 1;
        }
        int i12 = this.f49534f;
        q[] qVarArr = this.f49531b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f49534f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.f49526a = i14;
        qVar.f49527b = i10;
        qVar.f49528c = f7;
        arrayList.add(qVar);
        this.f49533e += i10;
        while (true) {
            int i15 = this.f49533e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                q qVar2 = (q) arrayList.get(0);
                int i17 = qVar2.f49527b;
                if (i17 <= i16) {
                    this.f49533e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f49534f;
                    if (i18 < 5) {
                        this.f49534f = i18 + 1;
                        qVarArr[i18] = qVar2;
                    }
                } else {
                    qVar2.f49527b = i17 - i16;
                    this.f49533e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f49532c;
        ArrayList arrayList = this.f49530a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f49532c = 0;
        }
        float f7 = 0.5f * this.f49533e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f49527b;
            if (i11 >= f7) {
                return qVar.f49528c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) i2.g.h(1, arrayList)).f49528c;
    }
}
