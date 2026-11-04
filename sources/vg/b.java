package vg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.h10;
public final class b extends a {
    public c d;

    @Override
    public final u4.h0 a() {
        c cVar = new c(h10.f22829t0, this.f56567a);
        this.d = cVar;
        cVar.f56579r = this;
        return cVar;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        c cVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = cVar.f56577f;
        e eVar = new e(context, cVar.f56575c);
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            eVar.a((d) arrayList.get(i12));
            eVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((d) arrayList.get(i12)).f56587e = i11;
            i11 += eVar.getMeasuredHeight();
        }
        cVar.f56578n = i11;
    }
}
