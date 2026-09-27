package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ua implements Runnable {
    public final wb f38185a;
    public final ArrayList f38186b;
    public final ArrayList f38187c;
    public final ArrayList d;
    public final View e;
    public final float f38188f;
    public final float h;

    public ua(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f38185a = wbVar;
        this.f38186b = arrayList;
        this.f38187c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f38188f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.V(this.f38185a, this.f38186b, this.f38187c, this.d, this.e, this.f38188f, this.h);
    }
}
