package vb;

import b8.ke;
import mb.g;
public final class f implements t9.d {
    public static final f f56513b = new f(0);
    public static final f f56514c = new f(1);
    public static final f d = new f(2);
    public final int f56515a;

    public f(int i3) {
        this.f56515a = i3;
    }

    @Override
    public final Object q1(ke keVar) {
        switch (this.f56515a) {
            case 0:
                return new d((g) keVar.a(g.class));
            case 1:
                return new c((d) keVar.a(d.class), (mb.d) keVar.a(mb.d.class));
            default:
                return new sb.b(keVar.f(c.class));
        }
    }
}
