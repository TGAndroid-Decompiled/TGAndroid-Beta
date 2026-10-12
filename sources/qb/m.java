package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f46028a;
    public static final m[] f46029b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f46028a = r02;
        f46029b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f46029b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f46012a.post(runnable);
    }
}
