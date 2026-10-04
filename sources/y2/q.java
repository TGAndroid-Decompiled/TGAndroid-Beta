package y2;

import hg.k0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.ui.gb1;
public final class q {
    public static final gb1 f50410g = new gb1(18);
    public static final gb1 h = new gb1(19);
    public int d;
    public int f50414e;
    public int f50415f;
    public final p[] f50412b = new p[5];
    public final ArrayList f50411a = new ArrayList();
    public int f50413c = -1;

    public final void a(float f7, int i10) {
        p pVar;
        int i11 = this.f50413c;
        ArrayList arrayList = this.f50411a;
        if (i11 != 1) {
            Collections.sort(arrayList, f50410g);
            this.f50413c = 1;
        }
        int i12 = this.f50415f;
        p[] pVarArr = this.f50412b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f50415f = i13;
            pVar = pVarArr[i13];
        } else {
            pVar = new Object();
        }
        int i14 = this.d;
        this.d = i14 + 1;
        pVar.f50407a = i14;
        pVar.f50408b = i10;
        pVar.f50409c = f7;
        arrayList.add(pVar);
        this.f50414e += i10;
        while (true) {
            int i15 = this.f50414e;
            if (i15 > 2000) {
                int i16 = i15 - 2000;
                p pVar2 = (p) arrayList.get(0);
                int i17 = pVar2.f50408b;
                if (i17 <= i16) {
                    this.f50414e -= i17;
                    arrayList.remove(0);
                    int i18 = this.f50415f;
                    if (i18 < 5) {
                        this.f50415f = i18 + 1;
                        pVarArr[i18] = pVar2;
                    }
                } else {
                    pVar2.f50408b = i17 - i16;
                    this.f50414e -= i16;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f50413c;
        ArrayList arrayList = this.f50411a;
        if (i10 != 0) {
            Collections.sort(arrayList, h);
            this.f50413c = 0;
        }
        float f7 = 0.5f * this.f50414e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            p pVar = (p) arrayList.get(i12);
            i11 += pVar.f50408b;
            if (i11 >= f7) {
                return pVar.f50409c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((p) k0.g(1, arrayList)).f50409c;
    }
}
