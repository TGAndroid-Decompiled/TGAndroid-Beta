package org.telegram.ui;

import android.text.style.URLSpan;
import android.view.View;
import java.util.HashSet;
public final class r3 extends URLSpan {
    public final int f41849a;
    public final s3 f41850b;

    public r3(s3 s3Var, String str, int i10) {
        super(str);
        this.f41849a = i10;
        this.f41850b = s3Var;
    }

    @Override
    public final void onClick(View view) {
        m0 m0Var;
        int i10 = this.f41849a;
        s3 s3Var = this.f41850b;
        switch (i10) {
            case 0:
                m4 m4Var = s3Var.f42263c;
                String url = getURL();
                org.telegram.ui.Components.z80 z80Var = m4Var.f37380b;
                f3 f3Var = m4Var.d;
                HashSet hashSet = m4.X0;
                if (z80Var == null) {
                    m0Var = null;
                } else {
                    m0Var = new m0(m4Var, f3Var, z80Var);
                }
                m4Var.Q(url, null, m0Var);
                return;
            default:
                s3Var.f42263c.Q(getURL(), null, null);
                return;
        }
    }
}
