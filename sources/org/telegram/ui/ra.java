package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f37375a;
    public final ArrayList f37376b;
    public final ArrayList f37377c;
    public final ArrayList d;
    public final View e;
    public final float f37378f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37375a = ubVar;
        this.f37376b = arrayList;
        this.f37377c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37378f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f37375a, this.f37376b, this.f37377c, this.d, this.e, this.f37378f, this.h);
    }
}
