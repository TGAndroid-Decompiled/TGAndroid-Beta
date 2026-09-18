package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final vb f37231a;
    public final ArrayList f37232b;
    public final ArrayList f37233c;
    public final ArrayList d;
    public final View e;
    public final float f37234f;
    public final float h;

    public sa(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37231a = vbVar;
        this.f37232b = arrayList;
        this.f37233c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37234f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f37231a, this.f37232b, this.f37233c, this.d, this.e, this.f37234f, this.h);
    }
}
