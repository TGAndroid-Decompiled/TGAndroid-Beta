package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final vb f41647a;
    public final ArrayList f41648b;
    public final ArrayList f41649c;
    public final ArrayList d;
    public final View f41650e;
    public final float f41651f;
    public final float h;

    public sa(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41647a = vbVar;
        this.f41648b = arrayList;
        this.f41649c = arrayList2;
        this.d = arrayList3;
        this.f41650e = view;
        this.f41651f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41647a, this.f41648b, this.f41649c, this.d, this.f41650e, this.f41651f, this.h);
    }
}
