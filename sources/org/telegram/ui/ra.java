package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f37057a;
    public final ArrayList f37058b;
    public final ArrayList f37059c;
    public final ArrayList d;
    public final View e;
    public final float f37060f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f37057a = ubVar;
        this.f37058b = arrayList;
        this.f37059c = arrayList2;
        this.d = arrayList3;
        this.e = view;
        this.f37060f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f37057a, this.f37058b, this.f37059c, this.d, this.e, this.f37060f, this.h);
    }
}
