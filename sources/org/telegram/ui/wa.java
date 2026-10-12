package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class wa implements Runnable {
    public final ac f41194a;
    public final ArrayList f41195b;
    public final ArrayList f41196c;
    public final ArrayList d;
    public final View e;
    public final float f41197f;
    public final float h;

    public wa(ac acVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41194a = acVar;
        this.f41195b = arrayList;
        this.f41196c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41197f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ac.V(this.f41194a, this.f41195b, this.f41196c, this.d, this.e, this.f41197f, this.h);
    }
}
