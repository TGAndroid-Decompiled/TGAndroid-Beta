package yh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.qa1;
import w7.b6;
import w7.z5;
public final class m1 extends f61 {
    public static final int f50397a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        boolean z11;
        n1 n1Var = (n1) view;
        int i10 = g61Var.d;
        ArrayList arrayList = (ArrayList) g61Var.G;
        int i11 = g61Var.f26510z;
        Utilities.Callback callback = (Utilities.Callback) g61Var.H;
        qa1 qa1Var = n1Var.f50409a;
        ArrayList arrayList2 = n1Var.d;
        if (n1Var.f50414r == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        n1Var.f50414r = i10;
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
                    qa1Var.removeView((View) arrayList2.remove(i12));
                    i12--;
                } else {
                    ((TextView) arrayList2.get(i12)).setText(charSequence);
                }
                i13++;
                i12++;
            }
            while (i13 < arrayList.size()) {
                x90 x90Var = new x90(n1Var.getContext(), null);
                x90Var.setGravity(17);
                x90Var.setText((CharSequence) arrayList.get(i13));
                x90Var.setTypeface(AndroidUtilities.bold());
                x90Var.setTextColor(h6.v(h6.x0(null, h6.f20948b6, false), h6.x0(null, h6.f20968c6, false)));
                x90Var.setTextSize(1, 14.0f);
                x90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                x90Var.setEllipsize(TextUtils.TruncateAt.END);
                x90Var.setSingleLine();
                x90Var.setMaxLines(1);
                b6.b(x90Var, 0.075f, 1.4f);
                qa1Var.addView(x90Var, z5.n(-2, 26));
                arrayList2.add(x90Var);
                i13++;
            }
        }
        n1Var.f50410b = i11;
        if (!z11) {
            n1Var.f50411c.d(i11, true);
        }
        qa1Var.invalidate();
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            ((TextView) arrayList2.get(i14)).setOnClickListener(new org.telegram.ui.Components.a0(i14, 1, callback));
        }
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.f26510z == g61Var2.f26510z && g61Var.H == g61Var2.H && equals(g61Var, g61Var2)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new n1(context);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            ArrayList arrayList = (ArrayList) g61Var.G;
            ArrayList arrayList2 = (ArrayList) g61Var2.G;
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
