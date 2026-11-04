package org.telegram.utils.twidget;

import java.util.ArrayList;
public final class n {
    public final ArrayList f52935a = new ArrayList();

    public final synchronized boolean a(int i3, int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            if (i11 >= this.f52935a.size()) {
                break;
            }
            int[] iArr = (int[]) this.f52935a.get(i11);
            if (iArr[0] != i3) {
                i11++;
            } else if (iArr[1] == i10 && iArr[2] == z10 && i11 == 0) {
                return false;
            } else {
                this.f52935a.remove(i11);
            }
        }
        this.f52935a.add(0, new int[]{i3, i10, z10 ? 1 : 0});
        while (this.f52935a.size() > 4) {
            ArrayList arrayList = this.f52935a;
            arrayList.remove(arrayList.size() - 1);
        }
        return true;
    }
}
