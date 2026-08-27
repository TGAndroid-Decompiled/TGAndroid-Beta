package pa;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

public final class n extends ua.b {
    public static final m D = new m();
    public static final ma.m E = new ma.m("closed");
    public final ArrayList A;
    public String B;
    public ma.i C;

    public n() {
        super(D);
        this.A = new ArrayList();
        this.C = ma.k.f17910a;
    }

    @Override
    public final void b() {
        ma.h hVar = new ma.h();
        w(hVar);
        this.A.add(hVar);
    }

    @Override
    public final void c() {
        ma.l lVar = new ma.l();
        w(lVar);
        this.A.add(lVar);
    }

    @Override
    public final void close() throws IOException {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(E);
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof ma.h)) {
            throw new IllegalStateException();
        }
        a9.p.s(1, arrayList);
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty() || this.B != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof ma.l)) {
            throw new IllegalStateException();
        }
        a9.p.s(1, arrayList);
    }

    @Override
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.A.isEmpty() || this.B != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof ma.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.B = str;
    }

    @Override
    public final ua.b i() {
        w(ma.k.f17910a);
        return this;
    }

    @Override
    public final void n(double d) {
        if (this.f48486n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new ma.m(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override
    public final void o(long j10) {
        w(new ma.m(Long.valueOf(j10)));
    }

    @Override
    public final void p(Boolean bool) {
        if (bool == null) {
            w(ma.k.f17910a);
        } else {
            w(new ma.m(bool));
        }
    }

    @Override
    public final void q(Number number) {
        if (number == null) {
            w(ma.k.f17910a);
            return;
        }
        if (this.f48486n != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new ma.m(number));
    }

    @Override
    public final void r(String str) {
        if (str == null) {
            w(ma.k.f17910a);
        } else {
            w(new ma.m(str));
        }
    }

    @Override
    public final void s(boolean z10) {
        w(new ma.m(Boolean.valueOf(z10)));
    }

    public final ma.i u() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return this.C;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final ma.i v() {
        return (ma.i) i0.a.i(1, this.A);
    }

    public final void w(ma.i iVar) {
        if (this.B != null) {
            if (!(iVar instanceof ma.k) || this.v) {
                ((ma.l) v()).o(this.B, iVar);
            }
            this.B = null;
            return;
        }
        if (this.A.isEmpty()) {
            this.C = iVar;
            return;
        }
        ma.i iVarV = v();
        if (!(iVarV instanceof ma.h)) {
            throw new IllegalStateException();
        }
        ((ma.h) iVarV).f17909a.add(iVar);
    }

    @Override
    public final void flush() {
    }
}
