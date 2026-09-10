package y2;

import java.util.ArrayList;
import java.util.Collections;
public final class s {
    public static final sg.p f46455g = new sg.p(15);
    public static final sg.p h = new sg.p(16);
    public int d;
    public int e;
    public int f46459f;
    public final r[] f46457b = new r[5];
    public final ArrayList f46456a = new ArrayList();
    public int f46458c = -1;

    public final void a(float f7, int i10) {
        r rVar;
        int i11 = this.f46458c;
        ArrayList arrayList = this.f46456a;
        if (i11 != 1) {
            Collections.sort(arrayList, f46455g);
            this.f46458c = 1;
        }
        int i12 = this.f46459f;
        r[] rVarArr = this.f46457b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f46459f = i13;
            rVar = rVarArr[i13];
        } else {
            rVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        rVar.f46452a = i14;
        rVar.f46453b = i10;
        rVar.f46454c = f7;
        arrayList.add(rVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                r rVar2 = (r) arrayList.get(0);
                int i17 = rVar2.f46453b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f46459f;
                    if (i18 < 5) {
                        this.f46459f = i18 + 1;
                        rVarArr[i18] = rVar2;
                    }
                } else {
                    rVar2.f46453b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f46458c;
        ArrayList arrayList = this.f46456a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f46458c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            r rVar = (r) arrayList.get(i12);
            i11 += rVar.f46453b;
            if (i11 >= f7) {
                return rVar.f46454c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) hc.b.i(1, arrayList)).f46454c;
    }
}
