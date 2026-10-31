package sb;

import jb.g;
public final class f implements r9.d {
    public static final f f48139b = new f(0);
    public static final f f48140c = new f(1);
    public static final f d = new f(2);
    public final int f48141a;

    public f(int i10) {
        this.f48141a = i10;
    }

    @Override
    public final Object K(bh.d dVar) {
        switch (this.f48141a) {
            case 0:
                return new d((g) dVar.b(g.class));
            case 1:
                return new c((d) dVar.b(d.class), (jb.d) dVar.b(jb.d.class));
            default:
                return new pb.b(dVar.c(c.class));
        }
    }
}
