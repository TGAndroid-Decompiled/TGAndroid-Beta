package y2;

import hg.k0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.mb1;
public final class r {
    public static final mb1 f46607g = new mb1(18);
    public static final mb1 h = new mb1(19);
    public int d;
    public int e;
    public int f46611f;
    public final q[] f46609b = new q[5];
    public final ArrayList f46608a = new ArrayList();
    public int f46610c = -1;

    public final void a(float f7, int i10) {
        q qVar;
        int i11 = this.f46610c;
        ArrayList arrayList = this.f46608a;
        if (i11 != 1) {
            Collections.sort(arrayList, f46607g);
            this.f46610c = 1;
        }
        int i12 = this.f46611f;
        q[] qVarArr = this.f46609b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f46611f = i13;
            qVar = qVarArr[i13];
        } else {
            qVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        qVar.f46604a = i14;
        qVar.f46605b = i10;
        qVar.f46606c = f7;
        arrayList.add(qVar);
        this.e += i10;
        while (true) {
            int i15 = this.e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                q qVar2 = (q) arrayList.get(0);
                int i17 = qVar2.f46605b;
                if (i17 <= i16) {
                    this.e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f46611f;
                    if (i18 < 5) {
                        this.f46611f = i18 + 1;
                        qVarArr[i18] = qVar2;
                    }
                } else {
                    qVar2.f46605b = i17 - i16;
                    this.e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f46610c;
        ArrayList arrayList = this.f46608a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f46610c = 0;
        }
        float f7 = 0.5f * this.e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q qVar = (q) arrayList.get(i12);
            i11 += qVar.f46605b;
            if (i11 >= f7) {
                return qVar.f46606c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q) k0.g(1, arrayList)).f46606c;
    }
}
