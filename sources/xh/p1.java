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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ub1;
import w7.a6;
import w7.y5;
public final class p1 extends x51 {
    public static final int f46454a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = y51Var.d;
        ArrayList arrayList = (ArrayList) y51Var.G;
        int i11 = y51Var.f30650z;
        Utilities.Callback callback = (Utilities.Callback) y51Var.H;
        ub1 ub1Var = q1Var.f46463a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f46468r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f46468r = i10;
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
                q90 q90Var = new q90(q1Var.getContext(), null);
                q90Var.setGravity(17);
                q90Var.setText((CharSequence) arrayList.get(i13));
                q90Var.setTypeface(AndroidUtilities.bold());
                q90Var.setTextColor(h6.v(h6.w0(null, h6.f19039b6, false), h6.w0(null, h6.f19058c6, false)));
                q90Var.setTextSize(1, 14.0f);
                q90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                q90Var.setEllipsize(TextUtils.TruncateAt.END);
                q90Var.setSingleLine();
                q90Var.setMaxLines(1);
                a6.b(q90Var, 0.075f, 1.4f);
                ub1Var.addView(q90Var, y5.n(-2, 26));
                arrayList2.add(q90Var);
                i13++;
            }
        }
        q1Var.f46464b = i11;
        if (!z11) {
            q1Var.f46465c.d(i11, true);
        }
        ub1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.f30650z == y51Var2.f30650z && y51Var.H == y51Var2.H && equals(y51Var, y51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new q1(context);
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.d == y51Var2.d) {
            ArrayList arrayList = (ArrayList) y51Var.G;
            ArrayList arrayList2 = (ArrayList) y51Var2.G;
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
