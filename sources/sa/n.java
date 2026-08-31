package sa;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
public final class n extends xa.b {
    public static final m E = new m();
    public static final pa.m F = new pa.m("closed");
    public final ArrayList B;
    public String C;
    public pa.i D;

    public n() {
        super(E);
        this.B = new ArrayList();
        this.D = pa.k.f44246a;
    }

    @Override
    public final void b() {
        pa.h hVar = new pa.h();
        w(hVar);
        this.B.add(hVar);
    }

    @Override
    public final void c() {
        pa.l lVar = new pa.l();
        w(lVar);
        this.B.add(lVar);
    }

    @Override
    public final void close() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            arrayList.add(F);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty() && this.C == null) {
            if (v() instanceof pa.h) {
                android.support.v4.media.a.u(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void f() {
        ArrayList arrayList = this.B;
        if (!arrayList.isEmpty() && this.C == null) {
            if (v() instanceof pa.l) {
                android.support.v4.media.a.u(1, arrayList);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override
    public final void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.B.isEmpty() && this.C == null) {
            if (v() instanceof pa.l) {
                this.C = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override
    public final xa.b i() {
        w(pa.k.f44246a);
        return this;
    }

    @Override
    public final void n(double d) {
        if (this.f50493n == 1 || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            w(new pa.m(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override
    public final void o(long j10) {
        w(new pa.m(Long.valueOf(j10)));
    }

    @Override
    public final void p(Boolean bool) {
        if (bool == null) {
            w(pa.k.f44246a);
        } else {
            w(new pa.m(bool));
        }
    }

    @Override
    public final void q(Number number) {
        if (number == null) {
            w(pa.k.f44246a);
            return;
        }
        if (this.f50493n != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        w(new pa.m(number));
    }

    @Override
    public final void r(String str) {
        if (str == null) {
            w(pa.k.f44246a);
        } else {
            w(new pa.m(str));
        }
    }

    @Override
    public final void s(boolean z4) {
        w(new pa.m(Boolean.valueOf(z4)));
    }

    public final pa.i u() {
        ArrayList arrayList = this.B;
        if (arrayList.isEmpty()) {
            return this.D;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    public final pa.i v() {
        return (pa.i) l.d.i(1, this.B);
    }

    public final void w(pa.i iVar) {
        if (this.C != null) {
            if (!(iVar instanceof pa.k) || this.v) {
                ((pa.l) v()).o(this.C, iVar);
            }
            this.C = null;
        } else if (this.B.isEmpty()) {
            this.D = iVar;
        } else {
            pa.i v = v();
            if (v instanceof pa.h) {
                ((pa.h) v).f44245a.add(iVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override
    public final void flush() {
    }
}
