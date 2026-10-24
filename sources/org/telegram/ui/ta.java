package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final vb f41976a;
    public final ArrayList f41977b;
    public final ArrayList f41978c;
    public final ArrayList d;
    public final View e;
    public final float f41979f;
    public final float h;

    public ta(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41976a = vbVar;
        this.f41977b = arrayList;
        this.f41978c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41979f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41976a, this.f41977b, this.f41978c, this.d, this.e, this.f41979f, this.h);
    }
}
