package y2;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.eb1;
public final class q {
    public static final eb1 f50426g = new eb1(18);
    public static final eb1 h = new eb1(19);
    public int d;
    public int f50430e;
    public int f50431f;
    public final p[] f50428b = new p[5];
    public final ArrayList f50427a = new ArrayList();
    public int f50429c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f50429c;
        ArrayList arrayList = this.f50427a;
        if (i11 != 1) {
            Collections.sort(arrayList, f50426g);
            this.f50429c = 1;
        }
        int i12 = this.f50431f;
        p[] pVarArr = this.f50428b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f50431f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f50423a = i14;
        pVar.f50424b = i10;
        pVar.f50425c = f7;
        arrayList.add(pVar);
        this.f50430e += i10;
        while (true) {
            int i15 = this.f50430e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f50424b;
                if (i17 <= i16) {
                    this.f50430e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f50431f;
                    if (i18 < 5) {
                        this.f50431f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f50424b = i17 - i16;
                    this.f50430e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f50429c;
        ArrayList arrayList = this.f50427a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f50429c = 0;
        }
        float f7 = 0.5f * this.f50430e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f50424b;
            if (i11 >= f7) {
                return pVar.f50425c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) hg.c.g(1, arrayList)).f50425c;
    }
}
