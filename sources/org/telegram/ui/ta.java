package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final wb f40743a;
    public final ArrayList f40744b;
    public final ArrayList f40745c;
    public final ArrayList d;
    public final View f40746e;
    public final float f40747f;
    public final float h;

    public ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40743a = wbVar;
        this.f40744b = arrayList;
        this.f40745c = arrayList2;
        this.d = arrayList3;
        this.f40746e = view;
        this.f40747f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.T(this.f40743a, this.f40744b, this.f40745c, this.d, this.f40746e, this.f40747f, this.h);
    }
}
