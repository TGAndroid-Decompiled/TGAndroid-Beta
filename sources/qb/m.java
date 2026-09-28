package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41543a;
    public static final m[] f41544b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41543a = r02;
        f41544b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41544b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41527a.post(runnable);
    }
}
