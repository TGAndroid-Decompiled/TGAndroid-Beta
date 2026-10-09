package xh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.dc1;
import w7.x5;
import w7.z5;
public final class p1 extends o61 {
    public static final int f51454a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = p61Var.d;
        ArrayList arrayList = (ArrayList) p61Var.G;
        int i11 = p61Var.f29747z;
        Utilities.Callback callback = (Utilities.Callback) p61Var.H;
        dc1 dc1Var = q1Var.f51464a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f51470r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f51470r = i10;
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
                ea0 ea0Var = new ea0(q1Var.getContext(), null);
                ea0Var.setGravity(17);
                ea0Var.setText((CharSequence) arrayList.get(i13));
                ea0Var.setTypeface(AndroidUtilities.bold());
                ea0Var.setTextColor(i6.v(i6.x0(null, i6.f20760b6, false), i6.x0(null, i6.f20780c6, false)));
                ea0Var.setTextSize(1, 14.0f);
                ea0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                ea0Var.setEllipsize(TextUtils.TruncateAt.END);
                ea0Var.setSingleLine();
                ea0Var.setMaxLines(1);
                z5.b(ea0Var, 0.075f, 1.4f);
                dc1Var.addView(ea0Var, x5.n(-2, 26));
                arrayList2.add(ea0Var);
                i13++;
            }
        }
        q1Var.f51465b = i11;
        if (!z11) {
            q1Var.f51466c.d(i11, true);
        }
        dc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (p61Var.f29747z == p61Var2.f29747z && p61Var.H == p61Var2.H && equals(p61Var, p61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new q1(context);
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            ArrayList arrayList = (ArrayList) p61Var.G;
            ArrayList arrayList2 = (ArrayList) p61Var2.G;
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
