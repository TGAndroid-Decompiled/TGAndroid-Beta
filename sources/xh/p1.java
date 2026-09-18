package xh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.bc1;
import w7.a6;
import w7.y5;
public final class p1 extends w51 {
    public static final int f46319a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = x51Var.d;
        ArrayList arrayList = (ArrayList) x51Var.G;
        int i11 = x51Var.f30261z;
        Utilities.Callback callback = (Utilities.Callback) x51Var.H;
        bc1 bc1Var = q1Var.f46328a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f46333r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f46333r = i10;
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
                    bc1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                l90 l90Var = new l90(q1Var.getContext(), null);
                l90Var.setGravity(17);
                l90Var.setText((CharSequence) arrayList.get(i13));
                l90Var.setTypeface(AndroidUtilities.bold());
                l90Var.setTextColor(j6.v(j6.w0(null, j6.f19025b6, false), j6.w0(null, j6.f19044c6, false)));
                l90Var.setTextSize(1, 14.0f);
                l90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                l90Var.setEllipsize(TextUtils.TruncateAt.END);
                l90Var.setSingleLine();
                l90Var.setMaxLines(1);
                a6.b(l90Var, 0.075f, 1.4f);
                bc1Var.addView(l90Var, y5.n(-2, 26));
                arrayList2.add(l90Var);
                i13++;
            }
        }
        q1Var.f46329b = i11;
        if (!z11) {
            q1Var.f46330c.d(i11, true);
        }
        bc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (x51Var.f30261z == x51Var2.f30261z && x51Var.H == x51Var2.H && equals(x51Var, x51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        return new q1(context);
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            ArrayList arrayList = (ArrayList) x51Var.G;
            ArrayList arrayList2 = (ArrayList) x51Var2.G;
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
