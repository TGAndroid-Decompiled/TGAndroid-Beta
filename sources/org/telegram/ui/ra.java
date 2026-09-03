package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final sb f40788a;
    public final ArrayList f40789b;
    public final ArrayList f40790c;
    public final ArrayList d;
    public final View f40791e;
    public final float f40792f;
    public final float h;

    public ra(sb sbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f10, float f11) {
        this.f40788a = sbVar;
        this.f40789b = arrayList;
        this.f40790c = arrayList2;
        this.d = arrayList3;
        this.f40791e = view;
        this.f40792f = f10;
        this.h = f11;
    }

    @Override
    public final void run() {
        sb.V(this.f40788a, this.f40789b, this.f40790c, this.d, this.f40791e, this.f40792f, this.h);
    }
}
