package qa;

import j$.util.Objects;
import j7.l1;
import java.io.IOException;
import java.util.ArrayList;
public final class n extends va.b {
    public static final m D = new m();
    public static final na.m E = new na.m("closed");
    public final ArrayList A;
    public String B;
    public na.i C;

    public n() {
        super(D);
        this.A = new ArrayList();
        this.C = na.k.f17193a;
    }

    @Override
    public final void b() {
        na.h hVar = new na.h();
        w(hVar);
        this.A.add(hVar);
    }

    @Override
    public final void c() {
        na.l lVar = new na.l();
        w(lVar);
        this.A.add(lVar);
    }

    @Override
    public final void close() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            arrayList.add(E);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty() && this.B == null) {
            if (v() instanceof na.h) {
                a4.w.t(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty() && this.B == null) {
            if (v() instanceof na.l) {
                a4.w.t(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.A.isEmpty() && this.B == null) {
            if (v() instanceof na.l) {
                this.B = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override
    public final va.b i() {
        w(na.k.f17193a);
        return this;
    }

    @Override
    public final void n(double d) {
        if (this.f49494n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new na.m(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override
    public final void o(long j10) {
        w(new na.m(Long.valueOf(j10)));
    }

    @Override
    public final void p(Boolean bool) {
        if (bool == null) {
            w(na.k.f17193a);
        } else {
            w(new na.m(bool));
        }
    }

    @Override
    public final void q(Number number) {
        if (number == null) {
            w(na.k.f17193a);
            return;
        }
        if (this.f49494n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new na.m(number));
    }

    @Override
    public final void r(String str) {
        if (str == null) {
            w(na.k.f17193a);
        } else {
            w(new na.m(str));
        }
    }

    @Override
    public final void s(boolean z10) {
        w(new na.m(Boolean.valueOf(z10)));
    }

    public final na.i u() {
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            return this.C;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final na.i v() {
        return (na.i) l1.i(1, this.A);
    }

    public final void w(na.i iVar) {
        if (this.B != null) {
            if (!(iVar instanceof na.k) || this.v) {
                ((na.l) v()).o(this.B, iVar);
            }
            this.B = null;
        } else if (this.A.isEmpty()) {
            this.C = iVar;
        } else {
            na.i v = v();
            if (v instanceof na.h) {
                ((na.h) v).f17192a.add(iVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override
    public final void flush() {
    }
}
