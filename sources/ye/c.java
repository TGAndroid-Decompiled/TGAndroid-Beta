package ye;

import bf.p;
import bf.t;
public final class c extends df.a {
    public final int f50878a;
    public final bf.a f50879b;

    public c(int i10) {
        this.f50878a = i10;
        switch (i10) {
            case 1:
                this.f50879b = new p();
                return;
            default:
                this.f50879b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f50878a;
    }

    @Override
    public boolean b(bf.a aVar) {
        switch (this.f50878a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f50878a) {
            case 0:
                return (bf.f) this.f50879b;
            default:
                return (t) this.f50879b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f50878a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f50878a) {
            case 0:
                return q3.h.a(dVar.f50883b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
