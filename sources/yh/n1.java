package yh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.ic1;
import w7.a6;
import w7.c6;
public final class n1 extends k61 {
    public static final int f49035a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        boolean z11;
        o1 o1Var = (o1) view;
        int i10 = l61Var.d;
        ArrayList arrayList = (ArrayList) l61Var.G;
        int i11 = l61Var.f26967z;
        Utilities.Callback callback = (Utilities.Callback) l61Var.H;
        ic1 ic1Var = o1Var.f49044a;
        ArrayList arrayList2 = o1Var.d;
        if (o1Var.f49049r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        o1Var.f49049r = i10;
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
                    ic1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                da0 da0Var = new da0(o1Var.getContext(), null);
                da0Var.setGravity(17);
                da0Var.setText((CharSequence) arrayList.get(i13));
                da0Var.setTypeface(AndroidUtilities.bold());
                da0Var.setTextColor(g6.v(g6.x0(null, g6.f19862b6, false), g6.x0(null, g6.f19882c6, false)));
                da0Var.setTextSize(1, 14.0f);
                da0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                da0Var.setEllipsize(TextUtils.TruncateAt.END);
                da0Var.setSingleLine();
                da0Var.setMaxLines(1);
                c6.b(da0Var, 0.075f, 1.4f);
                ic1Var.addView(da0Var, a6.n(-2, 26));
                arrayList2.add(da0Var);
                i13++;
            }
        }
        o1Var.f49045b = i11;
        if (!z11) {
            o1Var.f49046c.d(i11, true);
        }
        ic1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.f26967z == l61Var2.f26967z && l61Var.H == l61Var2.H && equals(l61Var, l61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new o1(context);
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
