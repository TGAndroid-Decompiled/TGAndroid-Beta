package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final ub f40391a;
    public final ArrayList f40392b;
    public final ArrayList f40393c;
    public final ArrayList d;
    public final View f40394e;
    public final float f40395f;
    public final float h;

    public sa(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40391a = ubVar;
        this.f40392b = arrayList;
        this.f40393c = arrayList2;
        this.d = arrayList3;
        this.f40394e = view;
        this.f40395f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f40391a, this.f40392b, this.f40393c, this.d, this.f40394e, this.f40395f, this.h);
    }
}
