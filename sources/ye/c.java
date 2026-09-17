package ye;

import bf.p;
import bf.t;
public final class c extends df.a {
    public final int f49982a;
    public final bf.a f49983b;

    public c(int i10) {
        this.f49982a = i10;
        switch (i10) {
            case 1:
                this.f49983b = new p();
                return;
            default:
                this.f49983b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f49982a;
    }

    @Override
    public boolean b(bf.a aVar) {
        switch (this.f49982a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f49982a) {
            case 0:
                return (bf.f) this.f49983b;
            default:
                return (t) this.f49983b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f49982a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f49982a) {
            case 0:
                return q3.h.a(dVar.f49987b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
