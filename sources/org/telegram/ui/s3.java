package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class s3 extends URLSpan {
    public final int f38094a;
    public final t3 f38095b;

    public s3(t3 t3Var, String str, int i10) {
        super(str);
        this.f38094a = i10;
        this.f38095b = t3Var;
    }

    @Override
    public final void onClick(View view) {
        m0 m0Var;
        int i10 = this.f38094a;
        t3 t3Var = this.f38095b;
        switch (i10) {
            case 0:
                n4 n4Var = t3Var.f38373c;
                String url = getURL();
                org.telegram.ui.Components.g90 g90Var = n4Var.f36981b;
                f3 f3Var = n4Var.d;
                HashSet hashSet = n4.Y0;
                if (g90Var == null) {
                    m0Var = null;
                } else {
                    m0Var = new m0(n4Var, f3Var, g90Var);
                }
                n4Var.Q(url, null, m0Var);
                return;
            default:
                t3Var.f38373c.Q(getURL(), null, null);
                return;
        }
    }
}
