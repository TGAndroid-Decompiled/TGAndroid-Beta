package qh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class x2 extends View {
    public int f46308a;
    public final z2 f46309b;

    public x2(z2 z2Var, Context context) {
        super(context);
        this.f46309b = z2Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        z2 z2Var = this.f46309b;
        l2 l2Var = z2Var.f46393e;
        ArrayList arrayList = z2Var.V;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f46308a;
        if (i14 == -1) {
            if (z2Var.f46389b0 == z2.f46385g0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = z2Var.f46391c0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (z2Var.W ? 1 : 0);
                    if (z2Var.f46387a0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / l2Var.J)) * z2Var.L)) * ((int) Math.ceil(i12 / l2Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
