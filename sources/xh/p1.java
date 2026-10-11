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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.cc1;
import w7.x5;
import w7.z5;
public final class p1 extends q61 {
    public static final int f51541a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = r61Var.d;
        ArrayList arrayList = (ArrayList) r61Var.G;
        int i11 = r61Var.f30374z;
        Utilities.Callback callback = (Utilities.Callback) r61Var.H;
        cc1 cc1Var = q1Var.f51551a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f51557r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f51557r = i10;
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
                fa0 fa0Var = new fa0(q1Var.getContext(), null);
                fa0Var.setGravity(17);
                fa0Var.setText((CharSequence) arrayList.get(i13));
                fa0Var.setTypeface(AndroidUtilities.bold());
                fa0Var.setTextColor(h6.v(h6.x0(null, h6.f20749b6, false), h6.x0(null, h6.f20769c6, false)));
                fa0Var.setTextSize(1, 14.0f);
                fa0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                fa0Var.setEllipsize(TextUtils.TruncateAt.END);
                fa0Var.setSingleLine();
                fa0Var.setMaxLines(1);
                z5.b(fa0Var, 0.075f, 1.4f);
                cc1Var.addView(fa0Var, x5.n(-2, 26));
                arrayList2.add(fa0Var);
                i13++;
            }
        }
        q1Var.f51552b = i11;
        if (!z11) {
            q1Var.f51553c.d(i11, true);
        }
        cc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (r61Var.f30374z == r61Var2.f30374z && r61Var.H == r61Var2.H && equals(r61Var, r61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new q1(context);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.d == r61Var2.d) {
            ArrayList arrayList = (ArrayList) r61Var.G;
            ArrayList arrayList2 = (ArrayList) r61Var2.G;
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
