package zh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import c8.ka;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;
import org.telegram.ui.d61;
public final class e1 extends x31 {
    public static final int f60313b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        boolean z10;
        f1 f1Var = (f1) view;
        int i7 = y31Var.d;
        ArrayList arrayList = (ArrayList) y31Var.G;
        int i10 = y31Var.f40581z;
        c20 c20Var = (c20) y31Var.H;
        d61 d61Var = f1Var.f60321a;
        ArrayList arrayList2 = f1Var.d;
        if (f1Var.f60327r == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1Var.f60327r = i7;
        if (arrayList2.size() != arrayList.size()) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                CharSequence charSequence = null;
                if (i11 >= arrayList2.size()) {
                    break;
                }
                if (i12 < arrayList.size()) {
                    charSequence = (CharSequence) arrayList.get(i12);
                }
                if (charSequence == null) {
                    d61Var.removeView((View) arrayList2.remove(i11));
                    i11--;
                } else {
                    ((TextView) arrayList2.get(i11)).setText(charSequence);
                }
                i12++;
                i11++;
            }
            while (i12 < arrayList.size()) {
                x70 x70Var = new x70(f1Var.getContext(), null);
                x70Var.setGravity(17);
                x70Var.setText((CharSequence) arrayList.get(i12));
                x70Var.setTypeface(org.telegram.messenger.g0.o());
                s6.V(x70Var, s6.p(l6.f27828b6, l6.f27847c6), null);
                x70Var.setTextSize(1, 14.0f);
                x70Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
                x70Var.setEllipsize(TextUtils.TruncateAt.END);
                x70Var.setSingleLine();
                x70Var.setMaxLines(1);
                ka.b(x70Var, 0.075f, 1.4f);
                d61Var.addView(x70Var, ha.o(-2, 26));
                arrayList2.add(x70Var);
                i12++;
            }
        }
        f1Var.f60322b = i10;
        if (!z10) {
            f1Var.f60323c.e(true, i10);
        }
        d61Var.invalidate();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((TextView) arrayList2.get(i13)).setOnClickListener(new org.telegram.ui.Components.c0(c20Var, i13, 1));
        }
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.f40581z == y31Var2.f40581z && y31Var.H == y31Var2.H && e(y31Var, y31Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new f1(context);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.d == y31Var2.d) {
            ArrayList arrayList = (ArrayList) y31Var.G;
            ArrayList arrayList2 = (ArrayList) y31Var2.G;
            if (arrayList != arrayList2) {
                if (arrayList != null || arrayList2 != null) {
                    if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i7), (CharSequence) arrayList2.get(i7))) {
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
