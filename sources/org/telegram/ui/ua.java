package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final wb f44075a;
    public final ArrayList f44076b;
    public final ArrayList f44077c;
    public final ArrayList d;
    public final View e;
    public final float f44078f;
    public final float h;

    public ua(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f44075a = wbVar;
        this.f44076b = arrayList;
        this.f44077c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f44078f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.W(this.f44075a, this.f44076b, this.f44077c, this.d, this.e, this.f44078f, this.h);
    }
}
