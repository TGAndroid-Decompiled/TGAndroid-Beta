package org.telegram.utils.twidget;

import java.util.ArrayList;
public final class l0 {
    public final ArrayList f52894a = new ArrayList();

    public final synchronized boolean a(int i7, int i10, boolean z9) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f52894a.size()) {
                break;
            }
            int[] iArr = (int[]) this.f52894a.get(i11);
            if (iArr[0] != i7) {
                i11++;
            } else if (iArr[1] == i10 && iArr[2] == z9 && i11 == 0) {
                return false;
            } else {
                this.f52894a.remove(i11);
            }
        }
        this.f52894a.add(0, new int[]{i7, i10, z9 ? 1 : 0});
        while (this.f52894a.size() > 4) {
            ArrayList arrayList = this.f52894a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
