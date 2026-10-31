package org.telegram.utils.twidget;

import java.util.ArrayList;
public final class n {
    public final ArrayList f44417a = new ArrayList();

    public final synchronized boolean a(int i10, int i11, boolean z10) {
        int i12 = 0;
        while (true) {
            if (i12 >= this.f44417a.size()) {
                break;
            }
            int[] iArr = (int[]) this.f44417a.get(i12);
            if (iArr[0] != i10) {
                i12++;
            } else if (iArr[1] == i11 && iArr[2] == z10 && i12 == 0) {
                return false;
            } else {
                this.f44417a.remove(i12);
            }
        }
        this.f44417a.add(0, new int[]{i10, i11, z10 ? 1 : 0});
        while (this.f44417a.size() > 4) {
            ArrayList arrayList = this.f44417a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
