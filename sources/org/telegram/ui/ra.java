package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ra implements Runnable {
    public final ub f41390a;
    public final ArrayList f41391b;
    public final ArrayList f41392c;
    public final ArrayList d;
    public final View f41393e;
    public final float f41394f;
    public final float h;

    public ra(ub ubVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41390a = ubVar;
        this.f41391b = arrayList;
        this.f41392c = arrayList2;
        this.d = arrayList3;
        this.f41393e = view;
        this.f41394f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        ub.V(this.f41390a, this.f41391b, this.f41392c, this.d, this.f41393e, this.f41394f, this.h);
    }
}
