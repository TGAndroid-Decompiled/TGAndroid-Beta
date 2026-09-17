package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.f11;
public final class r {
    public static final f11 f49559g = new f11(20);
    public static final f11 h = new f11(21);
    public int d;
    public int f49563e;
    public int f49564f;
    public final q[] f49561b = new q[5];
    public final ArrayList f49560a = new ArrayList();
    public int f49562c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.f49562c;
        ArrayList arrayList = this.f49560a;
        if (i11 != 1) {
            Collections.sort(arrayList, f49559g);
            this.f49562c = 1;
        }
        int i12 = this.f49564f;
        q[] qVarArr = this.f49561b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f49564f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.f49556a = i14;
        qVar.f49557b = i10;
        qVar.f49558c = f7;
        arrayList.add(qVar);
        this.f49563e += i10;
        while (true) {
            int i15 = this.f49563e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                q qVar2 = (q) arrayList.get(0);
                int i17 = qVar2.f49557b;
                if (i17 <= i16) {
                    this.f49563e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f49564f;
                    if (i18 < 5) {
                        this.f49564f = i18 + 1;
                        qVarArr[i18] = qVar2;
                    }
                } else {
                    qVar2.f49557b = i17 - i16;
                    this.f49563e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f49562c;
        ArrayList arrayList = this.f49560a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f49562c = 0;
        }
        float f7 = 0.5f * this.f49563e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f49557b;
            if (i11 >= f7) {
                return qVar.f49558c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) i2.g.h(1, arrayList)).f49558c;
    }
}
