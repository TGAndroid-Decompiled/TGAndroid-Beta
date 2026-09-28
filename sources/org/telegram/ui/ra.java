package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f37273a;
    public final ArrayList f37274b;
    public final ArrayList f37275c;
    public final ArrayList d;
    public final View e;
    public final float f37276f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37273a = ubVar;
        this.f37274b = arrayList;
        this.f37275c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37276f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f37273a, this.f37274b, this.f37275c, this.d, this.e, this.f37276f, this.h);
    }
}
