package wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.gc1;
import w7.a6;
import w7.c6;
public final class n1 extends u51 {
    public static final int f44265a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        o1 o1Var = (o1) view;
        int i10 = v51Var.d;
        ArrayList arrayList = (ArrayList) v51Var.G;
        int i11 = v51Var.f27842z;
        Utilities.Callback callback = (Utilities.Callback) v51Var.H;
        gc1 gc1Var = o1Var.f44273a;
        ArrayList arrayList2 = o1Var.d;
        if (o1Var.f44278r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        o1Var.f44278r = i10;
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
                    gc1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                m90 m90Var = new m90(o1Var.getContext(), null);
                m90Var.setGravity(17);
                m90Var.setText((CharSequence) arrayList.get(i13));
                m90Var.setTypeface(AndroidUtilities.bold());
                m90Var.setTextColor(j6.v(j6.w0(null, j6.f17891b6, false), j6.w0(null, j6.f17910c6, false)));
                m90Var.setTextSize(1, 14.0f);
                m90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                m90Var.setEllipsize(TextUtils.TruncateAt.END);
                m90Var.setSingleLine();
                m90Var.setMaxLines(1);
                c6.b(m90Var, 0.075f, 1.4f);
                gc1Var.addView(m90Var, a6.n(-2, 26));
                arrayList2.add(m90Var);
                i13++;
            }
        }
        o1Var.f44274b = i11;
        if (!z11) {
            o1Var.f44275c.d(i11, true);
        }
        gc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.c0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.f27842z == v51Var2.f27842z && v51Var.H == v51Var2.H && equals(v51Var, v51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new o1(context);
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
