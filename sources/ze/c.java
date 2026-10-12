package ze;

import cf.p;
import cf.t;
public final class c extends ef.a {
    public final int f54600a;
    public final cf.a f54601b;

    public c(int i10) {
        this.f54600a = i10;
        switch (i10) {
            case 1:
                this.f54601b = new p();
                return;
            default:
                this.f54601b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f54600a;
    }

    @Override
    public boolean b(cf.a aVar) {
        switch (this.f54600a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final cf.a e() {
        switch (this.f54600a) {
            case 0:
                return (cf.f) this.f54601b;
            default:
                return (t) this.f54601b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f54600a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f54600a) {
            case 0:
                return q3.h.a(dVar.f54605b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
