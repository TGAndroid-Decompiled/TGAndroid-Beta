package ye;

import bf.p;
import bf.t;
public final class c extends df.a {
    public final int f46669a;
    public final bf.a f46670b;

    public c(int i10) {
        this.f46669a = i10;
        switch (i10) {
            case 1:
                this.f46670b = new p();
                return;
            default:
                this.f46670b = new p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f46669a;
    }

    @Override
    public boolean b(bf.a aVar) {
        switch (this.f46669a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f46669a) {
            case 0:
                return (bf.f) this.f46670b;
            default:
                return (t) this.f46670b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f46669a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f46669a) {
            case 0:
                return q3.h.a(dVar.f46674b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
