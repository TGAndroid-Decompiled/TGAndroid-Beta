package va;

import ae.a1;
import ci.u5;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import m9.c;
import q9.d;
import q9.s;
public final class a implements d {
    public static final a f49598b = new a(0);
    public static final a f49599c = new a(1);
    public static final a d = new a(2);
    public static final a f49600e = new a(3);
    public final int f49601a;

    public a(int i10) {
        this.f49601a = i10;
    }

    @Override
    public final Object y0(u5 u5Var) {
        switch (this.f49601a) {
            case 0:
                Object g10 = u5Var.g(new s(m9.a.class, Executor.class));
                i.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g10);
            case 1:
                Object g11 = u5Var.g(new s(c.class, Executor.class));
                i.d(g11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g11);
            case 2:
                Object g12 = u5Var.g(new s(b.class, Executor.class));
                i.d(g12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g12);
            default:
                Object g13 = u5Var.g(new s(m9.d.class, Executor.class));
                i.d(g13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new a1((Executor) g13);
        }
    }
}
