package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class va implements Runnable {
    public final yb f42737a;
    public final ArrayList f42738b;
    public final ArrayList f42739c;
    public final ArrayList d;
    public final View f42740e;
    public final float f42741f;
    public final float h;

    public va(yb ybVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f42737a = ybVar;
        this.f42738b = arrayList;
        this.f42739c = arrayList2;
        this.d = arrayList3;
        this.f42740e = view;
        this.f42741f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        yb.V(this.f42737a, this.f42738b, this.f42739c, this.d, this.f42740e, this.f42741f, this.h);
    }
}
