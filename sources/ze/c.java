package ze;

import cf.p;
import cf.t;
public final class c extends ef.a {
    public final int f54608a;
    public final cf.a f54609b;

    public c(int i10) {
        this.f54608a = i10;
        switch (i10) {
            case 1:
                this.f54609b = new p();
                return;
            default:
                this.f54609b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f54608a;
    }

    @Override
    public boolean b(cf.a aVar) {
        switch (this.f54608a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final cf.a e() {
        switch (this.f54608a) {
            case 0:
                return (cf.f) this.f54609b;
            default:
                return (t) this.f54609b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f54608a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f54608a) {
            case 0:
                return q3.h.a(dVar.f54613b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
