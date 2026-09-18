package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final wb f37700a;
    public final ArrayList f37701b;
    public final ArrayList f37702c;
    public final ArrayList d;
    public final View e;
    public final float f37703f;
    public final float h;

    public ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37700a = wbVar;
        this.f37701b = arrayList;
        this.f37702c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37703f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.V(this.f37700a, this.f37701b, this.f37702c, this.d, this.e, this.f37703f, this.h);
    }
}
