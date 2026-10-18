package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class va implements Runnable {
    public final xb f42176a;
    public final ArrayList f42177b;
    public final ArrayList f42178c;
    public final ArrayList d;
    public final View e;
    public final float f42179f;
    public final float h;

    public va(xb xbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f42176a = xbVar;
        this.f42177b = arrayList;
        this.f42178c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f42179f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        xb.V(this.f42176a, this.f42177b, this.f42178c, this.d, this.e, this.f42179f, this.h);
    }
}
