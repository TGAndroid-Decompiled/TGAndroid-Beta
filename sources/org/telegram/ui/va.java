package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class va implements Runnable {
    public final xb f42134a;
    public final ArrayList f42135b;
    public final ArrayList f42136c;
    public final ArrayList d;
    public final View e;
    public final float f42137f;
    public final float h;

    public va(xb xbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f42134a = xbVar;
        this.f42135b = arrayList;
        this.f42136c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f42137f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        xb.V(this.f42134a, this.f42135b, this.f42136c, this.d, this.e, this.f42137f, this.h);
    }
}
