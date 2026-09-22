package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final vb f37372a;
    public final ArrayList f37373b;
    public final ArrayList f37374c;
    public final ArrayList d;
    public final View e;
    public final float f37375f;
    public final float h;

    public sa(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37372a = vbVar;
        this.f37373b = arrayList;
        this.f37374c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37375f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f37372a, this.f37373b, this.f37374c, this.d, this.e, this.f37375f, this.h);
    }
}
