package ze;

import cf.p;
import cf.t;
public final class c extends ef.a {
    public final int f54497a;
    public final cf.a f54498b;

    public c(int i10) {
        this.f54497a = i10;
        switch (i10) {
            case 1:
                this.f54498b = new p();
                return;
            default:
                this.f54498b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f54497a;
    }

    @Override
    public boolean b(cf.a aVar) {
        switch (this.f54497a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final cf.a e() {
        switch (this.f54497a) {
            case 0:
                return (cf.f) this.f54498b;
            default:
                return (t) this.f54498b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f54497a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f54497a) {
            case 0:
                return q3.h.a(dVar.f54502b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
