package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class wa implements Runnable {
    public final ac f40901a;
    public final ArrayList f40902b;
    public final ArrayList f40903c;
    public final ArrayList d;
    public final View e;
    public final float f40904f;
    public final float h;

    public wa(ac acVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40901a = acVar;
        this.f40902b = arrayList;
        this.f40903c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f40904f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ac.V(this.f40901a, this.f40902b, this.f40903c, this.d, this.e, this.f40904f, this.h);
    }
}
