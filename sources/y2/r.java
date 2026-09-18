package y2;

import hg.k0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.kb1;
public final class r {
    public static final kb1 f46560g = new kb1(18);
    public static final kb1 h = new kb1(19);
    public int d;
    public int e;
    public int f46564f;
    public final q[] f46562b = new q[5];
    public final ArrayList f46561a = new ArrayList();
    public int f46563c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.f46563c;
        ArrayList arrayList = this.f46561a;
        if (i11 != 1) {
            Collections.sort(arrayList, f46560g);
            this.f46563c = 1;
        }
        int i12 = this.f46564f;
        q[] qVarArr = this.f46562b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f46564f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.f46557a = i14;
        qVar.f46558b = i10;
        qVar.f46559c = f7;
        arrayList.add(qVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                q qVar2 = (q) arrayList.get(0);
                int i17 = qVar2.f46558b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f46564f;
                    if (i18 < 5) {
                        this.f46564f = i18 + 1;
                        qVarArr[i18] = qVar2;
                    }
                } else {
                    qVar2.f46558b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f46563c;
        ArrayList arrayList = this.f46561a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f46563c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f46558b;
            if (i11 >= f7) {
                return qVar.f46559c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) k0.g(1, arrayList)).f46559c;
    }
}
