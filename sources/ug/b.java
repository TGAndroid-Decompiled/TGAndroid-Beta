package ug;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.i10;
public final class b extends a {
    public c d;

    @Override
    public final v4.i0 a() {
        c cVar = new c(i10.f24637t0, this.f58720a);
        this.d = cVar;
        cVar.f58755r = this;
        return cVar;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        c cVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = cVar.f58753f;
        e eVar = new e(context, cVar.f58751c);
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            eVar.a((d) arrayList.get(i12));
            eVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((d) arrayList.get(i12)).f58763e = i11;
            i11 += eVar.getMeasuredHeight();
        }
        cVar.f58754n = i11;
    }
}
