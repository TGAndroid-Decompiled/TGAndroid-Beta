package zh;

import org.telegram.messenger.c20;
public final class e2 implements c20 {
    public final int f60316a;
    public final m3 f60317b;

    public e2(m3 m3Var, int i7) {
        this.f60316a = i7;
        this.f60317b = m3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f60316a) {
            case 0:
                this.f60317b.k0(((Boolean) obj).booleanValue());
                return;
            default:
                m3.c0(this.f60317b, (Integer) obj);
                return;
        }
    }
}
