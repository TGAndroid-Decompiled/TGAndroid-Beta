package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.u71;
import w7.b6;
import w7.e6;
public final class j1 extends z41 {
    public static final int f45127b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        boolean z11;
        k1 k1Var = (k1) view;
        int i10 = a51Var.d;
        ArrayList arrayList = (ArrayList) a51Var.G;
        int i11 = a51Var.f24305z;
        q20 q20Var = (q20) a51Var.H;
        u71 u71Var = k1Var.f45161a;
        ArrayList arrayList2 = k1Var.d;
        if (k1Var.f45166r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        k1Var.f45166r = i10;
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
                    u71Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                p80 p80Var = new p80(k1Var.getContext(), null);
                p80Var.setGravity(17);
                p80Var.setText((CharSequence) arrayList.get(i13));
                p80Var.setTypeface(org.telegram.messenger.i0.o());
                a7.W(p80Var, a7.q(t6.f20891b6, t6.f20910c6), null);
                p80Var.setTextSize(1, 14.0f);
                p80Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                p80Var.setSingleLine();
                p80Var.setMaxLines(1);
                e6.b(p80Var, 0.075f, 1.4f);
                u71Var.addView(p80Var, b6.o(-2, 26));
                arrayList2.add(p80Var);
                i13++;
            }
        }
        k1Var.f45162b = i11;
        if (!z11) {
            k1Var.f45163c.e(true, i11);
        }
        u71Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.c0(i14, 1, q20Var));
        }
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (a51Var.f24305z == a51Var2.f24305z && a51Var.H == a51Var2.H && e(a51Var, a51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new k1(context);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            ArrayList arrayList = (ArrayList) a51Var.G;
            ArrayList arrayList2 = (ArrayList) a51Var2.G;
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
