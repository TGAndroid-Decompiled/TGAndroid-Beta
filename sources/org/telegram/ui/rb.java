package org.telegram.ui;

import android.view.View;
public final class rb extends w7.d6 {
    public org.telegram.messenger.kj f41025a;
    public int f41026b = 0;
    public boolean f41027c = true;
    public int d = 0;
    public int e;
    public final sb f41028f;

    public rb(sb sbVar) {
        this.f41028f = sbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.kj kjVar = this.f41025a;
        sb sbVar = this.f41028f;
        if (kjVar != null) {
            int indexOf = sbVar.f41319o0.indexOf(kjVar) + sbVar.E.f40442f;
            if (indexOf >= 0) {
                sbVar.f41333y.i1(indexOf, this.e, false);
            }
        } else {
            sbVar.f41333y.i1(this.f41026b, this.d, this.f41027c);
        }
        this.f41025a = null;
        sbVar.V = true;
        sbVar.i1();
        org.telegram.messenger.i0.g3(new qr0(this, 21));
    }

    @Override
    public final void c() {
        sb sbVar = this.f41028f;
        sbVar.K0 = sbVar.getNotificationCenter().q(sb.R0, sbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f41028f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
