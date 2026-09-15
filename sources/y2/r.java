package y2;

import hg.k0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.ob1;
public final class r {
    public static final ob1 f46305g = new ob1(18);
    public static final ob1 h = new ob1(19);
    public int d;
    public int e;
    public int f46309f;
    public final q[] f46307b = new q[5];
    public final ArrayList f46306a = new ArrayList();
    public int f46308c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.f46308c;
        ArrayList arrayList = this.f46306a;
        if (i11 != 1) {
            Collections.sort(arrayList, f46305g);
            this.f46308c = 1;
        }
        int i12 = this.f46309f;
        q[] qVarArr = this.f46307b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f46309f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.f46302a = i14;
        qVar.f46303b = i10;
        qVar.f46304c = f7;
        arrayList.add(qVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                q qVar2 = (q) arrayList.get(0);
                int i17 = qVar2.f46303b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f46309f;
                    if (i18 < 5) {
                        this.f46309f = i18 + 1;
                        qVarArr[i18] = qVar2;
                    }
                } else {
                    qVar2.f46303b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f46308c;
        ArrayList arrayList = this.f46306a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f46308c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f46303b;
            if (i11 >= f7) {
                return qVar.f46304c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) k0.h(1, arrayList)).f46304c;
    }
}
