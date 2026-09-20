package xh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.dc1;
import w7.b6;
import w7.y5;
public final class p1 extends v51 {
    public static final int f46366a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = w51Var.d;
        ArrayList arrayList = (ArrayList) w51Var.G;
        int i11 = w51Var.f29961z;
        Utilities.Callback callback = (Utilities.Callback) w51Var.H;
        dc1 dc1Var = q1Var.f46375a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f46380r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f46380r = i10;
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
                    dc1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                k90 k90Var = new k90(q1Var.getContext(), null);
                k90Var.setGravity(17);
                k90Var.setText((CharSequence) arrayList.get(i13));
                k90Var.setTypeface(AndroidUtilities.bold());
                k90Var.setTextColor(j6.v(j6.w0(null, j6.f19057b6, false), j6.w0(null, j6.f19076c6, false)));
                k90Var.setTextSize(1, 14.0f);
                k90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                k90Var.setEllipsize(TextUtils.TruncateAt.END);
                k90Var.setSingleLine();
                k90Var.setMaxLines(1);
                b6.b(k90Var, 0.075f, 1.4f);
                dc1Var.addView(k90Var, y5.n(-2, 26));
                arrayList2.add(k90Var);
                i13++;
            }
        }
        q1Var.f46376b = i11;
        if (!z11) {
            q1Var.f46377c.d(i11, true);
        }
        dc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.f29961z == w51Var2.f29961z && w51Var.H == w51Var2.H && equals(w51Var, w51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new q1(context);
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d) {
            ArrayList arrayList = (ArrayList) w51Var.G;
            ArrayList arrayList2 = (ArrayList) w51Var2.G;
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
