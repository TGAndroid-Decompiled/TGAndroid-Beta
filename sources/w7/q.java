package w7;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
public abstract class q {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m.q3.a(view, charSequence);
            return;
        }
        m.s3 s3Var = m.s3.v;
        if (s3Var != null && s3Var.f14965a == view) {
            m.s3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            m.s3 s3Var2 = m.s3.f14964w;
            if (s3Var2 != null && s3Var2.f14965a == view) {
                s3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new m.s3(view, charSequence);
    }
}
