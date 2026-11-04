package w2;
public final class k1 implements d1 {
    public int f57125a;
    public boolean f57126b;
    public final m1 f57127c;

    public k1(m1 m1Var) {
        this.f57127c = m1Var;
    }

    @Override
    public final void a() {
        m1 m1Var = this.f57127c;
        if (!m1Var.f57153w) {
            m1Var.f57151r.a();
        }
    }

    public final void b() {
        if (!this.f57126b) {
            m1 m1Var = this.f57127c;
            m1Var.f57148e.k(d2.u0.h(m1Var.f57152s.f8489s), m1Var.f57152s, 0, null, 0L);
            this.f57126b = true;
        }
    }

    @Override
    public final boolean f() {
        return this.f57127c.f57154x;
    }

    @Override
    public final int m(long j10) {
        b();
        if (j10 > 0 && this.f57125a != 2) {
            this.f57125a = 2;
            return 1;
        }
        return 0;
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        b();
        m1 m1Var = this.f57127c;
        boolean z10 = m1Var.f57154x;
        if (z10 && m1Var.f57155y == null) {
            this.f57125a = 2;
        }
        int i10 = this.f57125a;
        if (i10 == 2) {
            hVar.addFlag(4);
            return -4;
        } else if ((i3 & 2) == 0 && i10 != 0) {
            if (!z10) {
                return -3;
            }
            m1Var.f57155y.getClass();
            hVar.addFlag(1);
            hVar.f16158e = 0L;
            if ((i3 & 4) == 0) {
                hVar.b(m1Var.E);
                hVar.f16157c.put(m1Var.f57155y, 0, m1Var.E);
            }
            if ((i3 & 1) == 0) {
                this.f57125a = 2;
            }
            return -4;
        } else {
            bVar.f55095b = m1Var.f57152s;
            this.f57125a = 1;
            return -5;
        }
    }
}
