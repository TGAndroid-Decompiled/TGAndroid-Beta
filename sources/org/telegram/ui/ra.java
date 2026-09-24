package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f37261a;
    public final ArrayList f37262b;
    public final ArrayList f37263c;
    public final ArrayList d;
    public final View e;
    public final float f37264f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37261a = ubVar;
        this.f37262b = arrayList;
        this.f37263c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37264f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f37261a, this.f37262b, this.f37263c, this.d, this.e, this.f37264f, this.h);
    }
}
