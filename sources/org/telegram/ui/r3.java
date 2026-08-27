package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;

public final class r3 extends URLSpan {

    public final int f41790a;

    public final s3 f41791b;

    public r3(s3 s3Var, String str, int i10) {
        super(str);
        this.f41790a = i10;
        this.f41791b = s3Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41790a;
        s3 s3Var = this.f41791b;
        switch (i10) {
            case 0:
                m4 m4Var = s3Var.f42400c;
                String url = getURL();
                org.telegram.ui.Components.q80 q80Var = m4Var.f37285b;
                f3 f3Var = m4Var.d;
                HashSet hashSet = m4.X0;
                m4Var.Q(url, null, q80Var == null ? null : new m0(m4Var, f3Var, q80Var));
                break;
            default:
                s3Var.f42400c.Q(getURL(), null, null);
                break;
        }
    }
}
