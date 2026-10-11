package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class n {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.n3.a(view, charSequence);
            return;
        }
        m.p3 p3Var = m.p3.v;
        if (p3Var != null && p3Var.f15806a == view) {
            m.p3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m.p3 p3Var2 = m.p3.f15805w;
            if (p3Var2 != null && p3Var2.f15806a == view) {
                p3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new m.p3(view, charSequence);
    }
}
