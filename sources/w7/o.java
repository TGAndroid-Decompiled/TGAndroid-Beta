package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class o {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.m3.a(view, charSequence);
            return;
        }
        m.o3 o3Var = m.o3.v;
        if (o3Var != null && o3Var.f15639a == view) {
            m.o3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m.o3 o3Var2 = m.o3.f15638w;
            if (o3Var2 != null && o3Var2.f15639a == view) {
                o3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new m.o3(view, charSequence);
    }
}
