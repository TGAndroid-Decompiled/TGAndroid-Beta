package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final wb f37695a;
    public final ArrayList f37696b;
    public final ArrayList f37697c;
    public final ArrayList d;
    public final View e;
    public final float f37698f;
    public final float h;

    public ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37695a = wbVar;
        this.f37696b = arrayList;
        this.f37697c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37698f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.V(this.f37695a, this.f37696b, this.f37697c, this.d, this.e, this.f37698f, this.h);
    }
}
