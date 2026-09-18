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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.dc1;
import w7.x5;
import w7.z5;
public final class o1 extends i51 {
    public static final int f46080a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        boolean z11;
        p1 p1Var = (p1) view;
        int i10 = j51Var.d;
        ArrayList arrayList = (ArrayList) j51Var.G;
        int i11 = j51Var.f25140z;
        Utilities.Callback callback = (Utilities.Callback) j51Var.H;
        dc1 dc1Var = p1Var.f46090a;
        ArrayList arrayList2 = p1Var.d;
        if (p1Var.f46095r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        p1Var.f46095r = i10;
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
                c90 c90Var = new c90(p1Var.getContext(), null);
                c90Var.setGravity(17);
                c90Var.setText((CharSequence) arrayList.get(i13));
                c90Var.setTypeface(AndroidUtilities.bold());
                c90Var.setTextColor(j6.v(j6.w0(null, j6.f18826b6, false), j6.w0(null, j6.f18845c6, false)));
                c90Var.setTextSize(1, 14.0f);
                c90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                c90Var.setEllipsize(TextUtils.TruncateAt.END);
                c90Var.setSingleLine();
                c90Var.setMaxLines(1);
                z5.b(c90Var, 0.075f, 1.4f);
                dc1Var.addView(c90Var, x5.n(-2, 26));
                arrayList2.add(c90Var);
                i13++;
            }
        }
        p1Var.f46091b = i11;
        if (!z11) {
            p1Var.f46092c.d(i11, true);
        }
        dc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.f25140z == j51Var2.f25140z && j51Var.H == j51Var2.H && equals(j51Var, j51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new p1(context);
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.d == j51Var2.d) {
            ArrayList arrayList = (ArrayList) j51Var.G;
            ArrayList arrayList2 = (ArrayList) j51Var2.G;
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
