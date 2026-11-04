package xb;

import b8.ke;
import mb.g;
public final class a implements t9.d {
    public static final a f58593b = new a(0);
    public static final a f58594c = new a(1);
    public final int f58595a;

    public a(int i3) {
        this.f58595a = i3;
    }

    @Override
    public final Object q1(ke keVar) {
        switch (this.f58595a) {
            case 0:
                return new c((g) keVar.a(g.class));
            default:
                return new b((c) keVar.a(c.class), (mb.d) keVar.a(mb.d.class));
        }
    }
}
