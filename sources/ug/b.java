package ug;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.k10;
public final class b extends a {
    public c d;

    @Override
    public final v4.h0 a() {
        c cVar = new c(k10.f24932t0, this.f58605a);
        this.d = cVar;
        cVar.f58640r = this;
        return cVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        c cVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = cVar.f58638f;
        e eVar = new e(context, cVar.f58636c);
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            eVar.a((d) arrayList.get(i12));
            eVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((d) arrayList.get(i12)).f58648e = i11;
            i11 += eVar.getMeasuredHeight();
        }
        cVar.f58639n = i11;
    }
}
