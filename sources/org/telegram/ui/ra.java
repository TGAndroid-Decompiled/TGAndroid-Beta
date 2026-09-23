package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f36745a;
    public final ArrayList f36746b;
    public final ArrayList f36747c;
    public final ArrayList d;
    public final View e;
    public final float f36748f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f36745a = ubVar;
        this.f36746b = arrayList;
        this.f36747c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f36748f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f36745a, this.f36746b, this.f36747c, this.d, this.e, this.f36748f, this.h);
    }
}
