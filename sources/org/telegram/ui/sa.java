package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sa implements Runnable {
    public final vb f41645a;
    public final ArrayList f41646b;
    public final ArrayList f41647c;
    public final ArrayList d;
    public final View f41648e;
    public final float f41649f;
    public final float h;

    public sa(vb vbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f41645a = vbVar;
        this.f41646b = arrayList;
        this.f41647c = arrayList2;
        this.d = arrayList3;
        this.f41648e = view;
        this.f41649f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        vb.V(this.f41645a, this.f41646b, this.f41647c, this.d, this.f41648e, this.f41649f, this.h);
    }
}
