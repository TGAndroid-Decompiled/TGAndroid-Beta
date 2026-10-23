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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.va1;
import w7.b6;
import w7.z5;
public final class m1 extends l61 {
    public static final int f50862a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        boolean z11;
        n1 n1Var = (n1) view;
        int i10 = m61Var.d;
        ArrayList arrayList = (ArrayList) m61Var.G;
        int i11 = m61Var.f28572z;
        Utilities.Callback callback = (Utilities.Callback) m61Var.H;
        va1 va1Var = n1Var.f50874a;
        ArrayList arrayList2 = n1Var.d;
        if (n1Var.f50879r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        n1Var.f50879r = i10;
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
                    va1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                y90 y90Var = new y90(n1Var.getContext(), null);
                y90Var.setGravity(17);
                y90Var.setText((CharSequence) arrayList.get(i13));
                y90Var.setTypeface(AndroidUtilities.bold());
                r6.X(y90Var, r6.q(k6.f21144b6, k6.f21164c6), null);
                y90Var.setTextSize(1, 14.0f);
                y90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                y90Var.setEllipsize(TextUtils.TruncateAt.END);
                y90Var.setSingleLine();
                y90Var.setMaxLines(1);
                b6.b(y90Var, 0.075f, 1.4f);
                va1Var.addView(y90Var, z5.n(-2, 26));
                arrayList2.add(y90Var);
                i13++;
            }
        }
        n1Var.f50875b = i11;
        if (!z11) {
            n1Var.f50876c.d(i11, true);
        }
        va1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.f28572z == m61Var2.f28572z && m61Var.H == m61Var2.H && equals(m61Var, m61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new n1(context);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            ArrayList arrayList = (ArrayList) m61Var.G;
            ArrayList arrayList2 = (ArrayList) m61Var2.G;
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
