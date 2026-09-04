package ye;

import bf.p;
import bf.t;
public final class c extends df.a {
    public final int f49981a;
    public final bf.a f49982b;

    public c(int i10) {
        this.f49981a = i10;
        switch (i10) {
            case 1:
                this.f49982b = new p();
                return;
            default:
                this.f49982b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f49981a;
    }

    @Override
    public boolean b(bf.a aVar) {
        switch (this.f49981a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f49981a) {
            case 0:
                return (bf.f) this.f49982b;
            default:
                return (t) this.f49982b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f49981a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f49981a) {
            case 0:
                return q3.h.a(dVar.f49986b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
