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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.dc1;
import w7.x5;
import w7.z5;
public final class p1 extends p61 {
    public static final int f51498a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        boolean z11;
        q1 q1Var = (q1) view;
        int i10 = q61Var.d;
        ArrayList arrayList = (ArrayList) q61Var.G;
        int i11 = q61Var.f30076z;
        Utilities.Callback callback = (Utilities.Callback) q61Var.H;
        dc1 dc1Var = q1Var.f51508a;
        ArrayList arrayList2 = q1Var.d;
        if (q1Var.f51514r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.f51514r = i10;
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
                fa0 fa0Var = new fa0(q1Var.getContext(), null);
                fa0Var.setGravity(17);
                fa0Var.setText((CharSequence) arrayList.get(i13));
                fa0Var.setTypeface(AndroidUtilities.bold());
                fa0Var.setTextColor(i6.v(i6.x0(null, i6.f20764b6, false), i6.x0(null, i6.f20784c6, false)));
                fa0Var.setTextSize(1, 14.0f);
                fa0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                fa0Var.setEllipsize(TextUtils.TruncateAt.END);
                fa0Var.setSingleLine();
                fa0Var.setMaxLines(1);
                z5.b(fa0Var, 0.075f, 1.4f);
                dc1Var.addView(fa0Var, x5.n(-2, 26));
                arrayList2.add(fa0Var);
                i13++;
            }
        }
        q1Var.f51509b = i11;
        if (!z11) {
            q1Var.f51510c.d(i11, true);
        }
        dc1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.f30076z == q61Var2.f30076z && q61Var.H == q61Var2.H && equals(q61Var, q61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new q1(context);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            ArrayList arrayList = (ArrayList) q61Var.G;
            ArrayList arrayList2 = (ArrayList) q61Var2.G;
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
