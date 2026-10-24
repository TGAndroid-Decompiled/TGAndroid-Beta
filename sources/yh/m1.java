package yh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.ua1;
import w7.b6;
import w7.z5;
public final class m1 extends k61 {
    public static final int f50861a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        boolean z11;
        n1 n1Var = (n1) view;
        int i10 = l61Var.d;
        ArrayList arrayList = (ArrayList) l61Var.G;
        int i11 = l61Var.f28240z;
        Utilities.Callback callback = (Utilities.Callback) l61Var.H;
        ua1 ua1Var = n1Var.f50873a;
        ArrayList arrayList2 = n1Var.d;
        if (n1Var.f50878r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        n1Var.f50878r = i10;
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
                    ua1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                w90 w90Var = new w90(n1Var.getContext(), null);
                w90Var.setGravity(17);
                w90Var.setText((CharSequence) arrayList.get(i13));
                w90Var.setTypeface(AndroidUtilities.bold());
                r6.X(w90Var, r6.q(k6.f21145b6, k6.f21165c6), null);
                w90Var.setTextSize(1, 14.0f);
                w90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                w90Var.setEllipsize(TextUtils.TruncateAt.END);
                w90Var.setSingleLine();
                w90Var.setMaxLines(1);
                b6.b(w90Var, 0.075f, 1.4f);
                ua1Var.addView(w90Var, z5.n(-2, 26));
                arrayList2.add(w90Var);
                i13++;
            }
        }
        n1Var.f50874b = i11;
        if (!z11) {
            n1Var.f50875c.d(i11, true);
        }
        ua1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.f28240z == l61Var2.f28240z && l61Var.H == l61Var2.H && equals(l61Var, l61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new n1(context);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            ArrayList arrayList = (ArrayList) l61Var.G;
            ArrayList arrayList2 = (ArrayList) l61Var2.G;
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
