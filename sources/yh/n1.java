package yh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.cc1;
import w7.x5;
import w7.z5;
public final class n1 extends g51 {
    public static final int f50458a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        o1 o1Var = (o1) view;
        int i10 = h51Var.d;
        ArrayList arrayList = (ArrayList) h51Var.G;
        int i11 = h51Var.f26607z;
        Utilities.Callback callback = (Utilities.Callback) h51Var.H;
        cc1 cc1Var = o1Var.f50468a;
        ArrayList arrayList2 = o1Var.d;
        if (o1Var.f50474r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        o1Var.f50474r = i10;
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
                    cc1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                d90 d90Var = new d90(o1Var.getContext(), null);
                d90Var.setGravity(17);
                d90Var.setText((CharSequence) arrayList.get(i13));
                d90Var.setTypeface(AndroidUtilities.bold());
                d90Var.setTextColor(j6.v(j6.w0(null, j6.f20626b6, false), j6.w0(null, j6.f20645c6, false)));
                d90Var.setTextSize(1, 14.0f);
                d90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                d90Var.setEllipsize(TextUtils.TruncateAt.END);
                d90Var.setSingleLine();
                d90Var.setMaxLines(1);
                z5.b(d90Var, 0.075f, 1.4f);
                cc1Var.addView(d90Var, x5.n(-2, 26));
                arrayList2.add(d90Var);
                i13++;
            }
        }
        o1Var.f50469b = i11;
        if (!z11) {
            o1Var.f50470c.d(i11, true);
        }
        cc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.b0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f26607z == h51Var2.f26607z && h51Var.H == h51Var2.H && equals(h51Var, h51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new o1(context);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            ArrayList arrayList = (ArrayList) h51Var.G;
            ArrayList arrayList2 = (ArrayList) h51Var2.G;
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
