package sg;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;
public final class c extends b {
    public d d;

    @Override
    public final s4.h0 a() {
        d dVar = new d(UserConfig.selectedAccount, this.f46022a);
        this.d = dVar;
        dVar.f46061r = this;
        return dVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d dVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = dVar.f46059f;
        f fVar = new f(context, dVar.f46057c);
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            fVar.a((e) arrayList.get(i13));
            fVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((e) arrayList.get(i13)).f46075e = i12;
            i12 += fVar.getMeasuredHeight();
        }
        dVar.f46060n = i12;
    }
}
