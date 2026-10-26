package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.z90;
public final class n2 extends s61 {
    public static final int f53162a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        u6 u6Var;
        z90 z90Var = (z90) view;
        z90Var.setGravity(t61Var.f32888z);
        Object obj = t61Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = t61Var.G;
            if (obj2 instanceof u6) {
                u6Var = (u6) obj2;
            } else {
                u6Var = null;
            }
            f7.V(z90Var, intValue, u6Var);
        } else {
            f7.r(z90Var);
            z90Var.setTextColor((int) t61Var.B);
        }
        z90Var.setTextSize(1, t61Var.A);
        if (t61Var.f32880q) {
            typeface = AndroidUtilities.bold();
        }
        z90Var.setTypeface(typeface);
        int i10 = t61Var.f32872i;
        z90Var.setPadding(i10, 0, i10, t61Var.f32874k);
        z90Var.setText(t61Var.f32875l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new xb(context, 5, null);
    }
}
