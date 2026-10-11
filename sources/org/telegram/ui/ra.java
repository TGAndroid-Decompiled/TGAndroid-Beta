package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f41424a;
    public final ArrayList f41425b;
    public final ArrayList f41426c;
    public final ArrayList d;
    public final View f41427e;
    public final float f41428f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41424a = ubVar;
        this.f41425b = arrayList;
        this.f41426c = arrayList2;
        this.d = arrayList3;
        this.f41427e = view;
        this.f41428f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f41424a, this.f41425b, this.f41426c, this.d, this.f41427e, this.f41428f, this.h);
    }
}
