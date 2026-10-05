package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class ta implements Runnable {
    public final wb f40765a;
    public final ArrayList f40766b;
    public final ArrayList f40767c;
    public final ArrayList d;
    public final View f40768e;
    public final float f40769f;
    public final float h;

    public ta(wb wbVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, View view, float f7, float f10) {
        this.f40765a = wbVar;
        this.f40766b = arrayList;
        this.f40767c = arrayList2;
        this.d = arrayList3;
        this.f40768e = view;
        this.f40769f = f7;
        this.h = f10;
    }

    @Override
    public final void run() {
        wb.T(this.f40765a, this.f40766b, this.f40767c, this.d, this.f40768e, this.f40769f, this.h);
    }
}
