package qh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class y2 extends View {
    public int f46352a;
    public final a3 f46353b;

    public y2(a3 a3Var, Context context) {
        super(context);
        this.f46353b = a3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        a3 a3Var = this.f46353b;
        m2 m2Var = a3Var.f44898e;
        ArrayList arrayList = a3Var.V;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f46352a;
        if (i14 == -1) {
            if (a3Var.f44894b0 == a3.f44890g0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = a3Var.f44896c0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (a3Var.W ? 1 : 0);
                    if (a3Var.f44892a0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / m2Var.J)) * a3Var.L)) * ((int) Math.ceil(i12 / m2Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
