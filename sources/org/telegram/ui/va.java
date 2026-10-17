package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class va implements Runnable {
    public final xb f42159a;
    public final ArrayList f42160b;
    public final ArrayList f42161c;
    public final ArrayList d;
    public final View e;
    public final float f42162f;
    public final float h;

    public va(xb xbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f42159a = xbVar;
        this.f42160b = arrayList;
        this.f42161c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f42162f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        xb.V(this.f42159a, this.f42160b, this.f42161c, this.d, this.e, this.f42162f, this.h);
    }
}
