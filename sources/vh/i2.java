package vh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.oi;
public final class i2 extends View {
    public int f51274a;
    public final k2 f51275b;

    public i2(k2 k2Var, Context context) {
        super(context);
        this.f51275b = k2Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        k2 k2Var = this.f51275b;
        oi oiVar = k2Var.e;
        ArrayList arrayList = k2Var.f51383b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f51274a;
        if (i14 == -1) {
            if (k2Var.f51387e0 == k2.f51379j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = k2Var.f51389f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (k2Var.f51385c0 ? 1 : 0);
                    if (k2Var.f51386d0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.i0.f16026q.y - org.telegram.messenger.i0.L(62.0f)) - (((int) (((int) (size / oiVar.J)) * k2Var.O)) * ((int) Math.ceil(i12 / oiVar.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
