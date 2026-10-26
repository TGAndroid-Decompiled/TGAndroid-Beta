package zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.z90;
import org.telegram.ui.xa1;
public final class n1 extends s61 {
    public static final int f53161a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        o1 o1Var = (o1) view;
        int i10 = t61Var.d;
        ArrayList arrayList = (ArrayList) t61Var.G;
        int i11 = t61Var.f32888z;
        Utilities.Callback callback = (Utilities.Callback) t61Var.H;
        xa1 xa1Var = o1Var.f53171a;
        ArrayList arrayList2 = o1Var.d;
        if (o1Var.f53176r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        o1Var.f53176r = i10;
        if (arrayList2.size() != arrayList.size()) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                CharSequence charSequence = null;
                if (i12 >= arrayList2.size()) {
                    break;
                }
                if (i13 < arrayList.size()) {
                    charSequence = (CharSequence) arrayList.get(i13);
                }
                if (charSequence == null) {
                    xa1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                z90 z90Var = new z90(o1Var.getContext(), null);
                z90Var.setGravity(17);
                z90Var.setText((CharSequence) arrayList.get(i13));
                z90Var.setTypeface(AndroidUtilities.bold());
                f7.W(z90Var, f7.q(y6.f23317b6, y6.f23337c6), null);
                z90Var.setTextSize(1, 14.0f);
                z90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                z90Var.setEllipsize(TextUtils.TruncateAt.END);
                z90Var.setSingleLine();
                z90Var.setMaxLines(1);
                gb1.c(z90Var, 0.075f, 1.4f);
                xa1Var.addView(z90Var, gb1.r(-2, 26));
                arrayList2.add(z90Var);
                i13++;
            }
        }
        o1Var.f53172b = i11;
        if (!z11) {
            o1Var.f53173c.d(i11, true);
        }
        xa1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.f32888z == t61Var2.f32888z && t61Var.H == t61Var2.H && equals(t61Var, t61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new o1(context);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d) {
            ArrayList arrayList = (ArrayList) t61Var.G;
            ArrayList arrayList2 = (ArrayList) t61Var2.G;
            if (arrayList != arrayList2) {
                if (arrayList != null || arrayList2 != null) {
                    if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
                            }
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
