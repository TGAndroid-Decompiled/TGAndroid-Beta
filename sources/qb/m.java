package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41276a;
    public static final m[] f41277b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41276a = r02;
        f41277b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41277b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41260a.post(runnable);
    }
}
