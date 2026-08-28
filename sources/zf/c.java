package zf;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.UserConfig;
public final class c extends b {
    public d d;

    @Override
    public final f2.r0 a() {
        d dVar = new d(UserConfig.selectedAccount, this.f50463a);
        this.d = dVar;
        dVar.f50483r = this;
        return dVar;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        d dVar = this.d;
        Context context = getContext();
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ArrayList arrayList = dVar.f50481f;
        f fVar = new f(context, dVar.f50479c);
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            fVar.a((e) arrayList.get(i12));
            fVar.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE));
            ((e) arrayList.get(i12)).f50491e = i11;
            i11 += fVar.getMeasuredHeight();
        }
        dVar.f50482n = i11;
    }
}
