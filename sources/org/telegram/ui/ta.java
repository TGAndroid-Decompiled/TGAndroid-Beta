package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final wb f40737a;
    public final ArrayList f40738b;
    public final ArrayList f40739c;
    public final ArrayList d;
    public final View f40740e;
    public final float f40741f;
    public final float h;

    public ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40737a = wbVar;
        this.f40738b = arrayList;
        this.f40739c = arrayList2;
        this.d = arrayList3;
        this.f40740e = view;
        this.f40741f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.T(this.f40737a, this.f40738b, this.f40739c, this.d, this.f40740e, this.f40741f, this.h);
    }
}
