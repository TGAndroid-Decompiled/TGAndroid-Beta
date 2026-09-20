package ye;

import bf.p;
import bf.t;
public final class c extends df.a {
    public final int f47017a;
    public final bf.a f47018b;

    public c(int i10) {
        this.f47017a = i10;
        switch (i10) {
            case 1:
                this.f47018b = new p();
                return;
            default:
                this.f47018b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f47017a;
    }

    @Override
    public boolean b(bf.a aVar) {
        switch (this.f47017a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f47017a) {
            case 0:
                return (bf.f) this.f47018b;
            default:
                return (t) this.f47018b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f47017a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f47017a) {
            case 0:
                return q3.h.a(dVar.f47022b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
