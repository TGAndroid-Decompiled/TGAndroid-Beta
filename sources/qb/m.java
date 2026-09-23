package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41206a;
    public static final m[] f41207b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41206a = r02;
        f41207b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41207b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41190a.post(runnable);
    }
}
