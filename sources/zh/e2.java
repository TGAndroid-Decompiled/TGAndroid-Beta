package zh;

import org.telegram.messenger.c20;
public final class e2 implements c20 {
    public final int f60314a;
    public final m3 f60315b;

    public e2(m3 m3Var, int i7) {
        this.f60314a = i7;
        this.f60315b = m3Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f60314a) {
            case 0:
                this.f60315b.k0(((Boolean) obj).booleanValue());
                return;
            default:
                m3.c0(this.f60315b, (Integer) obj);
                return;
        }
    }
}
