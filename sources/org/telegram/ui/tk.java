package org.telegram.ui;
public final class tk extends c2.z {
    public final zn f38535l;

    public tk(zn znVar, sj sjVar, vj vjVar) {
        super(sjVar, vjVar);
        this.f38535l = znVar;
    }

    public final void d(int i10) {
        if (this.f38535l.Ma) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.f2062b = i10;
    }
}
