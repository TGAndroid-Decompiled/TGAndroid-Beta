package xh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.ub1;
import w7.a6;
import w7.y5;
public final class p1 extends v51 {
    public static final int f46345a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = w51Var.d;
        ArrayList arrayList = (ArrayList) w51Var.G;
        int i11 = w51Var.f29908z;
        Utilities.Callback callback = (Utilities.Callback) w51Var.H;
        ub1 ub1Var = q1Var.f46354a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f46359r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f46359r = i10;
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
                    ub1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                o90 o90Var = new o90(q1Var.getContext(), null);
                o90Var.setGravity(17);
                o90Var.setText((CharSequence) arrayList.get(i13));
                o90Var.setTypeface(AndroidUtilities.bold());
                o90Var.setTextColor(h6.v(h6.w0(null, h6.f19022b6, false), h6.w0(null, h6.f19041c6, false)));
                o90Var.setTextSize(1, 14.0f);
                o90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                o90Var.setEllipsize(TextUtils.TruncateAt.END);
                o90Var.setSingleLine();
                o90Var.setMaxLines(1);
                a6.b(o90Var, 0.075f, 1.4f);
                ub1Var.addView(o90Var, y5.n(-2, 26));
                arrayList2.add(o90Var);
                i13++;
            }
        }
        q1Var.f46355b = i11;
        if (!z11) {
            q1Var.f46356c.d(i11, true);
        }
        ub1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.f29908z == w51Var2.f29908z && w51Var.H == w51Var2.H && equals(w51Var, w51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
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
