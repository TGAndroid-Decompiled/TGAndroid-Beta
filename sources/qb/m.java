package qb;

import java.util.concurrent.Executor;
public final class m implements Executor {
    public static final m f41515a;
    public static final m[] f41516b;

    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f41515a = r02;
        f41516b = new m[]{r02};
    }

    public static m[] values() {
        return (m[]) f41516b.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        f.a().f41499a.post(runnable);
    }
}
