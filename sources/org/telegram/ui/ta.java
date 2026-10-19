package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final vb f41620a;
    public final ArrayList f41621b;
    public final ArrayList f41622c;
    public final ArrayList d;
    public final View e;
    public final float f41623f;
    public final float h;

    public ta(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41620a = vbVar;
        this.f41621b = arrayList;
        this.f41622c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f41623f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41620a, this.f41621b, this.f41622c, this.d, this.e, this.f41623f, this.h);
    }
}
