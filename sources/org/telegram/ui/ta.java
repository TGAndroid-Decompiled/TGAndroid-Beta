package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final wb f36885a;
    public final ArrayList f36886b;
    public final ArrayList f36887c;
    public final ArrayList d;
    public final View e;
    public final float f36888f;
    public final float h;

    public ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f36885a = wbVar;
        this.f36886b = arrayList;
        this.f36887c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f36888f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.V(this.f36885a, this.f36886b, this.f36887c, this.d, this.e, this.f36888f, this.h);
    }
}
