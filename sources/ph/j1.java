package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.r20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.s71;
import w7.b6;
import w7.e6;
public final class j1 extends a51 {
    public static final int f45138b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        boolean z11;
        k1 k1Var = (k1) view;
        int i10 = b51Var.d;
        ArrayList arrayList = (ArrayList) b51Var.G;
        int i11 = b51Var.f24656z;
        r20 r20Var = (r20) b51Var.H;
        s71 s71Var = k1Var.f45172a;
        ArrayList arrayList2 = k1Var.d;
        if (k1Var.f45177r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        k1Var.f45177r = i10;
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
                    s71Var.removeView((View) arrayList2.remove(i12));
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
                a7.W(p80Var, a7.q(t6.f20892b6, t6.f20911c6), null);
                p80Var.setTextSize(1, 14.0f);
                p80Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                p80Var.setEllipsize(TextUtils.TruncateAt.END);
                p80Var.setSingleLine();
                p80Var.setMaxLines(1);
                e6.b(p80Var, 0.075f, 1.4f);
                s71Var.addView(p80Var, b6.o(-2, 26));
                arrayList2.add(p80Var);
                i13++;
            }
        }
        k1Var.f45173b = i11;
        if (!z11) {
            k1Var.f45174c.e(true, i11);
        }
        s71Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.c0(i14, 1, r20Var));
        }
    }

    @Override
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (b51Var.f24656z == b51Var2.f24656z && b51Var.H == b51Var2.H && e(b51Var, b51Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new k1(context);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            ArrayList arrayList = (ArrayList) b51Var.G;
            ArrayList arrayList2 = (ArrayList) b51Var2.G;
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
