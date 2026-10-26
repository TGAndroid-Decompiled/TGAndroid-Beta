package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final wb f44078a;
    public final ArrayList f44079b;
    public final ArrayList f44080c;
    public final ArrayList d;
    public final View e;
    public final float f44081f;
    public final float h;

    public ua(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f44078a = wbVar;
        this.f44079b = arrayList;
        this.f44080c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f44081f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.W(this.f44078a, this.f44079b, this.f44080c, this.d, this.e, this.f44081f, this.h);
    }
}
