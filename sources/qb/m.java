package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41542a;
    public static final m[] f41543b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41542a = r02;
        f41543b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41543b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41526a.post(runnable);
    }
}
