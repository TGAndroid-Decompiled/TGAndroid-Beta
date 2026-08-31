package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final sb f40875a;
    public final ArrayList f40876b;
    public final ArrayList f40877c;
    public final ArrayList d;
    public final View f40878e;
    public final float f40879f;
    public final float h;

    public ra(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f40875a = sbVar;
        this.f40876b = arrayList;
        this.f40877c = arrayList2;
        this.d = arrayList3;
        this.f40878e = view;
        this.f40879f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        sb.V(this.f40875a, this.f40876b, this.f40877c, this.d, this.f40878e, this.f40879f, this.h);
    }
}
