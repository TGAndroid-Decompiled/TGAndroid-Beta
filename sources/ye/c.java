package ye;

import bf.p;
import bf.t;
public final class c extends df.a {
    public final int f50010a;
    public final bf.a f50011b;

    public c(int i10) {
        this.f50010a = i10;
        switch (i10) {
            case 1:
                this.f50011b = new p();
                return;
            default:
                this.f50011b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f50010a;
    }

    @Override
    public boolean b(bf.a aVar) {
        switch (this.f50010a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f50010a) {
            case 0:
                return (bf.f) this.f50011b;
            default:
                return (t) this.f50011b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f50010a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f50010a) {
            case 0:
                return q3.h.a(dVar.f50015b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
