package ye;

import bf.p;
import bf.t;
public final class c extends df.a {
    public final int f46983a;
    public final bf.a f46984b;

    public c(int i10) {
        this.f46983a = i10;
        switch (i10) {
            case 1:
                this.f46984b = new p();
                return;
            default:
                this.f46984b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f46983a;
    }

    @Override
    public boolean b(bf.a aVar) {
        switch (this.f46983a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f46983a) {
            case 0:
                return (bf.f) this.f46984b;
            default:
                return (t) this.f46984b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f46983a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f46983a) {
            case 0:
                return q3.h.a(dVar.f46988b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
