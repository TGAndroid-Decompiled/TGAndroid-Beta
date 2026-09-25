package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f37274a;
    public final ArrayList f37275b;
    public final ArrayList f37276c;
    public final ArrayList d;
    public final View e;
    public final float f37277f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37274a = ubVar;
        this.f37275b = arrayList;
        this.f37276c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37277f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f37274a, this.f37275b, this.f37276c, this.d, this.e, this.f37277f, this.h);
    }
}
