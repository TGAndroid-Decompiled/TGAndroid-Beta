package org.telegram.ui;

import android.view.View;
public final class rb extends w7.d6 {
    public org.telegram.messenger.jj f41189a;
    public int f41190b = 0;
    public boolean f41191c = true;
    public int d = 0;
    public int e;
    public final sb f41192f;

    public rb(sb sbVar) {
        this.f41192f = sbVar;
    }

    @Override
    public final void a() {
        org.telegram.messenger.jj jjVar = this.f41189a;
        sb sbVar = this.f41192f;
        if (jjVar != null) {
            int indexOf = sbVar.f41443o0.indexOf(jjVar) + sbVar.E.f40562f;
            if (indexOf >= 0) {
                sbVar.f41457y.i1(indexOf, this.e, false);
            }
        } else {
            sbVar.f41457y.i1(this.f41190b, this.d, this.f41191c);
        }
        this.f41189a = null;
        sbVar.V = true;
        sbVar.h1();
        org.telegram.messenger.i0.g3(new rr0(this, 21));
    }

    @Override
    public final void c() {
        sb sbVar = this.f41192f;
        sbVar.K0 = sbVar.getNotificationCenter().q(sb.R0, sbVar.K0, true);
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f41192f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
