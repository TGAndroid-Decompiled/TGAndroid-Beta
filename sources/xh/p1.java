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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.ub1;
import w7.a6;
import w7.y5;
public final class p1 extends u51 {
    public static final int f46347a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = v51Var.d;
        ArrayList arrayList = (ArrayList) v51Var.G;
        int i11 = v51Var.f29062z;
        Utilities.Callback callback = (Utilities.Callback) v51Var.H;
        ub1 ub1Var = q1Var.f46356a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f46361r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f46361r = i10;
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
                n90 n90Var = new n90(q1Var.getContext(), null);
                n90Var.setGravity(17);
                n90Var.setText((CharSequence) arrayList.get(i13));
                n90Var.setTypeface(AndroidUtilities.bold());
                n90Var.setTextColor(h6.v(h6.w0(null, h6.f19023b6, false), h6.w0(null, h6.f19042c6, false)));
                n90Var.setTextSize(1, 14.0f);
                n90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n90Var.setEllipsize(TextUtils.TruncateAt.END);
                n90Var.setSingleLine();
                n90Var.setMaxLines(1);
                a6.b(n90Var, 0.075f, 1.4f);
                ub1Var.addView(n90Var, y5.n(-2, 26));
                arrayList2.add(n90Var);
                i13++;
            }
        }
        q1Var.f46357b = i11;
        if (!z11) {
            q1Var.f46358c.d(i11, true);
        }
        ub1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.f29062z == v51Var2.f29062z && v51Var.H == v51Var2.H && equals(v51Var, v51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new q1(context);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            ArrayList arrayList = (ArrayList) v51Var.G;
            ArrayList arrayList2 = (ArrayList) v51Var2.G;
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
