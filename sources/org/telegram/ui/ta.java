package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final wb f40736a;
    public final ArrayList f40737b;
    public final ArrayList f40738c;
    public final ArrayList d;
    public final View f40739e;
    public final float f40740f;
    public final float h;

    public ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40736a = wbVar;
        this.f40737b = arrayList;
        this.f40738c = arrayList2;
        this.d = arrayList3;
        this.f40739e = view;
        this.f40740f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.T(this.f40736a, this.f40737b, this.f40738c, this.d, this.f40739e, this.f40740f, this.h);
    }
}
